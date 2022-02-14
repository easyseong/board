package com.mybatis.board.dao;

import com.mybatis.board.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    public List<Board> selectList(); //이 메소드명==xml의 id명

    public void create(Board board);

    public Board read(int bno);

    public void update(Board board);

    void delete(int bno);
}
