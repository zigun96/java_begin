package sec01_datatype.EX03_RangeOfVariableUse;
public class RangOfVariableUse {
	public static void main(String[] args) {
		int value1 = 3; //변수 value1 생성
		{
			int value2 = 5; //변수 value2 생성
			final int VALUE1 = 920 ; //상수 VALUE1 생성
			
			System.out.println(value1);
			System.out.println(value2);
			System.out.println(VALUE1);
		} //변수 value2 소멸, 상수 VALUE1 소멸
		
		System.out.println(value1);
//		System.out.println(value2); 소멸된 변수에 대한 출력을 요구하였으므로 오류
//		System.out.println(VALUE1); 소멸된 상수에 대한 출력을 요구하였으므로 오류
	}//변수 value1 소멸
}
