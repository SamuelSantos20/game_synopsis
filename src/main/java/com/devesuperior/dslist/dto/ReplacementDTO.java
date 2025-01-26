package com.devesuperior.dslist.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(name = "ReplacementDTO")
public class ReplacementDTO {
    @Schema(name = "sourceIndex")
    private Integer sourceIndex;
    @Schema(name = "destinationIndex")
    private Integer destinationIndex;

}
