
package logica;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Persona {
    
    @Basic
    private String nombre;
    private String apellido;
    
        
    public Persona() {
    }

    public Persona(String username, String password) {
        this.nombre = username;
        this.apellido = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
