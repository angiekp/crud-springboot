package prueba.crud_spring.model;

import jakarta.persistence.*;

@Entity
@Table(name="tperso")
public class mGalpon {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String temperaturaG;
    private String cantidadPollo;
    private String aseo;
    private String controlPlaga;
    private String estado;
    private String codMant;

    public mGalpon(int id, String temperaturaG, String cantidadPollo, String aseo, String controlPlaga, String estado, String codMant) {
        this.id = id;
        this.temperaturaG = temperaturaG;
        this.cantidadPollo = cantidadPollo;
        this.aseo = aseo;
        this.controlPlaga = controlPlaga;
        this.estado = estado;
        this.codMant = codMant;
    }

    public int getId() {
        return id;
    }

    public String getTemperaturaG() {
        return temperaturaG;
    }

    public String getCantidadPollo() {
        return cantidadPollo;
    }

    public String getAseo() {
        return aseo;
    }

    public String getControlPlaga() {
        return controlPlaga;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodMant() {
        return codMant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTemperaturaG(String temperaturaG) {
        this.temperaturaG = temperaturaG;
    }

    public void setCantidadPollo(String cantidadPollo) {
        this.cantidadPollo = cantidadPollo;
    }

    public void setAseo(String aseo) {
        this.aseo = aseo;
    }

    public void setControlPlaga(String controlPlaga) {
        this.controlPlaga = controlPlaga;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCodMant(String codMant) {
        this.codMant = codMant;
    }
}
