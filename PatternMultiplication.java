"Implement a Java-main-method that prints out the multiplication table for all numbers from 1 to 10.
"Use the tabulator character \t' to align the values. A sample output is shown below.
  
  public class Multi {
   public static void main(String[] args) {
       int size = 11;
      int row=1;
      while(row<size){  
         System.out.printf("%2d ", row); 
          
          int column=2;
         while(column <size){  
            System.out.printf("%4d", row * column);
            column++;
         }
         row++;
         System.out.println(); 
         
      }
   }
}
