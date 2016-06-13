package dk.itu.osto;

/**
 * Matrix operations
 *
 */
class Matrix {

    private double[][] columns;

  //matrix matrix product naïve implementation O(n^3)
  public static double[][]  mul(double a[][], double b[][]){
    int N = a.length;
    double[][] c = new double[N][N];
    for(int i = 0; i <N; i++)  //row i
      for (int j = 0; j < N; j++) // column j
      { //compute dot product of row i and column j
        for(int k = 0; k < N; k++)
         c[i][j] += a[i][k] * b[k][j];
      }
    return c;
  }

  //matrix-vector product
  public static double[] mul(double[][] a, double[] x){
     double[] result = new double[x.length];
       if(a.length != x.length) {return new double[]{0};} else
         for(int i=0; i< a.length; i++)
           for(int j=0;j < x.length; j++)
             result[i] += a[i][j] * x[j] ;

       return result;

    }
 //vector dot product
 static double dot(double[] x, double[] y){
   double result = 0; 
   for(int i= 0; i < x.length; i++) {
     result += x[i] * y[i];
   }
   return result;
 }

 //transpose a matrix
 public static double[][] transpose(double[][] a) {
     int r = a.length;
     int c = a[0].length;
     double[][] result = new double[c][r];

     for (int i = 0;i < r;i++)
       for(int j = 0;j < c; j++) {
          result[j][i] = a[i][j];
       }
     return result;
 }

 public static void printer(double[][] a){
     for(double[] e : a)
         for (double d : e)
             System.out.println(d);
 }
 public static void printer(double[] b){
     for(double c : b) {
         System.out.println(c);
     }
 }




}
