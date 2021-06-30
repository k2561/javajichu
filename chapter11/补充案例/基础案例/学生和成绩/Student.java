
public class Student {
      String name;
      Score score;
      
      public void setData(){
    	  name = "уехЩ";
    	  score = new Score();
    	  score.course = "Java";
    	  score.grade = 80;
      }
      
      public void getResult(){
    	  System.out.println(score.course + "\t" + score.grade);
      }
      
      public static void main(String[] args){
    	  Student stu = new Student();
    	  stu.setData();
    	  stu.getResult();
      }
} 
