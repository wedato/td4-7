package etat_poisson;

import mare.Mare;

public class EtatAffole implements EtatPoisson {

    private Mare mare;
    private Poisson poissonPilote;

    public EtatAffole(Mare mare, Poisson poissonPilote) {
        this.mare = mare;
        this.poissonPilote = poissonPilote;
    }

    @Override
    public void deplacer() {

    }
}
