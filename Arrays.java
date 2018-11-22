package arrays;
public class Arrays 
{
    public static void main(String[] args) 
    {
      System.out.println("First array 'Ages'");
      System.out.println("\n");
        
      int[] ages = new int[] {10,20,30,40};
      
      
      System.out.println(ages[0]);
      System.out.println(ages[1]);
      System.out.println(ages[2]);
      System.out.println(ages[3]);
      
      System.out.println("\n");
      System.out.println("End of first array");
      System.out.println("\n");
              
      System.out.println("Second Array 'Ages1'");
      System.out.println("\n");
      
      int[] ages1;
      
      ages1 = new int[6];
      
      ages1[0] = 12;
      ages1[1] = 23;
      ages1[2] = 34;
      ages1[3] = 45;
      ages1[4] = 56;
      ages1[5] = 67;
      
      System.out.println("Element 0 = " + ages1[0]);
      System.out.println("Element 1 = " + ages1[1]);
      System.out.println("Element 2 = " + ages1[2]);
      System.out.println("Element 3 = " + ages1[3]);
      System.out.println("Element 4 = " + ages1[4]);
      System.out.println("Element 5 = " + ages1[5]);
            
      System.out.println("\n");
      System.out.println("End of second array");
    }
    
}
