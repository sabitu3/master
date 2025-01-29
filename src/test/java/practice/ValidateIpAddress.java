package practice;

public class ValidateIpAddress {

    public static void main(String[] args) {

    }

    public static boolean checkIpv4(String ip){

        String ips [] =ip.split(" ");

        for(String ipp : ips){
           int parseedIp  =Integer.parseInt(ipp);
           if(parseedIp<0 || parseedIp>255){
               System.out.println("not a valid ip "+false);
           }
        }
        System.out.println("its a valid ip");
        return true;
    }
}
