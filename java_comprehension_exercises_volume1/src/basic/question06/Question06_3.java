package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int amount = 0; //鉛筆の個数
		int price = 100; //鉛筆の値段

		System.out.print("鉛筆を購入しますか?\nはい：0、いいえ：1 >");
		String strbuyFlag = reader.readLine();
		int buyFlag = Integer.parseInt(strbuyFlag);

		while (buyFlag == 0) {
			amount++;
			System.out.print("購入する鉛筆の本数を 1 つ増やしますか？\nはい：0、いいえ：1 >");
			strbuyFlag = reader.readLine();
			buyFlag = Integer.parseInt(strbuyFlag);
		}
		System.out.println("購入した鉛筆の本数は" + amount + "本です。");
		System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");

	}

}
