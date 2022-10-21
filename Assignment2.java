public class Assignment {
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
        // JOHN CASPER
        
        String[] myFirstName = {"J","O","H","N","C","A","S","P","E","R"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        //5. Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)

        //For loop
        char[] firstname2 = {'J','O','H','N', 'C','A','S','P','E','R'};

            for (int r = 5; r >= 0; r--){
            System.out.print(firstname2[r]);

        }
    }
