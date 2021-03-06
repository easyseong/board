package com.mybatis.board.controller;

import com.mybatis.board.dao.BoardDao;
import com.mybatis.board.model.Board;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public List create(Board board) {
        boardDao.create(board);
        log.info("create: " + board + "=========================");
        return boardDao.selectList();
    }

    @GetMapping("/read/{bno}")
    public Board read(@PathVariable("bno") int bno) {
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
    @GetMapping("/delete/{bno}")
    public List<Board> delete(@PathVariable("bno") int bno) {
        boardDao.delete(bno);
        log.info("delete: " + bno + "=========================");
        return boardDao.selectList();
    }



}
