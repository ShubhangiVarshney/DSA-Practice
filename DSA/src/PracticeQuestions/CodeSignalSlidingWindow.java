package PracticeQuestions;

public class CodeSignalSlidingWindow {
    public static void SlideWindow(int[][] arr, int x, int y){
        for (int i=0; i<arr.length-(x-1); i++){
            for (int j=0; j<arr[i].length-(y-1); j++){
                //System.out.println(" "+arr[i][j]+" "+arr[i][j+1]);
                //System.out.println(" "+arr[i+1][j]+" "+arr[i+1][j+1]);
                //System.out.println();
                for(int k=0; k<x; k++){
                    for (int l=0; l<y; l++){
                        System.out.print(arr[i+k][j+l]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args){
        int[][] arr={{1,2,3,4,21},{5,6,7,8,22},{9,10,11,12,23},{13,14,15,16,24},{17,18,19,20,25}};
        SlideWindow(arr,2,2);

    }
}
