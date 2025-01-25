package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.model.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
