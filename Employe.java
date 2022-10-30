import java.util.Date;
import java.util.LocalDate;

public abstract class Employe extends IR implements IEmploye
    {
//Les attributs
protected int mtle;
protected String nom;
protected Date dateNaissance,dateEmbauche;
protected double salaireBase;
private static int cmt=0;
//les accesseurs
            public Date getDateNaissance() {return dateNaissance;}
            public void setDateNaissance(Date dateNaissance){this.dateNaissance=dateNaissance;}
            public Date getDateEmbauche() {return dateEmbauche;}
        public void setDateEmbauche
        {
        if((dateEmbauche-dateNaissance) < 16){
                System.out.println("Cet employé n'est pas accepté ");
        }
        throw ((dateEmbauche-dateNaissance) > 16);

        }
//constructeur
public Employe(String nom,Date dateNaissance,Date dateEmbauche,double salaireBase)
        {
        this.nom=nom;
        this.dateNaissance=dateNaissance;
        this.dateEmbauche=dateEmbauche;
        this.salaireBase=salaireBase;
        cmt++;
        this.mtle=cmt;
        }
// méthode abstraite SalaireAPayer()
public abstract double SalaireAPayer();

//L'implémentation de l'interface IEmploye
public int Age()
        {
        int age= LocalDate().now-dateNaissance;
        return age;
        }
public int Anciennete()
        {
        int anciennete =LocalDate().now-dateEmbauche;
        return anciennete;
        }
public Date DateRetraite(int ageRetraite){

            int DateRetraite= ageRetraite + dateNaissance;
            return DateRetraite;

        }
//La redéfinition de la méthode ToString()

public   String ToString()
        {
        return mtle+"-"+nom+"-"+dateNaissance+"-"+dateEmbauche+"-"+salaireBase;
        }
//La redéfinition de la méthode Equals()
@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe e)) return false;
        return false;
}}