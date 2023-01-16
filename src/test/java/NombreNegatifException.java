public class NombreNegatifException extends Exception{
    private int entiernegative;
public NombreNegatifException(String s){
    super(s);
}
    public NombreNegatifException(String s,int val){
        super(s);
        entiernegative=val;
    }
    public int getEntiernegative(){
    return entiernegative;
    }

}

