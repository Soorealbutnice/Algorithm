/**
 * https://www.acmicpc.net/problem/11718
 *
 * @author sooreal
*/

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fullText = new ArrayList<String>();
        
        while(sc.hasNextLine()){
            fullText.add(sc.nextLine());
        }
        
        for (int i = 0; i < fullText.size(); i++ ) {
            System.out.println(fullText.get(i));
        }
    }
}