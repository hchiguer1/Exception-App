public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException{
        if (val<0) throw new NombreNegatifException("le nombre insérer est négative !!!", val);
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException{
        if (val<0) throw new NombreNegatifException("le nombre insérer est négative !!!",val );
        this.val = val;
    }
    public void deccrementer() throws NombreNegatifException {
        if(val==0) throw new NombreNegatifException("Vous ne pouvez pas decrementer !!!");
        val=val-1;
    }
}
