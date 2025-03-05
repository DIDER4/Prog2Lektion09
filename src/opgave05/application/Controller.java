package opgave05.application;

import javafx.beans.property.StringProperty;
import javafx.scene.input.MouseButton;
import opgave05.application.model.Board;
import opgave05.application.model.Point;

public class Controller {
    private static Board board = new Board(9, 10);
    public static void handle(Point point, MouseButton button) {
        if (button == MouseButton.PRIMARY && board.getField(point).equals(" ")) {
            board.setField(point, "F");
            if(board.getRemainingMinesProperty().get() > 0) {
                board.getRemainingMinesProperty().set(board.getRemainingMinesProperty().get() - 1);
            } else {
                System.out.println("Ikke flere miner tilbage");
            }
            return;
        }
    }

    public static void fjernFlag(Point point, MouseButton button) {
        if (button == MouseButton.PRIMARY && board.getField(point).equals("F")) {
            board.setField(point, " ");
            board.getRemainingMinesProperty().set(board.getRemainingMinesProperty().get() + 1);
        }
    }

    public static StringProperty getField(int x, int y) {
        return board.getField(x, y);
    }

    public static Board getBoard() {
        return board;
    }
}
