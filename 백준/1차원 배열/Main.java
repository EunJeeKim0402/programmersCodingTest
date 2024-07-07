/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

// public class Main {

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         // 첫 번째 줄: 정수의 개수 n
//         int n = Integer.parseInt(br.readLine());

//         // 두 번째 줄: 공백으로 구분된 n개의 정수
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         int[] numbers = new int[n];
//         for (int i = 0; i < n; i++) {
//             numbers[i] = Integer.parseInt(st.nextToken());
//         }

//         int max = numbers[0];
//         int min = numbers[0];

//         for (int i = 1; i < n; i++) {
//             if (numbers[i] > max) {
//                 max = numbers[i];
//             }
//             if (numbers[i] < min) {
//                 min = numbers[i];
//             }
//         }

//         br.close();

//         System.out.println(min + " " + max);
//     }
// }
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 배열 길이
		
		int M = sc.nextInt(); // 반복 횟수
		
		int[] arr = new int[N];
		
		for(int x = 0 ; x < M ; x++) { // 
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int y = i-1 ; y < j ; y++) { // 입력 받은 줄에서의 반복
				arr[y] = k;
			}
			
		}
		
		for(int x = 0 ; x < N ; x++) {
			System.out.print(arr[x] + " ");
		}
		
	}
}
 