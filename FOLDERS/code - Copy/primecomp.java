import java.util.Scanner; 
public class primecomp{ 
 public static void main(String args[]) 
 { 
 try { 
 Scanner input = new Scanner(System.in); 
 System.out.print("Enter the number of numbers: "); 
 int n = input.nextInt(); 
 int[] arr = new int[n]; 
 System.out.print("Enter the numbers\n"); 
 for (int i = 0; i < n; i++) { 
 arr[i] = input.nextInt(); 
 } 
 int prime, composite; 
 prime = 0; 
 composite = 0; 
 for (int i = 0; i < n; i++) { 
 int pri = 0; 
 for (int j = 1; j < 100; j++) { 
 if (arr[i] % j == 0) 
 pri = pri + 1; 
 } 
 if (pri == 2) 
 prime = prime + 1; 
 else 
 composite = composite + 1; 
 } 
 System.out.print("Composite number: " + composite); 
 System.out.print("\nPrime number: " + prime); 
 } 
 catch(Exception e) 
 { 
 System.out.print("Input format is not INTEGER"+e); 
 } 
 } 
}