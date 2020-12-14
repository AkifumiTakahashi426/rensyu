import java.util.Random;

public class TestScoreArrayMethod {

	///ランダムで0～100の数字を出し、randomNumberで返す。教科数もここで決定
	public static int[] randMethod(int num) {

		Random rand = new Random();
		int[] randomNumbers;
		randomNumbers = new int[num];

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = rand.nextInt(101);

		}
		return randomNumbers;
	}

	///合計を出し、sumで返す
	public static int sumMethod(int scores[]) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];

		}
		return sum;
	}

	///最大値を出し、maxで返す
	public static int maxMethod(int scores[]) {
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i])
				max = scores[i];
		}
		return max;
	}

	///最大点が何教科目かを表示するためのメソッド(失敗）
	/*	public static int maxNumberMethod(int scores[]) {
			int max = scores[0];
			int maxNumber;
			for (int i = 1; i < scores.length; i++) {
				if (max < scores[i])
					maxNumber = i;
			}
			return maxNumber;
		}*/

	///平均を出し、avgで返す
	public static double avgMethod(int scoreSum, int testScores[]) {
		double avg = (double)scoreSum / (double)testScores.length;//平均はdouble
		return avg;
	}

	///結果の出力
	public static void showResultMethod(int testScores[], int scoreSum, double scoreAvg, int max) {

		for (int i = 0; i < testScores.length; i++) {
			System.out.println((i + 1) + "教科目の点数は「" + testScores[i] + "」です");
		}//各教科の点数表示

		System.out.println("合計は" + scoreSum + "です");
		System.out.printf("平均は%.1fです%n",scoreAvg);//少数第二位で四捨五入して一位で表示
		System.out.println("最高点は" +  max + "点です");
	}

	public static void main(String[] args) {
		int num = 5;//教科数決定
		int testScores[] = randMethod(num);
		int scoreSum = sumMethod(testScores);//配列を送るときは[]はいらないの？
		double scoreAvg = avgMethod(scoreSum, testScores);
		int max = maxMethod(testScores);
		//int maxNumber = maxNumberMethod(testScores);
		showResultMethod(testScores, scoreSum, scoreAvg, max);
	}

}
