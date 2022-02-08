package PracticeQuestions;

public class CodeSignalSlidingWindow {
    public static void SlideWindow(int[][] arr){
        for (int i=1; i<arr.length; i++){
            for (int j=1; j<arr[i].length; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr={{1,2,3,4,21},{5,6,7,8,22},{9,10,11,12,23},{13,14,15,16,24},{17,18,19,20,25}};
        SlideWindow(arr);

    }
}
