package practice;

public class Fibnoacci {

    public static void main(String[] args) {
        int count =5;
        int firstTerm=0;
        int secondTerm=1;
        int nextTerm;

        for (int i=0; i<count;i++){
            System.out.print(firstTerm + ", ");
            nextTerm= firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm= nextTerm;
        }

    }
}
