/*
 * 
 * 
 */
package siralamaalgoritmalar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Malik
 */
public class grafModeli extends JPanel{
    algoModeli[] graflar ;
    int enBuyukKarmasiklik;
    int modelSayisi;
    
    public grafModeli(){
        super();
        setSize(850, 550);
        setLocation(0, 0);
        setBackground(new Color(255, 255, 255));
        graflar = new algoModeli[7];
        modelSayisi = 0 ;
    }
    
    public boolean doluMu(){
        return modelSayisi == graflar.length;
    }
    
    public void barEkle(algoModeli model){
        if(!doluMu()){
        if(enBuyukKarmasiklik<model.karmasiklik)
            enBuyukKarmasiklik = model.karmasiklik;
        
            graflar[modelSayisi] = model ;
            modelSayisi++;
        }
    }
    
    protected boolean algoModeliVarMi(String algoAdi){
        
        for(int i = 0 ; i < modelSayisi ; i++){
            if(graflar[i].algoAdi.equals(algoAdi))                               // Sıralama Algoritması Önceden Kullanılmış Olup Olmadığına Bakmak İçin.
                return true;
        }
        return false ;
    }
     
    public void istatistikleriSil(){
        graflar = new algoModeli[7];
        modelSayisi = 0 ;                                                         // Diziyi Ve Grafı Sil.
        enBuyukKarmasiklik = -1 ;
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        
        super.paintComponent(g);
       Graphics2D g2d = (Graphics2D) g ;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setFont(new Font("Purisa", Font.PLAIN, 13));
                                                                                    // Tüm Grafiği Çizmek.
        borderCiz(g2d);
        istatistikleriCiz(g2d);
        
    }
    
    public void borderCiz(Graphics2D g){
        g.setColor(Color.black);                                                    // Çerçeve Çizmek.
        g.drawRoundRect(10, 20, 830, 300, 10, 10);
    }
    
    public void olcekleriCiz(Graphics2D g){
        
        g.setColor(Color.gray);
        for (int i = 10; i < 840; i+=20) {
        g.drawLine(i, 50, i+10, 50);
        g.drawLine(i, 118, i+10, 118);
        g.drawLine(i, 185, i+10, 185);                                              // Ölçekleri Çizmek.
        g.drawLine(i, 253, i+10, 253);
        }
        
        g.drawString(Integer.toString(enBuyukKarmasiklik), 15, 45);
        g.drawString(Integer.toString((int) (enBuyukKarmasiklik*( (double ) 3/4 ))), 15, 113);
        g.drawString(Integer.toString((int) (enBuyukKarmasiklik*( (double ) 1/2 ))), 15, 180);
        g.drawString(Integer.toString((int) (enBuyukKarmasiklik*( (double ) 1/4 ))), 15, 248);
        
    }
    
    public void istatistikleriCiz(Graphics2D g){
        if(modelSayisi<=0 || modelSayisi>7){
            return ;
        }
        
        Color[] renkler = {new Color(11, 89, 191), new Color(255, 173, 0), new Color(3, 138, 53), new Color(209, 3, 3),
                           new Color(77, 18, 166), new Color(28, 171, 171), new Color(198, 34, 100)};                     // Graph Bar Renkleri.
        
        olcekleriCiz(g);
        
        double yukseklikOrani = (double) 270/enBuyukKarmasiklik;                // Graph Bar Uzunlukları Ayarlamak İçin.
        int baslangicX = 390 - 60*(modelSayisi-1);
        
        for(int i = 0 ; i< modelSayisi ; i++){
            g.setColor(renkler[i]);
            g.fillRect(baslangicX+120*i, 320- (int)(graflar[i].karmasiklik*yukseklikOrani), 70, (int)(graflar[i].karmasiklik*yukseklikOrani));
            g.drawString(graflar[i].algoAdi, baslangicX+120*i + ( 80 - 7*graflar[i].algoAdi.length() )/2 , 340);
        }
            g.setColor(Color.black);
        
    }
    
    
}

class algoModeli{
    int karmasiklik ;
    String algoAdi  ;                   //Bir Graph Bar Yapısı
    boolean cizildiMi ;
    

    public algoModeli(int karmasiklik, String algoAdi) {
        this.karmasiklik = karmasiklik;
        this.algoAdi = algoAdi;
        cizildiMi = false ;
    }
    
}
