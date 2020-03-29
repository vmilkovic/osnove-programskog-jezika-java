package predavanja2019.predavanje3;

public class Student {

    private String imeStudenta;
    private int JMBAG;
    static private String nazivFakulteta = "Veleučilište u Bjelovaru";

    Student(){
        System.out.println("Pozvan defaultni konstruktor!");
    }

    Student(String ime, int JMBAG){
        this.imeStudenta = ime;
        this.JMBAG = JMBAG;
    }

    Student(String ime){
        this.imeStudenta = ime;
        this.JMBAG = -1;
    }

    Student(Student s1){
        this.JMBAG = s1.JMBAG;
        this.imeStudenta = s1.imeStudenta;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    static void setNazivFakulteta(String noviNaziv){
        nazivFakulteta = noviNaziv;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        try {

            Student noviStudent = new Student("Pero Peric", 1234);
            Student noviStudent2 = new Student("Pero Peric Bez JMBAG");

            // Student noviStudent3 = new Student(noviStudent); // Konstruktor kopije

            Student noviStudent3 = noviStudent.clone();

            if (noviStudent == noviStudent3) System.out.println("Reference su iste");
            else System.out.println("Reference nisu iste");

            System.out.println("Rezultat: " + noviStudent3.imeStudenta + " " + noviStudent3.JMBAG);

        } catch(CloneNotSupportedException ie){

            System.out.println(ie);

        }


    }

}
