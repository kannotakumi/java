class GCMTest{
	public static void main(String[] args){
		int num1 = 3;
		int num2 = 2;
		int gcm = getGcm(num1, num2);
		System.out.println("Å‘åŒö–ñ”:" + gcm);
	}
	static int getGcm(int num1, int num2){
		while(true){
			if(num1 > num2){
				num1 -= num2;
			}
			else if(num2 > num1){
				num2 -= num1;
			}
			if(num1 == num2){
				return num1;
			}
		}
	}
}
