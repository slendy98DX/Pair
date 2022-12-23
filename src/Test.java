public class Test {

    public static void main(String[] args) {

        StudentiManager studentiManager = new StudentiManager();

        Studente studente = new Studente("Pesc","Man",12,"fabio123");
        StudenteDSA studenteDSA = new StudenteDSA("Pesc","Man",12,"gz1233","seghe");
        StudenteDSA studenteDSA3 = new StudenteDSA("Cacca","pupù",24,"segway1738","seghetto");
        StudenteDSA studenteDSA2 = new StudenteDSA("Seg","way",33,"217","bho");
        Studente studente2 = new Studente("Pesc","Man",12,"10388");

        Esame esame = new Esame("math",26);
        Esame esame2 = new Esame("seghe",30);
        Esame esame3 = new Esame("sex",16);

        studentiManager.addStudente(studente);
        studentiManager.addStudente(studente2);
        studentiManager.addStudente(studenteDSA);
        studentiManager.addStudente(studenteDSA2);
        studentiManager.addStudente(studenteDSA3);

        studentiManager.addEsame(studente,esame);
        studentiManager.addEsame(studente2,esame2);
        studentiManager.addEsame(studenteDSA2,esame3);
        studentiManager.addEsame(studenteDSA,esame3);

        System.out.println("-----------------------------------------------");

        System.out.println(studentiManager.getStudentiByEsame(esame));
        System.out.println(studentiManager.getStudentiByEsame(esame2));

        System.out.println("--------------------------------------------------");

        studentiManager.printInfoDSA();

        System.out.println("----------------------------------------------------");

        System.out.println(studentiManager.sameDSA("seghe"));
    }
}