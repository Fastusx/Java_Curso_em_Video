package cursoemvideo;

import java.util.Locale;

public class Idioma extends javax.swing.JFrame {
    
    
    public Idioma() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Visor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cursoemvideo/Sem título.png"))); 

        btnClick.setFont(new java.awt.Font("Segoe UI", 3, 12)); 
        btnClick.setText("Clique Aqui!");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Segoe UI", 3, 24)); 
        Title.setText("Idioma do Sistema");

        Visor.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        Visor.setForeground(new java.awt.Color(153, 153, 153));
        Visor.setText("Clique abaixo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnClick))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Visor)
                            .addComponent(Title))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Visor)
                        .addGap(54, 54, 54)
                        .addComponent(btnClick)))
                .addContainerGap(277, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {
       Locale language = Locale.getDefault();
       Visor.setText(language.getDisplayLanguage().toUpperCase() + " / " + language.getDisplayCountry().toUpperCase());
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Idioma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Idioma().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Visor;
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel2;
    
}
