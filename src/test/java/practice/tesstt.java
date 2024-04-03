package practice;

public class tesstt {

    //100 -500

    public static void main(String[] args) {
        int arm = 0;
//        int n;
//        for(int i=100; i<=500; i++){
//             n = i;
//            int len = 0;
//            int t1 = n;
//            //find the length of the no
//            while (t1 != 0) {
//                len = len + 1;
//                t1 = t1 / 10;
//            }
//
//            //reverse the number
//            int t2 = n;
//            int rem;
//
//
//            while (t2 != 0) {
//                int mul = 1;
//                rem = t2%10;
//
//                for (int j = 1; j <= len; j++) {
//                    mul = mul * rem;
//                }
//                arm = arm + mul;
//                t2 = t2 / 10;
//            }
//
//            if (arm == n) {
//                System.out.println("its a armstrong no");
//            } else {
//                System.out.println("not armstrong");
//            }
//        }


        for(int i=100; i<=500; i++){
            int check=i; int rem; int sum=0;
            while(check!=0){
                rem= check%10;
                sum= sum+(rem*rem*rem);
                check= check/10;
            }

            if(sum==i){
                System.out.println(""+i+" is an Armstrong number");
            }
        }



    }
}
