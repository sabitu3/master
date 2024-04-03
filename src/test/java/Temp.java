import java.util.*;

public class Temp {


    public static void main(String[] args) {
       /* //student details
        //results
        //

        Result rs = new Result();
        Scanner sc = new Scanner(System.in);
        int rollNo = sc.nextInt();
        int marks = sc.nextInt();
        int stu_class = sc.nextInt();
        String subject =sc.next();
        String section =sc.next();

        rs.setRoll_no(rollNo);
        rs.setMarks(marks);
        rs.setStudent_class(stu_class);
        rs.setSubject(subject);
        rs.setSubject(section);



    }

    public static void validateEntries(int rollNo,int stu_cl,String subject,String section){
        HashMap<Integer,Integer> studentMap = new HashMap<>();
        Result rs = new Result();
        studentMap.put(rollNo,rs.getRoll_no());
        String std = rollNo+stu_cl+subject+section;
        Set<String> st = new HashSet<>();
        if(!st.contains(std)){
            st.add(std);
        }
        else {
            System.out.println("Student details already exist");
        }


//1,class-10,Maths,A
//1,class-10,Maths,B


    }*/
        int[] arr =  {22,11,42,13,55,52,56,88,104};
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("max is "+max);
        System.out.println("min is "+min);




    }

}
