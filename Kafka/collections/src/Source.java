import java.util.ArrayList;

class Vaccine {
    private int age;
    private float dosage;

    public Vaccine(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDosage() {
        return dosage;
    }

    public void setDosage(float dosage) {
        this.dosage = dosage;
    }
}

class VaccinationCamp{
    ArrayList<Vaccine> list = new ArrayList<>();

    public void assignVaccine(){
        for(int i = 0;i<list.size();i++){
            Vaccine v = list.get(i);
            if(v.getAge()>=45){
                v.setDosage(250);
            }
            else if(v.getAge()>=20){
                v.setDosage(200);
            }
            else if(v.getAge()<20){
                v.setDosage(100);
            }
        }
    }

    public void vaccineInjected(){
        float total = 0;
        for(int i = 0;i<list.size();i++){
            Vaccine v = list.get(i);
            total+=v.getDosage();
        }
        System.out.println(total);
    }
}
public class Source{
    public static void main(String[] args) {
        VaccinationCamp vc = new VaccinationCamp();

        vc.list.add(new Vaccine(49));
        vc.list.add(new Vaccine(26));
        vc.list.add(new Vaccine(19));

        vc.assignVaccine();
        vc.vaccineInjected();
    }
}