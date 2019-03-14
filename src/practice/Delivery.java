package practice;

public class Delivery {
	/*
	����̴� ���� �������忡�� ������ ����ϰ� �ִ�.
	����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�.
	�������忡�� ����� ������ ������ ����� �ִ�.
	������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
	����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�.
	���� ���, 18ų�α׷� ������ ����ؾ� �� ��,
	3ų�α׷� ���� 6���� �������� ������,
	5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�,
	�� ���� ������ ������ ����� �� �ִ�.
	����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��,
	���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
	
	���
	����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
	
	[��ó: https://kin.naver.com/qna/detail.nhn?d1id=1&dirId=1040201&docId=319719447]
	*/
	
	public int[] calcPackageBack(int weight_sugar) {
		if( !(3 <= weight_sugar && weight_sugar <= 5000) ) {
			System.out.println("����̰� �� ���� ����ϴ� ������ ���� 3kg �̻� �� 5000kg �����Դϴ�.");
			return null;
		}
		for(int i=1; ; i++) {
			int x = weight_sugar - 5*i; // 5kg ������ ��� ���� ����
			if(x < 0) {
				if(weight_sugar != 4 && weight_sugar != 7) i--;	// 4kg�� 7kg�� ���� ���� ó���Ѵ�
				for(; ;i--) {
					int y = weight_sugar - 5*i;
					int[] arr = new int[2];
					if(y == 0) {
						// 5kg ���������� ������ ���� �� ���� ��
						arr[0] = i;
						arr[1] = 0;
						return arr;
					}else if(y > 0){
						// 3kg ������ ����� ��
						if(y % 3 == 0) {
							// 3kg ���������� ���� ������ ���� �� ���� ��
							arr[0] = i;
							arr[1] = y / 3;
							return arr;
						}else if(y % 3 > 0){
							// 3kg ������ ���� ������ ���� �� ���� ������ �����Ѵ�
							continue;
						}else {
							// ������ ������ ���� �� ���� ��
							arr[0] = -1;
							arr[1] = -1;
							return arr;
						}
					}else {
						if(weight_sugar == 3) {
							// ������ ���� 3kg�� ��
							arr[0] = 0;
							arr[1] = 1;
							return arr;
						}else {
							// ������ ���� 4kg �Ǵ� 7kg�� ��
							arr[0] = -1;
							arr[1] = -1;
							return arr;
						}
					}
				}
			}else {
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		Delivery deli = new Delivery();
		for(int i=3; i <= 1523; i++) {
			System.out.println("���� "+i+"kg");
			for (int val : deli.calcPackageBack(i)) {
				System.out.println(val+"��");
			}
			System.out.println();
		}
	}
	
}
