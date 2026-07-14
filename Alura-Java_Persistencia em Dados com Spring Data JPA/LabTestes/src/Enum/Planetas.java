package Enum;

public enum Planetas {

    TERRA,
    MARTE,
    VENUS,
    MERCURIO,
    JUPITER,
    SATURNO,
    NETUNO,
    URANO;



    public void qualPlaneta(Planetas planeta) {
        switch (planeta) {
            case TERRA:
                System.out.println("Você está na Terra!");
                return ;
            default:
                System.out.println("Você não está na Terra!");
                break;
        }
    }






}
