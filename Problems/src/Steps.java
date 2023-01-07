public class Steps {

  public static void main(String[] args) {
    System.out.println(numberOfSteps(14));
  }

  static int numberOfSteps(int n) {
    return stepsHelper(n,0);
  }
  static int stepsHelper(int n, int steps){
    if(n==0){
      return steps;
    }
    if(n%2==0){
      return stepsHelper(n/2,steps+1);
    }
    return stepsHelper(n-1,steps+1);
  }

}
