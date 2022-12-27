package ma.elwardi.tp5_elwardi_abderrazzak.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import ma.elwardi.tp5_elwardi_abderrazzak.ejb.GestionnaireCompte;
import ma.elwardi.tp5_elwardi_abderrazzak.entities.CompteBancaire;
import ma.elwardi.tp5_elwardi_abderrazzak.entities.OperationBancaire;

@Named(value = "listeOperations")
@ViewScoped
public class ListeOperations implements Serializable {

    @EJB
    private GestionnaireCompte gestionnaireCompte;

    public ListeOperations() {
    }

    private Long idCompteBancaire;
    private CompteBancaire compte;

    public Long getIdCompteBancaire() {
        return idCompteBancaire;
    }

    public void setIdCompteBancaire(Long idCompteBancaire) {
        this.idCompteBancaire = idCompteBancaire;
    }

    public List<OperationBancaire> getOperations() {
        return compte.getOperations();
    }

    public void setCompte() {
        compte = gestionnaireCompte.findById(idCompteBancaire);
    }

    public CompteBancaire getCompte() {
        return compte;
    }
}
