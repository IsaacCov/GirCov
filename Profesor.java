import java.lang.String;

public class Profesor
{
    private String nombre;
    private String apellidos;
    
    public Profesor(String nombre,String apellidos)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    
    public String setFull()
    {
        return nombre + " " + apellidos; 
    }
}
