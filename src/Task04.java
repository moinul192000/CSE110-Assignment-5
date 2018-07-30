/********************
 //Programmed By DarkSh@Dow
 //Moinul Haq
 //12:29 AM,Tue,7/31/2018,07,2018
 //CSE110
 **************************/
public class Task04 {
    public static void main(String[] args) {
        int[] a = new int[] {10, 30, 20, 50, 40};
        int largest = a[0];
        int largestLoc = 0;
        //Find Largest Number and Its location
        for (int i = 0; i < a.length ; i++) {
            if(a[i]>largest){
                largest = a[i];
                largestLoc = i;
            }
        }
        //Check if its needed to re-order or not.
        if(largestLoc != 0){
            int backup = a[0];
            a[0] = largest;
            a[largestLoc] = backup;
        }
        //Printing updated array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
