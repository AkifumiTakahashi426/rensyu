package e_card;

import java.util.Scanner;

public class E_card {

	public static void empWin(String player2) {

		white();

		System.out.println("");
		System.out.println("セット・・・っ！");
		System.out.println("");

		enter();
		white();

		System.out.println("");
		System.out.println("オープン・・・っ！！");
		System.out.println("");

		enter();
		white();

		System.out.println(player2 + "さんの勝利です！");
		System.out.println("");

		System.out.println("　　　　ヾミ | | | | | | | l,,l 川〃彡|");
		System.out.println("　　　　　V~~''-山┴''''''~ 　　ヾニﾆ彡|　　　　　　　もう降参か？");
		System.out.println("　　　　 /　二ー―''二　　　　　  ヾﾆニ┤　　　　　　 あ～ん・・・・？");
		System.out.println("　　　 <'-.,　　￣￣ 　 　 _,-‐､　〉ニﾆ|　　　　　　　");
		System.out.println("　　　/'''-ﾆ,‐l 　　l`__ニ-‐'''` /ニ二|　　　　　　　");
		System.out.println("　　　|　==＝､!　　`＝====､　　l =ｌべ=|");
		System.out.println(".　　　| `ーﾟ‐/　　 `ー‐ﾟ―' 　　l.=lへ|~|　　　　　　　");
		System.out.println("　　　 |`ー‐/　　　　`ー――　H<,〉|=|　　　　　　　");
		System.out.println("　　　 |　　/　　　 ､　　 　 　 　 l|__ノｰ|　　　　　　　");
		System.out.println(".　　　| ／`ー　~　′　　 ＼　　　.|ヾ.ニ|ヽ");
		System.out.println("　　　 |ｌ　下王l王l王l王lヲ｜　 　|　ヾ_,|　＼　　　　　");
		System.out.println(". 　 　 |　　　　≡　　　　　　　|　　 `l　　 ＼__　　　");
		System.out.println("　　　　!、　　　　　　　　　 _,,..-'′ ／l　　 　 |　~'''　 ");
		System.out.println("‐'''￣|　`iｰ-..,,,＿,,,,,....-‐''''　 　 ／　 |　 　 　 |　　　 ");
		System.out.println("　-―|　　|＼　　　　　　　　 ／　 　 |　　　 　 |　　　");
		System.out.println("　 　 |　　 |　 ＼　　　　　　／　 　 　 |　　　　 |");

	}

