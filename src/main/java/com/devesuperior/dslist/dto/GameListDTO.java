package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.model.GameList;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Schema(name = "GameListDTO")
public class GameListDTO {
    @Schema(name = "id")
    private Long id;
    @Schema(name = "name")
    private String name;

    public GameListDTO(GameList list) {
        id = list.getId();
        name = list.getName();
    }
}
