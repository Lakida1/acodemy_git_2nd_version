package classroom;
// default
//public
//private - zakrivaet dostup k znaceniju classa, mozem tolko polucat zancenije metoda iz glavnogo klassa, dla dostupa nado sozdavat Get i Set
//protected
public class Calculator {
    public int addCalc(int x,int y)
    {return x + y; }
    public int subtruct(int x, int y)
    {return x - y;}
    public int divide (int x,int y)
    {return x/y;}
    public int multiply(int x, int y)
    {return x*y;}
    public int multiply(int x, int y, int z)
    {return x*y*z;} // peregruzka metoda

    public void printResult(int number)
    {System.out.println(number);    }

    public String name;
    public boolean isScientific;
    private String condition; //dla dostupa k private, sozdali get i set

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    //pustoj constuctor: zecem nuzen her znaet :)
    public Calculator() {
    }
    //constructor (vtoraja knopka miski) - etim constr vizivaem objazannost propisat imja Calc, pri sozdaniji Calc
    public Calculator(String calculatorName,boolean isScientific,String condition) {
        this.name = calculatorName; // u Calc est pole name = pri sozdaniji new Calc nado propisat imja Calc
        this.isScientific = isScientific;


    }
}
