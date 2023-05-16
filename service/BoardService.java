package com.example.board.service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired //스프링빈이 읽어와서 알아서 boardrepository 를 주입을 해줍니다. (Dependency Injection)
    private BoardRepository boardRepository;

    public void write(Board board){
        //entity 에 저장하는 코드를 작성해주세요.
      
    }
    //이렇게 작성한 서비스는 컨트롤러에서 이용됩니다. 
    //헷갈리신다면 MVC구조, 어노테이션 등에 대해 파악하고 풀어주시길 바랍니다. 
}
