package sv.edu.usam.www.entities;
// Generated 09-dic-2020 23:14:23 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RecetasPacientes generated by hbm2java
 */
@Entity
@Table(name="recetas_pacientes"
    ,catalog="hospitalbd"
)
public class RecetasPacientes  implements java.io.Serializable {


     private Integer idRecetas;
     private Citas citas;
     private DatosPacientes datosPacientes;
     private Medicamentos medicamentos;
     private String indicaciones;
     private String fecha;

    public RecetasPacientes() {
    }

	
    public RecetasPacientes(Citas citas, DatosPacientes datosPacientes, Medicamentos medicamentos, String indicaciones) {
        this.citas = citas;
        this.datosPacientes = datosPacientes;
        this.medicamentos = medicamentos;
        this.indicaciones = indicaciones;
    }
    public RecetasPacientes(Citas citas, DatosPacientes datosPacientes, Medicamentos medicamentos, String indicaciones, String fecha) {
       this.citas = citas;
       this.datosPacientes = datosPacientes;
       this.medicamentos = medicamentos;
       this.indicaciones = indicaciones;
       this.fecha = fecha;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_recetas", unique=true, nullable=false)
    public Integer getIdRecetas() {
        return this.idRecetas;
    }
    
    public void setIdRecetas(Integer idRecetas) {
        this.idRecetas = idRecetas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cita", nullable=false)
    public Citas getCitas() {
        return this.citas;
    }
    
    public void setCitas(Citas citas) {
        this.citas = citas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_paciente", nullable=false)
    public DatosPacientes getDatosPacientes() {
        return this.datosPacientes;
    }
    
    public void setDatosPacientes(DatosPacientes datosPacientes) {
        this.datosPacientes = datosPacientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="medicamentos", nullable=false)
    public Medicamentos getMedicamentos() {
        return this.medicamentos;
    }
    
    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }

    
    @Column(name="indicaciones", nullable=false, length=65535)
    public String getIndicaciones() {
        return this.indicaciones;
    }
    
    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    
    @Column(name="fecha", length=10)
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }




}


