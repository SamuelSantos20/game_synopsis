package com.devesuperior.dslist.controller;

import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> all = gameService.findAll();
        return all;

    }


}
