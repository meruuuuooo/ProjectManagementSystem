package cost.management;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class DashboardFrame extends javax.swing.JFrame {

    private Point mouseDownCompCoords = null;
    private Timer searchTimer;
    List<String[]> projectList;

    public DashboardFrame() {
        initComponents();
        t1.setVisible(true);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        this.projectList = new ArrayList<>();
        searchTimer = new Timer(800, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch1();
                performSearch2();
            }
        });
        searchTimer.setRepeats(false);
        DraggableMouseListener dragListener = new DraggableMouseListener();
        this.addMouseListener(dragListener);
        this.addMouseMotionListener(dragListener);
        String[][] projectInputs = {
            {"001", "Web Development", "John Doe", "ABC Corporation", "Website", "$50,000", "$10,000", "$5,000", "$10,000", "$1,000", "2023-12-31", "In Progress"},
            {"002", "Mobile App Design", "Jane Smith", "XYZ Tech Solutions", "Mobile App", "$65,000", "$6,000", "$5,000", "$4,000", "$2,000", "2023-10-15", "Completed"},
            {"003", "Database Optimization", "James Johnson", "Data Systems Inc.", "Database", "$100,000", "$12,000", "$18,000", "$20,000", "$2,000", "2023-11-30", "On Hold"},
            {"004", "AI Chatbot Integration", "Emily Brown", "ChatTech Ltd.", "Artificial Intelligence", "$55,000", "$15,000", "$10,000", "$5,000", "$2,000", "2023-11-15", "In Progress"},
            {"005", "Game Development", "Alex Turner", "GameStudios Inc.", "Game Development", "$70,000", "$25,000", "$10,000", "$5,000", "$2,000", "2023-12-20", "Completed"}
        };

        for (String[] project : projectInputs) {
            for (int i = 5; i <= 9; i++) {
                project[i] = project[i].replace("$", "");
                project[i] = project[i].replace(",", "");
            }
        }

        projectList.addAll(Arrays.asList(projectInputs));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        generatereportBtn = new javax.swing.JButton();
        lagoutBtn = new javax.swing.JButton();
        t1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        leastExpensiveCost = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        inProgressLabel = new javax.swing.JLabel();
        completedLabel = new javax.swing.JLabel();
        onHoldLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jp7 = new javax.swing.JProgressBar();
        jp8 = new javax.swing.JProgressBar();
        jp9 = new javax.swing.JProgressBar();
        jp10 = new javax.swing.JProgressBar();
        jp11 = new javax.swing.JProgressBar();
        jp12 = new javax.swing.JProgressBar();
        jp13 = new javax.swing.JProgressBar();
        jp14 = new javax.swing.JProgressBar();
        jp6 = new javax.swing.JProgressBar();
        jp5 = new javax.swing.JProgressBar();
        jp4 = new javax.swing.JProgressBar();
        jp3 = new javax.swing.JProgressBar();
        jp2 = new javax.swing.JProgressBar();
        jp1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        numOfProjects = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        expensiveProject = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t2 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        textLaborCost = new javax.swing.JTextField();
        c5 = new javax.swing.JLabel();
        c0 = new javax.swing.JLabel();
        textMiscellaneousCost = new javax.swing.JTextField();
        textProjectName = new javax.swing.JTextField();
        c6 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        textDueDate = new javax.swing.JTextField();
        textBudget = new javax.swing.JTextField();
        a4 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        textMaterialCost = new javax.swing.JTextField();
        textInitialCost = new javax.swing.JTextField();
        textID = new javax.swing.JTextField();
        textProjectManager = new javax.swing.JTextField();
        a1 = new javax.swing.JLabel();
        textClient = new javax.swing.JTextField();
        a2 = new javax.swing.JLabel();
        textCategory = new javax.swing.JTextField();
        a3 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectTable = new javax.swing.JTable();
        textSearch = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();
        labelSearch1 = new javax.swing.JLabel();
        t3 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        textSearch2 = new javax.swing.JTextField();
        generateBtn = new javax.swing.JButton();
        refreshBtn2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textMessage = new javax.swing.JTextPane();
        backBtn = new javax.swing.JButton();
        copytextBtn = new javax.swing.JButton();

        dateChooser1.setForeground(new java.awt.Color(102, 204, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/job-description.png"))); // NOI18N

        createBtn.setBackground(new java.awt.Color(102, 153, 255));
        createBtn.setFont(new java.awt.Font("Malgun Gothic", 0, 10)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setText("CREATE");
        createBtn.setBorder(null);
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(102, 153, 255));
        homeBtn.setFont(new java.awt.Font("Malgun Gothic", 0, 10)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("HOME");
        homeBtn.setBorder(null);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        generatereportBtn.setBackground(new java.awt.Color(102, 153, 255));
        generatereportBtn.setFont(new java.awt.Font("Malgun Gothic", 0, 10)); // NOI18N
        generatereportBtn.setForeground(new java.awt.Color(255, 255, 255));
        generatereportBtn.setText("REPORT");
        generatereportBtn.setBorder(null);
        generatereportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generatereportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatereportBtnActionPerformed(evt);
            }
        });

        lagoutBtn.setBackground(new java.awt.Color(102, 153, 255));
        lagoutBtn.setFont(new java.awt.Font("Malgun Gothic", 0, 10)); // NOI18N
        lagoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        lagoutBtn.setText("Logout");
        lagoutBtn.setBorder(null);
        lagoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lagoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generatereportBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lagoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generatereportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(lagoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        t1.setBackground(new java.awt.Color(102, 204, 255));
        t1.setPreferredSize(new java.awt.Dimension(880, 500));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(124, 226, 254));
        jLabel6.setText("Least Expensive Cost :");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/icons8-total-sales-100.png"))); // NOI18N

        leastExpensiveCost.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        leastExpensiveCost.setForeground(new java.awt.Color(124, 226, 254));
        leastExpensiveCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leastExpensiveCost.setText("0");
        leastExpensiveCost.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leastExpensiveCost, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leastExpensiveCost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(124, 226, 254));
        jLabel15.setText("Project Status Count :");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(124, 226, 254));
        jLabel16.setText("In Progress");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(124, 226, 254));
        jLabel17.setText("On Hold");

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(124, 226, 254));
        jLabel18.setText("Completed");

        inProgressLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        inProgressLabel.setForeground(new java.awt.Color(255, 255, 255));
        inProgressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inProgressLabel.setText("0");

        completedLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        completedLabel.setForeground(new java.awt.Color(255, 255, 255));
        completedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedLabel.setText("0");

        onHoldLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        onHoldLabel.setForeground(new java.awt.Color(255, 255, 255));
        onHoldLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onHoldLabel.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inProgressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(onHoldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(completedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inProgressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onHoldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 153, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(124, 226, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Welcome To");
        jLabel8.setIconTextGap(0);
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 194, 40));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(124, 226, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/c_1.png"))); // NOI18N
        jLabel1.setText("ost Management");
        jLabel1.setIconTextGap(0);
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 290, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(124, 226, 254));
        jLabel3.setText("Manage any type of project. Assign owners, set timelines and keep track of where your project stands.");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/icons8-projects-100.png"))); // NOI18N

        numOfProjects.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        numOfProjects.setForeground(new java.awt.Color(124, 226, 254));
        numOfProjects.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numOfProjects.setText("0");
        numOfProjects.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(124, 226, 254));
        jLabel4.setText("NO. OF PROJECTS :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(numOfProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jp14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(124, 226, 254));
        jLabel9.setText("Most Expensive Cost :");

        expensiveProject.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        expensiveProject.setForeground(new java.awt.Color(124, 226, 254));
        expensiveProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expensiveProject.setText("0");
        expensiveProject.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/icons8-project-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(expensiveProject, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expensiveProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout t1Layout = new javax.swing.GroupLayout(t1);
        t1.setLayout(t1Layout);
        t1Layout.setHorizontalGroup(
            t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(t1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        t1Layout.setVerticalGroup(
            t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(t1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 880, 500));
        t1.setSize(880, 500);

        t2.setBackground(new java.awt.Color(102, 204, 255));
        t2.setPreferredSize(new java.awt.Dimension(880, 500));
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });

        p1.setBackground(new java.awt.Color(0, 153, 255));
        p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));
        p1.setFocusable(false);
        p1.setPreferredSize(new java.awt.Dimension(700, 100));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });

        p3.setBackground(new java.awt.Color(0, 153, 255));
        p3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });

        c3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setText("Material cost :");

        c4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setText("Initial cost :");

        textLaborCost.setBackground(new java.awt.Color(102, 204, 255));
        textLaborCost.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textLaborCost.setForeground(new java.awt.Color(255, 255, 255));

        c5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 255));
        c5.setText("Labor cost :");

        c0.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        c0.setForeground(new java.awt.Color(255, 255, 255));
        c0.setText("ID :");

        textMiscellaneousCost.setBackground(new java.awt.Color(102, 204, 255));
        textMiscellaneousCost.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textMiscellaneousCost.setForeground(new java.awt.Color(255, 255, 255));

        textProjectName.setBackground(new java.awt.Color(102, 204, 255));
        textProjectName.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textProjectName.setForeground(new java.awt.Color(255, 255, 255));

        c6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setText("Miscellaneous cost :");

        c1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setText("Project name :");

        textDueDate.setBackground(new java.awt.Color(102, 204, 255));
        textDueDate.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textDueDate.setForeground(new java.awt.Color(255, 255, 255));
        textDueDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textDueDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textDueDateMouseClicked(evt);
            }
        });

        textBudget.setBackground(new java.awt.Color(102, 204, 255));
        textBudget.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textBudget.setForeground(new java.awt.Color(255, 255, 255));

        a4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        a4.setForeground(new java.awt.Color(255, 255, 255));
        a4.setText("Due date :");

        c2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setText("Budget :");

        textMaterialCost.setBackground(new java.awt.Color(102, 204, 255));
        textMaterialCost.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textMaterialCost.setForeground(new java.awt.Color(255, 255, 255));

        textInitialCost.setBackground(new java.awt.Color(102, 204, 255));
        textInitialCost.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textInitialCost.setForeground(new java.awt.Color(255, 255, 255));

        textID.setBackground(new java.awt.Color(102, 204, 255));
        textID.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textID.setForeground(new java.awt.Color(255, 255, 255));
        textID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textProjectManager.setBackground(new java.awt.Color(102, 204, 255));
        textProjectManager.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textProjectManager.setForeground(new java.awt.Color(255, 255, 255));

        a1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 255, 255));
        a1.setText("Project Manager :");

        textClient.setBackground(new java.awt.Color(102, 204, 255));
        textClient.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textClient.setForeground(new java.awt.Color(255, 255, 255));

        a2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        a2.setForeground(new java.awt.Color(255, 255, 255));
        a2.setText("Client :");

        textCategory.setBackground(new java.awt.Color(102, 204, 255));
        textCategory.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textCategory.setForeground(new java.awt.Color(255, 255, 255));

        a3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        a3.setForeground(new java.awt.Color(255, 255, 255));
        a3.setText("Category :");

        a5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        a5.setForeground(new java.awt.Color(255, 255, 255));
        a5.setText("Status :");

        comboStatus.setBackground(new java.awt.Color(102, 204, 255));
        comboStatus.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        comboStatus.setForeground(new java.awt.Color(255, 255, 255));
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "In Progress", "On Hold", "Completed" }));
        comboStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(124, 226, 254));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Project Information");
        jLabel11.setIconTextGap(0);

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(c0)
                        .addGap(94, 94, 94)
                        .addComponent(c1)
                        .addGap(37, 37, 37)
                        .addComponent(a1)
                        .addGap(17, 17, 17)
                        .addComponent(a2)
                        .addGap(75, 75, 75)
                        .addComponent(a3)
                        .addGap(59, 59, 59)
                        .addComponent(a4))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(textBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(c2))
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(p3Layout.createSequentialGroup()
                                        .addComponent(c3)
                                        .addGap(266, 266, 266)
                                        .addComponent(c6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a5))
                                    .addGroup(p3Layout.createSequentialGroup()
                                        .addComponent(textMaterialCost, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textInitialCost, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textLaborCost, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMiscellaneousCost, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(p3Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(c5))))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c4)
                            .addGroup(p3Layout.createSequentialGroup()
                                .addComponent(textProjectManager, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textClient, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(textDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c1)
                        .addComponent(c0))
                    .addComponent(a1)
                    .addComponent(a2)
                    .addComponent(a3)
                    .addComponent(a4))
                .addGap(6, 6, 6)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textProjectManager, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textClient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c6)
                            .addComponent(a5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c3)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(c2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textMaterialCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textInitialCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textLaborCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textMiscellaneousCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        addBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD");
        addBtn.setBorder(null);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(java.awt.Color.blue);
        updateBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("UPDATE");
        updateBtn.setBorder(null);
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        deleteBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(null);
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(0, 153, 255));
        p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        projectTable.setAutoCreateRowSorter(true);
        projectTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        projectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Project name", "Manager", "Client", "Category", "Budget", "Material", "Initial", "Labor", "Miscellaneous", "Due date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        projectTable.setToolTipText("double click to clear selection");
        projectTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        projectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(projectTable);
        if (projectTable.getColumnModel().getColumnCount() > 0) {
            projectTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            projectTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            projectTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            projectTable.getColumnModel().getColumn(7).setPreferredWidth(50);
            projectTable.getColumnModel().getColumn(8).setPreferredWidth(50);
            projectTable.getColumnModel().getColumn(9).setPreferredWidth(50);
            projectTable.getColumnModel().getColumn(10).setPreferredWidth(50);
            projectTable.getColumnModel().getColumn(11).setPreferredWidth(50);
        }

        textSearch.setBackground(new java.awt.Color(102, 204, 255));
        textSearch.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textSearch.setForeground(new java.awt.Color(255, 255, 255));
        textSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchActionPerformed(evt);
            }
        });
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSearchKeyTyped(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(0, 153, 255));
        refreshBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/refresh.png"))); // NOI18N
        refreshBtn.setBorder(null);
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        labelSearch1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        labelSearch1.setForeground(new java.awt.Color(255, 255, 255));
        labelSearch1.setText("SEARCH");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout t2Layout = new javax.swing.GroupLayout(t2);
        t2.setLayout(t2Layout);
        t2Layout.setHorizontalGroup(
            t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        t2Layout.setVerticalGroup(
            t2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        String date = dateChooser1.getDateFormat();

        textDueDate.setText(date);

        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));
        t2.setSize(880, 500);

        dateChooser1.setTextRefernce(textDueDate);

        t3.setBackground(new java.awt.Color(102, 204, 255));
        t3.setPreferredSize(new java.awt.Dimension(880, 500));

        p4.setBackground(new java.awt.Color(0, 153, 255));
        p4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        textSearch2.setBackground(new java.awt.Color(102, 204, 255));
        textSearch2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textSearch2.setForeground(new java.awt.Color(255, 255, 255));
        textSearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSearch2KeyTyped(evt);
            }
        });

        generateBtn.setBackground(java.awt.Color.orange);
        generateBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        generateBtn.setForeground(new java.awt.Color(255, 255, 255));
        generateBtn.setText("Generate report");
        generateBtn.setBorder(null);
        generateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBtnActionPerformed(evt);
            }
        });

        refreshBtn2.setBackground(new java.awt.Color(0, 153, 255));
        refreshBtn2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        refreshBtn2.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/refresh.png"))); // NOI18N
        refreshBtn2.setBorder(null);
        refreshBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtn2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SEARCH");

        reportTable.setAutoCreateRowSorter(true);
        reportTable.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Project name", "Manager", "Client", "Category", "Budget", "Material", "Initial", "Labor", "Miscellaneous", "Due date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setViewportView(reportTable);
        if (reportTable.getColumnModel().getColumnCount() > 0) {
            reportTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            reportTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            reportTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            reportTable.getColumnModel().getColumn(7).setPreferredWidth(50);
            reportTable.getColumnModel().getColumn(8).setPreferredWidth(50);
            reportTable.getColumnModel().getColumn(9).setPreferredWidth(50);
            reportTable.getColumnModel().getColumn(10).setPreferredWidth(50);
            reportTable.getColumnModel().getColumn(11).setPreferredWidth(50);
        }

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                        .addComponent(textSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 621, Short.MAX_VALUE)
                        .addComponent(refreshBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textSearch2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addComponent(refreshBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(0, 153, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));
        jPanel8.setPreferredSize(new java.awt.Dimension(588, 78));

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(124, 226, 254));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/g.png"))); // NOI18N
        jLabel12.setText("enerate Report");
        jLabel12.setIconTextGap(3);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(124, 226, 254));
        jLabel13.setText("Compiles project expenses for quick budget analysis and decision-making.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout t3Layout = new javax.swing.GroupLayout(t3);
        t3.setLayout(t3Layout);
        t3Layout.setHorizontalGroup(
            t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        t3Layout.setVerticalGroup(
            t3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 880, 500));
        t3.setSize(880, 500);

        t4.setBackground(new java.awt.Color(102, 204, 255));
        t4.setPreferredSize(new java.awt.Dimension(880, 500));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        textMessage.setEditable(false);
        textMessage.setBorder(null);
        textMessage.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jScrollPane3.setViewportView(textMessage);

        backBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/icons8-back-24.png"))); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(null);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        copytextBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        copytextBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        copytextBtn.setForeground(new java.awt.Color(255, 255, 255));
        copytextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imgs/icons8-copy-16.png"))); // NOI18N
        copytextBtn.setText("Copy");
        copytextBtn.setBorder(null);
        copytextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copytextBtn.setIconTextGap(10);
        copytextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copytextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copytextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copytextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout t4Layout = new javax.swing.GroupLayout(t4);
        t4.setLayout(t4Layout);
        t4Layout.setHorizontalGroup(
            t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        t4Layout.setVerticalGroup(
            t4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 880, 500));
        t4.setSize(880, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private class DraggableMouseListener extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }

    public boolean isEmpty(JTextField[] textFields) {
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void clearTextFields() {
        JTextField[] textFields = {textID, textProjectName, textProjectManager, textClient, textCategory, textBudget, textMaterialCost, textInitialCost, textLaborCost, textMiscellaneousCost};
        for (JTextField textField : textFields) {
            textField.setText("");
        }
        comboStatus.setSelectedIndex(0);
        textID.setEditable(true);
    }

    public String[] costReportFormat() {
        JLabel[] labels = {c0, c1, c2, c3, c4, c5, c6};
        String[] result = new String[labels.length];
        for (int i = 0; i < labels.length; i++) {
            result[i] = labels[i].getText().toUpperCase();
        }
        return result;
    }

    public String[] projectInfoFormat() {
        JLabel[] labels = {a1, a2, a3, a4, a5};
        String[] result = new String[labels.length];
        for (int i = 0; i < labels.length; i++) {
            result[i] = labels[i].getText().toUpperCase();
        }
        return result;
    }

    public String[] getValueFromTable() {
        DefaultTableModel table = (DefaultTableModel) reportTable.getModel();
        int selectedRow = reportTable.getSelectedRow();
        String[] data = new String[12];

        int indexToModel = reportTable.convertRowIndexToModel(selectedRow);
        for (int i = 0; i < data.length; i++) {
            data[i] = table.getValueAt(indexToModel, i).toString();
        }
        return data;
    }

    public double getTotalCost(String[] reportData) {
        double[] cost = new double[5];
        double actualCost = 0.0;
        for (int i = 6; i <= 9; i++) {
            cost[i - 6] = Double.parseDouble(reportData[i]);
        }

        for (double c : cost) {
            actualCost += c;
        }
        return actualCost;
    }

    public void print(String[] costReportFormat, String[] projectInfoFormat, String[] reportData) {
        StringBuilder sb = new StringBuilder();
        String[] result1 = new String[costReportFormat.length];
        String[] result2 = new String[projectInfoFormat.length];

        String[] costReportData = {reportData[0], reportData[1], "$" + reportData[5], "$" + reportData[6], "$" + reportData[7], "$" + reportData[8], "$" + reportData[9]};

        String[] profileInfoData = {reportData[2], reportData[3], reportData[4], reportData[10], reportData[11]};

        double actualCost = getTotalCost(reportData);
        double budgetedCost = Double.parseDouble(reportData[5]);
        double costVariance = budgetedCost - actualCost;

        for (int i = 0; i < costReportFormat.length; i++) {
            result1[i] = costReportFormat[i] + " : " + costReportData[i];
        }

        for (int i = 0; i < projectInfoFormat.length; i++) {
            result2[i] = projectInfoFormat[i] + " : " + profileInfoData[i];
        }

        sb.append("\tCost Report\n");
        sb.append("-------------------------------------").append("\n");
        for (String string : result1) {
            sb.append(string).append("\n");
        }
        sb.append("-------------------------------------").append("\n");
        sb.append("ACTUAL COST : $").append(actualCost).append("\n");
        sb.append("COST VARIANCE : $").append(costVariance).append("\n");
        sb.append("\n");
        sb.append("\tProject Information\n");
        sb.append("-------------------------------------").append("\n");
        for (String string : result2) {
            sb.append(string).append("\n");
        }
        textMessage.setText(sb.toString());
    }

    public void projectStatusCount() {
        int onHoldProjects = 0;
        int inProgressProjects = 0;
        int completedProjects = 0;
        DefaultTableModel table = (DefaultTableModel) projectTable.getModel();

        int rowCount = table.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String[] data = (String[]) projectList.get(i);
            String status = data[11];

            switch (status) {
                case "In Progress":
                    inProgressProjects++;
                    break;
                case "On Hold":
                    onHoldProjects++;
                    break;
                case "Completed":
                    completedProjects++;
                    break;
            }
        }
        inProgressLabel.setText(String.valueOf(inProgressProjects));
        onHoldLabel.setText(String.valueOf(onHoldProjects));
        completedLabel.setText(String.valueOf(completedProjects));

    }

    public void readTable1() {
        DefaultTableModel table = (DefaultTableModel) projectTable.getModel();
        table.setRowCount(0);
        for (Object object : projectList) {
            Vector<Object> v = new Vector<>();
            String[] strArr = (String[]) object;
            for (String string : strArr) {
                v.add(string);
            }
            table.addRow(v);
        }
    }

    public void readTable2() {
        DefaultTableModel table = (DefaultTableModel) reportTable.getModel();
        table.setRowCount(0);
        for (Object object : projectList) {
            Vector<Object> v = new Vector<>();
            String[] strArr = (String[]) object;
            for (String string : strArr) {
                v.add(string);
            }
            table.addRow(v);
        }
    }

    private void performSearch1() {
        List<String[]> searchList = new ArrayList<>();
        DefaultTableModel table = (DefaultTableModel) projectTable.getModel();

        int rowCount = table.getRowCount();
        String searchValue = textSearch.getText();

        if (searchValue.isEmpty()) {
            readTable1();
        } else {
            for (int i = 0; i < rowCount; i++) {
                String[] data = (String[]) projectList.get(i);
                String projectListID = data[0];
                String projectListName = data[1];
                String projectManager = data[2];
                String category = data[4];
                String status = data[11];

                if (searchValue.equalsIgnoreCase(projectListID) || searchValue.equalsIgnoreCase(projectListName) || searchValue.equalsIgnoreCase(category) || searchValue.equalsIgnoreCase(status) || searchValue.equalsIgnoreCase(projectManager)) {
                    searchList.add(data);
                }
            }

            table.setRowCount(0);
            for (String[] strings : searchList) {
                Vector<String> v = new Vector<>();
                for (String string : strings) {
                    v.add(string);
                }
                table.addRow(v);
            }
        }
    }

    public void performSearch2() {
        List<String[]> searhList = new ArrayList<>();
        DefaultTableModel table = (DefaultTableModel) reportTable.getModel();

        int rowCount = table.getRowCount();
        String searchValue = textSearch2.getText();

        if (textSearch2.getText().isEmpty()) {
            readTable2();
        } else {
            for (int i = 0; i < rowCount; i++) {
                String[] data = (String[]) projectList.get(i);
                String projectListID = data[0];
                String projectListName = data[1];
                String category = data[4];
                String status = data[11];

                if (searchValue.equalsIgnoreCase(projectListID) || searchValue.equalsIgnoreCase(projectListName) || searchValue.equalsIgnoreCase(category) || searchValue.equalsIgnoreCase(status)) {
                    searhList.add(data.clone());

                }
            }

            table.setRowCount(0);
            for (String[] strings : searhList) {
                Vector<String> v = new Vector<>();
                String[] strArr = (String[]) strings;
                for (String string : strArr) {
                    v.add(string);
                }
                table.addRow(v);
            }

        }
    }

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        t1.setVisible(true);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        int noOfProjects = projectTable.getRowCount();
        numOfProjects.setText(String.valueOf(noOfProjects));

        double totalCost = 0.0;
        double maxProjectTotalCost = Double.MIN_VALUE;  // Initialize with smallest possible value
        double minProjectTotalCost = Double.MAX_VALUE;  // Initialize with largest possible value

        for (String[] project : projectList) {
            double materialsCost = Double.parseDouble(project[6]);
            double initialCost = Double.parseDouble(project[7]);
            double laborCost = Double.parseDouble(project[8]);
            double miscellaneousCost = Double.parseDouble(project[9]);

            double projectTotalCost = materialsCost + initialCost + laborCost + miscellaneousCost;

            totalCost += projectTotalCost;

            if (projectTotalCost > maxProjectTotalCost) {
                maxProjectTotalCost = projectTotalCost;
            }

            if (projectTotalCost < minProjectTotalCost) {
                minProjectTotalCost = projectTotalCost;
            }
        }

        leastExpensiveCost.setText(String.format("%.2f", minProjectTotalCost));
        expensiveProject.setText(String.format("%.2f", maxProjectTotalCost));
        projectStatusCount();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        t1.setVisible(false);
        t2.setVisible(true);
        t3.setVisible(false);
        t4.setVisible(false);
        readTable1();
    }//GEN-LAST:event_createBtnActionPerformed

    private void generatereportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatereportBtnActionPerformed
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(true);
        t4.setVisible(false);
        refreshBtn2ActionPerformed(evt);
    }//GEN-LAST:event_generatereportBtnActionPerformed

    private void hidePanels() {
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(true);
    }

    private void generateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBtnActionPerformed
        int selectedViewRow = reportTable.getSelectedRow();

        try {
            if (selectedViewRow < 0) {
                JOptionPane.showMessageDialog(t3, "No selected row", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                hidePanels();
                String[] costReportFormat = costReportFormat();
                String[] projectInfoFormat = projectInfoFormat();
                String[] reportData = getValueFromTable();

                print(costReportFormat, projectInfoFormat, reportData);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(t3, "Error parsing numeric values.", "", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(t3, e, "", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_generateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        JTextField[] textFields = {textID, textProjectName, textProjectManager, textClient, textCategory, textBudget, textMaterialCost, textInitialCost, textLaborCost, textMiscellaneousCost, textDueDate};
        boolean isDuplicate = false;
        if (isEmpty(textFields)) {
            JOptionPane.showMessageDialog(t2, "Text Fields are Empty!", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String[] data = new String[textFields.length + 1];

            String ID = textID.getText();

            for (String[] strings : projectList) {
                String[] newData = (String[]) strings;
                String existingID = newData[0];
                if (ID.equals(existingID)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {

                for (int i = 0; i < 11; i++) {
                    data[i] = textFields[i].getText();
                }
                data[11] = comboStatus.getSelectedItem().toString();
                projectList.add(data);
                refreshBtnActionPerformed(evt);
                clearTextFields();
                JOptionPane.showMessageDialog(t2, "Project Added Successfully", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(t2, "Duplicate ID! Please enter a different ID.", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        JTextField[] textFields = {textID, textProjectName, textProjectManager, textClient, textCategory, textBudget, textMaterialCost, textInitialCost, textLaborCost, textMiscellaneousCost, textDueDate};
        DefaultTableModel table = (DefaultTableModel) projectTable.getModel();
        int selectedRow = projectTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(t2, "No Selected Row", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int rowIndexModel = projectTable.convertRowIndexToModel(selectedRow);
            if (isEmpty(textFields)) {
                JOptionPane.showMessageDialog(t2, "Text Fields are Empty!", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String[] data = new String[textFields.length + 1];

                for (int i = 0; i < textFields.length; i++) {
                    String value = textFields[i].getText();
                    table.setValueAt(value, rowIndexModel, i);
                    data[i] = value;
                }
                data[11] = comboStatus.getSelectedItem().toString();
                projectList.set(rowIndexModel, data);
                refreshBtnActionPerformed(evt);
                clearTextFields();
                JOptionPane.showMessageDialog(t2, "Project Updated Successfully", "", JOptionPane.INFORMATION_MESSAGE);

            }

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel table = (DefaultTableModel) projectTable.getModel();
        int[] selectedRows = projectTable.getSelectedRows();

        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(t2, "No Selected Row to Delete!", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int del = JOptionPane.showConfirmDialog(t2, "Delete this selected row(s)", "", JOptionPane.INFORMATION_MESSAGE);

            if (del == JOptionPane.OK_OPTION) {

                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    int rowIndexModel = projectTable.convertRowIndexToModel(selectedRows[i]);
                    table.removeRow(rowIndexModel);
                    projectList.remove(rowIndexModel);
                }
                clearTextFields();
                JOptionPane.showMessageDialog(t2, "Record(s) Deleted", "", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        readTable1();
        projectTable.clearSelection();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void projectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectTableMouseClicked
        JTextField[] textFields = {textID, textProjectName, textProjectManager, textClient, textCategory, textBudget, textMaterialCost, textInitialCost, textLaborCost, textMiscellaneousCost, textDueDate};
        DefaultTableModel table = (DefaultTableModel) projectTable.getModel();
        int selectedRow = projectTable.getSelectedRow();
        int rowIndexModel = projectTable.convertRowIndexToModel(selectedRow);

        for (int i = 0; i < textFields.length; i++) {
            textFields[i].setText(table.getValueAt(rowIndexModel, i).toString());
        }
        comboStatus.setSelectedItem(table.getValueAt(rowIndexModel, 11).toString());
        if (evt.getClickCount() == 2) {
            textID.setEditable(true);
            clearTextFields();
            projectTable.clearSelection();
        } else {
            textID.setEditable(false);
        }
    }//GEN-LAST:event_projectTableMouseClicked

    private void refreshBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtn2ActionPerformed
        readTable2();
    }//GEN-LAST:event_refreshBtn2ActionPerformed

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked

    }//GEN-LAST:event_t2MouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(true);
        t4.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void lagoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagoutBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to Logout?", "Logout", JOptionPane.INFORMATION_MESSAGE);
        if (confirm == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lagoutBtnActionPerformed

    private void copytextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copytextBtnActionPerformed
        StringSelection stringSelection = new StringSelection(textMessage.getText());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        JOptionPane.showMessageDialog(t4, "Code copied to clipboard!");
    }//GEN-LAST:event_copytextBtnActionPerformed

    private void textSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyTyped
        searchTimer.restart();
    }//GEN-LAST:event_textSearchKeyTyped

    private void textSearch2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearch2KeyTyped
        searchTimer.restart();
    }//GEN-LAST:event_textSearch2KeyTyped

    private void textDueDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textDueDateMouseClicked
        dateChooser1.showPopup();
    }//GEN-LAST:event_textDueDateMouseClicked

    private void textSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel c0;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel completedLabel;
    private javax.swing.JButton copytextBtn;
    private javax.swing.JButton createBtn;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel expensiveProject;
    private javax.swing.JButton generateBtn;
    private javax.swing.JButton generatereportBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel inProgressLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JProgressBar jp1;
    private javax.swing.JProgressBar jp10;
    private javax.swing.JProgressBar jp11;
    private javax.swing.JProgressBar jp12;
    private javax.swing.JProgressBar jp13;
    private javax.swing.JProgressBar jp14;
    private javax.swing.JProgressBar jp2;
    private javax.swing.JProgressBar jp3;
    private javax.swing.JProgressBar jp4;
    private javax.swing.JProgressBar jp5;
    private javax.swing.JProgressBar jp6;
    private javax.swing.JProgressBar jp7;
    private javax.swing.JProgressBar jp8;
    private javax.swing.JProgressBar jp9;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JButton lagoutBtn;
    private javax.swing.JLabel leastExpensiveCost;
    private javax.swing.JLabel numOfProjects;
    private javax.swing.JLabel onHoldLabel;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JTable projectTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton refreshBtn2;
    private javax.swing.JTable reportTable;
    private javax.swing.JPanel t1;
    private javax.swing.JPanel t2;
    private javax.swing.JPanel t3;
    private javax.swing.JPanel t4;
    private javax.swing.JTextField textBudget;
    private javax.swing.JTextField textCategory;
    private javax.swing.JTextField textClient;
    private javax.swing.JTextField textDueDate;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textInitialCost;
    private javax.swing.JTextField textLaborCost;
    private javax.swing.JTextField textMaterialCost;
    public javax.swing.JTextPane textMessage;
    private javax.swing.JTextField textMiscellaneousCost;
    private javax.swing.JTextField textProjectManager;
    private javax.swing.JTextField textProjectName;
    private javax.swing.JTextField textSearch;
    private javax.swing.JTextField textSearch2;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
