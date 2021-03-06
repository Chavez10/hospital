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
 * AsigInstitucion generated by hbm2java
 */
@Entity
@Table(name="asig_institucion"
    ,catalog="hospitalbd"
)
public class AsigInstitucion  implements java.io.Serializable {


     private Integer idAsigInstitucion;
     private Instituciones instituciones;
     private NivelEducativo nivelEducativo;
     private Registros registros;

    public AsigInstitucion() {
    }

    public AsigInstitucion(Instituciones instituciones, NivelEducativo nivelEducativo, Registros registros) {
       this.instituciones = instituciones;
       this.nivelEducativo = nivelEducativo;
       this.registros = registros;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_asig_institucion", unique=true, nullable=false)
    public Integer getIdAsigInstitucion() {
        return this.idAsigInstitucion;
    }
    
    public void setIdAsigInstitucion(Integer idAsigInstitucion) {
        this.idAsigInstitucion = idAsigInstitucion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_institucion", nullable=false)
    public Instituciones getInstituciones() {
        return this.instituciones;
    }
    
    public void setInstituciones(Instituciones instituciones) {
        this.instituciones = instituciones;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_nivel", nullable=false)
    public NivelEducativo getNivelEducativo() {
        return this.nivelEducativo;
    }
    
    public void setNivelEducativo(NivelEducativo nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_registro", nullable=false)
    public Registros getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Registros registros) {
        this.registros = registros;
    }




}


