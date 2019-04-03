package java_algo;

public class Arrayy {
	
	static int[][] array = {   {1, 0, 1, 0, 0, 0}, 
					           {1, 1, 1, 0, 0, 0}, 
					           {1, 0, 1, 2, 0, 1}, 
					           {0, 0, 0, 4, 2, 2}, 
					           {0, 0, 0, 4, 0, 4}, 
					           {0, 0, 0, 0, 0, 0} };

    static int hourglassSum(int[][] arr) {
        // ���� �� �ִ� ���� ���� ���� �ʱ�ȭ
    	int sum = -9 * 7;
        int each_sum = 0;
    	
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
            	each_sum += array[j][i] + array[j][i+1] + array[j][i+2];
            	each_sum += array[j+1][i+1];
            	each_sum += array[j+2][i] + array[j+2][i+1] + array[j+2][i+2];
            	
            	// �𷡽ð� ��� ���
            	System.out.println(array[j][i] + "  " + array[j][i+1] + "  " + array[j][i+2]);
            	System.out.println( "   " + array[j+1][i+1]);
            	System.out.println(array[j+2][i] + "  " + array[j+2][i+1] + "  " + array[j+2][i+2]);
            	
            	// ������ �𷡽ð� ��翡 ���ԵǾ� �ִ� ���� ��
            	System.out.println("each_sum : " + each_sum);
            	
            	// ���� ū ��
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
