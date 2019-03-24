package p01;

import java.util.ArrayList;
import java.util.List;


public class triangle {
	public int[] ar1 = {1,1,2,3};
	public int[] ar2 = {50,20,5,1};
    public List<Integer> result = new ArrayList<Integer>();
    
    public boolean whether(int x) {
    	for (int i = 0; i < ar1[0] + 1; i++) {
    		for (int i1 = 0; i1 < ar1[1] + 1; i1++) {
    			for (int i2 = 0; i2 < ar1[2] + 1; i2++) {
    				for (int i3 = 0; i3 < ar1[3] + 1; i3++) {
    					result.add(ar2[0] * i + ar2[1]*i1+ar2[2]*i2+ar2[3]*i3);
    			    } 
    		    }
    	    }
    	}
    	for (int i = 0; i < result.size(); i++) {
    		if(x == result.get(i)) {
    			return true;
    		}
    	}
    	return false;
    }
	
}
