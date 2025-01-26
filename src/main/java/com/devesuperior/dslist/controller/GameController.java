package com.devesuperior.dslist.controller;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.service.GameService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
@Tag(name = "Game")
public class GameController {

    private final GameService gameService;

    @GetMapping
    @ApiResponse(description = "Lista completa dos jogos cadastrados no sistema com as informações minimas. ")
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> all = gameService.findAll();
        return all;

    }

    @GetMapping(value = "/{id}")
    @ApiResponse(description = "Busca de um game especifico no sistema, utilizando como parametro o seu ID como parametro de busca.")
    public GameDTO findById(@PathVariable(value = "id") Long id) {

        GameDTO byId = gameService.findById(id);

        return byId;

    }


}
