package hethongquanlidiem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMarkTest {

    static Scanner input = new Scanner(System.in);
    static List<StudentMark> listStudents = new ArrayList<>();
    static int id = 1;
    static void menu() {
        System.out.println("Please select an option: ");
        System.out.println("1. Insert new Students ...");
        System.out.println("2. View list of Students ...");
        System.out.println("3. Average mark...");
        System.out.println("4. Exit");

    }

    static void inputInfo() {
        StudentMark studentMark = new StudentMark();
        
        studentMark.ID = id++;
        System.out.println("Input Full Name: ");
        studentMark.Fullname = input.nextLine();
        System.out.println("Input Class Room: ");
        studentMark.ClassRoom = input.nextLine();
        System.out.println("Input Semester: ");
        studentMark.Semester = Integer.parseInt(input.nextLine());
        for(int i = 0; i < studentMark.SubjectMarkList.length; i++  ){
            System.out.printf("Mark %d: ", i + 1);
            studentMark.SubjectMarkList[i] = Integer.parseInt(input.nextLine());
        }
       listStudents.add(studentMark);
    }
    
    static void showInfo(){
        System.out.println("List of students: ");
        for(StudentMark sm: listStudents){
            sm.display();
        }
    }
     
    static void averageMark(){
        System.out.println("List of students with average mark: ");
        for(StudentMark sm: listStudents){
            sm.AveCal();
            sm.display();
        }
            
    }
    

    public static void main(String[] args) {
        menu();

        while (true) {
            System.out.println("Option: ");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    inputInfo();
                    break;
                case 2:  
                    showInfo();
                    break;
                case 3: 
                    averageMark();
                    break;
                case 4:
                    return;

            }
        }
    }
}
