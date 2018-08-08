/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaestudiantes;

/**
 *
 * @author Usuario FDG
 */
public class Datos {
    private String nombre;
    private String nota1;
    private String nota2;
    private String nota3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }

    public Datos(String nombre, String nota1, String nota2, String nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


   
    

    @Override
    public String toString() {
        return "ESTUDIANTE: "+this.nombre+"   "+this.nota1+"   "+this.nota2+"   "+this.nota3+"\n";
    }
      
      
}
