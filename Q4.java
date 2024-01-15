import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter Kilometers");
        Scanner sc = new Scanner(System.in);
        float kilo = sc.nextFloat();
        System.out.println("Conversion begins ");
        float Miles = kilo*(0.621371f);
        System.out.println(Miles);
    }
}
