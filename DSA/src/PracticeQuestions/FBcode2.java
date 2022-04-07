package PracticeQuestions;

public class FBcode2 {
    static int solution(String text, int n) {
        if (text==null || text.equals(""))
            return 0;
        String[] words=text.split(" ");
        int ans=0;
        for (int i=0;i<words.length;i++){
            String word=words[i];
            int lastCharCount=1;
            char prevChar=word.charAt(0);
            System.out.println("");
            boolean exist=false;
            for (int j=1; j<word.length()-1;j++){
                if (word.charAt(j)==prevChar){
                    lastCharCount++;
                } else{
                    prevChar=word.charAt(j);
                    lastCharCount=1;
                }
                System.out.println("print j & char: "+j+" "+word.charAt(j)+" "+lastCharCount);
                if (lastCharCount==n){
                    if (word.charAt(j+1)!=prevChar){
                        System.out.println("PRINT j & char: "+j+" "+word.charAt(j)+" "+lastCharCount);
                        exist=true;
                    }
                } else if (lastCharCount==n-1 && j==word.length()-2){
                    if (word.charAt(j+1)==prevChar){
                        System.out.println("PRINT j & char: "+j+" "+word.charAt(j)+" "+lastCharCount);
                        exist=true;
                    }
                }
            }
            if (exist)
                ans++;

        }

        return ans;
    }
    public static void main(String[] args){
        String text="all cook";
        System.out.println(solution(text,2));
    }
}
