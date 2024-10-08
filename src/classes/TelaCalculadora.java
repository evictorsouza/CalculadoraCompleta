package classes;
/**
 *
 * @author edson
 */
public class TelaCalculadora extends javax.swing.JFrame {
    Calculador c = new Calculador();
    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
        txtTela.setText("0");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTela = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnOito = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnSom = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPorcento = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnMaisMenos = new javax.swing.JButton();
        btnMMais = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMMenos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        txtTela.setEditable(false);
        txtTela.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnOito.setBackground(new java.awt.Color(0, 51, 204));
        btnOito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOito.setForeground(new java.awt.Color(255, 255, 255));
        btnOito.setText("8");
        btnOito.setPreferredSize(new java.awt.Dimension(80, 30));
        btnOito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOitoMouseClicked(evt);
            }
        });

        btnSete.setBackground(new java.awt.Color(0, 51, 204));
        btnSete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSete.setForeground(new java.awt.Color(255, 255, 255));
        btnSete.setText("7");
        btnSete.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeteMouseClicked(evt);
            }
        });

        btnNove.setBackground(new java.awt.Color(0, 51, 204));
        btnNove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNove.setForeground(new java.awt.Color(255, 255, 255));
        btnNove.setText("9");
        btnNove.setPreferredSize(new java.awt.Dimension(80, 30));
        btnNove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoveMouseClicked(evt);
            }
        });

        btnQuatro.setBackground(new java.awt.Color(0, 51, 204));
        btnQuatro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnQuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnQuatro.setText("4");
        btnQuatro.setPreferredSize(new java.awt.Dimension(80, 30));
        btnQuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuatroMouseClicked(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(0, 51, 204));
        btnCinco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCincoMouseClicked(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(0, 51, 204));
        btnSeis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeisMouseClicked(evt);
            }
        });

        btnUm.setBackground(new java.awt.Color(0, 51, 204));
        btnUm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUm.setForeground(new java.awt.Color(255, 255, 255));
        btnUm.setText("1");
        btnUm.setPreferredSize(new java.awt.Dimension(80, 30));
        btnUm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUmMouseClicked(evt);
            }
        });

        btnDois.setBackground(new java.awt.Color(0, 51, 204));
        btnDois.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDois.setForeground(new java.awt.Color(255, 255, 255));
        btnDois.setText("2");
        btnDois.setPreferredSize(new java.awt.Dimension(80, 30));
        btnDois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoisMouseClicked(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(0, 51, 204));
        btnTres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.setPreferredSize(new java.awt.Dimension(80, 30));
        btnTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTresMouseClicked(evt);
            }
        });

        btnSub.setBackground(new java.awt.Color(102, 102, 102));
        btnSub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSub.setForeground(new java.awt.Color(255, 255, 255));
        btnSub.setText("-");
        btnSub.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubMouseClicked(evt);
            }
        });

        btnSom.setBackground(new java.awt.Color(102, 102, 102));
        btnSom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSom.setForeground(new java.awt.Color(255, 255, 255));
        btnSom.setText("+");
        btnSom.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSomMouseClicked(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(102, 102, 102));
        btnDiv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(255, 255, 255));
        btnDiv.setText("÷");
        btnDiv.setPreferredSize(new java.awt.Dimension(80, 30));
        btnDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivMouseClicked(evt);
            }
        });

        btnMult.setBackground(new java.awt.Color(102, 102, 102));
        btnMult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMult.setForeground(new java.awt.Color(255, 255, 255));
        btnMult.setText("×");
        btnMult.setPreferredSize(new java.awt.Dimension(80, 30));
        btnMult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultMouseClicked(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(102, 102, 102));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setPreferredSize(new java.awt.Dimension(80, 30));
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualMouseClicked(evt);
            }
        });

        btnRaiz.setBackground(new java.awt.Color(102, 102, 102));
        btnRaiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(255, 255, 255));
        btnRaiz.setText("√");
        btnRaiz.setPreferredSize(new java.awt.Dimension(80, 30));
        btnRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRaizMouseClicked(evt);
            }
        });

        btnPorcento.setBackground(new java.awt.Color(102, 102, 102));
        btnPorcento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPorcento.setForeground(new java.awt.Color(255, 255, 255));
        btnPorcento.setText("%");
        btnPorcento.setPreferredSize(new java.awt.Dimension(80, 30));
        btnPorcento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPorcentoMouseClicked(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(0, 51, 204));
        btnZero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnZero.setForeground(new java.awt.Color(255, 255, 255));
        btnZero.setText("0");
        btnZero.setPreferredSize(new java.awt.Dimension(80, 30));
        btnZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnZeroMouseClicked(evt);
            }
        });

        btnPonto.setBackground(new java.awt.Color(0, 51, 204));
        btnPonto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnPonto.setText(".");
        btnPonto.setPreferredSize(new java.awt.Dimension(80, 30));
        btnPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPontoMouseClicked(evt);
            }
        });

        btnMaisMenos.setBackground(new java.awt.Color(0, 51, 204));
        btnMaisMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMaisMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMaisMenos.setText("+/-");
        btnMaisMenos.setPreferredSize(new java.awt.Dimension(80, 30));
        btnMaisMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaisMenosMouseClicked(evt);
            }
        });

        btnMMais.setBackground(new java.awt.Color(0, 153, 0));
        btnMMais.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMMais.setForeground(new java.awt.Color(255, 255, 255));
        btnMMais.setText("M+");
        btnMMais.setPreferredSize(new java.awt.Dimension(80, 30));
        btnMMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMMaisMouseClicked(evt);
            }
        });

        btnMC.setBackground(new java.awt.Color(0, 153, 0));
        btnMC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMC.setForeground(new java.awt.Color(255, 255, 255));
        btnMC.setText("MC");
        btnMC.setPreferredSize(new java.awt.Dimension(80, 30));
        btnMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMCMouseClicked(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.setPreferredSize(new java.awt.Dimension(80, 30));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        btnMR.setBackground(new java.awt.Color(0, 153, 0));
        btnMR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMR.setForeground(new java.awt.Color(255, 255, 255));
        btnMR.setText("MR");
        btnMR.setPreferredSize(new java.awt.Dimension(80, 30));
        btnMR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMRMouseClicked(evt);
            }
        });

        btnMMenos.setBackground(new java.awt.Color(0, 153, 0));
        btnMMenos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMMenos.setText("M-");
        btnMMenos.setPreferredSize(new java.awt.Dimension(80, 30));
        btnMMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMMenosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMMais, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnSom, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTela)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTela, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeteMouseClicked
        txtTela.setText(c.botaoSete(txtTela.getText()));
    }//GEN-LAST:event_btnSeteMouseClicked

    private void btnOitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOitoMouseClicked
        txtTela.setText(c.botaoOito(txtTela.getText()));
    }//GEN-LAST:event_btnOitoMouseClicked

    private void btnNoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoveMouseClicked
        txtTela.setText(c.botaoNove(txtTela.getText()));
    }//GEN-LAST:event_btnNoveMouseClicked

    private void btnQuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuatroMouseClicked
        txtTela.setText(c.botaoQuatro(txtTela.getText()));
    }//GEN-LAST:event_btnQuatroMouseClicked

    private void btnCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCincoMouseClicked
        txtTela.setText(c.botaoCinco(txtTela.getText()));
    }//GEN-LAST:event_btnCincoMouseClicked

    private void btnSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeisMouseClicked
        txtTela.setText(c.botaoSeis(txtTela.getText()));
    }//GEN-LAST:event_btnSeisMouseClicked

    private void btnUmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUmMouseClicked
        txtTela.setText(c.botaoUm(txtTela.getText()));
    }//GEN-LAST:event_btnUmMouseClicked

    private void btnDoisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoisMouseClicked
        txtTela.setText(c.botaoDois(txtTela.getText()));
    }//GEN-LAST:event_btnDoisMouseClicked

    private void btnTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTresMouseClicked
        txtTela.setText(c.botaoTres(txtTela.getText()));
    }//GEN-LAST:event_btnTresMouseClicked

    private void btnZeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnZeroMouseClicked
        txtTela.setText(c.botaoZero(txtTela.getText()));
    }//GEN-LAST:event_btnZeroMouseClicked

    private void btnPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPontoMouseClicked
        txtTela.setText(c.botaoPonto(txtTela.getText()));
    }//GEN-LAST:event_btnPontoMouseClicked

    private void btnMaisMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaisMenosMouseClicked
        txtTela.setText(c.botaoMaisMenos(txtTela.getText()));
    }//GEN-LAST:event_btnMaisMenosMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtTela.setText(c.botaoClear());
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseClicked
        txtTela.setText(c.botaoIgual(txtTela.getText()));
    }//GEN-LAST:event_btnIgualMouseClicked

    private void btnSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMouseClicked
        txtTela.setText(c.botaoSubtrair(txtTela.getText()));
    }//GEN-LAST:event_btnSubMouseClicked

    private void btnSomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSomMouseClicked
        txtTela.setText(c.botaoSomar(txtTela.getText()));
    }//GEN-LAST:event_btnSomMouseClicked

    private void btnMultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultMouseClicked
        txtTela.setText(c.botaoMultiplicar(txtTela.getText()));
    }//GEN-LAST:event_btnMultMouseClicked

    private void btnDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivMouseClicked
        txtTela.setText(c.botaoDividir(txtTela.getText()));
    }//GEN-LAST:event_btnDivMouseClicked

    private void btnRaizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRaizMouseClicked
        txtTela.setText(c.botaoRaiz(txtTela.getText()));
    }//GEN-LAST:event_btnRaizMouseClicked

    private void btnPorcentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPorcentoMouseClicked
        txtTela.setText(c.botaoPorcentagem(txtTela.getText()));
    }//GEN-LAST:event_btnPorcentoMouseClicked

    private void btnMMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMMaisMouseClicked
        c.botaoMemoriaMais(txtTela.getText());
    }//GEN-LAST:event_btnMMaisMouseClicked

    private void btnMCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMCMouseClicked
        c.botaoMemoriaClear();
    }//GEN-LAST:event_btnMCMouseClicked

    private void btnMRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMRMouseClicked
        txtTela.setText(c.botaoMemoriaReveal());
    }//GEN-LAST:event_btnMRMouseClicked

    private void btnMMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMMenosMouseClicked
        // TODO add your handling code here:
        c.botaoMemoriaMenos(txtTela.getText());
    }//GEN-LAST:event_btnMMenosMouseClicked
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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMMais;
    private javax.swing.JButton btnMMenos;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMaisMenos;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorcento;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSom;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTela;
    // End of variables declaration//GEN-END:variables
}
