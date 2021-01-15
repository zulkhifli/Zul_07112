package Tampilan;

import Entity.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
        
public class Zul07112_Daftar {
    JFrame Tampilandaftar = new JFrame();
    JLabel daftar;
    JButton back,daftarbaru;
    JTextArea area = new JTextArea();
    JTextField textnama,textplat,textmasuk,textkeluar,texttarif,texttotal;
    JLabel labelnama,labelplat,labelmasuk,labelkeluar,labeltarif,labeltotal;
    public Zul07112_Daftar(){
        Tampilandaftar.setSize(720, 600);
        Tampilandaftar.setLayout(null);
        Tampilandaftar.getContentPane().setBackground(Color.RED);
        daftar = new JLabel("DAFTAR");
        daftar.setBounds(50, 10, 600, 50);
        daftar.setFont(new Font("Times New Roman",Font.BOLD,40));
        labelnama = new JLabel("Nama");
        labelnama.setBounds(50, 50, 100, 30);
        Tampilandaftar.add(labelnama);
        textnama = new JTextField();
        textnama.setBounds(50, 80, 200, 30);
        Tampilandaftar.add(textnama);
        labelplat =new JLabel("Plat Nomor");
        labelplat.setBounds(50, 110, 100, 30);
        Tampilandaftar.add(labelplat);
        textplat = new JTextField();
        textplat.setBounds(50, 140, 200, 30);
        Tampilandaftar.add(textplat);
        labelmasuk = new JLabel("Jam Masuk");
        labelmasuk.setBounds(50, 170, 100, 30);
        Tampilandaftar.add(labelmasuk);
        textmasuk = new JTextField();
        textmasuk.setBounds(50, 200, 200, 30);
        Tampilandaftar.add(textmasuk);
        labelkeluar = new JLabel("Jam Keluar");
        labelkeluar.setBounds(50, 230, 100, 30);
        Tampilandaftar.add(labelkeluar);
        textkeluar = new JTextField();
        textkeluar.setBounds(50, 260, 200, 30);
        Tampilandaftar.add(textkeluar);
        daftarbaru = new JButton("Daftar");
        daftarbaru.setBounds(50, 290, 100, 40);
        daftarbaru.setBackground(Color.GREEN);
        Tampilandaftar.add(daftarbaru);
        back = new JButton("Back");
        back.setBounds(50, 500, 100, 30);
        back.setBackground(Color.black);
        Tampilandaftar.add(back);
        Tampilandaftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilandaftar.setVisible(true);
        Tampilandaftar.setLocationRelativeTo(null);
        daftarbaru.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            try{
                String zul07112_nama = textnama.getText();
                String zul07112_plat = textplat.getText();
                int zul07112_masuk = Integer.parseInt(textmasuk.getText());
                int zul07112_keluar = Integer.parseInt(textkeluar.getText());
                int zul07112_total = zul07112_keluar - zul07112_masuk;
                int zul07112_tarif = zul07112_total * 5000;
                Parkir data = new Parkir(zul07112_nama,zul07112_plat);
                Zul07112_TampilanControl.control.Insert(new Zul07112_Pelanggan(zul07112_masuk,zul07112_keluar,zul07112_total,zul07112_tarif,data));
                JOptionPane.showMessageDialog(null, "Daftar Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Daftar Gagal", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Tampilandaftar.dispose();
                Zul07112_GUI men = new Zul07112_GUI();
            }
        });
    }
}
