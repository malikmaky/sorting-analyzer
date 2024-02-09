package siralamaalgoritmalar;

import java.awt.Color;
import javax.swing.JFrame;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Malik
 */
public class siralamaGUI extends javax.swing.JFrame {
    int dizi[] ;
    grafModeli grafModel ;
    ResourceBundle langBundle ;
    
    public siralamaGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        langBundle = ResourceBundle.getBundle("appLanguageBundle", new Locale("en")); // Uses the default locale
        initializeLanguage();
        dizi = new int[0];
        grafModel = new grafModeli();
        grafikPanel.add(grafModel);
        grafModel.setVisible(true);
    }

    private void initializeLanguage(){
        headerTextlabel.setText(langBundle.getString("header1"));
        headerTextLabel2.setText(langBundle.getString("header2"));
        uniTextLabel2.setText(langBundle.getString("uniLabel"));
        closeLabel.setToolTipText(langBundle.getString("closeToolTip"));
        minimizeLabel.setToolTipText(langBundle.getString("minimizeToolTip"));
        
        olusturButton.setText(langBundle.getString("createButton"));
        clearButton.setText(langBundle.getString("clearButton"));
        gunceleButton.setText(langBundle.getString("updateButton"));
        siralaButton.setText(langBundle.getString("sortButton"));
        cizdirButton.setText(langBundle.getString("drawButton"));
        
        diziBoyutGirisLabel.setText(langBundle.getString("arraySizeLabel"));
        diziBoyutGirisLabel1.setText(langBundle.getString("arrayArrangementLabel"));
        diziElemanlariLabel.setText(langBundle.getString("arrayLabel"));
        siralamaAlgoritmasiLabel.setText(langBundle.getString("sortAlgo"));
        
        diziOlusturmaComboBox.removeAllItems();
        diziOlusturmaComboBox.addItem(langBundle.getString("arrangementField1"));
        diziOlusturmaComboBox.addItem(langBundle.getString("arrangementField2"));
        diziOlusturmaComboBox.addItem(langBundle.getString("arrangementField3"));
        
        siralamaAlgoComboBox.removeAllItems();
        siralamaAlgoComboBox.addItem(langBundle.getString("sortAlgoField1"));
        siralamaAlgoComboBox.addItem(langBundle.getString("sortAlgoField2"));
        siralamaAlgoComboBox.addItem(langBundle.getString("sortAlgoField3"));
        siralamaAlgoComboBox.addItem(langBundle.getString("sortAlgoField4"));
        siralamaAlgoComboBox.addItem(langBundle.getString("sortAlgoField5"));
        siralamaAlgoComboBox.addItem(langBundle.getString("sortAlgoField6"));
        siralamaAlgoComboBox.addItem(langBundle.getString("sortAlgoField7"));
        
        dilLabel.setText(langBundle.getString("language"));
        
        dilComboBox.removeAllItems();
        dilComboBox.addItem(langBundle.getString("language1"));
        dilComboBox.addItem(langBundle.getString("language2"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        minimizeLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        uniTextLabel = new javax.swing.JLabel();
        uniTextLabel2 = new javax.swing.JLabel();
        headerTextlabel = new javax.swing.JLabel();
        headerTextLabel2 = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        siralamaAlgoritmasiLabel = new javax.swing.JLabel();
        diziBoyutTextField = new javax.swing.JTextField();
        diziBoyutuLabel = new javax.swing.JLabel();
        diziBoyutGirisLabel = new javax.swing.JLabel();
        diziElemanlariLabel = new javax.swing.JLabel();
        gunceleButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        diziOlusturmaComboBox = new javax.swing.JComboBox<>();
        siralaButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        diziElemanlariTextArea = new javax.swing.JTextArea();
        diziBoyutGirisLabel1 = new javax.swing.JLabel();
        olusturButton = new javax.swing.JButton();
        cizdirButton = new javax.swing.JButton();
        siralamaAlgoComboBox = new javax.swing.JComboBox<>();
        grafikPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        dilComboBox = new javax.swing.JComboBox<>();
        dilLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeLabel.setBackground(new java.awt.Color(187, 187, 187));
        minimizeLabel.setFont(new java.awt.Font("Roboto Slab Medium", 0, 55)); // NOI18N
        minimizeLabel.setForeground(new java.awt.Color(255, 255, 255));
        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setText("-");
        minimizeLabel.setToolTipText("Sekmeyi Sakla.");
        minimizeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        minimizeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        mainPanel.add(minimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 30));

        closeLabel.setBackground(new java.awt.Color(187, 187, 187));
        closeLabel.setFont(new java.awt.Font("Roboto Slab Medium", 0, 28)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setToolTipText("Sekmeyi Kapat.");
        closeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true));
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        mainPanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 0, 30, 30));

        headerPanel.setBackground(new java.awt.Color(125, 14, 62));

        uniTextLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        uniTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        uniTextLabel.setText("FIRAT");

        uniTextLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        uniTextLabel2.setForeground(new java.awt.Color(255, 255, 255));
        uniTextLabel2.setText("ÜNİVERSİTESİ");

        headerTextlabel.setFont(new java.awt.Font("Raleway SemiBold", 0, 24)); // NOI18N
        headerTextlabel.setForeground(new java.awt.Color(255, 255, 255));
        headerTextlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerTextlabel.setText("SIRALAMA ALGORİTMALARININ");

        headerTextLabel2.setFont(new java.awt.Font("Raleway SemiBold", 0, 24)); // NOI18N
        headerTextLabel2.setForeground(new java.awt.Color(255, 255, 255));
        headerTextLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerTextLabel2.setText("PERFORMANSLARININ KARŞILAŞTIRICISI");

        headerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siralamaalgoritmalar/headerImage.jpg"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(uniTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headerTextLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(uniTextLabel)
                        .addGap(63, 63, 63)
                        .addComponent(headerTextlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
            .addComponent(headerLabel)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(uniTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(headerTextlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uniTextLabel2)
                    .addComponent(headerTextLabel2)))
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        siralamaAlgoritmasiLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        siralamaAlgoritmasiLabel.setForeground(new java.awt.Color(0, 0, 0));
        siralamaAlgoritmasiLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        siralamaAlgoritmasiLabel.setText("Sıralama Algoritması :");
        mainPanel.add(siralamaAlgoritmasiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 280, 170, -1));

        diziBoyutTextField.setBackground(java.awt.SystemColor.control);
        diziBoyutTextField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        diziBoyutTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mainPanel.add(diziBoyutTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, 25));

        diziBoyutuLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        diziBoyutuLabel.setForeground(new java.awt.Color(0, 0, 0));
        diziBoyutuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diziBoyutuLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainPanel.add(diziBoyutuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 410, 25));

        diziBoyutGirisLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diziBoyutGirisLabel.setForeground(new java.awt.Color(0, 0, 0));
        diziBoyutGirisLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        diziBoyutGirisLabel.setText("Dizi Boyutu :");
        mainPanel.add(diziBoyutGirisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        diziElemanlariLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diziElemanlariLabel.setForeground(new java.awt.Color(0, 0, 0));
        diziElemanlariLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        diziElemanlariLabel.setText("Dizi : ");
        mainPanel.add(diziElemanlariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, -1));

        gunceleButton.setBackground(new java.awt.Color(125, 14, 62));
        gunceleButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        gunceleButton.setForeground(new java.awt.Color(255, 255, 255));
        gunceleButton.setText("Güncelle");
        gunceleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gunceleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunceleButtonActionPerformed(evt);
            }
        });
        mainPanel.add(gunceleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 120, 25));

        clearButton.setBackground(new java.awt.Color(125, 14, 62));
        clearButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        mainPanel.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 120, 25));

        diziOlusturmaComboBox.setBackground(java.awt.SystemColor.control);
        diziOlusturmaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rastgele - Random", "Sıralı (Küçükten Büyüğe) - Sorted (Ascending)", "Sıralı (Büyükten Küçüğe) - Sorted (Descending)" }));
        diziOlusturmaComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainPanel.add(diziOlusturmaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        siralaButton.setBackground(new java.awt.Color(125, 14, 62));
        siralaButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        siralaButton.setForeground(new java.awt.Color(255, 255, 255));
        siralaButton.setText("Sırala");
        siralaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siralaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siralaButtonActionPerformed(evt);
            }
        });
        mainPanel.add(siralaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 120, 25));

        jScrollPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));

        diziElemanlariTextArea.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        diziElemanlariTextArea.setColumns(20);
        diziElemanlariTextArea.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        diziElemanlariTextArea.setRows(1);
        diziElemanlariTextArea.setWrapStyleWord(true);
        diziElemanlariTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        diziElemanlariTextArea.setMargin(new java.awt.Insets(2, 10, 2, 10));
        diziElemanlariTextArea.setName("Dizi"); // NOI18N
        jScrollPane1.setViewportView(diziElemanlariTextArea);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 410, 40));

        diziBoyutGirisLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diziBoyutGirisLabel1.setForeground(new java.awt.Color(0, 0, 0));
        diziBoyutGirisLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        diziBoyutGirisLabel1.setText("Dizi Dizilişi :");
        mainPanel.add(diziBoyutGirisLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        olusturButton.setBackground(new java.awt.Color(125, 14, 62));
        olusturButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        olusturButton.setForeground(new java.awt.Color(255, 255, 255));
        olusturButton.setText("Oluştur");
        olusturButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olusturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButtonActionPerformed(evt);
            }
        });
        mainPanel.add(olusturButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 120, 25));

        cizdirButton.setBackground(new java.awt.Color(125, 14, 62));
        cizdirButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cizdirButton.setForeground(new java.awt.Color(255, 255, 255));
        cizdirButton.setText("Çizdir");
        cizdirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cizdirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cizdirButtonActionPerformed(evt);
            }
        });
        mainPanel.add(cizdirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 120, 25));

        siralamaAlgoComboBox.setBackground(java.awt.SystemColor.control);
        siralamaAlgoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort - Seçmeli Sıralama", "Insertion Sort - Eklemeli Sıralama", "Bubble Sort - Kabarcık Sıralama", "Heap Sort - Yığın Sıralama", "Merge Sort - Birleştirmeli Sıralama", "Quick Sort - Hızlı Sıralama", "Counting Sort - Saymalı Sıralama" }));
        mainPanel.add(siralamaAlgoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 25));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 400));

        grafikPanel.setBackground(new java.awt.Color(255, 255, 255));
        grafikPanel.setPreferredSize(new java.awt.Dimension(0, 350));

        javax.swing.GroupLayout grafikPanelLayout = new javax.swing.GroupLayout(grafikPanel);
        grafikPanel.setLayout(grafikPanelLayout);
        grafikPanelLayout.setHorizontalGroup(
            grafikPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        grafikPanelLayout.setVerticalGroup(
            grafikPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(grafikPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 850, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dilComboBox.setBackground(java.awt.SystemColor.control);
        dilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Türkçe", "İngilizce" }));
        dilComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(dilComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 5, -1, 20));

        dilLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dilLabel.setForeground(new java.awt.Color(0, 0, 0));
        dilLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dilLabel.setText("Dil :");
        jPanel1.add(dilLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 850, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gunceleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunceleButtonActionPerformed
        
        try{
            
          dizi = diziyeCevir(diziElemanlariTextArea.getText());
          diziElemanlariTextArea.setText(diziYazdir(dizi));
          diziBoyutuLabel.setForeground(Color.black);
          diziBoyutuLabel.setText(langBundle.getString("arraySizeInfoLabel")+dizi.length);       //The user can also input/create an array manually.
          diziBoyutTextField.setText("");
          grafModel.istatistikleriSil();
          
        }catch(Exception e){
            diziBoyutuLabel.setForeground(Color.red);
            diziBoyutuLabel.setText(langBundle.getString("arraySizeErrorInfoLabel"));
        }
    }//GEN-LAST:event_gunceleButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        dizi = new int[0];
        diziBoyutTextField.setText("");
        diziElemanlariTextArea.setText("");
        diziBoyutuLabel.setForeground(Color.black);                             // Clear Button : Clears the graph and the array.
        diziBoyutuLabel.setText(langBundle.getString("arraySizeInfoLabel")+dizi.length);
        diziElemanlariTextArea.setText(diziYazdir(dizi));
        
        grafModel.istatistikleriSil();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void siralaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siralaButtonActionPerformed
        
        if(dizi.length>0){
            int[] x = dizi.clone();
            int[][] sonuc ;
            int sayac ;
            int[] siralanmisDizi ;
                                                                     //Executes the sorting algorithm based on the SelectedIndex of the ComboBox and records its complexity.
            switch(siralamaAlgoComboBox.getSelectedIndex()){
                case 0 :
                        if(!grafModel.algoModeliVarMi("Selection")){
                        sonuc = selectionSort(x);
                        sayac = sonuc[0][0];
                        siralanmisDizi = sonuc[1];
                        
                        grafModel.barEkle(new algoModeli(sayac, "Selection"));
                        }
                        break ;
                        
                case 1 :
                        if(!grafModel.algoModeliVarMi("Insertion")){
                            
                        sonuc = insertionSort(x);
                        sayac = sonuc[0][0];
                        siralanmisDizi = sonuc[1];
                        
                        grafModel.barEkle(new algoModeli(sayac, "Insertion"));
                        }
                        break ;
                        
                case 2 :
                        if(!grafModel.algoModeliVarMi("Bubble")){
                        sonuc = bubbleSort(x);
                        sayac = sonuc[0][0];
                        siralanmisDizi = sonuc[1];
                        
                        grafModel.barEkle(new algoModeli(sayac, "Bubble"));
                        }
                        break ;
                        
                case 3 :
                        if(!grafModel.algoModeliVarMi("Heap")){
                        sonuc = heapSort(x);
                        sayac = sonuc[0][0];
                        siralanmisDizi = sonuc[1];
                        
                        grafModel.barEkle(new algoModeli(sayac, "Heap"));
                        }
                        break ;
                        
                case 4 :
                        if(!grafModel.algoModeliVarMi("Merge")){
                        sonuc = mergeSort(x,0 , x.length-1, 0);
                        sayac = sonuc[0][0];
                        siralanmisDizi = sonuc[1];
                        
                        grafModel.barEkle(new algoModeli(sayac, "Merge"));
                        }
                        break ;
                        
                case 5 :
                        if(!grafModel.algoModeliVarMi("Quick")){
                        sonuc = quickSort(x,0 , x.length-1, 0);
                        sayac = sonuc[0][0];
                        siralanmisDizi = sonuc[1];
                        
                        grafModel.barEkle(new algoModeli(sayac, "Quick"));
                        }
                        break ;  
                        
                case 6 :
                        if(!grafModel.algoModeliVarMi("Counting")){
                        sonuc = countingSort(x);
                        sayac = sonuc[0][0];
                        siralanmisDizi = sonuc[1];
                        
                        grafModel.barEkle(new algoModeli(sayac, "Counting"));
                        }
                        break ;
            }
            
       }else{
            diziBoyutuLabel.setForeground(Color.red);
            diziBoyutuLabel.setText(langBundle.getString("arrayNotAvilable"));
        }
       
    }//GEN-LAST:event_siralaButtonActionPerformed

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        
        try{
        switch(diziOlusturmaComboBox.getSelectedIndex()){
            case 0 :
                    dizi = rastegeleDiziOlustur(Integer.parseInt(diziBoyutTextField.getText().strip()));
                    break;
            
            case 1 :
                    dizi = siraliDiziOlusturKucuktenBuyuge(Integer.parseInt(diziBoyutTextField.getText().strip()));            // 3 types of arrays can be created.
                    break;                                                                                               // Random - Sorted in Ascending Order - Sorted in Descending Order
                    
            case 2 :
                    dizi = siraliDiziOlusturBuyuktenKucuge(Integer.parseInt(diziBoyutTextField.getText()));
                    break;
        }
        diziBoyutuLabel.setForeground(Color.black);
        diziBoyutuLabel.setText(langBundle.getString("arraySizeInfoLabel")+dizi.length);
        diziElemanlariTextArea.setText(diziYazdir(dizi));                                                   
        grafModel.istatistikleriSil();                                                                                     //When creating a new array, old records are all deleted.
        
         }catch(Exception e){
        diziBoyutuLabel.setForeground(Color.red);
        diziBoyutuLabel.setText(langBundle.getString("arraySizeErrorInfoLabel"));
         }
        
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0); // Exits/shuts down the program
    }//GEN-LAST:event_closeLabelMouseClicked

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setExtendedState(JFrame.ICONIFIED); //Minimizes the UI
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void cizdirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cizdirButtonActionPerformed
       grafModel.repaint(); // Draws bar graphs.
    }//GEN-LAST:event_cizdirButtonActionPerformed

    private void dilComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilComboBoxActionPerformed
        
        if( dilComboBox.getSelectedItem() != null && dilComboBox.getSelectedItem().equals("Turkish")){
            langBundle = ResourceBundle.getBundle("appLanguageBundle", new Locale("tr"));
            initializeLanguage();
            diziBoyutuLabel.setText("");

        }
        else if( dilComboBox.getSelectedItem() != null && dilComboBox.getSelectedItem().equals("İngilizce")){
            langBundle = ResourceBundle.getBundle("appLanguageBundle", new Locale("en"));
            initializeLanguage();
            diziBoyutuLabel.setText("");
        }
    }//GEN-LAST:event_dilComboBoxActionPerformed
    
    /* ------------------------------------------------------------ Array Generation Algorithms ----------------------------------------------------------------------------- */
    
    int[] rastegeleDiziOlustur(int boyut){
        
        if (boyut > 0){
            int yeni[] = new int[boyut];
            for (int i = 0; i < boyut; i++) {
                yeni[i] = (int) (Math.random()*1002) ;                              // Generates a random array within the range [0, 1000].
            }
            return yeni ;
        }
        return new int[0] ;
        
    }

    int[] siraliDiziOlusturKucuktenBuyuge(int boyut){
        
        if(boyut>0){
            int yeni[] = rastegeleDiziOlustur(boyut);
               yeni = quickSort(yeni, 0, yeni.length-1, 0)[1];                      // Creates an array sorted ascendingly. 
            return yeni ;
        }
        return new int[0];
    }
    
    int[] siraliDiziOlusturBuyuktenKucuge(int boyut){
        
        if(boyut>0){
            int temp[] = rastegeleDiziOlustur(boyut);
            temp = quickSort(temp, 0, temp.length-1, 0)[1];
            int[] yeni = new int[temp.length];                                       // Creates an array sorted descendingly.
            
               for(int i = 0 ; i<temp.length ; i++){
                   yeni[temp.length-1-i] = temp[i];
               }
            return yeni ;
        }
        return new int[0];
    }
    
    String diziYazdir(int[] x){
        String sonuc = "";
        for(int i = 0 ;  i<x.length ; i++){
        sonuc+=x[i]+", " ;                                                           // Convert the Array into a printable String.
    }
        if(sonuc.length()>=2){
        sonuc = sonuc.substring(0, sonuc.length()-2);
        }
        return sonuc ;
    }
    
    int[] diziyeCevir(String x){
        String[] sayilar = x.split(",");
        int[] sonuc = new int[sayilar.length]; 
                                                                                      //Converts a String into an Array.
        for(int i = 0 ; i<sayilar.length ; i++ ){
            if(Integer.parseInt(sayilar[i].strip())>=0 && 1000>=Integer.parseInt(sayilar[i].strip()))
            sonuc[i] = Integer.parseInt(sayilar[i].strip());
        }
        return sonuc ;
    }
    
    /* --------------------------------------------------------------- Sorting Algorithms ----------------------------------------------------------------------------- */
    
    int[][] selectionSort(int[] x){
        
        int i, j, minIndisi, sayac = 0 ; 
        
        for (i = 0 ; i < x.length-1 ; i++) {
            minIndisi= i ;
            for (j = i+1 ; j < x.length ; j++){
                sayac++;                    // Karşılaştırma Yapınca Sayaç Artıyor.
                if(x[j] < x[minIndisi]){    
                    minIndisi = j ;
                }
            }
            if(minIndisi != i){              // Min İndis Seçilen İndis İle Aynı İse Gereksiz Swap Yapılmaz.
                sayac++;                     // Yerdeğiştirme Olunca Sayaç Artıyor.
                int temp = x[minIndisi];    
                x[minIndisi] = x[i];
                x[i] = temp;
            }
        }
        
        int[][]sonuc = {{sayac}, x};
            
        return sonuc;
    }     
    
    int[][] insertionSort(int[] x){
       
        int i, j, temp, sayac = 0 ;
        
        for( j = 1 ; j<x.length ; j++){
            temp = x[j];
            i = j - 1 ;
                sayac++;                     // Karşılaştırma Yapınca Sayaç Artıyor.
            while(i>=0 && x[i] > temp){
                sayac++;                     // Yerdeğiştirme Olunca Sayaç Artıyor.
                x[i+1] = x[i];      
                i--;
            }
            x[i+1] = temp;
            sayac++ ;                       // Yerdeğiştirme Olunca Sayaç Artıyor.
        }
        
        int[][]sonuc = {{sayac}, x};
       
        return sonuc;
    }
    
    int[][] bubbleSort(int[] x){
        int sayac = 0 ;
        
        boolean degistiMi = true ;
        
        while(degistiMi){                   // Bir Gidişte Yerdeğiştirme Gerçekleşmezse Dizi Sıralı Demektir.
            degistiMi = false ;
            for( int i = 0 ; i<x.length-1 ; i++ ){
                sayac++ ;                   // Karşılaştırma Yapınca Sayaç Artıyor.
                if(x[i] > x[i+1]){
                    sayac++ ;               // Yerdeğiştirme Olunca Sayaç Artıyor.
                    degistiMi = true ;
                    int temp = x[i];
                    x[i] = x[i+1]; 
                    x[i+1] = temp ;
                }
            }
        }
        
        int[][]sonuc = {{sayac}, x};
        
        return sonuc;
    }
    
    int[][] heapSort(int[] x){
        int sayac = 0 ;
        
        Yigin y = new Yigin(x.length);
        for(int i = 0 ; i < x.length ; i++){    
           sayac+= y.ekle(new Eleman(x[i]));                // Ekleme Yaparken Heap Kaç Adımda Elemanı Yerleştirdi.
        }
        
        for (int i = x.length-1 ; i >= 0; i--) { // Max Heap Olduğu İçin
            int[] sonuc =  y.azamiSil();
            x[i] = sonuc[0];
            sayac+=sonuc[1];                                // Silme Yaparken Heap Kaç Adımda Elemanı Çıkarttı.
        }
        
        int[][]sonuc = {{sayac}, x};
        
        return sonuc ;
    }
    
    private int merge(int[] x, int solIndis, int ortaIndis, int sagIndis)   {
        int i, j, k, sayac = 0 ;
        
        int n1 = ortaIndis - solIndis + 1 ;
        int n2 = sagIndis - ortaIndis ;
        
        int[] sol = new int[n1+1]; // Sonsuz Eklemek İçin
        int[] sag = new int[n2+1]; // Sonsuz Eklemek İçin
        
        for( i = 0 ; i < n1 ; i++){
        sol[i] = x[solIndis+i];
        }
        for( i = 0 ; i < n2 ; i++){
        sag[i] = x[ortaIndis+i+1];
        }
        
        sol[n1] = Integer.MAX_VALUE;
        sag[n2] = Integer.MAX_VALUE;
        
        i = 0 ;
        j = 0 ;
        
        sayac++;                                    // Diziyi 2'ye Bölünce Sayaç Artıyor.
        for (k = solIndis ; k<=sagIndis ; k++){
            sayac++;                                // Karşılaştırma Yapınca Sayaç Artıyor.
            if(sol[i]<=sag[j]){
                x[k] = sol[i];
                i++;
            }else{
                x[k] = sag[j];
                j++;
            }
        }
        
        return sayac ;
    }
    
    int[][] mergeSort(int[] x, int bas, int son, int sayac){
        
        int pivot = 0 ;
        if(bas<son){
            pivot = (bas+son)/2 ;
            mergeSort(x, bas, pivot, sayac);
            mergeSort(x, pivot+1, son, sayac);
            sayac+= merge(x, bas, pivot, son);
        }
        
        int[][]sonuc = {{sayac}, x};
        
        return sonuc;
    }
    
    private int[] parcala(int[] x, int bas, int son){
        int sayac = 0 ;
        
        int pivot = x[son];
        int i = bas - 1 ;
        
        for(int j = bas ; j < son ; j++){
            sayac++;                           // Karşılaştırma Yapınca Sayaç Artıyor.
        if(x[j] <= pivot){
            sayac++;                           // Yerdeğiştirme Olunca Sayaç Artıyor.
            i++;
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp ; 
        }
    }
        int temp = x[i+1];
        x[i+1] = x[son]  ;
        x[son] = temp ;
        
        int[] sonuc = {i+1, sayac};
        
        return sonuc ;  
    }
    
    int[][] quickSort(int[] x, int bas, int son,int sayac){
        
        
        if(bas<son){
           int[] temp = parcala(x, bas, son);
           int pivot = temp[0];
           sayac+=temp[1];
           quickSort(x, bas, pivot-1, sayac);
           quickSort(x, pivot+1, son, sayac);
        }
        
        int[][]sonuc = {{sayac}, x};
        
        return sonuc; 
    }
    
    int[][] countingSort(int[] x){

        int sayac = 0 ;
        
        int sonuc[] = new int[x.length+1] ;
        
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
                if(x[i]>max)
                    max = x[i];
        }
        
        int[] yardimci = new int[max+1];
        
        for(int i = 0 ; i < x.length ; i++){
            yardimci[x[i]]++;
            sayac++;
        }
        
        for (int i = 1; i < yardimci.length ; i++) {
            yardimci[i] += yardimci[i - 1];
            sayac++;
        }
        
        for (int i = x.length - 1; i >= 0; i--) {
            sonuc[yardimci[x[i]] - 1] = x[i];
            yardimci[x[i]]--;
        }
        
        for(int i = 0; i < x.length; i++) {
         x[i] = sonuc[i];
        }
        
        int[][] finalSonuc = {{sayac}, x};
        return finalSonuc;
    }
    
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new siralamaGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cizdirButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JComboBox<String> dilComboBox;
    private javax.swing.JLabel dilLabel;
    private javax.swing.JLabel diziBoyutGirisLabel;
    private javax.swing.JLabel diziBoyutGirisLabel1;
    private javax.swing.JTextField diziBoyutTextField;
    private javax.swing.JLabel diziBoyutuLabel;
    private javax.swing.JLabel diziElemanlariLabel;
    private javax.swing.JTextArea diziElemanlariTextArea;
    private javax.swing.JComboBox<String> diziOlusturmaComboBox;
    private javax.swing.JPanel grafikPanel;
    private javax.swing.JButton gunceleButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerTextLabel2;
    private javax.swing.JLabel headerTextlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton siralaButton;
    private javax.swing.JComboBox<String> siralamaAlgoComboBox;
    private javax.swing.JLabel siralamaAlgoritmasiLabel;
    private javax.swing.JLabel uniTextLabel;
    private javax.swing.JLabel uniTextLabel2;
    // End of variables declaration//GEN-END:variables
}

