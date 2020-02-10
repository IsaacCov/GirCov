import java.lang.String;
public class Grupo
{
    private Profesor profesor;
    private String horario;
    private String salon;
    private Materia materia;
    
    public Grupo(Materia nombremateria,String salon,String horario,Profesor profesor)
    {
        this.profesor=profesor;
        this.horario=horario;
        this.salon=salon;
        this.materia=nombremateria;
    }
    
    public String getNombreMateria()
    {
        return materia.getNombre();
    }
    
    public String getClave()
    {
        return materia.getClave();
    }
    
    public int getCreditos()
    {
        return materia.getCreditos();
    }
    
    public String getNombreProfesor()
    {
        return profesor.setFull();
    }
    
    public String getHorario()
    {
        return horario;
    }
    
    void setProfesor(Profesor profesor)
    {
        this.profesor=profesor;
    }
}
