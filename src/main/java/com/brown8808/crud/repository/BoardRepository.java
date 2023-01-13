package com.brown8808.crud.repository;

import com.brown8808.crud.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
