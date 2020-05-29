import java.util.Scanner;

public class LeftEye extends Organs{

    public LeftEye(String name, String medicalCondition, boolean isOpen, String color) {
        super(name, medicalCondition);
        this.isOpen = isOpen;
        this.color = color;
    }

    private boolean isOpen;
    private String color;

    Scanner sc = new Scanner(System.in);

    @Override
    public void info() {
        super.info();
        System.out.println("Color : " + this.getColor());
        action();
    }

    public void action(){
        if (isOpen) {
            System.out.println("1. Close the Eye");
            if(sc.nextInt()==1){
                System.out.println("Left Eye Closed");
                this.setOpen(false);
            }
        } else {
            System.out.println("1. Open the Eye");
            if(sc.nextInt()==1){
                System.out.println("Left Eye Opened");
                this.setOpen(true);
            }
        }
    }

    public boolean isOpen() {
        return isOpen;
    }


    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
