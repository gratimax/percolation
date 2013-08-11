package net.flayo.percolation.alg;

import net.flayo.percolation.grid.Lattice;
import net.flayo.percolation.grid.Point;
import net.flayo.percolation.grid.Site;

import java.util.Random;

/*
    A special kind of Lattice that is able to add on sites.
 */
public class Generator extends Lattice {

    public Generator(Point size) {
        super(size);
    }

    // Add an on site, at random, on a point.
    public Point gen() {
        Random rand = new Random();
        Point point;

        do {
            int x = rand.nextInt(size.x);
            int y = rand.nextInt(size.y);
            point = new Point(x, y);
        } while (on(point) || perc(point));

        set(point, Site.ON);
        return point;
    }

}
