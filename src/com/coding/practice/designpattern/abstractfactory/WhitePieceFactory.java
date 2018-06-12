package com.coding.practice.designpattern.abstractfactory;

public class WhitePieceFactory implements PieceFactory {

    @Override
    public Piece[] createPieces() {
        return new Piece[] { new King(PieceColor.WHITE),
                new Pawn(PieceColor.WHITE) };
    }
}
