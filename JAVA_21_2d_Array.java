class TwoDimensionalArrayPractice {
    static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] arr, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }

}

public class JAVA_21_2d_Array {
    public static void main(String[] args) {
        int[][] arr_1 = {
                {1, 2, 3},
                {4, 1, 3}
        };
        int[][] ans = TwoDimensionalArrayPractice.findTranspose(arr_1, 2, 3);
        TwoDimensionalArrayPractice.print2dArray(ans);
    }
}
