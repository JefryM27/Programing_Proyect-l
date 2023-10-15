
package Controller;


import Model.SamplingSite;
import Model.SamplingSiteDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author allys
 */
public class CtrlSampling {
    
    SamplingSiteDAO dao = new SamplingSiteDAO();
    int id;

    public void loadDataSamplingSites(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> order = new TableRowSorter<TableModel>(model);
        table.setRowSorter(order);
        model.setRowCount(0);
        List<SamplingSite> site = dao.readSamplingSites();
        for (SamplingSite sampling : site) {
            Object[] row = {sampling.getId(), sampling.getSamplingName(), sampling.getProvince_id(), sampling.getCanton_id(),
            sampling.getDistrict_id(), sampling.getEntity_id()};
            model.addRow(row);
        }
    }
    
    public void deleteSamplingSite(){
        this.dao.delete(this.id);
    }
}
