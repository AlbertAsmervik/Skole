import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        
    // sort
    
  
    int [] numbers = {12, 1, 5, -2, 16, 14};

    Arrays.sort(numbers);

    System.out.println(Arrays.toString(numbers));


    // avlangs, lister opp Mynumbers med for setningen

    int [] myNumbers = {10, 20, 30, 40, 50, 60};

    for (int i = 0; i < myNumbers.length; i++)
    {
      System.out.println(myNumbers[i]);
    }


   // new array 
   int [] idNumbers = new int[10];

//

    int [] salaries = new int[4];
    salaries[0]=10000;
    salaries[1]= 12000;
    salaries[2] = 13000;
    salaries[3] = 15000;
    

    System.out.print(salaries[2]);
//





    


}
}
