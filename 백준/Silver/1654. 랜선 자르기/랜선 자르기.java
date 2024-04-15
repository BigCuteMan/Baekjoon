import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] ewr) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[] arr = new int[K];

		long right = 0;

		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (right < arr[i]) {
				right = arr[i];
			}
		}

		long left = 1;
		long count, mid;

		while (left <= right) {
			count = 0;
			mid = (left + right) / 2;

			for (int i = 0; i < K; i++)
				count += arr[i] / mid;

			if (count < N) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
			
		}

		System.out.println(right);
	}
}