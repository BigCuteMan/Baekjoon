import java.util.*;
import java.io.*;

public class Main {
	static int dx []= {-1, 1 , 0, 0};
	static int dy[] = { 0, 0,-1, 1 };
	
	static int arr[][];
	static boolean visit[][];
	static int n,m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] ewr) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// StringBuilder sb= new StringBuilder();
		// Q,String 타입의 앵무새를담는 list
		st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		arr= new int [n][m];
		visit = new boolean[n][m];
		for(int i=0; i< n;i++) {
			String str = br.readLine();
			for(int j=0; j<m;j++) {
				arr[i][j]=str.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		System.out.println(arr[n-1][m-1]);
		

	}
	public static void bfs (int x, int y) {
		visit[0][0]=true;
			Queue<int[]> q= new LinkedList<>();
			q.add(new int[] {x,y});
			
			while(!q.isEmpty()) {
				int now[] = q.poll();
				int nowX = now[0];
				int nowY = now[1];
				
				for(int d=0;d<4;d++) {
					int nX = nowX+dx[d];
					int nY = nowY+dy[d];
					if(nX<n&&nX>=0&&nY<m&&nY>=0&&
							!visit[nX][nY]&&arr[nX][nY]==1) {
						visit[nX][nY]=true;
						q.add(new int[] {nX,nY});
						arr[nX][nY]=arr[nowX][nowY]+1;
						
					}
				}
			}
	}
	
	
}
