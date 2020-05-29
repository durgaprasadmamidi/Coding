public class Skin extends Organs{
    public Skin(String name, String medicalCondition) {
        super(name, medicalCondition);
    }
    public void info(){
        System.out.println("Name : " + this.getName());
        System.out.println("Medical Condition" + this.getMedicalCondition());
    }
}
