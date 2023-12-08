import java.util.*; 
class compco{ 
 public static boolean checkInt(String num){ 
 if(num == null){ 
 return false; 
 } 
 try{ 
 int n = Integer.parseInt(num); 
 } 
 catch(NumberFormatException e){ 
 return false; 
 } 
 return true; 
 } 
 public static void main(String[] Args){ 
 Scanner sc = new Scanner(System.in); 
 int isInvalid = 0; 
 System.out.println("Enter Array Size : "); 
 int n = sc.nextInt(); 
 int array[]; 
 array = new int[n]; 
 System.out.println("Enter " + n + " Numbers : "); 
 for(int i = 0;i<n;i++){ 
 String num = sc.next(); 
 if((checkInt(num) == true)){ 
 int x = Integer.parseInt(num); 
 if(x < 0){ 
 isInvalid = 1; 
 } 
 array[i] = x; 
 } 
 else{ 
 isInvalid = 1; 
 } 
 } 
 if(isInvalid == 0){ 
 int countc = 0,countp = 0; 
 int count = 0; 
 for(int i =0;i<n;i++){ 
 count = 0; 
 for(int j =1;j<=array[i];j++){ 
 if(array[i]%j == 0){ 
 count = count + 1; 
 } 
 } 
 if(count > 2){ 
 countc = countc + 1; 
 } 
 } 
 System.out.println("Composite Numbers : " + countc); 
 } 
 else{ 
 System.out.println("Enter Valid Numbers."); 
 System.out.println("Prime and Composite Numbers Cannot be Negative or Float "); 
 } 
 } 
} 