import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    LeftEye leftEye = new LeftEye("Left Eye","short sight",true,"Blue");
    RightEye rightEye = new RightEye("Right Eye","short sight",false,"Blue");
    Stomach stomach = new Stomach("Stomach","Burning",true);
    Heart heart = new Heart("Heart","High BP",88);
    Skin skin = new Skin("Skin","seems good");
        Person person = new Person("Robin",22,leftEye,rightEye,heart,skin,stomach);
        System.out.println("Name : " + person.getpName());
        System.out.println("Age : " + person.getAge());
        Boolean isExit = false;
        while(!isExit){
            display();
            Scanner sc =new Scanner(System.in);
            switch (sc.nextInt()){
                case 1 : leftEye.info();
                            break;
                case 2 : rightEye.info();
                            break;
                case 3 : heart.info();
                            break;
                case  4 : skin.info();
                            break;
                case 5 : stomach.info();
                            break;
                case 6 : isExit = true;
            }

        }

    }
    public static void display(){
        System.out.println("choose option");
        System.out.println("1. Left Eye");
        System.out.println("2. Right Eye");
        System.out.println("3. Heart");
        System.out.println("4. Skin");
        System.out.println("5. Stomach");
        System.out.println("6. quit");
    }
}
