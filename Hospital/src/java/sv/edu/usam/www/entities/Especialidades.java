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
 * Especialidades generated by hbm2java
 */
@Entity
@Table(name="especialidades"
    ,catalog="hospitalbd"
)
public class Especialidades  implements java.io.Serializable {


     private Integer idEspecialidad;
     private String especialidad;
     private Set<AsigEspecialidad> asigEspecialidads = new HashSet<AsigEspecialidad>(0);

    public Especialidades() {
    }

	
    public Especialidades(String especialidad) {
        this.especialidad = especialidad;
    }
    public Especialidades(String especialidad, Set<AsigEspecialidad> asigEspecialidads) {
       this.especialidad = especialidad;
       this.asigEspecialidads = asigEspecialidads;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_especialidad", unique=true, nullable=false)
    public Integer getIdEspecialidad() {
        return this.idEspecialidad;
    }
    
    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    
    @Column(name="especialidad", nullable=false, length=100)
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="especialidades")
    public Set<AsigEspecialidad> getAsigEspecialidads() {
        return this.asigEspecialidads;
    }
    
    public void setAsigEspecialidads(Set<AsigEspecialidad> asigEspecialidads) {
        this.asigEspecialidads = asigEspecialidads;
    }




}


