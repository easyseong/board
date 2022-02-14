package com.mybatis.board.controller;

import com.mybatis.board.dao.BoardDao;
import com.mybatis.board.model.Board;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
public class BoardController {

    @Autowired
    BoardDao boardDao;

    @GetMapping("/")
    public List<Board> main() {
        List<Board> list = boardDao.selectList();
        return list; //페이지에 list내용이 출력됨
    }

    @GetMapping("/create")
    public List<Board> create(Board board) {
        boardDao.create(board);
        log.info("create: " + board + "=========================");
        return boardDao.selectList();
    }

    @GetMapping("/read")
    public Board read(@RequestParam int bno) {
        Board result = boardDao.read(bno);
        log.info("read: " + result + "=========================");
        return result;
    }

    @GetMapping("/update")
    public List<Board> update(Board board) {
        boardDao.update(board);
        log.info("update: " + board + "=========================");
        return boardDao.selectList();
    }
    @GetMapping("/delete")
    public List<Board> delete(@RequestParam int bno) {
        boardDao.delete(bno);
        log.info("delete: " + bno + "=========================");
        return boardDao.selectList();
    }

    @GetMapping("/test")
    public String test(@RequestParam String a, @RequestParam String b) {
        log.info("test===============================");
        return a + b;
    }


}
