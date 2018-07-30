import java.util.Scanner;

/********************
 //Programmed By DarkSh@Dow
 //Moinul Haq
 //1:45 AM,Tue,7/31/2018,07,2018
 //CSE110
 **************************/
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to input?");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Numbers");
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
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

        if (n%2 == 0){
            float median = (float)(a[n/2]+a[(n/2)-1])/2;
            System.out.println(median);
        }else{
            float median = (float)a[(n)/2];
            System.out.println(median);
        }

    }
}
