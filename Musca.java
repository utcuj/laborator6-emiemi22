public class Musca  extends Insecta {

    public Musca(){
        System.out.println("constructor:Constructor musca ");
    zboara();
    }
    public void zboara()
    {
        System.out.println("Zboara puiulee!");
    }
    private static int r = enerveazaOameni();
    public static int enerveazaOameni(){
        System.out.println("static : Am murit");
        return 10 ;
    }
}
