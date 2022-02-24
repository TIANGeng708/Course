package xyz.chengzi.halma.listener;

import xyz.chengzi.halma.model.ChessBoardLocation;
import xyz.chengzi.halma.view.ChessComponent;
import xyz.chengzi.halma.view.SquareComponent;

public interface InputListener extends Listener {
    void onPlayerClickSquare(ChessBoardLocation location, SquareComponent component);

    void onPlayerClickChessPiece(ChessBoardLocation location, ChessComponent component);
}
