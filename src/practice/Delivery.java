package practice;

public class Delivery {
	/*
	상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
	상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
	설탕공장에서 만드는 설탕은 봉지에 담겨져 있다.
	봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
	상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
	예를 들어, 18킬로그램 설탕을 배달해야 할 때,
	3킬로그램 봉지 6개를 가져가도 되지만,
	5킬로그램 3개와 3킬로그램 1개를 배달하면,
	더 적은 개수의 봉지를 배달할 수 있다.
	상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
	봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
	
	출력
	상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
	
	[출처: https://kin.naver.com/qna/detail.nhn?d1id=1&dirId=1040201&docId=319719447]
	*/
	
	public int[] calcPackageBack(int weight_sugar) {
		if( !(3 <= weight_sugar && weight_sugar <= 5000) ) {
			System.out.println("상근이가 한 번에 배달하는 설탕의 양은 3kg 이상 및 5000kg 이하입니다.");
			return null;
		}
		for(int i=1; ; i++) {
			int x = weight_sugar - 5*i; // 5kg 봉지로 담고 남은 설탕
			if(x < 0) {
				if(weight_sugar != 4 && weight_sugar != 7) i--;	// 4kg와 7kg의 경우는 따로 처리한다
				for(; ;i--) {
					int y = weight_sugar - 5*i;
					int[] arr = new int[2];
					if(y == 0) {
						// 5kg 봉지만으로 설탕을 담을 수 있을 때
						arr[0] = i;
						arr[1] = 0;
						return arr;
					}else if(y > 0){
						// 3kg 봉지를 써야할 때
						if(y % 3 == 0) {
							// 3kg 봉지만으로 남은 설탕을 담을 수 있을 때
							arr[0] = i;
							arr[1] = y / 3;
							return arr;
						}else if(y % 3 > 0){
							// 3kg 봉지로 남은 설탕을 담을 수 있을 때까지 루프한다
							continue;
						}else {
							// 설탕을 완전히 담을 수 없을 때
							arr[0] = -1;
							arr[1] = -1;
							return arr;
						}
					}else {
						if(weight_sugar == 3) {
							// 설탕의 양이 3kg일 때
							arr[0] = 0;
							arr[1] = 1;
							return arr;
						}else {
							// 설탕의 양이 4kg 또는 7kg일 때
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
			System.out.println("설탕 "+i+"kg");
			for (int val : deli.calcPackageBack(i)) {
				System.out.println(val+"개");
			}
			System.out.println();
		}
	}
	
}
