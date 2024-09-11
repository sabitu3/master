import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        /*
        * Write a program to Validate an IPv4 Address. IP address are canonically represented in dot-decimal notation,
        * which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1*/

        String ip = "255.16.254.1";
        checkIpv4(ip);


    }

    public static Boolean checkIpv4(String ip){
        String [] ips= ip.split("\\.");


        for(int i=0; i<ips.length; i++){
            System.out.println(" ips of i "+i+" "+ips[i]);
            int parseInt=  Integer.parseInt(ips[i]);
            if(parseInt<0 || parseInt>255){
                System.out.println(false);
                return false;
            }

        }

        System.out.println(true);
        return true;
    }


}
