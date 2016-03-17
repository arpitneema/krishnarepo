package hackerrank;

import java.util.Scanner;

public class MYtest {
	static long a1[];
	static long min[];
	static boolean a2[];
	static long k = 0;
	static long maxi=1;
	public static void main(String a[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;

		n = sc.nextInt();
		k = sc.nextLong();
		 a1 = new long[n+1];
		 min= new long[n+1];
	 a2= new boolean[n+1];
		for (int i = 1; i <= n; i++) {
			a1[i] = sc.nextLong();
			a2[i]=false;
			maxi=maxi*a1[i];
		}
		min[1] = a1[1];
		a2[1] = true;
	System.out.println(fun(n));
	}

	static long fun(int n) {
		long mini = maxi;
		for (int i = n - 1; i >= n - k && i >= 1; i--) {
			if (a2[i]) {
				if(min[i]<mini)
					mini=min[i];
			} else {
				long temp = fun(i);
				if (temp < mini)
					mini = temp;
			}
		}
		a2[n]=true;
		min[n]=n*mini;
		return min[n];

	}
}
