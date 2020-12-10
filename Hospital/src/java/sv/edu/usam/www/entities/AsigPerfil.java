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
 * AsigPerfil generated by hbm2java
 */
@Entity
@Table(name="asig_perfil"
    ,catalog="hospitalbd"
)
public class AsigPerfil  implements java.io.Serializable {


     private Integer idAsigPerfil;
     private Perfiles perfiles;
     private Registros registros;

    public AsigPerfil() {
    }

    public AsigPerfil(Perfiles perfiles, Registros registros) {
       this.perfiles = perfiles;
       this.registros = registros;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_asig_perfil", unique=true, nullable=false)
    public Integer getIdAsigPerfil() {
        return this.idAsigPerfil;
    }
    
    public void setIdAsigPerfil(Integer idAsigPerfil) {
        this.idAsigPerfil = idAsigPerfil;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_perfil", nullable=false)
    public Perfiles getPerfiles() {
        return this.perfiles;
    }
    
    public void setPerfiles(Perfiles perfiles) {
        this.perfiles = perfiles;
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


