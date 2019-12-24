package penjualan;

import javax.swing.JTable;

public interface PenjualanDAO {
    public void read(JTable table);
    public void delete(int id);
}