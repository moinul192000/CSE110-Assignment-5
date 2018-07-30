import java.util.Scanner;

/********************
 //Programmed By DarkSh@Dow
 //Moinul Haq
 //1:13 AM,Tue,7/31/2018,07,2018
 //CSE110
 **************************/
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[] {50, 30, 20, 10, 40};
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minloc = i;
            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    minloc = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[minloc] = temp;
        }
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(a[n]);
    }
}
