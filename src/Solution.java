public class Solution {
	public Integer solution(Integer[] a) {
		int largestNegNum = -1;

		for (int i = 0; i < a.length; i++) {
			for(int j = i; j < a.length; j++) {
				if (a[j] == largestNegNum) {
					largestNegNum--;
					break;
				}
			}
		}

		return largestNegNum;
	}
}
