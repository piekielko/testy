public class Solution {
	
	public int solution(int[] A){
		
		
		int nextIndex=0;
		int seqLenght=1;
		int value=A[nextIndex];
		
		while (value!=-1) {
			nextIndex=A[nextIndex];
			value=A[nextIndex];
			seqLenght++;
		}
		
		return seqLenght;
	}
	
}
