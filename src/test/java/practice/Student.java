package practice;

public class Student {
    String name;
     int id;
     static int counter =0;
    int marks;



    //admission ,exam and results

    public  String getAddmission(String name , int id){
        this.id=counter++;
        return this.name=name;
    }

    public int getMarks(int marks){
        return this.marks=marks;
    }

    public void showResult(){
        if(marks>33){
            System.out.println("passed");
        }

        else {
            System.out.println("Fail");
        }


    }

}
