import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
     
       int[] nu2 = {1,2,0,0,};
        System.out.println(addToArrayForm(nu2,34));


        
     
    }

    public static List<Integer> addToArrayForm(int[] m, int k){
        List<Integer> my_list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m.length; i++) {
            sb.append(m[i]);
        }
        int nu_number = Integer.parseInt(sb.toString()) + k;

        String final_string = Integer.toString(nu_number);
        char[] c = final_string.toCharArray();

        for (int i = 0; i < c.length; i++) {
                my_list.add(Integer.parseInt(String.valueOf(c[i])));

        }


        return my_list;
    }
}
