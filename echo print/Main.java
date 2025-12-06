import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = new String("");
        do {
            if (str.contains(":q")) return;

            System.out.println(str);
            System.out.print(">>> ");
            str = input.nextLine();
        } while (true);
    }
}
