package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int amountBooks = 0; //本の冊数
		int sellFlag = 0; //本を売却するかどうかの判定
		int bookPrice = 200; //本の値段

		System.out.println("本を売却します。");

		do {
			amountBooks++;
			System.out.print("売却する本の冊数を 1 つ増やしますか？\nはい：0、いいえ：1 >");
			String strsellFlag = reader.readLine();
			sellFlag = Integer.parseInt(strsellFlag);

		} while (sellFlag == 0);
		System.out.print("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + (amountBooks * bookPrice) + "円です。");

	}

}
