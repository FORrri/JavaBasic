package day02;

public class Operator {
	
	public static void main(String[] args) {
		//단항 연산자 - 항이 하나인거
		
		int i = 3;
		int j = -i;
	
		//증감연산자 ++, --
		int k = 1;
		int h = k++;// 후위연산 - 먼저 값이 대입되고 , 그 다음에 증가.
		
		System.out.println("k값:"+k);
		System.out.println("h값:"+h);
		
		int x= 1;
		int y = ++x; //전위연사 - 먼저 값이 증가되고 , 그 다음에 대입
		System.out.println("x값:" + x);
		System.out.println("y값:"+y);
		
		//보통 이렇게 사용함
		x=1;
		x++;
		++x;
		System.out.println(x);
		
		
		System.out.println("------------------------------------------------------------");
		
		
		//비트연산자 "~" 많이 안씀
		byte b = 10; //0000 1010
		System.out.println(~b); //1111 0101
		System.out.println(~b+1); // -10 (보수 - 더했을 때 0이 되는 수)
		System.out.println(~b+1);
		
//		int z = 1;
//		int a = z++;
//		int f = ++a;
//		
//		System.out.println(f);
		System.out.println("------------------------------------------------------------");
		
		//논리 반전 연산자 ! 
		System.out.println(!true);
		System.out.println(!false); // 조건식을 세울 때 사용됨.
		
		boolean bool = !true;
		System.out.println(bool);
	
	
	}
		
		

}

