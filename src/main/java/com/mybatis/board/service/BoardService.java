package com.mybatis.board.service;

import com.mybatis.board.model.Board;

import java.util.List;

public interface BoardService {
    public List<Board> selectList();

    public void create(Board board);

    public Board read(int bno);

    public void update(Board board);

    void delete(int bno);
}
