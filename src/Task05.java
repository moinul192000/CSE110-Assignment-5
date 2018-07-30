/********************
 //Programmed By DarkSh@Dow
 //Moinul Haq
 //12:53 AM,Tue,7/31/2018,07,2018
 //CSE110
 **************************/
public class Task05 {
    public static void main(String[] args) {
        int[] a = new int[] {50, 30, 20, 10, 40};
        int largest = a[1];
        int largestLoc = 1;
        //Find Largest Number and Its location
        for (int i = 1; i < a.length ; i++) {
            if(a[i]>largest){
                largest = a[i];
                largestLoc = i;
            }
        }
        //Check if its needed to re-order or not.
        if(largestLoc != 1){
            int backup = a[1];
            a[1] = largest;
            a[largestLoc] = backup;
        }
        //Printing updated array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
