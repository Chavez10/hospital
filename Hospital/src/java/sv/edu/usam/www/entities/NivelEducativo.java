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
 * NivelEducativo generated by hbm2java
 */
@Entity
@Table(name="nivel_educativo"
    ,catalog="hospitalbd"
)
public class NivelEducativo  implements java.io.Serializable {


     private Integer idNivel;
     private String nivel;
     private Set<AsigInstitucion> asigInstitucions = new HashSet<AsigInstitucion>(0);

    public NivelEducativo() {
    }

    public NivelEducativo(String nivel, Set<AsigInstitucion> asigInstitucions) {
       this.nivel = nivel;
       this.asigInstitucions = asigInstitucions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_nivel", unique=true, nullable=false)
    public Integer getIdNivel() {
        return this.idNivel;
    }
    
    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    
    @Column(name="nivel", length=50)
    public String getNivel() {
        return this.nivel;
    }
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nivelEducativo")
    public Set<AsigInstitucion> getAsigInstitucions() {
        return this.asigInstitucions;
    }
    
    public void setAsigInstitucions(Set<AsigInstitucion> asigInstitucions) {
        this.asigInstitucions = asigInstitucions;
    }




}


