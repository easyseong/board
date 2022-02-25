package com.mybatis.board.service;

import com.mybatis.board.dao.BoardDao;
import com.mybatis.board.model.Board;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardServiceImpl implements BoardService { //서비스에서 dao를 호출? 사용

    @Autowired
    BoardDao boardDao; //boardDao에 xml에 접근하는 id 있음


    @Override
    public List<Board> selectList() {
        return boardDao.selectList();
    }

    @Override
    public void create(Board board) {
        boardDao.create(board);
    }

    @Override
    public Board read(int bno) {
        return boardDao.read(bno);
    }

    @Override
    public void update(Board board) {
        boardDao.update( board);
    }

    @Override
    public void delete(int bno) {
        boardDao.delete(bno);
    }
}
