package Programmers;

public class Number_Baseball {
	public int solution(int[][] baseball) {
		int[][] a = new int[baseball.length][5];

        for(int i = 0; i < baseball.length; i++){
            a[i][0] = String.valueOf(baseball[i][0]).charAt(0) - '0';
            a[i][1] = String.valueOf(baseball[i][0]).charAt(1) - '0';
            a[i][2] = String.valueOf(baseball[i][0]).charAt(2) - '0';
            a[i][3] = baseball[i][1];
            a[i][4] = baseball[i][2];
        }

        int ret = 0;

        int[] b = new int[3];

        for(b[0] = 1; b[0] < 10; b[0]++)
            for(b[1] = 1; b[1] < 10; b[1]++){
                if(b[0] == b[1]) continue;
                for(b[2] = 1; b[2] < 10; b[2]++){
                    if(b[0] == b[2] || b[1] == b[2]) continue;
                    if(match(b, a)) ret++;
                }
            }

        return ret;
    }

    boolean match(int[] b, int[][] a){
        for(int i = 0; i < a.length; i++){
            int strike = 0;
            int ball = 0;
            for(int j = 0; j < b.length; j++)
                for(int k = 0; k < b.length; k++){
                    if(b[j] == a[i][k]){
                        if(j == k) strike++;
                        else ball++;
                        break;
                    }
                }

            if(a[i][3] != strike || a[i][4] != ball) return false;
        }

        return true;
    }
}
