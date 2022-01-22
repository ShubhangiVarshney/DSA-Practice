public class ArrayTraverse {
    public static void main(String[] args){
        int a[]=new int[5];
        String b= "I Love You Manav";
        int i;
        a[0]=10;
        a[1]=20;
        a[2]=77;
        a[3]=8;
        a[4]=59;
        //System.out.println(b.indexOf("I"));
        for(i=b.length()-1;i>=0;i--) {
            System.out.println(b.charAt(i));
        }
    }

}
