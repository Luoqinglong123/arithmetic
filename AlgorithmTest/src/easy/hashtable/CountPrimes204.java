package easy.hashtable;

public class CountPrimes204 {
	public int countPrimes(int n) {
		int count =0;
		boolean[]  res =  new boolean[n];
		for (int i = 2; i < n; i++) {
			if(res[i] == false)
				count++;
			for (int j = 2; i*j < n; j++) {
				res[i*j]= true;
			}
		}
		return count;

	}
}
