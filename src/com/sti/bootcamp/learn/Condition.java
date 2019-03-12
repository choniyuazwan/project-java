package com.sti.bootcamp.learn;
public class Condition {
	public static void main(String[] args) {
		int uts=70, uas=80, absensi=90;
		int nilaiAkhir = getNilaiAkhir(uts, uas, absensi);
		String grade = getGrade(nilaiAkhir);
		System.out.println("nilai akhir = "+nilaiAkhir);
		System.out.println("grade = "+grade);
	}
	
	static int getNilaiAkhir(int a, int b, int c) {
		a = a*30/100;
		b = b*50/100;
		c = c*20/100;
		return a+b+c;
	}
	
	static String getGrade(int nilai) {
		if(nilai>=85) {
			return "A";
		} else if(nilai>=75) {
			return "B";
		} else if(nilai>=60) {
			return "C";
		} else {
			return "D";
		}
	}
}
