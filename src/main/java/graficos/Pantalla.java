/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author Pc-pro
 */
public final class Pantalla {
    private final int ancho;
    private final int alto;
    
    public final int[] pixeles;
    
    public Pantalla(final int ancho, final int alto) {
        this.ancho = ancho;
        this.alto = alto;
        
        pixeles = new int[ancho * alto];
    }
    
    public void limpiar() {
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = 0;
        }
    }
    
    public void mostrar(final int compensacionX, final int compensacionY) {
        for (int y = 0; y < alto; y++) {
            int posicionY = y + compensacionY;
            if (posicionY < 0 || posicionY >= alto) {
                continue;
            }
            
            for (int x = 0; x < ancho; x++) {
                int posicionX = x + compensacionX;
                if (posicionX <0 || posicionX >= ancho) {
                    continue;
                }
                
                //codigo para redibujar
          
            }
        }
    }
}