	public static void slvWin(String player1,String player2) {

		white();

		System.out.println("");
		System.out.println("セット・・・っ！");
		System.out.println("");

		enter();
		white();

		System.out.println("");
		System.out.println("オープン・・・っ！！");
		System.out.println("");

		enter();
		white();

		System.out.println("　　　 ∩00　　∩");
		System.out.println("　⊂ﾆﾆ　⊃ ⊂　ﾆ )-- ､");
		System.out.println("　 ,. ---ゝ ) 　 | ﾚ'／⌒ヽヽ");
		System.out.println(". （ (´￣￣ 　 /　/ 　 　 ﾉ.ﾉ　○ ○");
		System.out.println(".　ヽﾞニﾆ⊃　`'∪ ⊂ﾆ-‐'");
		System.out.println("　　　　　　　　　　　　　　　　　　　　　 ∩00　　∩");
		System.out.println("　　　　　　　　　　　　　　　　　　 . ⊂ﾆﾆ　⊃ ⊂　ﾆ )-- ､");
		System.out.println("　　　　　　　　　　　　　　　　　　　 ,. ---ゝ ) 　 | ﾚ'／⌒ヽヽ");
		System.out.println("　　　　　　　　　　　　　　　　　　 .（ (´￣￣ 　 /　/ 　 　 ﾉ.ﾉ　○ ○");
		System.out.println("　　　　　　　　　　　　　　　　　　　 ヽﾞニﾆ⊃　`'∪ ⊂ﾆ-‐'");

		enter();
		white();

		System.out.println("　　/─-;ｨ-､. 二.＿_　￣￣￣　─‐ﾄ　_");
		System.out.println("　 ／/ /／＼_| ヽ|_,.／￣｀ﾞ'''T ‐- ､__|ﾉ＼ヽ利根川・・・");
		System.out.println("　　 ／|＝==｡､　 _ ==＝｡＝,ﾉ|　|　 .| ゝ　ヽ ヽオレが蛇に");
		System.out.println("　　　　 ! ｰ-‐/　 '　ｰ--‐_'j ﾉ|　|　 |　ヽ　 |／見えたか・・・？");
		System.out.println("　　　 　 !.u / v　 uj ~U～／,ﾉ| .|　 |　　＼");
		System.out.println(".　　　　　l./ v　 __ )　　／　u　|/　/!　 |`''‐-");
		System.out.println(".　　　　　ﾞt､--───-､　　　/　/ !　 |");
		System.out.println("　　　　　 /.i`ｰ------‐ '　j／／イ　　|");
		System.out.println("　　　　／　 ヽ.　ー‐　　 ／''´　　|　　|");

		enter();
		white();

		System.out.println("　　/─-;ｨ-､. 二.＿_　￣￣￣　─‐ﾄ　_");
		System.out.println("　 ／/ /／＼_| ヽ|_,.／￣｀ﾞ'''T ‐- ､__|ﾉ＼ヽなら・・・");
		System.out.println("　　 ／|＝==｡､　 _ ==＝｡＝,ﾉ|　|　 .| ゝ　ヽ ヽお前が");
		System.out.println("　　　　 ! ｰ-‐/　 '　ｰ--‐_'j ﾉ|　|　 |　ヽ　 |／蛇だ・・・っ！");
		System.out.println("　　　 　 !.u / v　 uj ~U～／,ﾉ| .|　 |　　＼");
		System.out.println(".　　　　　l./ v　 __ )　　／　u　|/　/!　 |`''‐-");
		System.out.println(".　　　　　ﾞt､--───-､　　　/　/ !　 |");
		System.out.println("　　　　　 /.i`ｰ------‐ '　j／／イ　　|");
		System.out.println("　　　　／　 ヽ.　ー‐　　 ／''´　　|　　|");

		enter();
		white();
		System.out.println(player1 + "さんの勝利です！");
		System.out.println("");
		System.out.println("　　　　 　 ‐､――-､,,.. -――‐;:‐　　　　　　　　　　　　　");
		System.out.println("　　　　　　　＞　　　　　　 　　　￣＜　　　　　　　");
		System.out.println("　　　　 -=ﾆ　　　　　　 　 　 　 　 　 ｀ゝ　　　　　　　　　　");
		System.out.println("　　　　 ∠´　 　,.ｨ　 ﾊ　　　　 　　　　 `、　　　　土下座しろ・・・");
		System.out.println("　　　　　/ 　　/　| ./　ヽ　 ﾄ､　　　　 　 |　　　　　　　"+player2+"・・・っ！！　　");
		System.out.println("　　　　 lイ　/''-ﾆ|/､　r‐＼lﾆ＼!　__　 　|");
		System.out.println("　　 　 　 'l.ｲ| ＝=｡､i　''==｡=＝ l. l'ｌ| 　 |　　　　");
		System.out.println("　 　 　 　　 |l| `ー'/　 u　ｰ‐'''　| |'ｌ|　 ｜　　　　");
		System.out.println("　　 　 　 　 l || U/　　　　 　 ｌj　 |.|ソl　 　|　　　　　");
		System.out.println("　　　　　 　 ! `|/_,.　- ヽ　v' 　 　l!-'′ 　 |　　　　　　　　　　　");
		System.out.println("　　 　 　 　,l　 ヽ ヽﾆﾆﾆ二) 　／|　　 |＼. |　　　　　");
		System.out.println("　 　 _,,..　‐''''~/lヽ 　≡　　／ 　|　　 |　　|~''''　");
		System.out.println("　　　　| |　　/　| 　＼　 ／　ｕ　ﾚ! 　|　　 |　　　　　　　　　　");
		System.out.println("　　 　 | |　/ 　 ﾚw､　 l´　　　 　 |　 l　 　 |　　　　　　");
	}

	public static void draw() {

		white();

		System.out.println("");
		System.out.println("セット・・・っ！");
		System.out.println("");

		enter();
		white();

		System.out.println("");
		System.out.println("オープン・・・っ！！");
		System.out.println("");

		enter();
		white();

		System.out.println("DRAW!!");
		System.out.println("双方が「平民」カードを出しました。");
		System.out.println("次のターンに移ります。");

		enter();
		white();

	}

