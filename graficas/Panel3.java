
package graficas;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;


public class Panel3 extends JPanel {
    
    public Panel3()
    {
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("E-Mail");
        modelo.addColumn("Teléfono");
        
        ArrayList<Persona> arreglo=new ArrayList<Persona>();
        //emulamos datos desde un arrraylist
        //imaginando que vienen de una BD
        for(int i=0;i<=10;i++)
        {
            arreglo.add(new Persona("Nombre_"+i,"E-Mail_"+i,"Teléfono_"+i,i));
        }
        
        for(Persona p : arreglo)
        {
            Object[] fila=new Object[4];
            fila[0]=p.getId();
            fila[1]=p.getNombre();
            fila[2]=p.getCorreo();
            fila[3]=p.getTelefono();
            modelo.addRow(fila);
        }
        
        JTable tabla=new JTable(modelo);
        
        tabla.setPreferredScrollableViewportSize(new Dimension(900,100));
        //con ésto sólo se podrá seleccionar una fila
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //acá utilizamos un listener y un evento para obtener la fila seleccionada
        tabla.getSelectionModel().addListSelectionListener
        (
            new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //acá hacemos la magia
                int filas = tabla.getSelectedRowCount();
                if(filas==1)
                {
                    int row=tabla.getSelectedRow();
                    //JOptionPane.showMessageDialog(null, "la fila seleccionada es "+row);
                    Object nombre=tabla.getValueAt(row, 1);
                    JOptionPane.showMessageDialog(null, "El nombre es :"+nombre.toString());
                }
            }
        }
        );
        
        JScrollPane scroll=new JScrollPane(tabla);
        
        add(scroll);
    }
    
}
