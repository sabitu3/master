package practice.String;

public class RemoveSpecialChar {

    public static void main(String[] args) {
        String str = "Thi@%@#s is ne%#%w ver#%#%5sion releas5646%#$%ed";

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(Character.isLetterOrDigit(str.charAt(i)) || str.charAt(i)==' '){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("output string is "+sb
        );
    }
}
