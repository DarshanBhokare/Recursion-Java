/**
 * Print the following pattern
 *    * * * *
 *    * * *
 *    * *
 *    *
 */
public class Pattern1 {
  //Solution 1
/**
 public static void main(String[] args) {
 print(4);
 }
 static void print(int n){
 if(n==0){
 return ;
 }
 display(n);
 System.out.println();
 print(n-1);
 }
 static void display(int n){
 if(n==0) {
 return;
 }
 System.out.print("*");
 display(n-1);
 }

 */
// Solution 2
public static void main(String[] args) {
  pattern(4,0);
}
static void pattern(int r, int c){
  if(r==0){
    return;
  }
  if(c<r){
    System.out.print("*");
    pattern(r,c+1);
  }
  else{
    System.out.println();
    pattern(r-1,0);
  }
}
}
