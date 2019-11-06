package sk.itsovy.podhajecka.Project;

public interface ArrayMethods {

    public double getAverageValue();
    public int min();
    public int max();
    public int min2(); // dobrovolna
    public int max2(); // dobrovolna
    public void generateValues(int a, int b); //od a do b, 12 a 7 nič neurobi
    public boolean contains(int value); // true false, ked napíše 5 a v poli je 5 napíše true
    public int countOfValues(int value); // nevráti ano nie ale kolkokrát je tam value
    public int countOfEven(); // 0 a-1 párne čísla
    public void incrementValues(); // každé zvačší o jedno cele pole
    public void sort(boolean asc); // ak to bude true od najmenšieho po najvacsi, ak false opačne
    public void addItem(int newValue); // pridá na koniec pola novu polozku
    public void addItem(int newValue, int position); // dobrovolna ked dám na 3 poziciu tak sa ostatné posunu
    public int[] copy(); // kopiu
    //public String toString(); v triede override zdedime od objektu
    public int getItem(int position); // pozicia ked bude 3 tak vypíše 4ty prvok

    //ktore cislo je najpocetnejšie
}
