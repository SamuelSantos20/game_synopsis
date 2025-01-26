package com.devesuperior.dslist.service;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.model.GameList;
import com.devesuperior.dslist.projections.GameMinProjection;
import com.devesuperior.dslist.repository.GameListRepository;
import com.devesuperior.dslist.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;

    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {

        List<GameListDTO> list = gameListRepository.findAll().stream().map(GameListDTO::new).toList();

        return list;


    }


    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);


        GameMinProjection remove = list.remove(sourceIndex);
        list.add(destinationIndex, remove);


        int min = Math.min(sourceIndex, destinationIndex);

        int max = Math.max(sourceIndex, destinationIndex);

        for (int i = min; i <= max; i++) {

            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);

        }

    }


}
