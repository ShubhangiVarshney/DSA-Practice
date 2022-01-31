package PracticeQuestions;

public class DeloitteQ1 {
    void stringReverseBySplit(String s){
        String[] words=s.split("\\s");
        for(int i=0; i<words.length;i++){
            String p=words[i];
            for(int j=p.length()-1;j>=0;j--){
                System.out.print(p.charAt(j));
            }
            System.out.println();
        }
    }
    void stringReverseBySpace(String s){
        String p="";
        for (int i=0; i< s.length(); i++){
            if(s.charAt(i)==' ')
               System.out.println();
            p=s.charAt(i)+p;
        }
        System.out.println(p);
    }
    public static void main(String[] args){
        String s=",ignahbuhs yenhsrav";
        DeloitteQ1 dq1= new DeloitteQ1();
        dq1.stringReverseBySpace(s);
    }
}
