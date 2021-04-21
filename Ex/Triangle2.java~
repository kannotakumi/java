class Triangle2{
	public static void main(String[] args){
		int height = Integer.parseInt(args[0]);
		drawTriangle(height);
	}
	static void drawTriangle(int height){
		int max_Star = 1 + (height * 2);
		int star = 1;
		for(int i = 0; i < height; i++){
			for(int j = 0; j < max_Star; j++){
				System.out.print(" ");	
			}
			for(int k = 0; k < star; k ++){
				System.out.print("*");
			}
			max_Star--;
			star+=2;
			System.out.print("\n");
		}
	}
}
