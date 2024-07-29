package debutant;

import java.util.ArrayList;

public class mathsMethodes {

    public int findMax(ArrayList<Integer> liste){
        int max =liste.get(0);
        for(int i: liste){
            if(max<i){
                max=i;
            }
        }
        return max;
    }

    public int findMin(ArrayList<Integer> liste){
        int min =liste.get(0);
        for(int i: liste){
            if(min<i){
                min=i;
            }
        }
        return min;
    }
}
