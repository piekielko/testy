
public class Solution {
	
	public int solution(int[] A){

		int size = A.length;
		
		// jezeli pusta tablica zwroc zero
		if (size==0) {
			return -1;
		}
		
		// licze srednia
		int suma=0;
		
		for (int index=0; index<size; index++) {
			/* alternatywa: suma+=A[index];*/
			suma=suma+A[index];
		}
		
		double avarage=(double)suma/size;
		
		int maxIndex=0;
		int value;
		
		double diff=0;
		double maxDiff=0;
				
		for (int index=0; index<size; index++) {
			value=A[index];
			value=Math.abs(value);
			diff=Math.abs(avarage-value);
			
			if (diff>maxDiff) {
				maxDiff=diff;
				maxIndex=index;
			}
			/*
			System.out.println("************************************");
			System.out.println("Srednia"+String.valueOf(avarage));
			System.out.println("Diff"+String.valueOf(diff));
			*/
		}
		/*
		System.out.println("************************************");
		System.out.println("Max diff:="+String.valueOf(maxDiff));
		System.out.println("Index:="+String.valueOf(maxIndex));
		*/
		return maxIndex;
	}
	
	
}
