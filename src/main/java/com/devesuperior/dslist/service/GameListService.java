package com.devesuperior.dslist.service;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.model.GameList;
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

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {

        List<GameListDTO> list = gameListRepository.findAll().stream().map(GameListDTO::new).toList();

        return list;


    }


//
//    @Transactional(readOnly = true)
//    public GameDTO findById(Long id) {
//
//        GameDTO gameDTO = gameRepository.findById(id).map(GameDTO::new).get();
//
//        return gameDTO;
//
//    }


}
