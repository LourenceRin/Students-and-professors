import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Student> studentsList = new ArrayList();
    private static List<Professor> professorsList = new ArrayList();
     private static void addPerson() throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String student = "Student";
        String professor = "Professor";
        System.out.println("Student or Professor?");
        String input = reader.readLine();

        if (input.toLowerCase().equals(student.toLowerCase()) || input.toLowerCase().equals(professor.toLowerCase())) {
            System.out.println("Name: ");
            String inputName = reader.readLine();
            System.out.println("Last name: ");
            String inputLastName = reader.readLine();
            System.out.println("Patronymic: ");
            String inputPatronymic = reader.readLine();

            try {
                if (input.toLowerCase().equals(student.toLowerCase())) {
                    System.out.println("Grade point average: ");
                    int point = Integer.parseInt(reader.readLine());
                    Student studentMain = new Student(inputName, inputLastName, inputPatronymic, point);
                    studentsList.add(studentMain);

                } else if (input.toLowerCase().equals(professor.toLowerCase())) {
                    System.out.println("Publication Count: ");
                    int publicationCount = Integer.parseInt(reader.readLine());
                    System.out.println("Age: ");
                    int age = Integer.parseInt(reader.readLine());
                    System.out.println("Students count: ");
                    int studentsCount = Integer.parseInt(reader.readLine());
                    System.out.println("Position number: ");
                    System.out.println("1 - CHANCELLOR");
                    System.out.println("2 - PRO RECTOR");
                    System.out.println("3 - UNIVERSITY ADMINISTRATION");
                    System.out.println("4 - FACULTY");
                    System.out.println("5 - HEAD OF A FACULTY");
                    System.out.println("6 - PROFESSOR");
                    int numberPositionInput = Integer.parseInt(reader.readLine());

                    Professor professorMain = new Professor(inputName, inputLastName, inputPatronymic, publicationCount, age, studentsCount, numberPositionInput);
                    professorsList.add(professorMain);

                }
                System.out.println("Continue? Yes/No(Show data)");
                String continueInput = reader.readLine();
                String yes = "Yes";
                String no = "No";

                if (continueInput.toLowerCase().equals(yes.toLowerCase())){
                    addPerson();
                }else if (continueInput.toLowerCase().equals(no.toLowerCase())){

                    for (Student i : studentsList) {
                        i.showData();
                    }
                    for (Professor i : professorsList){
                        i.showData();
                    }
                }
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        } else if (!input.toLowerCase().equals(student.toLowerCase()) || !input.toLowerCase().equals(professor.toLowerCase())) {
            System.out.println("Please reload program!");
        }
    }

    public static void main(String[] args) throws IOException {
        addPerson();
        }
    }