class Eleman {
    int icerik;

    Eleman(int icerik) {
        this.icerik = icerik;
    }
}

class Yigin {           // Heap Data Structure, to implement the Heap Sort algorithm

    Eleman[] dizi;
    int elemanSayisi;

    public Yigin(int boyut) {
        dizi = new Eleman[boyut];
        this.elemanSayisi = 0;
    }

    boolean bosMu() {
        return elemanSayisi == 0;
    }
    
    int yukariCik(int no) {
        int sayac  = 0 ;
        
        int ata = (no - 1) / 2;
        while (ata >= 0 && dizi[ata].icerik < dizi[no].icerik) {
            sayac++ ;                                               // The counter increases when you go up.
            Eleman tmp = dizi[ata];
            dizi[ata] = dizi[no];
            dizi[no] = tmp;
            no = ata;
            ata = (no - 1) / 2;
        }
        
        return sayac;
    }

    int ekle(Eleman yeni) {
        int sayac = 0 ;
                
        elemanSayisi++;
        dizi[elemanSayisi - 1] = yeni;
        sayac = yukariCik(elemanSayisi - 1);
        
        return sayac ;
    }

    int asagiIn(int no) {
        
        int sayac = 0 ;
        
        int altSol = 2 * no + 1;
        int altSag = 2 * no + 2;
        while ((altSol < elemanSayisi && dizi[no].icerik < dizi[altSol].icerik) || (altSag < elemanSayisi && dizi[no].icerik < dizi[altSag].icerik)) {
            sayac++;                                        // The counter increases when you go down.
            if (altSag >= elemanSayisi || dizi[altSol].icerik > dizi[altSag].icerik) {
                Eleman tmp = dizi[no];
                dizi[no] = dizi[altSol];
                dizi[altSol] = tmp;
                no = altSol;
            } else {
                Eleman tmp = dizi[no];
                dizi[no] = dizi[altSag];
                dizi[altSag] = tmp;
                no = altSag;
            }
            altSol = 2 * no + 1;
            altSag = 2 * no + 2;
        }
        return sayac ;
    }

    int[] azamiSil() {
        int sayac = 0 ;
        if (!bosMu()) {
            Eleman tmp = dizi[0];
            dizi[0] = dizi[elemanSayisi - 1];
            elemanSayisi--;
           sayac = asagiIn(0);
           
           int[] sonuc = {tmp.icerik, sayac};
            return sonuc;
        } else {
            return null;
        }
    }
}
    
