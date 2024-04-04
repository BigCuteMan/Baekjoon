import java.util.*;
import java.io.*;

public class Main {
	static Queue<Node> q = new LinkedList<>();
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { -1, 1, 0, 0 };
	static int nx, ny;
	static int n;
	static int cnt = 0;
	
	static int map[][];
	static boolean visit[][];
	static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static List<Integer> list= new ArrayList<Integer>(); 
	public static void main(String[] ewr) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
	
		map = new int[n][n];
		visit = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		cnt=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visit[i][j] && map[i][j] == 1) {
				
					cnt++;
					bfs(j, i);
					
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	static void bfs(int x, int y) {
		q.offer(new Node(x, y));
		visit[y][x]=true;
		int cnt2=1;
		while (!q.isEmpty()) {
			Node node = q.poll();

			for (int d = 0; d < 4; d++) {
				nx = node.x + dx[d];
				ny = node.y + dy[d];
				
				if ( nx >= 0 && ny >= 0 && nx < n && ny < n&&!visit[ny][nx]&&map[ny][nx]==1)  {
					q.offer(new Node(nx, ny));
					visit[ny][nx] = true;
					cnt2++;
				}
			}
		}
		list.add(cnt2);
	}

}
