package com.henrique.boardgame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Position {

    private int row;
    private int column;

    @Override
    public String toString() {
        return "row = " + row + "; column = " + column;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

}
