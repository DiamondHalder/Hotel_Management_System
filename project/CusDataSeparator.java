

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;

public class CusDataSeparator
{
    JTable table;
    DefaultTableModel model;
    String[] cols ={"First name", "Last name", "Occupation", "Gender", "NID",
            "Days", "Room no", "Roob bill", "Paid amount", "Due amount", "Phone number", "Password" };

    // row value user theke nibo
    private String[] rows = new String[12];

    public void dataSeparator(int a)
    {
        table =new JTable();
        TableReader tt5=new TableReader();
        model = new DefaultTableModel();
        File f=new File("DATA/Data2.txt");
        if(f.length() !=0)
        {
            model =tt5.createModel("DATA/Data2.txt");
        }
        model.setColumnIdentifiers(cols);
        table.setModel(model);
        cusTable ct=new cusTable(table);
        try
        {
            ct.saveTable("DATA/member.txt",a-1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }


}
