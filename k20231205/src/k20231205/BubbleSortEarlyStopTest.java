package k20231205;

import java.util.Arrays;

public class BubbleSortEarlyStopTest {

	public static void main(String[] args) {

//		int[] data = {8, 3, 4, 9, 1};
		int[] data = {9, 1, 3, 4, 8};
		
		for (int i = 0; i<data.length - 1; i++) {
			
//			isFlag라는 이름의 변수를 선언하고 true로 초기화 한다.
			boolean isFlag = true;
			
			for (int j = 0; j<data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
					
//					값 교환이 이루어지면 isFlag 변수에 false를 저장한다.
					isFlag = false;
				}
			}
			
//			정렬이 완료된 데이터는 값교환 작업이 진행되지 않기 때문에 isFlag 변수는 true를 유지하게 된다.
			if (isFlag) {
//				정렬이 이미 완료된 상태라면 더 이상 회전할 필요가 없으므로 i반복을 탈출한다.
				break;
			}
			
			System.out.println(i + 1 + "회전 결과: " + Arrays.toString(data));
		}
		System.out.println("정렬 결과: " + Arrays.toString(data));
	}

}











