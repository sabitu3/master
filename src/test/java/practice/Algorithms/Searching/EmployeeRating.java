package practice.Algorithms.Searching;

public class EmployeeRating {

    public static void main(String[] args) {


        String s = "aabccccdee";
        //ArrayList<Object> st = new ArrayList<>();
        String res = "";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
                System.out.println("value of i is "+i+ " "+ "and count is "+cnt);
                continue;
            } else {
                //st.add(cnt);
                //st.add(s.charAt(i));
                System.out.println("value of count in els is "+cnt);
                System.out.println("value of res in els is "+res);

                res = res + cnt + s.charAt(i);
                System.out.println("value of res after is "+res);

                cnt = 1;
                System.out.println("count is  "+cnt);

            }
        }

        //st.add(cnt);
        //st.add(s.charAt(s.length()-1));
        System.out.println("char at -1 "+s.charAt(s.length()-1));


        res = res + cnt + s.charAt(s.length() - 1);
        System.out.println("final "+res);


        //for(int i=0; i<st.size();i++){
        //System.out.print(st.get(i));
        //}

    }

}

