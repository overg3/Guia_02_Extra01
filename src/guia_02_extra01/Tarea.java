
package guia_02_extra01;

public class Tarea {
    
    private String descripcion;
    private boolean isDone;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        isDone = false;
    }

    public Tarea(String descripcion, boolean isDone) {
        this.descripcion = descripcion;
        this.isDone = isDone;
    }
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
    
    
}
