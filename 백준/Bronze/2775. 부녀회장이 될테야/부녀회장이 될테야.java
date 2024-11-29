import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++){
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            System.out.println(DP(K, N));
        }


    }

    private static int DP(int k, int n) {
        if(k == 0){
            return n;
        }
        if(n == 1){
            return 1;
        }
        return DP(k - 1, n) + DP(k, n - 1);

    }

}
