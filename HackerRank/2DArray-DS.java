package java_algo;

public class Arrayy {
	
	static int[][] array = {   {1, 0, 1, 0, 0, 0}, 
					           {1, 1, 1, 0, 0, 0}, 
					           {1, 0, 1, 2, 0, 1}, 
					           {0, 0, 0, 4, 2, 2}, 
					           {0, 0, 0, 4, 0, 4}, 
					           {0, 0, 0, 0, 0, 0} };

    static int hourglassSum(int[][] arr) {
        // 나올 수 있는 가장 작은 수로 초기화
    	int sum = -9 * 7;
        int each_sum = 0;
    	
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
            	each_sum += array[j][i] + array[j][i+1] + array[j][i+2];
            	each_sum += array[j+1][i+1];
            	each_sum += array[j+2][i] + array[j+2][i+1] + array[j+2][i+2];
            	
            	// 모래시계 모양 출력
            	System.out.println(array[j][i] + "  " + array[j][i+1] + "  " + array[j][i+2]);
            	System.out.println( "   " + array[j+1][i+1]);
            	System.out.println(array[j+2][i] + "  " + array[j+2][i+1] + "  " + array[j+2][i+2]);
            	
            	// 각각의 모래시계 모양에 포함되어 있는 수의 합
            	System.out.println("each_sum : " + each_sum);
            	
            	// 제일 큰 수
            	System.out.println("sum : " + sum);
            	if (each_sum > sum) {
            		sum = each_sum;
            	}

            	each_sum = 0;
            }
        }
        
    	return sum;
    }
    
    public static void main(String[] args) {
    	int result = hourglassSum(array);
    	System.out.println(result);
	}
}
