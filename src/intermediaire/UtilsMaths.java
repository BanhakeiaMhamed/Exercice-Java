package intermediaire;

import java.util.ArrayList;

public class UtilsMaths {

    /**
     * @author: M. BANHAKEIA
     *
     * @type: void
     * this method search Max in List of Integer
     * */
    public static int findMax(ArrayList<Integer> liste){
        int max = liste.get(0);
        for(int i:liste){
            if(max<i){
                max = i;
            }
        }
        return max;
    }

    /**
     * M. BANHAKEIA
     *
     * @type: void
     * this method search Minimum in the list of integer
     * */
    public static int findMin(ArrayList<Integer> liste){
        int min = liste.get(0);
        for(int i:liste){
            if(min>i){
                min = i;
            }
        }
        return min;
    }
}
