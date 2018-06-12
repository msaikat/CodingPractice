package com.coding.practice.designpattern.abstractfactory;

public class Pawn implements Piece {

    private PieceColor color;
    private String direction;

    public Pawn(PieceColor color) {
        this.color = color;
        this.direction = "up|down|diagonal";
        System.out.println(color.toString() + " Pawn Created");
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
