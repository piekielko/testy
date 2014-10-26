
public class Solution {
	
	 public String solution(String S) {
		 
		 // rozdziel po spacji. 
		 String[] tabS=S.split(" ");
		 int dlugosc=tabS.length;
		 
		 String wyraz;
		 String zdanie="";
		 
		 for (int i=0; i<dlugosc; i++) {
			 wyraz=tabS[i];
			 String odwroconyWyraz=new StringBuilder(wyraz).reverse().toString();
			 
			 //stworz zdanie z odwroconych wyrazow
			 if (zdanie.length()==0) {
				zdanie=zdanie+odwroconyWyraz; 
			 } else {
				 zdanie=zdanie+" "+odwroconyWyraz;
			 }
		 }
		 
		 
		 return zdanie;
	 }

}