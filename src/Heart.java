import java.util.Scanner;

public class Heart extends Organs{
    private int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void info() {
        super.info();
        System.out.println("Heart Rate : " + this.getHeartRate());
        action();
    }


    public void action(){
        System.out.println("1. Change Heart Rate");
        if(sc.nextInt()==1){
            System.out.println("Enter heart rate :");
            this.setHeartRate(sc.nextInt());
        }
    }
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
