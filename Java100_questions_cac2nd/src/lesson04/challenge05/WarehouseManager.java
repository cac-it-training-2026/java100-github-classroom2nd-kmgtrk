/**
 * 第4章 倉庫番のお仕事
 *
 * 問題5  袋の中身を調べる【改訂版】
 *
 * AB興産から預かっている荷物を再び検査することになりました。
 * 荷物は全部で5袋あり、その中で数値の5が入っている袋が
 * 何袋目なのかを調べなければなりません。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらに今回はそれぞれの袋の値が重複しないものとします。
 * （つまり、5が入っている袋はただ一つだけ）
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  【※ここに値を出力】袋目
 *  に入っていました。
 *
 */

package lesson04.challenge05;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] bag = new int[5];//袋を5つ

		int intputNum = 0;
		boolean loopFlag = false;//重複したかどうかを確認する

		for (int i = 0; i < bag.length; i++) {//袋に数字を入れていく
			do {
				loopFlag = false;//重複していない

				intputNum = (int) (Math.random() * 5) + 1;

				for (int j = 0; j < bag.length; j++) {//すでに袋に入っている数字と比較
					if (bag[j] == intputNum) {//同じだった場合
						loopFlag = true;//再抽選
						break;
					}
				}

			} while (loopFlag);//ファルスだったら採用

			bag[i] = intputNum;//重複していない数字は袋に入れる

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の検査結果を教えてください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");

		for (int i = 0; i < bag.length; i++) {//袋の確認
			if (bag[i] == 5) {
				System.out.println((i + 1) + "袋目");
			}
		}

		System.out.println("に入っていました。");

	}
}
