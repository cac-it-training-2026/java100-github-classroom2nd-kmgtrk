/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		//      キーボード入力を受け取るための準備
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個づつ買いますか？\n");
		System.out.print("シトロン\t>");
		//		文字として入力を受け取る
		String citronstr = reader.readLine();
		//		数字に変換する
		double citronbuy = Double.parseDouble(citronstr);

		System.out.print("ショコラ\t>");
		String chocolastr = reader.readLine();
		double chocolabuy = Double.parseDouble(chocolastr);

		System.out.print("ピスターシュ\t>");
		String pistastr = reader.readLine();
		double pistabuy = Double.parseDouble(pistastr);

		System.out.println("\nシトロン\t" + citronbuy + "個");
		System.out.println("ショコラ\t" + chocolabuy + "個");
		System.out.println("ピスターシュ" + pistabuy + "個");

		System.out.println("\nをお買い上げですね\n");
		System.out.println("承りました。");

		//合計個数の出力
		//合計金額の出力
		double buycount = citronbuy + chocolabuy + pistabuy;
		int sumcount = (int) (250 * citronbuy + 280 * chocolabuy + 320 * pistabuy);

		System.out.println("合計個数" + buycount + "個");
		System.out.println("合計金額" + sumcount + "円");

		citron = (int) (citron - citronbuy);
		chocola = (int) (chocola - chocolabuy);
		pista = (int) (pista - pistabuy);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocola + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pista + "個");

	}

}
