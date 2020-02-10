import java.lang.String; 
public class Materia
{
    private String nombre;
    private String clave;
    private int creditos;
    
    public Materia(String nombre,String clave,int creditos)
    {
        this.nombre=nombre;
        this.clave=clave;
        this.creditos=creditos;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getClave()
    {
        return clave;
    }
    
    public int getCreditos()
    {
        return creditos;
    }
}
