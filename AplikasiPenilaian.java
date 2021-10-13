
/**
 * Class AplikasiPenilaian hanya memberikan contoh GUI sederhana
 * 
 * @author viska
 * @version 7 Des 2012
 */

import javax.swing.*;
import java.awt.*;

public class AplikasiPenilaian
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    
    JLabel lblnim=new JLabel("NIM ");
    JTextField txnim=new JTextField(20);
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);
    JButton tblcari=new JButton("Cari");
    JLabel lblkelas=new JLabel("Kelas ");
    JRadioButton kelasA=new JRadioButton("A");
    JRadioButton kelasB=new JRadioButton("B");
    JRadioButton kelasC=new JRadioButton("C");
    ButtonGroup grupkelas=new ButtonGroup();
    JLabel lblkelompok=new JLabel("Kelompok");
    String[] jeniskelompok={"1","2","3","4","5","6","7"};
    JComboBox cbkelompok=new JComboBox(jeniskelompok);

    /**
     * Constructor for objects of class AplikasiPenilaian
     */
    public AplikasiPenilaian()
    {
        // initialise instance variables
        makeFrame();
        frame.setVisible(true);
    }

    /**
     * Method untuk menampilkan dan menutup frame
     * 
     * @param  visible
     */
    public void setVisible(boolean visible)
    {
        // put your code here
        frame.setVisible(visible);
    }
    
    /**
     * Method untuk membuat frame
     */
    private void makeFrame()
    {
        frame = new JFrame("Lembar Penilaian");
        frame.setSize(300, 200);
        komponenVisual();
                
        //method pack pada frame berguna utk menampilkan frame dan menset ukuran sesuai preferredSize komponen
        //frame.pack();
    }
    
    /**
     * Method khusus untuk menambahkan komponen GUI
     * 
     * 
     */
    public void komponenVisual()
    {
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);               
        
        panel.add(lblnim);
        lblnim.setBounds(10,10,70,20);
        panel.add(txnim);
        txnim.setBounds(75,10,100,20);
        panel.add(tblcari);
        tblcari.setBounds(180,10,95,20);
        panel.add(lblnama);
        lblnama.setBounds(10,30,70,20);
        panel.add(txnama);
        txnama.setBounds(75,30,200,20);
        panel.add(lblkelas);
        lblkelas.setBounds(10,50,100,20);
        panel.add(kelasA);
        kelasA.setBounds(75,50,50,20);
        panel.add(kelasB);
        kelasB.setBounds(125,50,50,20);
        panel.add(kelasC);
        kelasC.setBounds(175,50,50,20);
        grupkelas.add(kelasA);
        grupkelas.add(kelasB);
        grupkelas.add(kelasC);
        panel.add(lblkelompok);
        lblkelompok.setBounds(10,70,100,20);
        panel.add(cbkelompok);
        cbkelompok.setBounds(75,70,100,20);
    }
}
