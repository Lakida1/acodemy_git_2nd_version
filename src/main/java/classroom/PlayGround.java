package classroom;
//vizivaem iz class Calculator metodi, propisannije v classe Calculator
public class PlayGround {
    public static void main(String[] args) {
        Calculator casio = new Calculator("Casio 1",true,"accept");
        System.out.println(casio.name);
        System.out.println(casio.isScientific);


        int divisionResult = casio.divide(20,4);
        System.out.println(divisionResult);

        casio.printResult(divisionResult); //vizvan metod iz class Calculator
        casio.printResult(8); //pecataet, to cto vveli v()

        int number = 15;
        casio.printResult(number);//pecataet znacenie int number

        casio.printResult(casio.subtruct(12,6));

        Calculator citizen = new Calculator(); // kalkulator bez parametrov
        System.out.println(citizen.name); //imja ne propisano v objekte CalcSitizen, poetomu pecataetsja null
        citizen.printResult(citizen.multiply(3,4));
        citizen.printResult(casio.multiply(2,8));
        // esli nado rabotat tolko s odnim kalkulatorom

        Calculator testCalculator = new Calculator();
        testCalculator.name = "Unknown";
        testCalculator.isScientific = false;
        System.out.println(testCalculator.name);
        System.out.println("Is scientific?" + testCalculator.isScientific);
        testCalculator.setCondition("not accept");
        System.out.println(testCalculator.getCondition());
        testCalculator.multiply(1,3);
        testCalculator.multiply(1,3,6); //peregruzka metoda

    }
}
