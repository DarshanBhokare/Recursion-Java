public class OnetoN {

  public static void main(String[] args) {
    oneton(5);
  }
  static void oneton(int n) {
    if(n==1){
      System.out.println(n);
      return;
    }
    oneton(n-1);
    System.out.println(n);

  }

}
