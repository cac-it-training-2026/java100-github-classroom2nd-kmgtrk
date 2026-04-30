/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売り上げの割合");
		System.out.println("売上合計   \\" + sumcount);
		System.out.println("\n内訳");
		System.out.println(
				"シトロン   \\" + (int) (250 * citronbuy) + "・・・ " + (int) (250 * citronbuy / sumcount * 100) + "%");
		System.out.println(
				"ショコラ   \\" + (int) (280 * chocolabuy) + "・・・" + (int) (280 * chocolabuy / sumcount * 100) + "%");
		System.out
				.println("ピスターシュ \\" + (int) (320 * pistabuy) + "・・・" + (int) (320 * pistabuy / sumcount * 100) + "%");

		System.out.println("\nが楽しめます！\n");
		System.out.println("\n値段は\\" + ((sumcount / (int) buycount) / 10 * 10) + "です。");

	}

}
