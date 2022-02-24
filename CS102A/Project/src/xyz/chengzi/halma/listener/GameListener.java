package xyz.chengzi.halma.listener;

import xyz.chengzi.halma.model.ChessBoard;
import xyz.chengzi.halma.model.ChessBoardLocation;
import xyz.chengzi.halma.model.ChessPiece;

public interface GameListener extends Listener {
    void onChessPiecePlace(ChessBoardLocation location, ChessPiece piece);

    void onChessPieceRemove(ChessBoardLocation location);

    void onChessBoardReload(ChessBoard board);
}
