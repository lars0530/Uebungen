package Blatt05.Aufgabe15;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
public class Schadensmeldung {
    protected long id;
    protected String beschreibung;
    protected LocalDateTime zeitDerMeldung;
    protected LocalDateTime zeitDesVorfalls;
    protected Schadensmelder melder;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.validation.constraints.Size(min = 10, max = 200)
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDateTime getZeitDerMeldung() {
        return zeitDerMeldung;
    }

    public void setZeitDerMeldung(LocalDateTime zeitDerMeldung) {
        this.zeitDerMeldung = zeitDerMeldung;
    }

    @javax.validation.constraints.Past
    public LocalDateTime getZeitDesVorfalls() {
        return zeitDesVorfalls;
    }

    public void setZeitDesVorfalls(LocalDateTime zeitDesVorfalls) {
        this.zeitDesVorfalls = zeitDesVorfalls;
    }

    @javax.persistence.ManyToOne(cascade = CascadeType.ALL)
    public Schadensmelder getSchadensmelder() {
        return melder;
    }

    public void setSchadensmelder(Schadensmelder schadensmelder) {
        this.melder = schadensmelder;
    }

}
