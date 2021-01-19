/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][] pascal = new int[n][n];
        for (int item: pascal[0]){
            pascal[0][item] = 0;
        }
        for (int i = 0; i < n; i++){
            pascal[i][0] = 1;
        }
        for (int row = 1; row < n; row++){
            for (int col = 1; col < n; col++){
                pascal[row][col] = pascal[row - 1][col] + pascal[row - 1][col - 1];
            }
        }
        return pascal;
    }
}
