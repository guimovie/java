import java.util.Random;

public class MatrizGradeBook {
    private int[][] grades;
    private String courseName;
    private static Random random = new Random();

    public MatrizGradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void outputGrades() {
        System.out.println("Course: " + courseName);
        System.out.println("The grades are: ");
        System.out.println();
        System.out.print("               ");
        for (int i = 1; i <= grades[0].length; i++) {
            System.out.printf("Test%d   ", i);
        }
        System.out.println("Average");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            double total = 0;

            for (int test = 0; test < grades[student].length; test++) {
                System.out.printf("%8d", grades[student][test]);
                total += grades[student][test];
            }

            double average = total / grades[student].length;
            System.out.printf("%11.2f%n", average);
        }
    }

    public static void main(String[] args) {
        int[][] gradesArray = new int[25][5];
        for (int i = 0; i < gradesArray.length; i++) {
            for (int j = 0; j < gradesArray[i].length; j++) {
                gradesArray[i][j] = 1 + random.nextInt(100);
            }
        }
        MatrizGradeBook myGradeBook = new MatrizGradeBook("Curso Bacana de Java", gradesArray);
        myGradeBook.outputGrades();
    }
}
