package com.quiz;

//Return row which contains maximum number of one, row contains zero followed by ones
/*4 * 4

0 1 1 1
0 0 1 1
1 1 1 1
0 0 0 1
 */

/*4 * 4

0 0 0 1
0 0 0 0
0 0 0 0
0 0 0 0
*/

//https://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/
public class TwoDimenArray {
    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 1, 1},
                { 0, 0, 1, 1},
                { 1, 1, 1, 1},
                { 0, 0, 0, 1}
        };

        int[][] matrix1 = {
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 1}
        };

        int[][] matrix2 = {
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0}
        };

        System.out.println(rowWithMaximumOne(matrix, 4, 4));
        System.out.println(rowWithMaximumOne(matrix1, 4, 4));
        System.out.println(rowWithMaximumOne(matrix2, 4, 4));
    }

    public static int rowWithMaximumOne(int[][] matrix, int m, int n){
        int i, j, row_with_max1s;
        j = n - 1;
        row_with_max1s = -1;

        for(i = 0; i < m; i++){
            while(j >= 0){
                if(matrix[i][j] == 1){
                   j--;
                   row_with_max1s = i;
                   continue;
                }
                break;
            }
        }
        return row_with_max1s;
    }
}
