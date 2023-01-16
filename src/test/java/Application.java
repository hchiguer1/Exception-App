public class Application {
    public static void main(String[] args)  {
        try{
        EntierNaturel entierNaturel= new EntierNaturel(-1);
        System.out.println(entierNaturel.getVal());
        entierNaturel.setVal(2);
        System.out.println(entierNaturel.getVal());
        entierNaturel.deccrementer();
        System.out.println(entierNaturel.getVal());
        }catch(NombreNegatifException e){

            System.out.println(e.getMessage());
            System.out.println("le nombre négative est : "+e.getEntiernegative());
            e.printStackTrace();

        }
    }
}
