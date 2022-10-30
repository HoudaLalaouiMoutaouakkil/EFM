import java.util.Date;

class Formateur extends Employe
        {
private int heureSup;
private static double remunerationHSup=70.00;
//L'accesseur RemunerationHSup
        public double getremunerationHSup(){
            return remunerationHSup;}
        public void setremunerationHSup(double remunerationHSup){ this.remunerationHSup=70.00;}
// constructeur d'initialisation
public Formateur(String nom, Date dateNaissance, Date dateEmbauche, double salaireBase, int heureSup){
        super (nom,dateNaissance,dateEmbauche,salaireBase);
        this.heureSup=heureSup;
        }
//La méthode SalaireAPayer()
public  double SalaireAPayer(){
        return (salaireBase+heureSup*remunerationHSup)*(1-IR.getIR(salaireBase*12));}
//La méthode ToString()
public String ToString()
        {
        return "les heures sup:"+heureSup+"le rémunération sup:"+remunerationHSup;
        }
        }