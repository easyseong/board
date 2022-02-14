package com.mybatis.board.model;

import lombok.Data;

@Data
public class Board {
    private int bno;
    private String title;
    private String writer;
    private String content;
}
