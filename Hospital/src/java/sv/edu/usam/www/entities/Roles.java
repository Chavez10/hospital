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
 * Roles generated by hbm2java
 */
@Entity
@Table(name="roles"
    ,catalog="hospitalbd"
)
public class Roles  implements java.io.Serializable {


     private Integer idRol;
     private String rol;
     private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

    public Roles() {
    }

	
    public Roles(String rol) {
        this.rol = rol;
    }
    public Roles(String rol, Set<Usuarios> usuarioses) {
       this.rol = rol;
       this.usuarioses = usuarioses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_rol", unique=true, nullable=false)
    public Integer getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    
    @Column(name="rol", nullable=false, length=50)
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="roles")
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }




}

