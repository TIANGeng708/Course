package xyz.chengzi.halma.model;

import java.awt.*;
import xyz.chengzi.halma.model.ChessPiece;

public class ChessPiece {
    private Color color;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
