package Javaexercises1;

public class javaexercises2 {

   public static void main(String[] args) {
       int salary = 35000;
       System.out.println("base salary: " + salary);
       float salaryInc = salary * 0.105f;
       System.out.println("10% " + salaryInc);
       float salaryTotal = salary + salaryInc;
       System.out.println("johns updated salary: " + "£" + salaryTotal);


       float apple = 3.25f - (3.25f*01f);
       float applePartial = apple;
       apple = (int)(apple * 100);
       apple /=100;
       apple = (applePartial - apple > 0) ? apple + 0.1f : apple;
       float  chicken = 7.25f * 0.08f;
       chicken = (int)(chicken *100);
       float banana = 1.25f - (1.25f *0.03f);
       banana = (int) (banana *100 );
       banana /= 100;
       System.out.println("new apple cost: £" + apple);
       System.out.println("new chicken fillet cost: £" + chicken);
       System.out.println("new banana cost: £" + banana);

   }



   }


