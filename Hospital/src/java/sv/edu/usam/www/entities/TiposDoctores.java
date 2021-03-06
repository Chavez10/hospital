package sv.edu.usam.www.entities;
// Generated 09-dic-2020 23:14:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TiposDoctores generated by hbm2java
 */
@Entity
@Table(name="tipos_doctores"
    ,catalog="hospitalbd"
)
public class TiposDoctores  implements java.io.Serializable {


     private Integer idTipoDoc;
     private String tipoDoc;
     private Set<Registros> registroses = new HashSet<Registros>(0);

    public TiposDoctores() {
    }

	
    public TiposDoctores(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public TiposDoctores(String tipoDoc, Set<Registros> registroses) {
       this.tipoDoc = tipoDoc;
       this.registroses = registroses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_tipo_doc", unique=true, nullable=false)
    public Integer getIdTipoDoc() {
        return this.idTipoDoc;
    }
    
    public void setIdTipoDoc(Integer idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    
    @Column(name="tipo_doc", nullable=false, length=50)
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tiposDoctores")
    public Set<Registros> getRegistroses() {
        return this.registroses;
    }
    
    public void setRegistroses(Set<Registros> registroses) {
        this.registroses = registroses;
    }




}


