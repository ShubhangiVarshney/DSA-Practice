package PracticeQuestions;

public class CodeSignalQ4Reverse {
        int isSumSame(int[] arr){
            int count=0;
            for (int i=0; i<arr.length; i++){
                for(int j=i; j<arr.length; j++){
                    if (arr[i]+ reverse(arr[j])==arr[j]+reverse(arr[i]))
                        count++;
                }
            }
            return count;
        }

        long reverse(int n){
            String s= String.valueOf(n);
            String num="";
            for (int i=0; i<s.length(); i++){
                num= s.charAt(i)+num;
            }
            Long number= Long.parseLong(num);
            return number;
        }

        public static void main(String[] args){
            int[] arr={1,20,2,11};
            CodeSignalQ4Reverse rev=new CodeSignalQ4Reverse();
            int count=rev.isSumSame(arr);
            System.out.println(count);
        }
}
