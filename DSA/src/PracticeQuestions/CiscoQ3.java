package PracticeQuestions;



import java.util.Scanner;

public class CiscoQ3 {

        public static String  validInterpretations(String decInput)
        {
            String  answer = "1";
            // Write your code here

            if (decInput==null || decInput.length()==0){
                return "0";
            }
            if (decInput.length()==1){
                return "1";
            }

            char[] decInputArray=decInput.toCharArray();
            int count=0;

            for (int i=0; i<decInputArray.length-1 ; i++){
                char ch=decInputArray[i];
                char ch2=decInputArray[i+1];
                int ch2Int=(int)ch2;

                if (ch=='1' || ch=='2'){
                    if (ch=='2' && (ch2Int>=48 && ch2Int<=53)){
                        count++;
                    } else if (ch=='1')
                        count++;
                }
            }
            System.out.println("count before: "+count);
            count++;
            if (count>0){
            count=factorial(count);

            }
            System.out.println("count aftr"+count);

            return ""+count;
        }

        private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // input for decInput
        String decInput = in.nextLine();

        String result = validInterpretations(decInput);
        System.out.print(result);
    }
}
