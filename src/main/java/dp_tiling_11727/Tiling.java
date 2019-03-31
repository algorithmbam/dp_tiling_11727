package dp_tiling_11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tiling {

	private static int d[]= new int[1001];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int input= Integer.parseInt(br.readLine());
		int result= dp(input);
		System.out.println(result);
		
	}

	public static int dp(int input) {

		if(input == 1) {
			d[1]= 1;
			return d[1];
			
		} else if(input == 2) {
			d[2]= 3;
			return d[2];
			
		} else {
			if(d[input] != 0) {
				return d[input];
				
			} else {
				d[input] = (dp(input-1) + 2*dp(input-2)) % 10007;
				return d[input];
				
			}
		}
	}
}