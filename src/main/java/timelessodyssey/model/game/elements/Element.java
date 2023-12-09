package timelessodyssey.model.game.elements;

import timelessodyssey.model.Position;

public class Element {
    private Position position;

    public Element(double x, double y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
