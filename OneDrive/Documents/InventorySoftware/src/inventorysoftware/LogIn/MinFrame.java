/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorysoftware.LogIn;

/**
 *
 * @author RoXen
 */
public class MinFrame {
 
    public static void main(String[] args) {
        SpalshScreen screen = new SpalshScreen();
        ProductScreen produk = new ProductScreen();
        screen.setVisible(true);
        try {
            for (int i = 0; i <=100; i++) {
                Thread.sleep(100);
                screen.loadingnumber.setText(Integer.toString(i)+"%");
                screen.loadingprogress.setValue(i);
                if (i == 100) {
                    
                    screen.setVisible(false);
                    produk.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
}
