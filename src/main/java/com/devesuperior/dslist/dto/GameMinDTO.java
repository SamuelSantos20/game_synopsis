package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.model.Game;
import com.devesuperior.dslist.projections.GameMinProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameMinDTO {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

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
