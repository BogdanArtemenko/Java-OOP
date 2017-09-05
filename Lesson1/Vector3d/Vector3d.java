package com;

public class Vector3d {
	private double x;
	private double y;
	private double z;
	
	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3d() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Vector3d sumcount(Vector3d v1, Vector3d v2){
		
		Vector3d vsum = new Vector3d();
		vsum.x = v1.x + v2.x; 
		vsum.y = v1.y + v2.y; 
		vsum.z = v1.z + v2.z; 
		return vsum;
	}
	
	public static double scalarMult(Vector3d v1, Vector3d v2){
		
		double scalarRez;
		scalarRez = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z; 
		return scalarRez;
	}
	
	public static Vector3d vectorMult(Vector3d v1, Vector3d v2){
		
		Vector3d vectorRez = new Vector3d();
		vectorRez.x = v1.y*v2.z - v1.z*v2.y;
		vectorRez.y = v1.z*v2.x - v1.x*v2.z;
		vectorRez.z = v1.x*v2.y - v1.y*v2.x;
		return vectorRez;
	}
	
	
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}	
}
