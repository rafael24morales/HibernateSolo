

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author rafaelm
 */
@Entity
public class Frijolito implements Serializable {
    
    @Id @GeneratedValue
    private int idFrijol;

    private String color;

    private String sabor;

    private String marca;

    public Frijolito() {
    }

    public Frijolito(String color, String sabor, String marca) {
        this.color = color;
        this.sabor = sabor;
        this.marca = marca;
    }
    
    public Frijolito(int idFrijol, String color, String sabor, String marca) {
        this.idFrijol = idFrijol;
        this.color = color;
        this.sabor = sabor;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public int getIdFrijol() {
        return idFrijol;
    }

    public String getMarca() {
        return marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIdFrijol(int idFrijol) {
        this.idFrijol = idFrijol;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
