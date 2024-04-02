import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// 배열에 카운트시키고 0인거찾기
		//30명 중 28명
		int arr[]= new int [31];
	for(int i=0; i<28;i++) {
		int a = Integer.parseInt(br.readLine());
		arr[a]++;
	}
	
	for(int i=1;i<31;i++) {
		if(arr[i]==0)System.out.println(i);
	}
		
		
		}
	}


