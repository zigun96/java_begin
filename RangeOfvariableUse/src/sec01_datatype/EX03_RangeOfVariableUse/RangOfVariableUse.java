package sec01_datatype.EX03_RangeOfVariableUse;
public class RangOfVariableUse {
	public static void main(String[] args) {
		int value1 = 3; //���� value1 ����
		{
			int value2 = 5; //���� value2 ����
			final int VALUE1 = 920 ; //��� VALUE1 ����
			
			System.out.println(value1);
			System.out.println(value2);
			System.out.println(VALUE1);
		} //���� value2 �Ҹ�, ��� VALUE1 �Ҹ�
		
		System.out.println(value1);
//		System.out.println(value2); �Ҹ�� ������ ���� ����� �䱸�Ͽ����Ƿ� ����
//		System.out.println(VALUE1); �Ҹ�� ����� ���� ����� �䱸�Ͽ����Ƿ� ����
	}//���� value1 �Ҹ�
}
