package easy.array;

/**
 * Reshape the Matrix
 *
 * @author LQL
 * @create 2017-09-20 19:00
 **/
public class ReshapetheMatrix566 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}, {4, 9}};
        int[][] ints = matrixReshape1(nums, 2, 3);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                max++;
            }
        }
        if (max != r * c)
            return nums;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < r; k++) {

                }
            }
        }
        System.out.println(max);
        return nums;
    }

    public static int[][] matrixReshape1(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r * c != n * m) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            res[i / c][i % c] = nums[i / m][i % m];
        }
        return res;
    }
}
