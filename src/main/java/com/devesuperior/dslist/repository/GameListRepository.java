package com.devesuperior.dslist.repository;

import com.devesuperior.dslist.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(@Param("listId") Long listId, @Param(value = "gameId") Long gameId,@Param(value = "newPosition") Integer newPosition);

}