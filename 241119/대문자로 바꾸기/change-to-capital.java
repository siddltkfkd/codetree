import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                sb.append(sc.next().toUpperCase()).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}