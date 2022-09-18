import java.awt.*;
import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Rectangle box=new Rectangle();

        System.out.println("Wilcome to AddTester........");

        System.out.print("Enter X : ");
        box.x=in.nextInt();
        System.out.print("Enter Y : ");
        box.y=in.nextInt();
        System.out.print("Enter width : ");
        box.width=in.nextInt();
        System.out.print("Enter height : ");
        box.height=in.nextInt();
        System.out.println("---------------------------------------");


        box.add(0,0);
        System.out.println("The X is : "+box.x);
        System.out.println("The Y is : "+box.y);
        System.out.println("The width is : "+box.width);
        System.out.println("The height is  : "+box.height);


    }
}
