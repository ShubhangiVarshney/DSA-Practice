package PracticeQuestions;
import java.util.*;

public class CodeSignalQ2SlidingWindow {
    public static boolean[][] SlideWindow(int[][] arr, int x, int y){
        HashSet<Integer> hs=new HashSet<Integer>();
        int i=0;
        int j=0;
        boolean[][] result= new boolean[arr.length-x+1][arr[i].length-y+1];
        for ( i=0; i<arr.length-(x-1); i++){
            for ( j=0; j<arr[i].length-(y-1); j++){
                //System.out.println(" "+arr[i][j]+" "+arr[i][j+1]);
                //System.out.println(" "+arr[i+1][j]+" "+arr[i+1][j+1]);
                //System.out.println();
                for(int k=0; k<x; k++){
                    for (int l=0; l<y; l++){
                        System.out.print(arr[i+k][j+l]+" ");
                        hs.add(arr[i+k][j+l]);
                    }
                    System.out.println();
                }
                if(hs.size()==9)
                    result[i][j]=true;
                else
                    result[i][j]=false;

                hs.clear();

                System.out.println();
            }

        }


        return result;
    }

    public static void main(String[] args){
        int[][] arr={{1,2,3,9,6},
                     {5,6,7,4,5},
                     {9,4,8,1,2}};
        boolean[][] result=SlideWindow(arr,3,3);
        System.out.println("Array:"+Arrays.deepToString(result));
            }
        }




