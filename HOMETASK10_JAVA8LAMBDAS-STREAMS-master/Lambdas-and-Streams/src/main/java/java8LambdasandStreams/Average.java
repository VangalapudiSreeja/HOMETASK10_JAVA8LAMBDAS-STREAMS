package java8LambdasandStreams;

import java.util.*;

public class Average {

	  public static void main( String[] args ) {
	    	Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	    	List<Integer> list = new ArrayList<>();
	    	for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
	        System.out.println( "Average of a list of Integers : " + findAverage(list));
	        sc.close();
	    }
	    static double findAverage(List<Integer> list) {
	    	return list.stream().mapToInt(x -> x.intValue()).average().getAsDouble();
	    }
	}