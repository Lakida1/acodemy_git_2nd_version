package classroom;

public class MethodPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(sum(4, 10));
        System.out.println(sum(30,8));
        System.out.println(add(2,4,5));
    }
        //metod slozenija:
        public static  int sum (int firstNumber, int secondNumber)
        {return firstNumber + secondNumber;}
       //inline (uproscjonnaja) return first+second;
       // polnaja (analogicno inline:
       // int sum = first second;
       //return sum;
    // metod umnozenie
public static int add(int firstNumber, int secondNumber,int thirdNumber)
{int add = firstNumber*secondNumber*thirdNumber;
    return add;}
    }

