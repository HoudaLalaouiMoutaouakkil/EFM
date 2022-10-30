public abstract class IR
{
    private static double[] tranches = {0,30001,50001,60001,80001,180001};
    private static double[] tauxIR = {0,10,20,30,34,38};
    //fonction getIR
    public static double getIR(double salaire)
    {
        for (int i = 1; i <= 6; i++)
        {
            if (salaire < tranches[i])
                return tauxIR[i - 1];
        }
        return tauxIR[5];
    }
}
