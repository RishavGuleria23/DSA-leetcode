import java.util.Arrays;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int[][] tp = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(Arrays.toString(transpose(tp)));


    }
    public static int[][] transpose(int[][]matrix){
        int m = matrix[0].length;
        int n = matrix.length;
        int[][] tp = new int[m][n];
        for (int i = 0; i < m; i++) {

        for (int j = 0; j <n ; j++) {
            tp[i][j]=matrix[j][i];

        }

    }
        return tp;
    }
}
