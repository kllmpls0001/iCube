import java.awt.*;

public class Cube {
    private Facet[] facets;
    Cube(){
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0, 0, 1), new R3Vector(0, 1, 1), new R3Vector(1, 1, 1), new R3Vector(1, 0, 1));
        facets[1] = new Facet(new R3Vector(1, 0, 0), new R3Vector(0, 0, 0), new R3Vector(0, 1, 0), new R3Vector(1, 1, 0));
        facets[2] = new Facet(new R3Vector(1, 1, 1), new R3Vector(0, 1, 1), new R3Vector(0, 1, 0), new R3Vector(1, 1, 0));
        facets[3] = new Facet(new R3Vector(1, 0, 0), new R3Vector(1, 0, 1), new R3Vector(0, 0, 1), new R3Vector(0, 0, 0));
        facets[4] = new Facet(new R3Vector(0, 0, 0), new R3Vector(0, 0, 1), new R3Vector(0, 1, 1), new R3Vector(0, 1, 0));
        facets[5] = new Facet(new R3Vector(1, 0, 1), new R3Vector(1, 1, 1), new R3Vector(1, 1, 0), new R3Vector(1, 0, 0));
    }

    void rotate(){
        facets[0].rotate();
        facets[1].rotate();
        facets[2].rotate();
        facets[3].rotate();
        facets[4].rotate();
        facets[5].rotate();
    }

    public void translate(double dx, double dy, double dz){
        facets[0].translate(dx, dy, dz);
        facets[1].translate(dx, dy, dz);
        facets[2].translate(dx, dy, dz);
        facets[3].translate(dx, dy, dz);
        facets[4].translate(dx, dy, dz);
        facets[5].translate(dx, dy, dz);
    }

    void mulNum(){
        facets[0].mulNum();
        facets[1].mulNum();
        facets[2].mulNum();
        facets[3].mulNum();
        facets[4].mulNum();
        facets[5].mulNum();
    }
    void draw(Graphics g){
        facets[1].draw(g);
        g.setColor(Color.RED);
        facets[2].draw(g);
        g.setColor(Color.GREEN);
        facets[3].draw(g);
        g.setColor(Color.ORANGE);
        facets[4].draw(g);
        g.setColor(Color.MAGENTA);
        facets[5].draw(g);
        g.setColor(Color.BLUE);
        facets[0].draw(g);
    }
}