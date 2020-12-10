package sv.edu.usam.www.entities;
// Generated 09-dic-2020 23:14:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Examenes generated by hbm2java
 */
@Entity
@Table(name="examenes"
    ,catalog="hospitalbd"
)
public class Examenes  implements java.io.Serializable {


     private String idExamen;
     private String examen;
     private Set<ExamenesPacientes> examenesPacienteses = new HashSet<ExamenesPacientes>(0);

    public Examenes() {
    }

	
    public Examenes(String idExamen, String examen) {
        this.idExamen = idExamen;
        this.examen = examen;
    }
    public Examenes(String idExamen, String examen, Set<ExamenesPacientes> examenesPacienteses) {
       this.idExamen = idExamen;
       this.examen = examen;
       this.examenesPacienteses = examenesPacienteses;
    }
   
     @Id 

    
    @Column(name="id_examen", unique=true, nullable=false, length=5)
    public String getIdExamen() {
        return this.idExamen;
    }
    
    public void setIdExamen(String idExamen) {
        this.idExamen = idExamen;
    }

    
    @Column(name="examen", nullable=false, length=100)
    public String getExamen() {
        return this.examen;
    }
    
    public void setExamen(String examen) {
        this.examen = examen;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="examenes")
    public Set<ExamenesPacientes> getExamenesPacienteses() {
        return this.examenesPacienteses;
    }
    
    public void setExamenesPacienteses(Set<ExamenesPacientes> examenesPacienteses) {
        this.examenesPacienteses = examenesPacienteses;
    }




}

