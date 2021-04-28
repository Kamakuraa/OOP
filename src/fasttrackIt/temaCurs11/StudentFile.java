package fasttrackIt.temaCurs11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentFile {
    public static void main(String[] args) throws Exception {
        List<StudentGrade> student = readStudentFromFile();
        System.out.println(student);
        readDiscipline(student);
        gradesForStud(student);
        maxGrades(student);


    }

    private static void maxGrades(List<StudentGrade> student) throws Exception {
        try (BufferedWriter write = new BufferedWriter(
                new FileWriter("files/bestGrades.txt")
        )){
            for (StudentGrade studs : student){
                if (studs.getGrade() > 9 ){
                    write.write("Cei mai buni din clasa" + studs);
                    write.newLine();
                }
            }
        }
    }


    private static String avgToGrades(StudentGrade studentGrade) {
        return String.valueOf(Integer.parseInt(String.valueOf(studentGrade.getGrade())));
    }


    private static void gradesForStud(List<StudentGrade> student) throws Exception {
        try (BufferedWriter write = new BufferedWriter(
                new FileWriter("files/grade-reports.out")
        )) {
            for (StudentGrade std : student) {
                String line = gradesToStr(std);
                write.write(line);
                write.newLine();

            }
        }
    }
//    pentru exercitiul 2 nu stiu cum sa aplic toate metodele
// primesc toate notele dar nu reusesc sa returnez cea mai mare/mica si average nota 

    private static String gradesToStr(StudentGrade std) {
        return String.valueOf(Integer.parseInt(String.valueOf(std.getGrade())));
    }

    private static void readDiscipline(List<StudentGrade> students) throws Exception {
        try (BufferedWriter writeDisc = new BufferedWriter(
                new FileWriter("files/student.txt"))) {
            for (StudentGrade stud : students) {
                String line = studToStr(stud);
                writeDisc.write(line);
                writeDisc.newLine();
            }
        }
    }

    private static String studToStr(StudentGrade stud) {
        return stud.getDiscipline();
    }


    private static List<StudentGrade> readStudentFromFile() throws Exception {
        List<StudentGrade> student = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader("files/grades.txt"));
        String line;
        while ((line = fileReader.readLine()) != null) {
            student.add(readStudent(line));
        }
        return student;
    }

    private static StudentGrade readStudent(String stud) {
        String[] studData = stud.split("\\|");

        String name = studData[0];
        String discipline = studData[1];
        int grade = Integer.parseInt(studData[2]);

        return new StudentGrade(name, discipline, grade);
    }
}