	public static void enter() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n(エンターキーを押してください▼)");
		String enter = scanner.nextLine();
		System.out.println("\n------------------------------------------\n");

	}

	public static void secret() {
		for (int i = 0; i < 25; i++) {

			System.out.println("secret");
		}
	}

	public static void white() {
		for (int i = 0; i < 25; i++) {

			System.out.println("");
		}
	}

	public static int setMethod(String player1, String player2, int slvCom, int empCom) {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerYorn = new Scanner(System.in);
		String slvSet = "";//奴隷側がセットするカードが入る変数
		String empSet = "";//皇帝側がセットするカードが入る変数

		String yORn = "";//はいかいいえが入る変数

		int slvSlv = 1;//奴隷側の奴隷カード残
		//int slvCom = 4;//奴隷側の平民カード残
		int empEmp = 1;//皇帝側の皇帝カード残
		//int empCom = 4;//皇帝側の平民カード残

		int judge = 0;//勝敗。1が奴隷勝利、2が皇帝勝利。(戻り値）

		while (true) {
			while (true) {
				System.out.println(player1 + "さんのターンです。どのカードを出すか選んでください。");
				System.out.println("(" + player2 + "さんは画面から目を離してください）");
				System.out.println("奴隷カード残[" + slvSlv + "]");
				System.out.println("平民カード残[" + slvCom + "]");
				System.out.print("入力してください（奴隷か平民)：");
				slvSet = scanner.nextLine();
				if (slvSet.equals("奴隷") || slvSet.equals("平民")) {
					break;

				} else {
					System.out.println("------------------------------------------");
					System.out.println("エラー！入力は「奴隷」か「平民」のみを受け付けます。");
					System.out.println("------------------------------------------");

				}
			}

			System.out.print(player1 + "さんの出すカードは「" + slvSet + "」でよろしいですか？「はい」or「いいえ」：");
			if (scannerYorn.hasNext()) {
				yORn = scannerYorn.nextLine();
				if (yORn.equals("はい")) {
					if (slvSet.equals("平民")) {
						break;
					} else {
						break;
					}
				} else {
					border();
					System.out.println("もう一度カードを選びます。");
				}
			}

		}

		secret();///入力した数値を隠す
		border();

		while (true) {
			while (true) {
				System.out.println(player2 + "さんのターンです。どのカードを出すか選んでください。");
				System.out.println("(" + player1 + "さんは画面から目を離してください）");
				System.out.println("皇帝カード残[" + empEmp + "]");
				System.out.println("平民カード残[" + empCom + "]");
				System.out.print("入力してください（皇帝か平民)：");
				empSet = scanner.nextLine();
				if (empSet.equals("皇帝") || empSet.equals("平民")) {
					break;

				} else {
					System.out.println("------------------------------------------");
					System.out.println("エラー！入力は「皇帝」か「平民」のみを受け付けます。");
					System.out.println("------------------------------------------");

				}
			}

			System.out.print(player2 + "さんの出すカードは「" + empSet + "」でよろしいですか？「はい」or「いいえ」：");
			if (scannerYorn.hasNext()) {
				yORn = scannerYorn.nextLine();
				if (yORn.equals("はい")) {
					if (empSet.equals("平民")) {
						break;
					} else {
						break;
					}
				} else {
					border();
					System.out.println("もう一度カードを選びます。");
				}
			}

		}

		secret();///入力した数値を隠す
		border();

		if (empSet.equals("皇帝") && slvSet.equals("奴隷")) {
			judge = 1;

		} else if (empSet.equals("平民") && slvSet.equals("奴隷")) {
			judge = 2;

		} else if (empSet.equals("皇帝") && slvSet.equals("平民")) {
			judge = 2;
		} else if (empSet.equals("平民") && slvSet.equals("平民")) {
			judge = 3;
		}
		return judge;
	}

	public static void border() {
		System.out.print("\n-----------------------------\n");
	}

	public static void main(String[] args) {

		String player1 = "";
		String player2 = "";

		int slvCom = 4;
		int empCom = 4;

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		//////////////////////////////////////ネーミングフェイズ

		System.out.print("奴隷（カイジ）側のプレイヤーの名前を入力してください:");//指示する文章1
		player1 = scanner1.nextLine();//入力待ち1
		System.out.println("奴隷（カイジ）側のプレイヤーは「" + player1 + "」です。");

		border();

		System.out.print("皇帝（利根川）側のプレイヤーの名前を入力してください:");//指示する文章1
		player2 = scanner2.nextLine();//入力待ち1
		System.out.println("皇帝（利根川）側のプレイヤーは「" + player2 + "」です。");

		border();

		System.out.println(player1 + "さん、" + player2 + "さん、こんにちは。\n");
		System.out.println(player1 + "さんに、奴隷カードが１枚、平民カードが４枚配られます。");
		System.out.println(player2 + "さんに、皇帝カードが１枚、平民カードが４枚配られます。\n");

		////////////////////////////ゲームフェイズ

		System.out.println("ではゲームを始めましょう。");
		enter();

		int judge;
		while (true) {
			judge = setMethod(player1, player2, slvCom, empCom);
			if (judge == 1) {
				slvWin(player1,player2);
				break;
			} else if (judge == 2) {
				empWin(player2);
				break;
			} else if (judge == 3) {
				draw();
				slvCom--;
				empCom--;

			}
		}

		////////////////////////////ゲーム終了

		border();
		System.out.print("ゲームを終了します。お疲れさまでした。");

	}

}
