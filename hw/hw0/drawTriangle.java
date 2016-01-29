public class drawTriangle{
	public drawTriangle(){};
	
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		DrawTriangle(N);
	}
	
	public static void DrawTriangle(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}
