package opgave01;

public class Main {
    public static char[][] input = {
            {'M', 'M', 'M', 'S', 'X', 'X', 'M', 'A', 'S', 'M'},
            {'M', 'S', 'A', 'M', 'X', 'M', 'S', 'M', 'S', 'A'},
            {'A', 'M', 'X', 'S', 'X', 'M', 'A', 'A', 'M', 'M'},
            {'M', 'S', 'A', 'M', 'A', 'S', 'M', 'S', 'M', 'X'},
            {'X', 'M', 'A', 'S', 'A', 'M', 'X', 'A', 'M', 'M'},
            {'X', 'X', 'A', 'M', 'M', 'X', 'X', 'A', 'M', 'A'},
            {'S', 'M', 'S', 'M', 'S', 'A', 'S', 'X', 'S', 'S'},
            {'S', 'A', 'X', 'A', 'M', 'A', 'S', 'A', 'A', 'A'},
            {'M', 'A', 'M', 'M', 'M', 'X', 'M', 'M', 'M', 'M'},
            {'M', 'X', 'M', 'X', 'A', 'X', 'M', 'A', 'S', 'X'}
    };

    public static void main(String[] args) {
        antalXmas();

    }

    public static void antalXmas() {
        int count = 0;
        int rows = input.length;
        int cols = input[0].length;

        // Check horizontally
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (input[i][j] == 'X' && input[i][j + 1] == 'm' && input[i][j + 2] == 'a' && input[i][j + 3] == 's') {
                    count++;
                }
            }
        }

        // Check vertically
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < cols; j++) {
                if (input[i][j] == 'X' && input[i + 1][j] == 'm' && input[i + 2][j] == 'a' && input[i + 3][j] == 's') {
                    count++;
                }
            }
        }

        // Check diagonally (top-left to bottom-right)
        for (int i = 0; i < rows - 3; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (input[i][j] == 'X' && input[i + 1][j + 1] == 'm' && input[i + 2][j + 2] == 'a' && input[i + 3][j + 3] == 's') {
                    count++;
                }
            }
        }

        // Check diagonally (bottom-left to top-right)
        for (int i = 3; i < rows; i++) {
            for (int j = 0; j < cols - 3; j++) {
                if (input[i][j] == 'X' && input[i - 1][j + 1] == 'm' && input[i - 2][j + 2] == 'a' && input[i - 3][j + 3] == 's') {
                    count++;
                }
            }
        }

        System.out.println("Antal Xmas: " + count);
    }
}
