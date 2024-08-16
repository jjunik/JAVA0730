package ex01_lambda;

import java.util.function.Function;

public class Ex05_Lambda {
	public static void main(String[] args) {
		Function<String, Integer> f1 = s -> Integer.parseInt(s,16);// 16진수 -> 10진수로 변환
		Function<Integer, String> g = i -> Integer.toBinaryString(i); // 2진수로 변환
		Function<String, String> h = f1.andThen(g);
		System.out.println(h.apply("ff"));
		
		Function<Integer, String> x = i -> Integer.toBinaryString(i);
		Function<String, Integer> y = s -> Integer.parseInt(s, 16);
		Function<Integer,Integer> z = y.compose(x);
		System.out.println(z.apply(2));
	}
}
