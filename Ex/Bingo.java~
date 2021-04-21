import java.util.Scanner;
class Bingo{
	public static void main(String[] args){
		String[][] line;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int hantei;
		int[] LotteryCompNum = new int[76]; 
		int check = 0;
		line = getLine();
		drawBingokard(line);
		while(true){
			String num = hitNumber();
			String str = sc.nextLine();
			System.out.println("抽選番号:"  + num);
			check = checkCompNum(num, LotteryCompNum);
			if(check == 1){
				System.out.println("抽選番号が被りました。もう一度Enterを押して");
				continue;
			}
			line = checkNumber(line, num);
			drawBingokard(line);
			hantei = checkBingo(line);
			count++;
			System.out.println(count);
			if(hantei == 1){
				break;
			}
		}
	}
	static int checkCompNum(String num, int[] LotteryCompNum){
		int i_Num = Integer.parseInt(num);
		LotteryCompNum[i_Num] += 1;
		if(LotteryCompNum[i_Num] > 1){
			return 1;
		}
		return 0;
	}
	static int checkBingo(String[][] line){
		int reach = 0;
		for(int i = 0; i < 5; i++){
			int Hcount = 0;
			for(int j = 0; j < 5; j++){
				if(line[i][j].equals("□")){
					Hcount++;
				}		
			}
			if (Hcount == 5){
				System.out.println("Bingo");
				return 1;
			}
			else if(Hcount == 4){
				reach++;
			}
		}
		for(int j = 0; j < 5; j++){
			int Wcount = 0;
			for(int i = 0; i < 5; i++){
				if(line[i][j].equals("□")){
					Wcount++;
				}
				if(Wcount == 5){
					System.out.println("Bingo");
					return 1;
				}
				else if(Wcount == 4){
					reach++;
				}
			}
		}
		for(int i = 0; i < 5; i++){
			int Lcount = 0;
			if(line[i][i].equals("□")){
				Lcount++;
			}
			if(Lcount == 5){
				System.out.println("BINGO");
				return 1;
			}
			else if(Lcount == 4){
				reach++;
			}

				}
		for(int i = 0; i < 5; i++){
			int Rcount = 0;
			if(line[4-i][i].equals("□")){
				Rcount++;
			}
			if(Rcount == 5){
				System.out.println("BINGO");
				return 1;
			}
			else if(Rcount == 4){
				reach++;
			}

			
		}

		System.out.println("reach:" + reach);
		return 0;
	}
	static String[][] checkNumber(String[][] line, String num){
			for(int i = 0; i < 5; i++){
				for(int j = 0; j < 5; j++){
					if(num.equals(line[i][j])){
						System.out.println("hit");
						line[i][j] = "□";
					}
				}
			}
			return line;
	}
	static String hitNumber(){
		int random = (int)(Math.random() * 100) % 75 + 1;
		String s_Random = String.valueOf(random);
		return s_Random;
	}
	static void drawBingokard(String[][] line){
		System.out.println("---------------------");
		System.out.println("| B | I | N | G | O |");
		System.out.println("---------------------");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.print("| " + line[j][i]);
			}
			System.out.println(" |");
			System.out.println("---------------------");
		}
	}
	static String[][] getLine(){
		String[][] line = new String[5][5];
		int random = 0;
		for(int i = 0; i < 5;i++){
			for(int j = 0; j < 5; j++){
				int count = 0;
				switch (i){
					case 0:	
						random = (int)(Math.random() * 100) % 15 + 1;
					//	System.out.println(i + ":" + random);
						break;
					case 1:
						random = (int)(Math.random() * 100) % 30 + 16;
						if(random > 30){
							j--;
							continue;
						}
					//	System.out.println(i + ":" + random);
						break;
					case 2:
						random = (int)(Math.random() * 100) % 45 + 31;
						if(random > 45){
							j--;
							continue;
						}
					//	System.out.println(i + ":" + random);
						break;
					case 3:
						random = (int)(Math.random() * 100) % 60 + 45;
						if(random > 60){
							j--;
							continue;
						}
					//	System.out.println(i + ":" + random);
						break;
					case 4:
						random = (int)(Math.random() * 100) % 75 + 61;
						if(random > 75){
							j--;
							continue;
						}
					//	System.out.println(i + ":" + random);
						break;
				}
				String s_Random = String.valueOf(random);
				//System.out.println(s_Random);
				for(int k = 0; k < 5; k++){
					if(s_Random.equals(line[i][k])){
						count++;
					}

				}
				if(count > 0){
					j--;
					continue;
				}
				else{
					if(i == 2 && j == 2){
						line[i][j] = "□";
					}
					else{
					line[i][j] = s_Random;
					}
				}
			}
		}
		return line;
	}
}
