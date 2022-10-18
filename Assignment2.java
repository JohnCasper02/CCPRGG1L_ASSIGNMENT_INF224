public class Assignment2 {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=3){
            System.out.println("JOHN CASPER");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("IGLESIAS");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("LAYA");
        }
        // char array
        
        String[] myFirstName = {"J","O","H","N","C","A","S","P","E","R"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"R","E","P","S","A","C","N","H","O","J"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
}
    }
}
