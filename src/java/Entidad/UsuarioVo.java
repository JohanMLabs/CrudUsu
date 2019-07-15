/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author blanclabs
 */
public class UsuarioVo {
    int Id;
    String Nombre;
    String Clave;

   

    public UsuarioVo(int Id, String Nombre, String Clave) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Clave = Clave;
    }

    

    public UsuarioVo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
}
