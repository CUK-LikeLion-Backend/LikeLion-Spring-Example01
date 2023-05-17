package com.example.board.repository;

import com.example.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {

//페이징 기능시에 필요함 
  //위 기능 구현안하면 그냥 복붙만해주세요~
}
