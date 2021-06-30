/*
 * 计算机类
 */
public class Computer {
   String CPU;
   String main_board;
   String monitor;
   String hard_disk;
   String memory;
	
   public String toString(){
	   return "计算机配置如下：\nCPU:" + CPU + ";\n主板：" + main_board + ";\n内存：" + memory + ";\n硬盘：" + hard_disk + ";\n显示器：" + monitor;
   }
}
