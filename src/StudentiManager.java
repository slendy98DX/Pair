import java.util.ArrayList;
import java.util.List;

public class StudentiManager implements EsameManager{
    private List<Studente> listaStudenti = new ArrayList<>();

    public List<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public List<Studente> getStudentiByEsame(Esame e) {
        List<Studente> listaStudentePromosso = new ArrayList<>();
        listaStudenti.stream().filter(studente -> studente.getListaEsamiSuperati().contains(e)).forEach(studente -> listaStudentePromosso.add(studente));
        return listaStudentePromosso;
    }

    public void printInfoDSA(){
        List<StudenteDSA> listaDSA = new ArrayList<>();
        listaStudenti.stream().filter(studente -> studente instanceof StudenteDSA).forEach(studente -> listaDSA.add((StudenteDSA) studente));
        System.out.println(listaDSA);
    }

    public List<StudenteDSA> sameDSA(String patology){
        List<StudenteDSA> listDSA = new ArrayList<>();
        listaStudenti.stream().filter(studente -> studente instanceof StudenteDSA && ((StudenteDSA) studente).getTypeOfPatology().contains(patology)).forEach(studente -> listDSA.add((StudenteDSA) studente));
        return listDSA;
    }

    @Override
    public void addEsame(Studente s, Esame esame) {
        if(esame.getMark() < 18 || s.getListaEsamiSuperati().contains(esame)){
            System.out.printf("Esame non registrato per lo studente %s %s con matricola %s%n",s.getName(),s.getSurname(),s.getMatricola());
        } else{
            s.getListaEsamiSuperati().add(esame);
        }
    }

    public void addStudente(Studente studente){
        if(!listaStudenti.contains(studente)){
            listaStudenti.add(studente);
        } else {
            System.out.println("Studente già inserito");
        }
    }
}
