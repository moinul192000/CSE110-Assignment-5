/********************
 //Programmed By DarkSh@Dow
 //Moinul Haq
 //12:26 AM,Tue,7/31/2018,07,2018
 //CSE110
 **************************/
public class Task03 {
    public static void main(String[] args) {
        int[] a = new int[] {10, 30, 20, 50, 40};
        int highest = a[0];
        int loc = 0;
        //Getting the highest number and it`s location
        for (int i = 0; i < a.length; i++) {
            if(highest<a[i]){
                highest = a[i];
                loc = i;
            }
        }
        //Printing Detail`s
        System.out.println("Largest number is "+highest);
        System.out.println("Largest number was found at location "+loc);
    }
}
