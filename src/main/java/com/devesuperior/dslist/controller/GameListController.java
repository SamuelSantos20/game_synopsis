package com.devesuperior.dslist.controller;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.service.GameListService;
import com.devesuperior.dslist.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
@RequiredArgsConstructor
public class GameListController {

    private final GameListService gameListService;

    private final GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {

        List<GameListDTO> all = gameListService.findAll();
        return all;

    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findAll(@PathVariable(value = "listId")Long listId) {

        List<GameMinDTO> all = gameService.findByList(listId);
        return all;

    }



}
