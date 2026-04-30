/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citron = 30;
		int chocola = 30;
		int pista = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocola + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pista + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個づつ買いますか？\n");
		System.out.print("シトロン\t>");
		String citronstr = reader.readLine();
		int citronbuy = Integer.parseInt(citronstr);

		System.out.print("ショコラ\t>");
		String chocolastr = reader.readLine();
		int chocolabuy = Integer.parseInt(chocolastr);

		System.out.print("ピスターシュ\n>");
		String pistastr = reader.readLine();
		int pistabuy = Integer.parseInt(pistastr);

		System.out.println("\nシトロン\t" + citronbuy + "個");
		System.out.println("ショコラ\t" + chocolabuy + "個");
		System.out.println("ピスターシュ\t" + pistabuy + "個");

		System.out.println("\nをお買い上げですね\n");
		System.out.println("承りました。");

	}

}
