public class Organs{
    private String name;
    private String medicalCondition;

    public Organs(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void info(){
        System.out.println("Name : " + this.getName());
        System.out.println("Medical Condition : " + this.getMedicalCondition());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
