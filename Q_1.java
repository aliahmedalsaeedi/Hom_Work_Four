import java.awt.*;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        Rectangle R= new Rectangle();
        Scanner in=new Scanner(System.in);
        System.out.print("Palse Enter the width : ");
        R.width=in.nextInt();
        System.out.print("Palse Enter the height : ");
        R.height=in.nextInt();
        System.out.println("--------------------------");

        System.out.println("The perimter is : "+2*(R.getWidth() + R.getHeight()));
    }
}
