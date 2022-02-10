package homework;

public class AnimalHomework {
    public String name;
    public int energyLevel = 4;
    boolean isNight = false;

    public AnimalHomework(String name, boolean isNight) {
        this.name = name;
        this.isNight = isNight;
    }

    public void walk() {
        if (energyLevel == 4) {
            System.out.println("I am ready for walking");
        } else {
            energyLevel--;
        }
        System.out.println(energyLevel);
    }

    public void eatSecond() {
        do {
            energyLevel++;
            System.out.println(energyLevel);
        }
        while (energyLevel == 4);
    }

    public void superEat() {

//rabotaet! no vse cikli podrjad
        while (energyLevel<=4)
        {if (energyLevel >=0){System.out.println("I am ready"+ energyLevel);}
        else {System.out.println("I want to eat");}
            energyLevel++;}}
public void fly()
        {
            if (energyLevel>=1)
            {energyLevel--;
                System.out.println("I am flying"+ energyLevel);}
            else System.out.println("I want to eat");
        }
public void eat()
{energyLevel++;
    System.out.println("Thank You" + energyLevel);}



}
















































