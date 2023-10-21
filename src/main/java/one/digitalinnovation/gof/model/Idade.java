package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Idade {
    @Id
    private Integer idade;
    
    public Idade(Integer idade) {
        this.idade = idade;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Idade idade) {
        this.idade = idade.getIdade();
    }
}
