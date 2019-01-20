package Programmers;

public class NetWork {
	
	public static void DFS(int v, boolean[] visited, int[][] computers){
        	visited[v] = true;
        
            for(int j = 0; j < computers.length; j++)
                if(computers[v][j] == 1 && !visited[j])
                    DFS(j, visited, computers);
    }
   
    public static int solution(int n, int[][] computers) {
    	int answer = 0;
    	
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++)
            if(!visited[i]){
                DFS(i, visited, computers);
                answer++;
            }
        return answer;
    }
                                               
	public static void main(String[] args) {
		int[][] a = {{1,1,0}, {1,1,0}, {0,0,1}};
		
		System.out.println(solution(3, a));

	}

}
