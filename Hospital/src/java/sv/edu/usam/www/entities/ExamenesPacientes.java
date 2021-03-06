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
 * ExamenesPacientes generated by hbm2java
 */
@Entity
@Table(name="examenes_pacientes"
    ,catalog="hospitalbd"
)
public class ExamenesPacientes  implements java.io.Serializable {


     private Integer idPacienteExm;
     private Citas citas;
     private DatosPacientes datosPacientes;
     private Examenes examenes;
     private TiposExamenes tiposExamenes;
     private String fechaCita;
     private String fechaRealizacion;
     private String resultado;

    public ExamenesPacientes() {
    }

	
    public ExamenesPacientes(Citas citas, DatosPacientes datosPacientes, Examenes examenes, TiposExamenes tiposExamenes, String fechaCita, String resultado) {
        this.citas = citas;
        this.datosPacientes = datosPacientes;
        this.examenes = examenes;
        this.tiposExamenes = tiposExamenes;
        this.fechaCita = fechaCita;
        this.resultado = resultado;
    }
    public ExamenesPacientes(Citas citas, DatosPacientes datosPacientes, Examenes examenes, TiposExamenes tiposExamenes, String fechaCita, String fechaRealizacion, String resultado) {
       this.citas = citas;
       this.datosPacientes = datosPacientes;
       this.examenes = examenes;
       this.tiposExamenes = tiposExamenes;
       this.fechaCita = fechaCita;
       this.fechaRealizacion = fechaRealizacion;
       this.resultado = resultado;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_paciente_exm", unique=true, nullable=false)
    public Integer getIdPacienteExm() {
        return this.idPacienteExm;
    }
    
    public void setIdPacienteExm(Integer idPacienteExm) {
        this.idPacienteExm = idPacienteExm;
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
    @JoinColumn(name="id_examen", nullable=false)
    public Examenes getExamenes() {
        return this.examenes;
    }
    
    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_tipo_exm", nullable=false)
    public TiposExamenes getTiposExamenes() {
        return this.tiposExamenes;
    }
    
    public void setTiposExamenes(TiposExamenes tiposExamenes) {
        this.tiposExamenes = tiposExamenes;
    }

    
    @Column(name="fecha_cita", nullable=false, length=15)
    public String getFechaCita() {
        return this.fechaCita;
    }
    
    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    
    @Column(name="fecha_realizacion", length=15)
    public String getFechaRealizacion() {
        return this.fechaRealizacion;
    }
    
    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    
    @Column(name="resultado", nullable=false, length=65535)
    public String getResultado() {
        return this.resultado;
    }
    
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }




}


