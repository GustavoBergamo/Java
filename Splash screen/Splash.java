package Views;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class Splash {
    private final int largura = 500;
    private final int altura = 192;
    private final int tempo = 3000;
    private final String caminho = "/Images/splash.jpg";
 
    public Splash() {
        JWindow janelaSplash = new JWindow();
        janelaSplash.getContentPane().add(
            new JLabel(
            "",
            new ImageIcon(getClass().getResource(caminho)),
            SwingConstants.CENTER
            )
        );
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        
        janelaSplash.setBounds(
                (dimension.width - largura) / 2,
                (dimension.height - altura) / 2,
                largura,
                altura);
        
        janelaSplash.setVisible(true);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        janelaSplash .dispose();
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
