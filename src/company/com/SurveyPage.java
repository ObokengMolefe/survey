package company.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class SurveyPage extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    String likeToEatOut = null;
    String likeToWatchMovies = null;
    String likeToWatchTv= null; 
    String likeToListenToTheRadio = null;
    public SurveyPage() {
        this.setResizable(false);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dcDate = new com.toedter.calendar.JDateChooser();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNAme = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        chckChickenStirFry = new javax.swing.JCheckBox();
        chckPizza = new javax.swing.JCheckBox();
        chckPapAndWors = new javax.swing.JCheckBox();
        chckPasta = new javax.swing.JCheckBox();
        chckOther = new javax.swing.JCheckBox();
        chckBeefStirFry = new javax.swing.JCheckBox();
        rdoWatchMovieStronlyAgree = new javax.swing.JRadioButton();
        rdoWatchTvStronlyAgree = new javax.swing.JRadioButton();
        rdoListenToRadioStronlyAgree = new javax.swing.JRadioButton();
        rdoWatchMovieAgree = new javax.swing.JRadioButton();
        rdoWatchTvAgree = new javax.swing.JRadioButton();
        rdoListenToRadioAgree = new javax.swing.JRadioButton();
        rdoEatOutNeutral = new javax.swing.JRadioButton();
        rdoWatchMovieNuetral = new javax.swing.JRadioButton();
        rdoWatchTvNeutral = new javax.swing.JRadioButton();
        rdoListentoRadioNuetral = new javax.swing.JRadioButton();
        rdoEatOutDisagree = new javax.swing.JRadioButton();
        rdoWatchTvDisagree = new javax.swing.JRadioButton();
        rdoWatchMovieDisagree = new javax.swing.JRadioButton();
        rdoListentoRadioDisagree = new javax.swing.JRadioButton();
        rdoEatOutStronglyDisagree = new javax.swing.JRadioButton();
        rdoWatchMovieStronlyDisagree = new javax.swing.JRadioButton();
        j = new javax.swing.JRadioButton();
        rdoListentoRadioStronglyDisagree = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rdoEatOutAgree = new javax.swing.JRadioButton();
        rdoEatOutStronglyAgree = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Survey");
        setBackground(new java.awt.Color(51, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("On a scale of 1 to 5 indicate whether you strongly agree to strongly disagree");

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 51, 51));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "    Strongly Agree  (1)", "                Agree (2) ", "                 Neutral  (3)", "          Disagree(4)", " Strongly Disagree (5)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Contact number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Age");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Surname");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Personal Details:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("First Names");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSurname)
                    .addComponent(txtNAme)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNumber)
                    .addComponent(dcDate, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNAme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("What is your favourite food? (You can choose more than 1 answer)");

        chckChickenStirFry.setBackground(new java.awt.Color(0, 153, 153));
        chckChickenStirFry.setText("Chicken stir fry");

        chckPizza.setBackground(new java.awt.Color(0, 153, 153));
        chckPizza.setText("Pizza");

        chckPapAndWors.setBackground(new java.awt.Color(0, 153, 153));
        chckPapAndWors.setText("Pap and Wors");

        chckPasta.setBackground(new java.awt.Color(0, 153, 153));
        chckPasta.setText("Pasta");

        chckOther.setBackground(new java.awt.Color(0, 153, 153));
        chckOther.setText("Other");

        chckBeefStirFry.setBackground(new java.awt.Color(0, 153, 153));
        chckBeefStirFry.setText("Beef stir fry");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chckPasta)
                            .addComponent(chckBeefStirFry)
                            .addComponent(chckOther)
                            .addComponent(chckPizza)
                            .addComponent(chckChickenStirFry)
                            .addComponent(chckPapAndWors))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addComponent(chckPizza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chckPasta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chckPapAndWors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chckChickenStirFry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chckBeefStirFry)
                .addGap(6, 6, 6)
                .addComponent(chckOther)
                .addContainerGap())
        );

        buttonGroup1.add(rdoWatchMovieStronlyAgree);

        buttonGroup1.add(rdoWatchTvStronlyAgree);

        buttonGroup1.add(rdoListenToRadioStronlyAgree);
        rdoListenToRadioStronlyAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoListenToRadioStronlyAgreeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoWatchMovieAgree);

        buttonGroup1.add(rdoWatchTvAgree);

        buttonGroup1.add(rdoListenToRadioAgree);

        buttonGroup1.add(rdoEatOutNeutral);

        buttonGroup1.add(rdoWatchMovieNuetral);

        buttonGroup1.add(rdoWatchTvNeutral);

        buttonGroup1.add(rdoListentoRadioNuetral);

        buttonGroup1.add(rdoEatOutDisagree);

        buttonGroup1.add(rdoWatchTvDisagree);

        buttonGroup1.add(rdoWatchMovieDisagree);

        buttonGroup1.add(rdoListentoRadioDisagree);
        rdoListentoRadioDisagree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoListentoRadioDisagreeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoEatOutStronglyDisagree);

        buttonGroup1.add(rdoWatchMovieStronlyDisagree);

        buttonGroup1.add(j);

        buttonGroup1.add(rdoListentoRadioStronglyDisagree);

        jLabel10.setText("I like to listen to radio");

        jLabel11.setText("I like to watch TV");

        jLabel12.setText("I like to watch Movies");

        jLabel13.setText("I like to eat out");

        buttonGroup1.add(rdoEatOutAgree);

        buttonGroup1.add(rdoEatOutStronglyAgree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(111, 111, 111)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoWatchTvStronlyAgree)
                                    .addComponent(rdoWatchMovieStronlyAgree)
                                    .addComponent(rdoListenToRadioStronlyAgree)
                                    .addComponent(rdoEatOutStronglyAgree))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoWatchTvAgree, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rdoWatchMovieAgree, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rdoListenToRadioAgree, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(141, 141, 141))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdoEatOutAgree)
                                        .addGap(141, 141, 141)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdoListentoRadioNuetral)
                                    .addComponent(rdoWatchTvNeutral)
                                    .addComponent(rdoWatchMovieNuetral)
                                    .addComponent(rdoEatOutNeutral))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoWatchMovieDisagree, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rdoWatchTvDisagree, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rdoListentoRadioDisagree, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(127, 127, 127)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoWatchMovieStronlyDisagree, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(j, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rdoListentoRadioStronglyDisagree, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdoEatOutDisagree)
                                        .addGap(127, 127, 127)
                                        .addComponent(rdoEatOutStronglyDisagree)))
                                .addGap(74, 74, 74)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoEatOutNeutral)
                            .addComponent(rdoEatOutDisagree)
                            .addComponent(rdoEatOutStronglyDisagree)
                            .addComponent(rdoEatOutAgree)
                            .addComponent(rdoEatOutStronglyAgree))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoWatchMovieStronlyAgree)
                            .addComponent(rdoWatchMovieAgree)
                            .addComponent(rdoWatchMovieNuetral)
                            .addComponent(rdoWatchTvDisagree)
                            .addComponent(rdoWatchMovieStronlyDisagree))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoWatchTvStronlyAgree)
                            .addComponent(rdoWatchTvAgree)
                            .addComponent(rdoWatchTvNeutral)
                            .addComponent(rdoWatchMovieDisagree)
                            .addComponent(j))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoListenToRadioStronlyAgree)
                            .addComponent(rdoListenToRadioAgree)
                            .addComponent(rdoListentoRadioNuetral)
                            .addComponent(rdoListentoRadioDisagree)
                            .addComponent(rdoListentoRadioStronglyDisagree)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 940, 670));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 200));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel1.setText("Take Our Survey");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel1)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 940, 50));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 60, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            String query = "INSERT INTO `user`(`surname`, `firstname`, `contact_number`, `date`, `age` , `pizza`, `pasta`, `papAndWors`, `favouriteFood`"
                    + ", `likeToEatOut`, `likeToWatchMovies`,  `likeToWatchTv`, `likeToListenToTheRadio`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/survey","root","");
            pst = con.prepareStatement(query);
            pst.setString(1, txtSurname.getText());
            pst.setString(2, txtNAme.getText());    
            pst.setString(3, txtContactNumber.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(dcDate.getDate());
            pst.setString(4, date);
            
            pst.setString(5, txtAge.getText());
            
            
            String pizza = "";
            if(chckPizza.isSelected())
            {
                 pizza += chckPizza.getText() + " ";
            }
            pst.setString(6, "1");
            
            String pasta = "";
            if(chckPasta.isSelected())
            {
                pasta +=chckPasta.getText() + " ";
            }
            pst.setString(7, "1");
            
            String papAndWors = "";
            if(chckPapAndWors.isSelected())
            {
                papAndWors += chckPapAndWors.getText() + " ";
            }
            pst.setString(8, "1");
            
            String favouriteFood = "";
            if(chckChickenStirFry.isSelected())
            {
                favouriteFood +=chckChickenStirFry.getText() + " ";
            }
            if(chckBeefStirFry.isSelected())
            {
                favouriteFood +=chckBeefStirFry.getText() + " ";
            }
            if(chckOther.isSelected())
            {
                favouriteFood +=chckOther.getText() + " ";
            }
            pst.setString(9, favouriteFood);
            
            if(rdoEatOutStronglyAgree.isSelected())
            {
               likeToEatOut = "1"; 
            }
            if(rdoEatOutAgree.isSelected())
            {
               likeToEatOut = "2"; 
            }
            if(rdoEatOutNeutral.isSelected())
            {
               likeToEatOut = "3"; 
            }
            if(rdoEatOutDisagree.isSelected())
            {
               likeToEatOut = "4"; 
            }
            if(rdoEatOutStronglyDisagree.isSelected())
            {
               likeToEatOut = "5"; 
            }
            pst.setString(10, likeToEatOut);
            
            if(rdoWatchMovieStronlyAgree.isSelected())
            {
               likeToWatchMovies = "1"; 
            }
            if(rdoWatchMovieAgree.isSelected())
            {
               likeToWatchMovies = "2"; 
            }
            if(rdoWatchMovieNuetral.isSelected())
            {
               likeToWatchMovies = "3"; 
            }
            if(rdoWatchTvDisagree.isSelected())
            {
               likeToWatchMovies = "4"; 
            }
            if(rdoWatchMovieStronlyDisagree.isSelected())
            {
               likeToWatchMovies = "5"; 
            }
            pst.setString(11,likeToWatchMovies);
            
            if(rdoWatchTvStronlyAgree.isSelected())
            {
               likeToWatchTv = "1"; 
            }
            if(rdoWatchTvAgree.isSelected())
            {
               likeToWatchTv = "2"; 
            }
            if(rdoWatchTvNeutral.isSelected())
            {
               likeToWatchTv = "3"; 
            }
            if(rdoWatchMovieDisagree.isSelected())
            {
               likeToWatchTv = "4"; 
            }
            if(rdoWatchMovieStronlyDisagree.isSelected())
            {
               likeToWatchTv = "5"; 
            }
            pst.setString(12,likeToWatchTv);
            
            if(rdoListenToRadioStronlyAgree.isSelected())
            {
               likeToListenToTheRadio = "1"; 
            }
            if(rdoListenToRadioAgree.isSelected())
            {
               likeToListenToTheRadio = "2"; 
            }
            if(rdoListentoRadioNuetral.isSelected())
            {
               likeToListenToTheRadio = "3"; 
            }
            if(rdoListentoRadioDisagree.isSelected())
            {
               likeToListenToTheRadio = "4"; 
            }
            if(rdoListentoRadioStronglyDisagree.isSelected())
            {
               likeToListenToTheRadio = "5"; 
            }
            pst.setString(13,likeToListenToTheRadio);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Thank You For Taking Part In Our Survey");
            
            txtSurname.setText("");
            txtNAme.setText("");
            txtContactNumber.setText("");
            txtAge.setText("");
            
            new HomePage().setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void rdoListenToRadioStronlyAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoListenToRadioStronlyAgreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoListenToRadioStronlyAgreeActionPerformed

    private void rdoListentoRadioDisagreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoListentoRadioDisagreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoListentoRadioDisagreeActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SurveyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SurveyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SurveyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SurveyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SurveyPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox chckBeefStirFry;
    private javax.swing.JCheckBox chckChickenStirFry;
    private javax.swing.JCheckBox chckOther;
    private javax.swing.JCheckBox chckPapAndWors;
    private javax.swing.JCheckBox chckPasta;
    private javax.swing.JCheckBox chckPizza;
    private com.toedter.calendar.JDateChooser dcDate;
    private javax.swing.JRadioButton j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoEatOutAgree;
    private javax.swing.JRadioButton rdoEatOutDisagree;
    private javax.swing.JRadioButton rdoEatOutNeutral;
    private javax.swing.JRadioButton rdoEatOutStronglyAgree;
    private javax.swing.JRadioButton rdoEatOutStronglyDisagree;
    private javax.swing.JRadioButton rdoListenToRadioAgree;
    private javax.swing.JRadioButton rdoListenToRadioStronlyAgree;
    private javax.swing.JRadioButton rdoListentoRadioDisagree;
    private javax.swing.JRadioButton rdoListentoRadioNuetral;
    private javax.swing.JRadioButton rdoListentoRadioStronglyDisagree;
    private javax.swing.JRadioButton rdoWatchMovieAgree;
    private javax.swing.JRadioButton rdoWatchMovieDisagree;
    private javax.swing.JRadioButton rdoWatchMovieNuetral;
    private javax.swing.JRadioButton rdoWatchMovieStronlyAgree;
    private javax.swing.JRadioButton rdoWatchMovieStronlyDisagree;
    private javax.swing.JRadioButton rdoWatchTvAgree;
    private javax.swing.JRadioButton rdoWatchTvDisagree;
    private javax.swing.JRadioButton rdoWatchTvNeutral;
    private javax.swing.JRadioButton rdoWatchTvStronlyAgree;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtNAme;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
