package Tampilan;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zul07112_GUI {
    JFrame Tampilanawal = new JFrame();
    JLabel top;
    JTextField textpilih;
    JLabel labeldaftar,labelview,labelupdate,labeldeletedata,labelpilih;
    JButton pilih;
    public Zul07112_GUI(){
        Tampilanawal.setSize(700, 630);
        Tampilanawal.setLayout(null);
        Tampilanawal.getContentPane().setBackground(Color.RED);
        top = new JLabel("Parkir Mobil MENTARI");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        Tampilanawal.add(top);
        labeldaftar = new JLabel("1. Daftar ");
        labeldaftar.setBounds(50, 210, 100, 30);
        Tampilanawal.add(labeldaftar);
        labelview = new JLabel("2. View ");
        labelview.setBounds(50, 240, 100, 30);
        Tampilanawal.add(labelview);
        labelupdate = new JLabel("3. Update ");
        labelupdate.setBounds(50, 270, 100, 30);
        Tampilanawal.add(labelupdate);
        labeldeletedata = new JLabel("4. Delete ");
        labeldeletedata.setBounds(50, 300, 100, 30);
        Tampilanawal.add(labeldeletedata);
        labelpilih = new JLabel("Input (1 - 4) :    ");
        labelpilih.setBounds(50, 330, 100, 30);
        Tampilanawal.add(labelpilih);
        pilih = new JButton("PILIH");
        pilih.setBounds(50, 360, 100, 40);
        pilih.setBackground(Color.GREEN);
        Tampilanawal.add(pilih);
        Tampilanawal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilanawal.setVisible(true);
        Tampilanawal.setLocationRelativeTo(null);
        pilih.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(){
                    
                }
            }
        }
        );
    }
}