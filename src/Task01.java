/********************
 //Programmed By DarkSh@Dow
 //Moinul Haq
 //12:26 AM,Tue,7/31/2018,07,2018
 //CSE110
 **************************/
public class Task01 {
    public static void main(String[] args) {
        int[] marks = new int[] {10, 30, 20, 50, 40};
        int highest,lowest,average,sum;
        highest = marks[0];
        lowest = marks[0];
        sum = 0;
        //Getting highest lowest and sum
        for (int i = 0; i < marks.length; i++) {
            if(highest<marks[i]){
                highest = marks[i];
            }
            if (lowest>marks[i]){
                lowest = marks[i];
            }
            sum = sum + marks[i];
        }
        //Average calculation
        average = sum/marks.length;

        //Printing Average
        System.out.println("Highest mark is "+highest);
        System.out.println("Lowest mark is "+lowest);
        System.out.println("Average mark is "+average);
    }
}

