import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        System.out.println("Enter subject1 marks");
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        System.out.println("Enter subject2 marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter subject3 marks");
        int sub3 = sc.nextInt();
        System.out.println("Enter subject4 marks");
        int sub4 = sc.nextInt();
        System.out.println("Enter subject5 marks");
        int sub5 = sc.nextInt();
        float percentage = (sub1+sub2+sub3+sub4+sub5)*100/500;
        System.out.println("Perentage of the student : "+ percentage);

    }
}
