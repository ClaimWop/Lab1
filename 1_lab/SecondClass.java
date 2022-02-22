package com.company;

public class SecondClass {
    private static int x, y;
	public SecondClass(int i, int j) {
		this.x = i;
		this.y = j;
	}
	public int getnumx(){
		return x;
	}
	public int getnumy(){
		return y;
	}
	public void setnumx(int i){
		this.x = i;
	}
	public void setnumy(int i){
		this.y = i;
	}
	public int getsumm(){
		return x*y;
	}
}