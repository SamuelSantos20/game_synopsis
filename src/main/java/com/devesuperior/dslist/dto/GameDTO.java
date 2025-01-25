package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.model.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
public class GameDTO {

    private Long id;

    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

    private String shortDescription;


    public GameDTO(Game game) {
        BeanUtils.copyProperties(game, this);
    }
}
