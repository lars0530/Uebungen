package Blatt05.Aufgabe15;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Schadensmelder implements java.io.Serializable {
    protected long id;
    protected String name;
    protected Collection<Schadensmeldung> schadensmeldungen = new ArrayList<Schadensmeldung>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    @javax.validation.constraints.NotNull
    @javax.persistence.Column(unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schadensmelder")
    public Collection<Schadensmeldung> getSchadensmeldung() {
        return schadensmeldungen;
    }

    public void setSchadensmeldung(Collection<Schadensmeldung> coll) {
        schadensmeldungen = coll;
    }


    public void addSchadensmeldung(Schadensmeldung schadensmeldung) {
        schadensmeldungen.add(schadensmeldung);
    }

    public void removeSchadensmeldung(Schadensmeldung schadensmeldung) {
        schadensmeldungen.remove(schadensmeldung);
    }
}
