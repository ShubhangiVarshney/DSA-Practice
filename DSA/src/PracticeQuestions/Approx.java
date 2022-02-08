package PracticeQuestions;

public class Approx {
    public int perecentage(int[] arr){
        int min=0;
        int max=0;
        double divide=0;

        for (int i=0; i<arr.length;i++ ){
            if(i==0){
                min=arr[i];
                max=arr[i];
            }
            else{
                if (min>arr[i])
                    min=arr[i];
                if(max<arr[i])
                    max=arr[i];
            }
            }
        if (min==0)
            return -1;
        divide= (double)max/min;
        divide= (divide-1)*100;

        return (int)divide;

        }

        public static void main(String[] args ){
        int[] arr={65,68,72,59,72};
        Approx ap=new Approx();
        int i=ap.perecentage(arr);
        System.out.println(i);

        }

    }

