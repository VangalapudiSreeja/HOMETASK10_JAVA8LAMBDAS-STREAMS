package java8LambdasandStreams;
import java.util.*;
import java.util.stream.Collectors;

public class StringFilter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		System.out.println(filterStrings(list));
		sc.close();
	    }
	
	static List<String> filterStrings(List<String> list) {
		return list.stream().filter(s -> s.startsWith("a") && s.length() == 3).collect(Collectors.toList());
	}
}

