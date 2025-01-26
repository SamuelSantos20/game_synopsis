package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.model.Game;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
@Schema(name = "GameDTO")
public class GameDTO {
    @Schema(name = "id")
    private Long id;
    @Schema(name = "title")
    private String title;
    @Schema(name = "year")
    private Integer year;
    @Schema(name = "genre")
    private String genre;
    @Schema(name = "platforms")
    private String platforms;
    @Schema(name = "score")
    private Double score;
    @Schema(name = "imgUrl")
    private String imgUrl;
    @Schema(name = "shortDescription")
    private String shortDescription;


    public GameDTO(Game game) {
        BeanUtils.copyProperties(game, this);
    }
}
