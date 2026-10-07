import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

     Scanner in = new Scanner(System.in); 


        int i = 0;
        String song = "";

        while (!song.equals(" ") && !in.equals("Stop")) {
            System.out.println("Enter a song number");
            song = in.nextLine();

    if (i == 0) {
      i++;
        break;  }
    
     

    if (i <= 3)
        
System.out.println("playing song: " + i);

else {
   System.out.println("playing song: " + i); 
}

         
      }

   }


}



   
    
