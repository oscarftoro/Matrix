package dk.itu.osto;


/**
 * Matrix algebra!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double[][] a = {{1,2},{2,3}};
        double[][] b = {{2,3},{1,2}};

        double[][]  result = Matrix.mul(a,b);
        Matrix.printer(result);

        double [][] c = {{1,2},{3,4},{5,6}};
        int i = c[0].length;

        double [][] transposed = Matrix.transpose(c);
        System.out.println("transposed matrix...");
        Matrix.printer(transposed);

        double[] d = {1,3};
        System.out.println("matrix-vector product");
        double[] pr = Matrix.mul(a,d);
        Matrix.printer(pr);
    }
}
