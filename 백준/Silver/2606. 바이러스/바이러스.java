import java.util.*;
import java.io.*;

public class Main {
	static int map[][];
	static boolean visit[];
	static int dx[]= {0,0,-1,1};
	static int dy[] = {-1,1,0,0};
	static int nx,ny;
	static int m,n,h;
	static int cnt=0;
	static class Node{
		int x;
		int y;
		
		public Node (int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] ewr) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st ;
	st= new StringTokenizer(br.readLine());
	n = Integer.parseInt(st.nextToken());
	st= new StringTokenizer(br.readLine());
	m = Integer.parseInt(st.nextToken());
	
	map = new int [n+1][n+1];
	visit = new boolean[n+1];
	
	for(int i=0; i<m;i++) {
	st= new StringTokenizer(br.readLine());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	map[a][b]=1;
	map[b][a]=1;
	}
	bfs(1);
	System.out.println(cnt);
	
		
		
	}
	static void bfs (int start){
		visit[start]=true;
		Queue <Integer> q = new LinkedList<Integer>();
		q.offer(start);
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for(int i=0;i<n+1;i++) {
				if(!visit[i]&&map[tmp][i]==1) {
					visit[i]=true;
					q.add(i);
					cnt++;
				}
			}
			
		}
		
			}
}
