public class NthSeries  {

  public static String seriesSum(int n) {
    double n2 =1;
    int n1 =1;
    double sum =0;
    for (int i = 0; i < n; i++)
    {
      if ( i<1) {sum +=1;}
      else {n2+=3;
      sum+=(1/n2);}
    }
    String total = String.format("%.2f" , sum);
    return total;
  }
}
