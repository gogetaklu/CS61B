public class FindMax{
	public static int max(int[] array){
		int max=0;

		for(int i=0; i<array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		
		return max;
	}
	public static void main(String[] args){
		int MAX = 100;
		int maxValue = 0;
		int[] array = new int[MAX];
		for(int i=0; i<args.length; i++){
			array[i] = Integer.parseInt(args[i]);
		}
		
		maxValue = max(array);
		System.out.println("The maximum value is " + maxValue);
	}
}
