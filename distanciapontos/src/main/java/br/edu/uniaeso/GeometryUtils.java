package br.edu.uniaeso;

public class GeometryUtils {
    public static double distanciaEntrePontos(Ponto2D p1, Ponto2D p2) {
        double distancia = 0, yPart = 0, xPart = 0;
        xPart = Math.pow((p2.getX() - p1.getX()), 2);
        yPart = Math.pow((p2.getY() - p1.getY()), 2);

        distancia = Math.sqrt(xPart + yPart);
        return distancia;
    }
}
