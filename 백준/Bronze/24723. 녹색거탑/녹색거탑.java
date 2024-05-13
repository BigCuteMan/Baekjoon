import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	int T = Integer.parseInt(br.readLine());
	System.out.println(zegob(T));
}
	public static int zegob(int t) {
		if(t==1) {
			return 2;
		}
		
		return 2*zegob(t-1);
		
	}
}