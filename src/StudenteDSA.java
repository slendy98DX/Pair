public class StudenteDSA extends Studente{
    private String typeOfPatology;

    public StudenteDSA(String name, String surname, int age, String matricola, String typeOfPatology) {
        super(name, surname, age, matricola);
        this.typeOfPatology = typeOfPatology;
    }


    public String getTypeOfPatology() {
        return typeOfPatology;
    }

    public void setTypeOfPatology(String typeOfPatology) {
        this.typeOfPatology = typeOfPatology;
    }

    @Override
    public String toString() {
        return super.toString()+
                " StudenteDSA{" +
                "typeOfPatology='" + typeOfPatology + '\'' +
                '}';
    }
}
