public class ReverseNumber {

  public static void main(String[] args) {
    reverse(123);
    System.out.println(sum);
  }
  static int sum=0;
  static void reverse(int n){
    if(n==0)
      return;
    int remainder=n%10;
    sum=sum*10 + remainder;
    reverse(n/10);
  }
}
