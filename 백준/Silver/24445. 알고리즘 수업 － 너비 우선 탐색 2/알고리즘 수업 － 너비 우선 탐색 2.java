
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] adjList = new ArrayList[N + 1];

        for (int i = 1; i <= N ; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            adjList[u].add(v);
            adjList[v].add(u);
        }

        for (int i = 1; i <= N ; i++) {
            Collections.sort(adjList[i], Collections.reverseOrder());
        }

        int[] res = new int[N+1];

        int nth = 1;
        boolean[] visited = new boolean[N+1];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[R] = true;
        queue.add(R);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            res[curr] = nth;
            nth++;

            for(int next: adjList[curr]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        for (int i = 1; i <= N ; i++) {
            System.out.println(res[i]);
        }
    }
}
