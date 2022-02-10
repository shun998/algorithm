package practice.begin;

/**
 * @User: layman
 * @Date: 2022/2/4 18:38
 * @Description:
 */
public class Code22_Demo {
    public static void main(String[] args) {
    int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix1 = muliMatrix1(m1, m1);
        int[][] matrix2 = muliMatrix(m1, m1);
        printMatrix(matrix1);
        printMatrix(matrix2);
    }
    public static int[][] muliMatrix1(int[][] m1, int[][] m2) {
        int[][] res = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }
    public static int[][] muliMatrix(int[][] m1,int[][] m2){
        int[][] ans=new int[m1.length][m2[0].length];
        for(int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                for (int k=0;k<m1[0].length;k++){
                    ans[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        return ans;
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}
