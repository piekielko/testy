class Solution {
    public int solution(int[] A) {
        if(A.length == 1) 
            return A[0];
        else if (A.length==2)
            return A[0]+A[1];

        else{
            int finalMaxSum = A[0];

            for (int l=0 ; l<A.length ; l++){
                for (int k = l+1 ; k<A.length ; k++ ){

                    int [] newA = A;
                    int temp = newA[l];
                    newA [l] = newA[k];
                    newA[k]=temp;

                    int maxSum = newA[0];
                    int current_max = newA[0];
                    for(int i = 1; i < newA.length; i++)
                    {
                        current_max = Math.max(A[i], current_max + newA[i]); 
                        maxSum = Math.max(maxSum, current_max);
                    }

                    finalMaxSum = Math.max(finalMaxSum , maxSum);

                }
            }

            return finalMaxSum;
        }
    }
}