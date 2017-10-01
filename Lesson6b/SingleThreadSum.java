
package com;

public class SingleThreadSum implements Runnable {
	private int[] array;
	private int begin;
	private int end;
	private int sum;
	private Thread thr;
	private boolean stop = false;
	
	public SingleThreadSum(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
		thr = new Thread(this);
		thr.start();
	}

	public Thread getThr() {
		return thr;
	}
	
	public int getSum() {
		return sum;
	}
	
	public boolean isStop() {
		return stop;
	}

	@Override
	public void run() {
		this.sum = 0;
		for (int i = begin; i < end; i++) {
			this.sum += array[i];
		}
	}


}
