import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nom;
        
        LocalDate date= LocalDate.of(2002,Month.MAY,24);
        LocalDate date2= LocalDate.of(2002,Month.APRIL,7);
        LocalDate date3= LocalDate.of(2002,Month.FEBRUARY,4);
        LocalDate date4= LocalDate.of(2002,Month.DECEMBER,11);
        Etudiant lolo=new Etudiant("dali ali", "ahmed raki",date,"daliraki19@gmail.com", "123");
        lolo.tostring();
        Etudiant toto=new Etudiant("dali ali", "ahmed raki",date2,"daliraki19@gmail.com", "123");        System.out.println("\n");
        toto.tostring();
        System.out.println("\n");

        System.out.println(lolo.nom == toto.nom);
        toto.setnom("titi");
        lolo.tostring();

        System.out.println("\n");

        Etudiant fifi = new Etudiant("Fifi", "Fifine", date3, "fifi@email.com", "789 Avenue, Village");
        Etudiant riri = new Etudiant("Riri", "Ririne", date4, "riri@email.com", "101 Main St, Hamlet");

        Departement monDepInfo = new Departement("Informatique", "123 University St, Campus");

        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);

        System.out.println("\nInformations du département monDepInfo :");
        System.out.println(monDepInfo);

        // Désinscription de toto du département
        monDepInfo.desinscrire(toto);
        System.out.println("\nInformations du département monDepInfo après désinscription de toto :");
        System.out.println(monDepInfo);

	}

}
