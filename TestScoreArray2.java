import java.util.Scanner;

public class TestScoreArray2 {

	public static void main(String[] args) {

		//変数の宣言
		String cur[] = { "国語", "社会", "数学", "理科", "英語", "体育" };
		Scanner scan = new Scanner(System.in);

		int scores[] = new int[cur.length];
		//////////new intの右のカッコにはscoreの「数」を入力する。
		//////////そこへ「cur.length（つまりcurの数）」を入力することで、
		//////////scoresに入れる数とcurの数を連動させることができる。
		int sum = 0;//合計を入れる変数の宣言
		double average = 0;//平均を入れる変数の宣言

		//各教科の点数入力
		for (int i = 0; i < cur.length; i++) { //curに入力した教科にそれぞれ点数を入れるための変数。

			while (true) {
				System.out.print(cur[i] + "の点数を入力してください：");//入力の要求
				if (scan.hasNextInt()) {//入力を待ち、整数かどうか判定。
					scores[i] = scan.nextInt();
					break;
				} else {
					System.out.println("正しい値を入力してください！");
					scan.nextLine();//削除
				}

			}

		}

		//合計を出す
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		//平均を出す
		average = (double) sum / scores.length;//平均の変数宣言

		//表示部分
		System.out.println("------------------------");//表示したときに見やすくするための棒
		for (int i = 0; i < cur.length; i++) {
			System.out.println(cur[i] + "の点数は" + scores[i] + "です。");//各教科の点数を表示
		}
		System.out.println("合計＝" + sum);//合計を表示
		System.out.printf("平均＝%.1f %n", average);//平均を表示（少数第一位まで）

		//最大値を出す
		int scoreMax = scores[0];

		for (int j = 0; j < scores.length; j++) {
			if (scores[j] > scoreMax) {
				scoreMax = scores[j];
			}
		}
		System.out.println("最大値は" + scoreMax);

		///最小値を出す
		int scoreMin = scores[0];

		for (int j = 0; j < scores.length; j++) {
			if (scores[j] < scoreMin) {
				scoreMin = scores[j];
			}
		}
		System.out.println("最小値は" + scoreMin);

	}

}
