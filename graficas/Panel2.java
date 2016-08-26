
package graficas;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Panel2 extends JPanel {
    
    public Panel2()
    {
    
        String[] encabezados={"ID","Nombre","E-Mail","Teléfono"};
        
        Object[][] data = {
	    {1,"César Cancino Zapata", "yo@cesarcancino.com",
	     "+56971373516"},
	    {2,"Juan Pérez", "juanito@gmail.com",
	     "+56985143106"},
            {3,"Federico Yáñez", "fede@hotmail.com",
	     "+56976633552"},
            {4,"Armando Hernández", "armando123@yahoo.es",
	     "+56956542365"},
        };
        
        DefaultTableModel modelo =new DefaultTableModel(data,encabezados);
        JTable tabla =new JTable(modelo);
        tabla.setPreferredScrollableViewportSize(new Dimension(900,100));
        
         JScrollPane scroll=new JScrollPane(tabla);
        
        add(scroll);
    }
}
