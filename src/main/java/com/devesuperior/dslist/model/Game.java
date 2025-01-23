package com.devesuperior.dslist.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;


    @Column(name = "shortDescription", columnDefinition = "TEXT")
    private String shortDescription;

    @Column(name = "longDescription", columnDefinition = "TEXT")
    private String longDescription;

}
