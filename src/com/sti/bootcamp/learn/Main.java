package com.sti.bootcamp.learn;
public class Main {
	static void cetak(int a, int b) {
		System.out.println(hitung(a, b));
	}
	
	static int hitung(int a, int b) {
		if(a>0 && b>0) {
			return(a+b);	
		}
		return(a+b);
	}

	public static void main(String[] args) {
		cetak(2, 3);
	}
}
	