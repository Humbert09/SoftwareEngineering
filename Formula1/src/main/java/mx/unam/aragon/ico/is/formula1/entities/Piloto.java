package mx.unam.aragon.ico.is.formula1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
public class Piloto {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "nombre_piloto", length = 100)
        @NotBlank(message = "El campo no puede estar en blanco")
        @NotNull(message = "No puede ser nulo")
        private String nombre;

        @Column(name = "equipo", length = 50)
        @NotBlank(message = "El campo no puede estar en blanco")
        @NotNull(message = "No puede ser nulo")
        private String equipo;


        @Column(name = "descripcion", length = 450)
        @NotBlank(message = "El campo no puede estar en blanco")
        @NotNull(message = "No puede ser nulo")
        private String descripcion;

        @Column(name = "edad", nullable = true)
        @Max(40)
        @Min(18)
        private Integer edad;

        @Column(name = "numero", nullable = true)
        @Max(99)
        @Min(1)
        private Integer numero;

        @Column(name = "url_foto", nullable = true, insertable = true, columnDefinition = "VARCHAR(350) DEFAULT 'https://png.pngtree.com/png-vector/20230407/ourmid/pngtree-placeholder-line-icon-vector-png-image_6691835.png'")
        private String imagen;

    public Piloto() {
    }

    public Piloto(Integer id, String nombre, String equipo, String descripcion, Integer numero, Integer edad, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.descripcion = descripcion;
        this.numero = numero;
        this.edad = edad;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Piloto piloto = (Piloto) o;
        return id == piloto.id && Objects.equals(nombre, piloto.nombre) && Objects.equals(equipo, piloto.equipo) && Objects.equals(descripcion, piloto.descripcion) && Objects.equals(edad, piloto.edad) && Objects.equals(numero, piloto.numero) && Objects.equals(imagen, piloto.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, equipo, descripcion, edad, numero, imagen);
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                ", imagen='" + imagen + '\'' +
                '}';
    }


}