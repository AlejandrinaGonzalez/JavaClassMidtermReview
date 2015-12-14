public class SecretSanta { // Four Days of S.S.
    public static void main(String args[]){
   //Defining strings for number of days and gifts for each day
        String days[] = new String[4];
        	days[0]="first";
        	days[1]="second";
        	days[2]="third";
        	days[3]="fourth";
        String gifts[] = new String[4];
            gifts[0]="a bag full of candy";
            gifts[1]="a twix and two clues";
            gifts[2]="uhm...nothing";
            gifts[3]="a giftcard, socks, etc.";
        for (int i=0;i<days.length;i++){  //setting the for loop for days
            //printing data to screen
            System.out.println();
            System.out.print("On the ".concat(days[i]).concat(" day of Christmas, "));
            System.out.print("my S.S. gave to me: ");
        for (int j=i;j>=0;j--);{ //setting for the loop of gifts
            System.out.println(gifts[i]);
            }
        }          
    }
}
