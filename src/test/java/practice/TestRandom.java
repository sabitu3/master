package practice;

public class TestRandom {

    public static void main(String[] args) {
        int arr [] = {2,3,4,5};
        checkMissing(arr);

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
