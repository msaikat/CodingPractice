package com.coding.practice.designpattern.abstractfactory;

public class AbstractFactory {
    public static void main(String[] args) {
        PieceFactory pieceFactory = AbstractFactory.getFactory(PieceColor.WHITE);
        Piece[] pieces = pieceFactory.createPieces();
    }

    private static PieceFactory getFactory(PieceColor pieceColor) {
        switch (pieceColor) {
            case WHITE:
                return new WhitePieceFactory();
    
            case BLACK:
                return new BlackPieceFactory();
        }
        return null;
    }
}