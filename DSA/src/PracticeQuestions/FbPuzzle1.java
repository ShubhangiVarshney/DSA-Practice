package PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class FbPuzzle1 {
    // Write any import statements here



        public static long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
            // Write your code here
            Arrays.sort(S);
            long maxPeople=0;
            long firstSeat=1;
            long lastSeat=N;
            for(int i=0; i<M; i++){
                if (i==0){
                    maxPeople= maxPeople+(S[i]-firstSeat)/(K+1);
                    maxPeople= maxPeople+(S[i+1]-S[i])/(2*(K+1));
                }
                else if (i==M-1){
                    maxPeople= maxPeople+(lastSeat-S[i])/(K+1);
                }
                else{
                    maxPeople= maxPeople+(S[i+1]-S[i])/(2*(K+1));
                }
            }
            return maxPeople;
        }

        public static void main(String[] args){
        long N=15;
        long K=2;
        int M=3;
        long[] S={11,6,14};
        long res= getMaxAdditionalDinersCount(N,K,M,S);
        System.out.println("output: "+res);
        }

    }



