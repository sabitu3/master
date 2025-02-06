package practice;

public class TestRandom {

    public static void main(String[] args) {
        int arr [] = {2,3,4,5};
      //  checkMissing(arr);

        String s1="sabitu";
        String s2="sabitu";
        String s3 =new String("sabitu");
        String s4=s1+s2;

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2.equals(s3));


    }

    static void checkMissing(int arr[]){
        for (int i=0; i<5; i++){
            if((arr[i]==i+1)){
                System.out.println("Missing no is "+arr[i]);
            }
            else {
                System.out.println("no missing found");
            }
        }
    }
}
