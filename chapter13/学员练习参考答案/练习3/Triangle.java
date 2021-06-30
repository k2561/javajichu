package cn.jbit.classandobject;
/**
 * 上机阶段3：图形生成器 
 *
 */
public class Triangle {
	
	/**	 
	 * @param  row 行号
	 * @param ch 打印的字符
	 */
	public void printTriangle(int row,String ch){	
        int i, j;      // 循环变量
        // 外层循环控制打印的行数
        for (i = 1; i <= row; i++){
            // 内层循环控制每行打印*的个数
            for (j = 1; j <= i; j++){
            	System.out.print(ch);// 打印一个 *                
            }
            System.out.println();     // 打印完一行之后换行          
        }
	}	
}
