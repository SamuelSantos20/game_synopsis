package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.model.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameListDTO {

    private Long id;

    private String name;

    public GameListDTO(GameList list) {
        id = list.getId();
        name = list.getName();
    }
}
