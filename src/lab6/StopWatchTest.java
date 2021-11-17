package lab6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class StopWatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[100000];
		Random rd = new Random();
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = rd.nextInt(100000);
		}
		StopWatch sw = new StopWatch();
		Arrays.sort(arr);
		sw.stop();
		System.out.println("Ö´ÐÐÁË" + sw.getElaspsedTime() + "ºÁÃë");
	}

}
