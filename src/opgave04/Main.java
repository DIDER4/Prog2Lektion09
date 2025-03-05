package opgave04;

import opgave04.model.Absence;

public class Main {
    public static void main(String[] args) {
        Absence absence = new Absence();
        absence.print();
        absence.totalAbsence(2);
        absence.average(2);
        System.out.println("Studerende uden fravær: " + absence.studentsWithoutAbsence());
        System.out.println("Den studerende med mest fravær: " + absence.mostAbsence());
        absence.reset(3);
    }


}


