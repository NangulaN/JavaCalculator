import java.util.Scanner;

public class ArrayUser {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String[] names = new String[5];

        for( int i = 0; i < names.length; i++) {
            System.out.print("Please enter your name: ");
            names[i] = p.nextLine();
            System.out.println(names[i]);
        }
        System.out.println("These are the names: ");
        for( String name : names) {
            System.out.println(name);
        }
    }
}
