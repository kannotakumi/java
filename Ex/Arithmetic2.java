class Arithmetic2{
	public static void main(String[] args){
		int first = Integer.parseInt(args[0]);
		int kousa = Integer.parseInt(args[1]);
		int kousu = Integer.parseInt(args[2]);
		int[] array;
		array = getProgression(first, kousa, kousu);
		System.out.println("‰€:" + first + ", Œö·:" + kousa + ", €”:" + kousu);
		
		System.out.print("“™·”—ñ;");
		for(int i = 0; i < kousu; i++){
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
	}
	static int[] getProgression(int first, int kousa, int kousu){
		int pArray[] = new int[kousu];
		for(int i = 0; i < kousu;i++){
			pArray[i] = first + (kousa * i);
		}
		return  pArray;
	}
}
