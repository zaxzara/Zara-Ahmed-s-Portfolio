/**
 * COMPLETE THE COMMENT HEADER FOR THIS PROGRAM
 */

/*
 * Requirements:
 * - This program must a 3 x 3 int[][] array to model
 *     the state of the Tic Tac Toe board. Each box on
 *     the board can be one of the following values:
        //  EMPTY (0) means the box is empty
        //  X_TURN (1) means the box has an X
        //  O_TURN (2) means the box has an O
 * - Use "moves" to count the number of current clicks
 * - Use "turn" to keep track of the current turn: X_TURN
 *     or O_turn
 * - Use "isGameOver" to track whether the game is over (true)
 *     or not (false)
 * - Must implement the following methods:
 *     - drawBoard() : Draws an empty 3 x 3 board
 *     - handleClick() : responds to each mouse click on the board
 *     - isWinner() : returns true if current player has 3 in a row
 *     - changeTurn() : changes turns
 */
import java.awt.*;

public class TicTacToe {
    final static int BOX_SIZE = 100;
    final static int WINDOW_SIZE = 3 * (BOX_SIZE) + 3;
    private static int moves;
    private static int turn;
    private static final int X_TURN = 1;
    private static final int O_TURN = 2;
    private static int[][] board;
    private static boolean isGameOver;

    public static void main(String[] args) {

        // Initialize: moves, turn (1st player is X), and
        //    isGameOver. Also create the 2D int array.
        // START CODE HERE =============================

        // END CODE HERE ===============================

        DrawingPanel panel = new DrawingPanel(WINDOW_SIZE, WINDOW_SIZE);
        Graphics g = panel.getGraphics();
        drawBoard(g);
        System.out.println("moves = " + moves);
        // Set the callback method for event mouseClick
        panel.onMouseClick(
                (x, y) -> {
                    handleClick(g, x, y);
                }
        );

    }

    private static void handleClick(Graphics g, int x, int y) {
        int row, col;
        // Obtain the row, col for the box clicked
        row = y / BOX_SIZE;
        col = x / BOX_SIZE;
        // Obtain the coordinate of the box
        int yTop = row * BOX_SIZE;
        int xTop = col * BOX_SIZE;
        System.out.printf("(row, col) = (%d, %d)\n", row, col);

        // START CODE HERE =====================================
        // Suggested parts:
        // 1) If game is over then return back to main()

        // 2) If the box is occupied, then return

        // 3) Box must be unoccupied, so update the state of the
        //    board by setting its value at (row,col) to current turn

        // 4) Draw an O or X depending on the current turn

        // 5) Check if the current turn has 3 in a row. If so,
        //      print message indicating current player won and
        //      change isGameOver to true.

        // 6) Increase moves by 1 and then check if moves
        //     is equal to 9. If so, set isGameOver to true

        // 7) Change value of turn

        // END CODE HERE =======================================

    }

    /**
     * isWinner() receives 2 parameters: the current turn,
     *   and a reference to the board array. It should check
     *   all possible ways in which turn may have 3 in a row.
     *   Return true if there is at least 3 in a row, otherwise
     *   return false.
     * @param turn : int, current turn (X_TURN or O_TURN)
     * @param board : int[][]
     * @return  boolean
     */
    private static boolean isWinner(int turn, int[][] board) {
        // START CODE HERE ====================================
        return false;  // Replace this line with your code.

        // END CODE HERE ======================================
    }

    /**
     * changeTurn() changes value of turn from X_TURN to O_TURN
     * and from O_TURN to X_TURN
     */
    private static void changeTurn() {
        // START CODE HERE =================================

        // END CODE HERE ===================================
    }

    /**
     * drawBoard() draws an empty board
     * @param g : Graphics
     */
    private static void drawBoard(Graphics g) {
        // START CODE HERE =================================

        // END CODE HERE ===================================
    }
}
