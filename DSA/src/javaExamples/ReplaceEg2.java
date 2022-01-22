package javaExamples;

public class ReplaceEg2 {
    public static void main(String args[]){
        String s1="my name is khan my name is java";
        String replaceString=s1.replace("name","hoot");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }
}
