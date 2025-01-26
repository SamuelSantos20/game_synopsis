package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.model.Game;
import com.devesuperior.dslist.projections.GameMinProjection;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Schema(name = "GameMinDTO")
public class GameMinDTO {
    @Schema(name = "")
    private Long id;
    @Schema(name = "title")
    private String title;
    @Schema(name = "year")
    private Integer year;
    @Schema(name = "imgUrl")
    private String imgUrl;
    @Schema(name = "shortDescription")
    private String shortDescription;


    public GameMinDTO(Game game) {
        id = game.getId();
        year = game.getYear();
        title = game.getTitle();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
    }

    public GameMinDTO(GameMinProjection gameMinProjection) {
        id = gameMinProjection.getId();
        year = gameMinProjection.getGameYear();
        title = gameMinProjection.getTitle();
        imgUrl = gameMinProjection.getImgUrl();
        shortDescription = gameMinProjection.getShortDescription();
    }
}
