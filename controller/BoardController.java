package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    /**
     * 역슬래시 경로로 들어왔을때 helloworld 를 리턴합니다.
     * @GetMapping("/") GetMapping : 어떤 url 로 접근할 것인지 지정해주는 어노테이션
     *     @ResponseBody
     *     public String main(){
     *         return "Hello World";
     *     }
     *
     * */
    
    
    //localhost:8090/board/wirte 주소로 접속하면 board write 페이지 보여주는 설정
    @GetMapping("/board/write")
    public String boardwriteForm(){
        return "boardwrite";
    }

    //boardwrite.html 에서의 요청이 넘어왔는지 확인하는 메소드
    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){ //html 에서지정한 이름대로 매개변수가 Board 클래스에 담겨서 들어옴

        //구현하시면됩니다.
        /**
         * 힌트 : 서비스에 작성한 코드를 이용하여 적절한 코드를 작성하세요
         * */
        
    }
    
    
    //R : 리스트 기능 구현
    @GetMapping("/board/list")
    public String boardList(Model model){
        return "";
    }
     
    //R : 상세페이지 기능 구현
    @GetMapping("/board/view") //localhost:8090/board/view?id=1 하면, 1 이 id 값이된다. 
    //이렇듯 값을 전달하는  path variable 과query parameter 방식에 대해서도 알아보시길 바랍니다.
    public String boardView(Model model,Integer id){

        return "";
    }
    
    //D : delete 기능
    @GetMapping("/board/delete")
    public String boardDelete(Integer id){
        
    }


}
