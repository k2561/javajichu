package cn.jbit.classandobject;
/**
 * �ϻ��׶�3��ͼ�������� 
 *
 */
public class Triangle {
	
	/**	 
	 * @param  row �к�
	 * @param ch ��ӡ���ַ�
	 */
	public void printTriangle(int row,String ch){	
        int i, j;      // ѭ������
        // ���ѭ�����ƴ�ӡ������
        for (i = 1; i <= row; i++){
            // �ڲ�ѭ������ÿ�д�ӡ*�ĸ���
            for (j = 1; j <= i; j++){
            	System.out.print(ch);// ��ӡһ�� *                
            }
            System.out.println();     // ��ӡ��һ��֮����          
        }
	}	
}
