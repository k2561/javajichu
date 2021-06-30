package cn.jbit.loops2;
import java.util.*;
public class Schedule {
	/**
	 * break在switch中的作用，根据选择，输入日程安排
	 */
     public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
		      System.out.print("查看日程表，请输入日期（1-5）：");
		      int day = input.nextInt();
		      switch (day) {
		      case 1:
			      System.out.println("出席IT科技展剪彩仪式");
			      break;
		      case 2:
			      System.out.println("飞抵香港参加亚太区会议");
			      break;
		      case 3:
			      System.out.println("会议结束游香港海洋公园");
			      break;
		      case 4:
			      System.out.println("抵京召开公司月度股东大会");
			      break;
		      case 5:
			      System.out.println("自由时间");
			      break;
		      }
	     }
}

