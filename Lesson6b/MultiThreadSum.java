package com;

public class MultiThreadSum {

	static void sum(int[] array, int threadNumber) {
		SingleThreadSum[] threadarray = new SingleThreadSum[threadNumber];
		for (int i = 0; i < threadarray.length; i++) {
			int size = array.length / threadNumber;
			int begin = size * i;
			int end = ((i + 1) * size);
			if ((array.length - end) < size) {
				end = array.length;
			}
			threadarray[i] = new SingleThreadSum(array, begin, end);
		}
		for (int i = 0; i < threadarray.length; i++) {
			try {
				threadarray[i].getThr().join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println(mergeArrays(threadarray));	
	}

	private static int mergeArrays(SingleThreadSum[] threadarray) {
		int sum = 0;
		
		for (int j = 0; j < threadarray.length; j++) {
			if (!threadarray[j].isStop()) {
				sum += threadarray[j].getSum();
			}
		}
		return sum;
	}

}
