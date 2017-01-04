public class Factorial {

  public int factorial(int n) {
    // Happy coding :-)
    if (n<0 || n>12)
    throw new IllegalArgumentException(); //Done as code demanded
    //We start at 1 because that covers the answer for 0 and 1 combined and we do not accept answers below 0
    int sum = 1;
    while (n>=1){
    sum*=n;
    n--;
    }
    return sum;
  }
}
