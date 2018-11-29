package com.java.pattern.P04_建造者模式.me;

public class Test {
	public static void main(String[] args) {
		TaoCan taoCan=new TaoCan(new HanBao(),new KeLe());
		taoCan.show();
		
	}
}
