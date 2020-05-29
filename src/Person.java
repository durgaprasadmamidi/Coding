public class Person {
     private String pName;
     private int age;
     LeftEye leftEye;
     RightEye rightEye;
     Heart heart;
     Skin skin;
     Stomach stomach;

    public Person(String pName, int age, LeftEye leftEye, RightEye rightEye, Heart heart, Skin skin, Stomach stomach) {
        this.pName = pName;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.skin = skin;
        this.stomach = stomach;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
