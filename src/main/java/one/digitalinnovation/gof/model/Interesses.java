package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Interesses {
    @Id
    private Interesses interesses;

    public Interesses getInteresses() {
        return interesses;
    }

    public void setInteresses(Interesses interesses) {
        this.interesses = interesses;
    }

    
}
