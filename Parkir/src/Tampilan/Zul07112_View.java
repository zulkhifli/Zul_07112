package Tampilan;

import Entity.*;
import Controller.Zul07112_Controller;
import Tampilan.Zul07112_TampilanControl;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zul07112_View {
    JFrame Tampilanview = new JFrame();
    JButton back,tampil;
    JLabel view;
    JTextArea area = new JTextArea();
    int cek = Zul07112_TampilanControl.control.View();
    public Zul07112_View(){
        Tampilanview.setSize(720, 600);
        Tampilanview.setLayout(null);
        Tampilanview.getContentPane().setBackground(Color.RED);
        view = new JLabel("VIEW");
        view.setBounds(50, 10, 600, 50);
        view.setFont(new Font("Times New Roman",Font.BOLD,40));
        Tampilanview.add(view);
        
        area.setBounds(50, 60, 400, 300);
        area.setFont(new Font("Times New Roman",Font.BOLD,40));
        Tampilanview.add(area);
        tampil = new JButton("TAMPILKAN");
        tampil.setBounds(50, 450, 100, 30);
        tampil.setBackground(Color.black);
        Tampilanview.add(tampil);
        
        back = new JButton("KEMBALI");
        back.setBounds(50, 550, 100, 30);
        back.setBackground(Color.black);
        Tampilanview.add(back);
        
        Tampilanview.setVisible(true);
        Tampilanview.setLocationRelativeTo(null);
        Tampilanview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                area.setText(datapelanggan());
            }
        });
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Tampilanview.dispose();
                Zul07112_GUI men = new Zul07112_GUI();
            }
        });
    }
    String datapelanggan(){
        String text = "Nama : "+
        }
    }
}