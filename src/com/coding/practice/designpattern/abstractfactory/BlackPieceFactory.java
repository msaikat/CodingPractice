package com.coding.practice.designpattern.abstractfactory;

public class BlackPieceFactory implements PieceFactory {
    @Override
    public Piece[] createPieces() {
        return new Piece[] { new King(PieceColor.BLACK),
                new Pawn(PieceColor.BLACK) };
    }
}
