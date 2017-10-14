package easy.math;

public class RangeAdditionII598 {
	public static void main(String[] args) {
		int[][] ops={{2,2},{2,1}};
		System.out.println(maxCount(3, 3, ops));
	}
	
	   public static int maxCount(int m, int n, int[][] ops) {
	        if (ops == null || ops.length == 0) {
	            return m * n;
	        }
	        
	        int row = Integer.MAX_VALUE, col = Integer.MAX_VALUE;
	        for(int[] op : ops) {
	            row = Math.min(row, op[0]);
	            col = Math.min(col, op[1]);
	        }
	        
	        return row * col;
	    }
}
