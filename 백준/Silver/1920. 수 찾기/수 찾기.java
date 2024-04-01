import java.util.*;
import java.io.*;

public class Main {
	static int arr[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(a, 0, n-1)).append('\n');
		}
		System.out.println(sb);
	}

	public static int binarySearch(int key, int left, int right) {
		int mid;
		// 모두 탐색할 떄 까지
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				return 1;
			} else if (key < arr[mid]) {
				right=mid-1;
			} else if (key > arr[mid]) {
				left=mid+1;
			}

		}
return 0;
	}

}
