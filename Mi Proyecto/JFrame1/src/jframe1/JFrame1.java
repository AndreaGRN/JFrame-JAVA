package jframe1;

public class JFrame1 {

    public static void main(String[] args) {
    
        FrmVenta miventa = new FrmVenta();
        
        miventa.setTitle("Sistema de Ventas");
        miventa.setVisible(true);
        miventa.setSize(550, 500);
        
        FrmVenta.txtPrecio.requestFocus();
    }
    
}
