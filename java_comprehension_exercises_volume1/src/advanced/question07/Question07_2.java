package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };

		// TODO: 実装ここから
		String[] buycountStrings = new String[5];
		int[] buycount = new int[5];
		int allprices = 0;

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数: > ");
			buycountStrings[i] = reader.readLine();
			buycount[i] = Integer.parseInt(buycountStrings[i]);
		}
		System.out.println("明細書；");
		for (int i = 0; i < itemNames.length; i++) {
			prices[i] = buycount[i] * prices[i];
			allprices += prices[i];

		}
		for (int i = 0; i < buycount.length; i++) {
			System.out.println(itemNames[i] + " : " + prices[i] + "円");
		}
		System.out.println("合計金額: " + allprices + "円");

	}
}
