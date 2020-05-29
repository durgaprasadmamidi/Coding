import java.util.Scanner;

public class Stomach extends Organs{
    public Stomach(String name, String medicalCondition, Boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    private Boolean isEmpty;

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    @Override
    public void info() {
        super.info();
        if(getEmpty()) {
            System.out.println("Need to Feed");
            action();
        }
        else
            System.out.println("stomach is full");
    }


    public void action(){
        System.out.println("1. Digest");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()==1) {
            System.out.println("digesting begin...");
            this.setEmpty(false);
        }
    }

}
