package com.devesuperior.dslist.projections;

/**
 * Projection for {@link com.devesuperior.dslist.model.Game}
 */
public interface GameMinProjection {
    Long getId();

    String getTitle();

    Integer getGameYear();

    String getGenre();

    String getPlatforms();

    Double getScore();

    String getImgUrl();

    String getShortDescription();

    String getLongDescription();
}