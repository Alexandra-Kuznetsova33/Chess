package chesspiece;
import kuznetzova.a.chess.Cell;
import kuznetzova.a.chess.ChessPiece;

/**
 * Ладья
 */
public class Rook extends ChessPiece {
    public Rook(String color, Cell position) {
        super(color, position);
    }

    @Override
    protected boolean canMoveToPosition(int dX, int dY) {
        return dX == 0 || dY == 0;
    }
}