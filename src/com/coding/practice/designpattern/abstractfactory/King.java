package com.coding.practice.designpattern.abstractfactory;

public class King implements Piece {

    private PieceColor color;
    private String direction;

    public King(PieceColor color) {
        this.color = color;
        this.direction = "any";
        System.out.println(color.toString() + " King Created");
    }

    @Override
    public PieceColor getColor() {
        return color;
    }

    @Override
    public String getMovement() {
        return direction;
    }

}
