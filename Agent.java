import java.util.Date;
public class Agent extends Employe
    {
        private double primeResponsabilite;

        public Agent(String nom, Date dateNaissance, Date dateEmbauche, double salaireBase, double primeResponsabilite){
           super (nom, dateNaissance, dateEmbauche, salaireBase);

            this.primeResponsabilite = primeResponsabilite;
        }
        //méthode salaireApayer
        public double SalaireAPayer()
        {
            return (salaireBase+primeResponsabilite)*(1-IR.getIR(salaireBase*12));
        }
    }


