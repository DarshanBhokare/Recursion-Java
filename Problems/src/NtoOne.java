public class NtoOne {

  public static void main(String[] args) {
    ntoone(5);
  }
  static void ntoone(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    ntoone(n-1);
  }
}
