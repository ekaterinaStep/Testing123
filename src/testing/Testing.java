package testing;

import java.util.ArrayList;
import java.util.Collections;

public class Testing {
	
	  static int x;
	    StringBuilder sb = new StringBuilder();
	    static StringBuilder sb2 = new StringBuilder();
	    public Testing() {
	      m1();
	      m2();
	    }
	    public void m1(){
	        x += 5;
	        sb.append(x);
	    }
	    public void m2(){
	        x += 10;
	        sb2.append(x);
	    }
	    public static void main(String[] args){
	    	Testing t1 = new Testing();
	    	Testing t2 = new Testing();
	    	Testing t3 = new Testing();
	        String s = t2.sb + "-" + t2.sb2;
	        System.out.println(s);
	      }

	
}
