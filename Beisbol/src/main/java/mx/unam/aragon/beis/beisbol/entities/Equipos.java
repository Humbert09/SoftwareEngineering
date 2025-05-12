package mx.unam.aragon.beis.beisbol.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Equipos")
public class Equipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clave;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "liga", nullable = false, length = 50)
    private String liga;

    @Column(name = "url_logo", nullable = true, insertable = false, columnDefinition = "VARCHAR(250) DEFAULT 'https://png.pngtree.com/png-vector/20230407/ourmid/pngtree-placeholder-line-icon-vector-png-image_6691835.png'")
    private String logo;

    @Column(name = "campeonatos", nullable = true)
    private int campeonatos;

    public Equipos() {
    }

    public Equipos(int clave, String nombre, String liga, String logo, int campeonatos) {
        this.clave = clave;
        this.nombre = nombre;
        this.liga = liga;
        this.logo = logo;
        this.campeonatos = campeonatos;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return clave == equipos.clave && campeonatos == equipos.campeonatos && Objects.equals(nombre, equipos.nombre) && Objects.equals(liga, equipos.liga) && Objects.equals(logo, equipos.logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, nombre, liga, logo, campeonatos);
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", liga='" + liga + '\'' +
                ", logo='" + logo + '\'' +
                ", campeonatos=" + campeonatos +
                '}';
    }
}
