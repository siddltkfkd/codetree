import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int format = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if (format == 1) {
            for (int i=1; i<=n; i++) {
                for (int j=0; j<i; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        else if (format == 2) {
            for (int i=n; i>0; i--) {
                for (int j=0; j<i; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        else if (format == 3) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<n-i-1; j++) {
                    sb.append(" ");
                }
                for (int j=0; j<i*2; j++) {
                    sb.append("*");
                }
                sb.append("*");
                for (int j=0; j<n-i; j++) {
                    sb.append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}