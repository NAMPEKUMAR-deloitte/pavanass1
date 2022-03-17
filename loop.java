import java.util.*;

public class loop {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 6; i >= 1; i--)
        {
            for (int j = 6; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
