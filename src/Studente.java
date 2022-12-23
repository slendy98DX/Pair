import java.util.ArrayList;
import java.util.List;

public class Studente {
    private String name;
    private String surname;
    private int age;

    private String matricola;
    private List<Esame> listaEsamiSuperati;

    public Studente(String name, String surname, int age, String matricola) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.matricola = matricola;
        this.listaEsamiSuperati = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public List<Esame> getListaEsamiSuperati() {
        return listaEsamiSuperati;
    }

    public void setListaEsamiSuperati(List<Esame> listaEsamiSuperati) {
        this.listaEsamiSuperati = listaEsamiSuperati;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
