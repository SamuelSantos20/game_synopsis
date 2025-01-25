package com.devesuperior.dslist.service;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.model.Game;
import com.devesuperior.dslist.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> list = gameRepository.findAll().stream().map(GameMinDTO::new).toList();

        return list;


    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {

        GameDTO gameDTO = gameRepository.findById(id).map(GameDTO::new).get();

        return gameDTO;

    }


}
