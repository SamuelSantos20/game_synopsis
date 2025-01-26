package com.devesuperior.dslist.controller;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.dto.ReplacementDTO;
import com.devesuperior.dslist.service.GameListService;
import com.devesuperior.dslist.service.GameService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
@RequiredArgsConstructor
@Tags({
        @Tag(name = "game", description = "Operações relacionadas a jogos"),
        @Tag(name = "gamelist", description = "Operações relacionadas a listas de jogos")
})
public class GameListController {

    private final GameListService gameListService;

    private final GameService gameService;

    @GetMapping
    @ApiResponse(description = "Lista geral dos games.Contem todas informações dos games cadastrados no sistema.")
    public List<GameListDTO> findAll() {

        List<GameListDTO> all = gameListService.findAll();
        return all;

    }

    @GetMapping(value = "/{listId}/games")
    @ApiResponse(description = "Gera uma lista com os tpos de generos cadastrados no sistema.")
    public List<GameMinDTO> findAll(@PathVariable(value = "listId") Long listId) {

        List<GameMinDTO> all = gameService.findByList(listId);
        return all;

    }

    @PostMapping(value = "/{listId}/replecement")
    @ApiResponse(description = "Esse método faz a função de reposicionamento de games na lista. Conforme eles são alterados no front, sofrem mudanças no número da posição no banco.")
    public void move(@PathVariable(value = "listId") Long listId, @RequestBody ReplacementDTO replacementDTO) {

        gameListService.move(listId, replacementDTO.getSourceIndex(), replacementDTO.getDestinationIndex());


    }


}
