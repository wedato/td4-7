package state_mosh;

import state_mosh.BrushTool;
import state_mosh.Canvas;
import state_mosh.EraserTool;

public class Main {

    /*
    OPEN CLOSED PRINCIPLE
    Ouvert à l'extension , fermer à la modif
    éviter le cas de : je change le code d'une classe et ça casse tout
    nouveau feature = add une nouvelle classe

     */
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
