package java8LambdasandStreams;
import java.util.*;
import java.util.stream.Collectors;

public class palindromes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		System.out.println(palindromeStrings(list));
		sc.close();
	}
    	static List<String> palindromeStrings(List<String> list) {
    		return list.stream().filter(s -> s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
	}
}
