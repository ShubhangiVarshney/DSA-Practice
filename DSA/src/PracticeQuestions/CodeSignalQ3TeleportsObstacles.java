package PracticeQuestions;

import java.util.*;

public class CodeSignalQ3TeleportsObstacles {
    public static boolean labyrinthEscape(int n, int m, int[][] obstacles, int[][] teleport){
        HashSet<String> obs=new HashSet<String>();
        HashSet<String> visitedCell=new HashSet<String>();
        HashMap<String,List<Integer>> tele=new HashMap<String,List<Integer>>();

        for (int i=0; i<obstacles.length; i++){
                obs.add(obstacles[i][0]+"_"+obstacles[i][1]);
            }
        System.out.print(obs);

        for (int j=0; j<teleport.length; j++){
            tele.put(teleport[j][0]+"_"+teleport[j][1],Arrays.asList(teleport[j][2],teleport[j][3]));
        }
        System.out.print(tele);

        int x=0;
        int y=0;
        int goal_x=n-1;
        int goal_y=m-1;
        String currentCell="";

        while(y<m){
            if (x==goal_x&&y==goal_y)
                return true;

            currentCell=x+"_"+y;

            if(visitedCell.contains(currentCell))
                return false;
            else
                visitedCell.add(currentCell);

            if(tele.containsKey(currentCell)){
                x=tele.get(currentCell).get(0);
                y=tele.get(currentCell).get(1);
                continue;
            }
            if (obs.contains(currentCell))
                return false;

            y++;
        }
        return false;
    }

    public static void main(String args[]){
        int[][] obstacles= {{1,0},{2,0}};
        int[][] teleport={{0,1,1,1},{1,2,0,2},{0,3,2,1}};
        int n=3; int m=4;
        boolean result=labyrinthEscape(n,m,obstacles,teleport);
        System.out.println(result);
    }
}
