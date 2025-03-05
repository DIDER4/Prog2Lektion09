package opgave04.model;

public class Absence {
    private int[][] absenceSchema = {
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0},
            {5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0}
    };

    public void print() {
        for (int elev = 0; elev < absenceSchema.length; elev++) {
            for (int måned = 0; måned < absenceSchema[elev].length; måned++) {
                System.out.println("Elev " + (elev + 1) + ", Måned " + (måned + 1) + ": " + absenceSchema[elev][måned]);
            }
            System.out.println();
        }
    }

    public int totalAbsence(int studentNumber) {
        int total = 0;
        for (int måned = 0; måned < absenceSchema[studentNumber].length; måned++) {
            total += absenceSchema[studentNumber][måned];
        }
        System.out.println("Total fravær for elev " + studentNumber + ": " + total);
        return total;
    }

    public double average(int studentNumber){
        int total = totalAbsence(studentNumber);
        return total / absenceSchema[studentNumber].length;
    }

    public int studentsWithoutAbsence(){
        int studentsWithoutAbsence = 0;
        for (int elev = 0; elev < absenceSchema.length; elev++) {
            boolean hasAbsence = false;
            for (int måned = 0; måned < absenceSchema[elev].length; måned++) {
                if (absenceSchema[elev][måned] != 0) {
                    hasAbsence = true;
                    break;
                }
            }
            if (!hasAbsence) {
                studentsWithoutAbsence++;
            }
        }
        return studentsWithoutAbsence;
    }

    public int mostAbsence(){
        int mostAbsence = 0;
        int studentNumber = 0;
        for (int elev = 0; elev < absenceSchema.length; elev++) {
            int total = 0;
            for (int måned = 0; måned < absenceSchema[elev].length; måned++) {
                total += absenceSchema[elev][måned];
            }
            if (total > mostAbsence) {
                mostAbsence = total;
                studentNumber = elev;
            }
        }
        return studentNumber;
    }

    public void reset(int studentNumber){
        for (int måned = 0; måned < absenceSchema[studentNumber].length; måned++) {
            absenceSchema[studentNumber][måned] = 0;
        }
    }
}
