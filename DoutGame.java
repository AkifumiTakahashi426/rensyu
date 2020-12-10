package jisyu;

import java.util.Scanner;

public class DoutGame {

	
	public static void secret() {
		for (int i = 0; i < 15; i++) {

			System.out.println("secret");
		}
	}

	
	
	public static void border() {
		System.out.print("\n-----------------------------\n");
	}
	
	

	public static void main(String[] args) {

		String player1 = "";
		String player2 = "";

		int dout1 = 0;
		int dout2 = 0;
		;
		String yORn = "";

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scannerd1 = new Scanner(System.in);
		Scanner scannerd2 = new Scanner(System.in);
		Scanner scanner_yorn = new Scanner(System.in);

		//////////////////////////////////////ネーミングフェイズ

		System.out.print("1人目のプレイヤーの名前を入力してください:");//ただの文章1
		player1 = scanner1.nextLine();//入力待ち1
		System.out.println("一人目のプレイヤーは「" + player1 + "」です。\n");

		border();

		System.out.print("二人目のプレイヤーの名前を入力してください:");//ただの文章1
		player2 = scanner2.nextLine();//入力待ち1
		System.out.println("二人目のプレイヤーは「" + player2 + "2」です。\n");

		border();

		System.out.println(player1 + "さん、" + player2 + "さん、こんにちは。\n");

		//////////////////////////////////////ダウトナンバー決定フェイズ

		System.out.println("次に、相手に当てられてはならない「ダウトナンバー」を決めていきます。");


		border();


		while (true) {
			yORn = "";
			System.out.print(player1 + "さん、1から10の中から好きな数字を入力してください：");
			dout1 = scannerd1.nextInt();//入力待ち

			if (dout1 < 0 || 11 <= dout1) {
				System.out.println("エラー！数字は1～10の間におさめてください");
				while (0 >= dout1 || dout1 > 10) {
					System.out.print(player1 + "さん、1から10の中から好きな数字を入力してください：");
					dout1 = scannerd1.nextInt();//入力待ち
				}
			}

			System.out.print(player1 + "さんの数字は" + dout1 + "でよいですか？「はい」or「いいえ」：");
			yORn = scanner_yorn.nextLine();//入力待ち

			if (yORn.equals("はい")) {
				break;
			}

		}

		secret();
		border();


		while (true) {
			yORn = "";
			System.out.print(player2 + "さん、1から10の中から好きな数字を入力してください：");
			dout2 = scannerd2.nextInt();//入力待ち

			if (dout2 < 0 || 11 <= dout2) {
				System.out.println("エラー！数字は1～10の間におさめてください");
				while (0 >= dout2 || dout2 > 10) {
					System.out.print(player2 + "さん、1から10の中から好きな数字を入力してください：");
					dout2 = scanner2.nextInt();//入力待ち
				}
			}

			System.out.print(player2 + "さんの数字は" + dout2 + "でよいですか？「はい」or「いいえ」：");
			yORn = scanner_yorn.nextLine();//入力待ち

			if (yORn.equals("はい")) {
				break;
			}

		}

		secret();

		////////////////////////////ゲームフェイズ

		int dout11 = 0;//プレイヤー1が、プレイヤー2のダウトナンバーだと思う数字
		Scanner scanner11 = new Scanner(System.in);
		int dout22 = 0;//プレイヤー2が、プレイヤー1のダウトナンバーだと思う数字
		Scanner scanner22 = new Scanner(System.in);

		System.out.println("ではゲームを始めましょう。");

		while (dout11 != dout2 && dout22 != dout1) {

			System.out.print(player1 + "さん、" + player2 + "さんのダウトナンバーを当ててください（1～10）：");
			dout11 = scanner11.nextInt();//入力待ち1

			if (dout11 < 0 || 11 <= dout11) {
				System.out.println("エラー！数字は1～10の間におさめてください");
				while (0 >= dout11 || dout11 > 10) {
					System.out.print(player1 + "さん、" + player2 + "さんのダウトナンバーを当ててください（1～10）：");
					dout11 = scanner11.nextInt();//入力待ち
				}
			}

			border();

			if (dout11 == dout2) {
				System.out.println("正解です！" + player1 + "さんの勝利です！");

			} else {
				System.out.println("不正解です。");
				dout11 = 0;//ダウトナンバー初期化
				System.out.println(player2 + "さんのターンです。");

				System.out.print(player2 + "さん、" + player1 + "さんのダウトナンバーを当ててください（1～10）：");
				dout22 = scanner22.nextInt();//入力待ち1

				if (dout22 < 0 || 11 <= dout22) {
					System.out.println("エラー！数字は1～10の間におさめてください");
					while (0 >= dout22 || dout22 > 10) {
						System.out.print(player2 + "さん、" + player1 + "さんのダウトナンバーを当ててください（1～10）：");
						dout22 = scanner22.nextInt();//入力待ち
					}
				}

				border();

				if (dout22 == dout1) {
					System.out.println("正解です！" + player2 + "さんの勝利です！");

				} else {
					System.out.println("不正解です。");
					dout22 = 0;
					System.out.println(player1 + "さんのターンです。");

				}

			}
		}

		System.out.print("ゲームを終了します。お疲れさまでした。");

	}
}
