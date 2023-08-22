package org.designpatterns.model;

public class Board {

    private Integer[][] board;

    private Integer boardSize;

    public Board(Integer boardSize) {
        this.boardSize = boardSize;
        this.board = new Integer[boardSize][boardSize];
    }

    public Integer getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(Integer boardSize) {
        this.boardSize = boardSize;
    }
}
