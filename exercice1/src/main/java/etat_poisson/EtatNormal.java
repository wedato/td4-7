package etat_poisson;

import mare.Mare;
import poissons.Poisson;

public class EtatNormal implements EtatPoisson{


    private Poisson poissonAPiloter;

    public EtatNormal(Poisson poissonAPiloter) {
        this.poissonAPiloter = poissonAPiloter;
    }

    @Override
    public void deplacer() {

        if (this.poissonAPiloter.getX() <= 0 ||
                this.poissonAPiloter.getX() >=
                        this.poissonAPiloter.getMare().getDimX()) {
            this.poissonAPiloter.setSensDeplacement(
                    this.poissonAPiloter.getSensDeplacement()*-1);
        }
        this.poissonAPiloter.setX(this.poissonAPiloter.getX()+
                this.poissonAPiloter.getSensDeplacement());

    }
}
