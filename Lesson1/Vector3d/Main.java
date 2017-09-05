package com;

public class Main {

	public static void main(String[] args){
		
		Vector3d v1 = new Vector3d(2,3,4);
		Vector3d v2 = new Vector3d(10,10,10);
		Vector3d v3 = new Vector3d(2,2,10);
		
		System.out.println(v1.sumcount(v1, v2));
		System.out.println(v1.scalarMult(v1, v2));
		System.out.println(v1.vectorMult(v1, v2));
		
	}
}
