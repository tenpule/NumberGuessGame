import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.println("数当てゲーム");
		System.out.println("1~99の数字を入力してね");
		
		Scanner x = new Scanner(System.in);
		int playernum;
		
		Random y = new Random();
		int cpunum;
		cpunum = y.nextInt(99)+1;
		
		int count = 0;
		
		do {
			playernum = x.nextInt();
			count++;
			
			if (cpunum > playernum) {
				System.out.println("正解の数字は大きいよ！");
			} else if (cpunum < playernum) {
				System.out.println("正解の数字は小さいよ！");
			} 			
		} while (cpunum != playernum);
		System.out.println("正解！");
		System.out.println("正解までの回数: " + count + "回!");
	}
}
