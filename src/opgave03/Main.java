package opgave03;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };
        int[] result = locateSmallest(input);
        System.out.println("Mindste tal er i " + result[0] + ", " + result[1]);
    }

    private static int[] locateSmallest(double[][] input) {
        double mindsteTal = Double.MAX_VALUE; // Double.MAX_VALUE er større end alle andre tal
        int[] position = new int[2]; // position[0] er række, position[1] er kolonne
        for (int i = 0; i < input.length; i++) { // input.length beregner antal rækker
            for (int j = 0; j < input[i].length; j++) { // input[i].length beregner antal kolonner i række i
                if (input[i][j] < mindsteTal) { // input[i][j] beregner diagonalen
                    mindsteTal = input[i][j];
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }
}
