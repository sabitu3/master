public class CywareTest {

    public static void main(String[] args) {
        int []	a = {1,0,1,0,1,1,1,1,1,0,1,0,1};
        int count =0;

        for(int i=0 ; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==1 && a[j]==1){
                    count++;

                }
            }

        }
        System.out.println("Consective ones are "+count);


    }
}
