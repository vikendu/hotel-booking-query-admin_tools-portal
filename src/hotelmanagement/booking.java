package hotelmanagement;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class booking extends javax.swing.JFrame {
float regular,deluxe,deluxe_plus;

    public booking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Guestspage = new javax.swing.JFrame();
        priceBtn = new javax.swing.JButton();
        stayDetail = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ManagersSec = new javax.swing.JFrame();
        searchVisistor = new javax.swing.JButton();
        allBookings = new javax.swing.JButton();
        bookRooms = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        AllBookings = new javax.swing.JFrame();
        cust_scrollpane1 = new javax.swing.JScrollPane();
        cust_table = new javax.swing.JTable();
        managerLogin = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        hintBtn = new javax.swing.JButton();
        visitorInfo = new javax.swing.JFrame();
        cust_scrollpane2 = new javax.swing.JScrollPane();
        cust_table1 = new javax.swing.JTable();
        nameSearch_txt = new javax.swing.JTextField();
        searchByname = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bookRoom = new javax.swing.JFrame();
        custID_txt = new javax.swing.JTextField();
        cust_name_txt = new javax.swing.JTextField();
        ID_txt = new javax.swing.JTextField();
        city_txt = new javax.swing.JTextField();
        chk_in_txt = new javax.swing.JTextField();
        chk_out_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        room_typelist = new javax.swing.JComboBox();
        pricing = new javax.swing.JFrame();
        regular_det = new javax.swing.JButton();
        deluxe_det = new javax.swing.JButton();
        deluxeplus_det = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        room_details = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        stay_details = new javax.swing.JFrame();
        room_type = new javax.swing.JComboBox();
        nights = new javax.swing.JTextField();
        estimate_btn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        estimate_fld = new javax.swing.JTextField();
        member = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        cust_idSearch = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        search_id_txt = new javax.swing.JTextField();
        searchById = new javax.swing.JButton();
        cust_scrollpane4 = new javax.swing.JScrollPane();
        cust_table3 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        price_update = new javax.swing.JFrame();
        jLabel25 = new javax.swing.JLabel();
        reg_price = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        deluxe_price = new javax.swing.JTextField();
        deluxe_plus_price = new javax.swing.JTextField();
        update_price_btn = new javax.swing.JButton();
        guestBtn = new javax.swing.JButton();
        mngrBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        Guestspage.setMinimumSize(new java.awt.Dimension(800, 800));

        priceBtn.setFont(new java.awt.Font("Tahoma", 0, 18));
        priceBtn.setText("Check Pricing");
        priceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBtnActionPerformed(evt);
            }
        });

        stayDetail.setFont(new java.awt.Font("Tahoma", 0, 18));
        stayDetail.setText("Stay Details");
        stayDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stayDetailActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Select your choice:");

        javax.swing.GroupLayout GuestspageLayout = new javax.swing.GroupLayout(Guestspage.getContentPane());
        Guestspage.getContentPane().setLayout(GuestspageLayout);
        GuestspageLayout.setHorizontalGroup(
            GuestspageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuestspageLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(priceBtn)
                .addGap(165, 165, 165)
                .addComponent(stayDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(321, 321, 321))
            .addGroup(GuestspageLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        GuestspageLayout.setVerticalGroup(
            GuestspageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuestspageLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addGroup(GuestspageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stayDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        ManagersSec.setMinimumSize(new java.awt.Dimension(800, 800));

        searchVisistor.setFont(new java.awt.Font("Tahoma", 1, 12));
        searchVisistor.setText("Search Visitor Info By Name");
        searchVisistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVisistorActionPerformed(evt);
            }
        });

        allBookings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allBookings.setText("View All Bookings");
        allBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBookingsActionPerformed(evt);
            }
        });

        bookRooms.setFont(new java.awt.Font("Tahoma", 1, 14));
        bookRooms.setText("Book A Room");
        bookRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomsActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel21.setText("Select a task you want to perform:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setText("Search Visitor Info By Cust ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update Prices");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManagersSecLayout = new javax.swing.GroupLayout(ManagersSec.getContentPane());
        ManagersSec.getContentPane().setLayout(ManagersSecLayout);
        ManagersSecLayout.setHorizontalGroup(
            ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagersSecLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ManagersSecLayout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagersSecLayout.createSequentialGroup()
                            .addGroup(ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchVisistor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGap(130, 130, 130)
                            .addGroup(ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bookRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(720, Short.MAX_VALUE))
        );
        ManagersSecLayout.setVerticalGroup(
            ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagersSecLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchVisistor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookRooms, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(ManagersSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );

        AllBookings.setMinimumSize(new java.awt.Dimension(900, 900));

        cust_table.setFont(new java.awt.Font("Tahoma", 1, 14));
        cust_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "ID", "City", "Room Type", "Check In", "Check Out"
            }
        ));
        cust_table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cust_tableFocusGained(evt);
            }
        });
        cust_scrollpane1.setViewportView(cust_table);

        javax.swing.GroupLayout AllBookingsLayout = new javax.swing.GroupLayout(AllBookings.getContentPane());
        AllBookings.getContentPane().setLayout(AllBookingsLayout);
        AllBookingsLayout.setHorizontalGroup(
            AllBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllBookingsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(cust_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        AllBookingsLayout.setVerticalGroup(
            AllBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AllBookingsLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(cust_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        managerLogin.setMinimumSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Password");

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel20.setText("Enter Your Login Credentials:");

        username.setFont(new java.awt.Font("Tahoma", 0, 14));

        hintBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        hintBtn.setText("Hint");
        hintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managerLoginLayout = new javax.swing.GroupLayout(managerLogin.getContentPane());
        managerLogin.getContentPane().setLayout(managerLoginLayout);
        managerLoginLayout.setHorizontalGroup(
            managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLoginLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerLoginLayout.createSequentialGroup()
                        .addGroup(managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(97, 97, 97)
                        .addGroup(managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                    .addGroup(managerLoginLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        managerLoginLayout.setVerticalGroup(
            managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLoginLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel20)
                .addGap(69, 69, 69)
                .addGroup(managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addGroup(managerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        visitorInfo.setMinimumSize(new java.awt.Dimension(800, 800));

        cust_table1.setFont(new java.awt.Font("Tahoma", 1, 14));
        cust_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "ID", "City", "Room Type", "Check In", "Check Out"
            }
        ));
        cust_scrollpane2.setViewportView(cust_table1);

        searchByname.setFont(new java.awt.Font("Tahoma", 1, 14));
        searchByname.setText("Search");
        searchByname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBynameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setText("By Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel22.setText("Enter Name to search:");

        javax.swing.GroupLayout visitorInfoLayout = new javax.swing.GroupLayout(visitorInfo.getContentPane());
        visitorInfo.getContentPane().setLayout(visitorInfoLayout);
        visitorInfoLayout.setHorizontalGroup(
            visitorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visitorInfoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(visitorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(visitorInfoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                        .addComponent(nameSearch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(searchByname, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                .addGap(263, 263, 263))
            .addGroup(visitorInfoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(cust_scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        visitorInfoLayout.setVerticalGroup(
            visitorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visitorInfoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(visitorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchByname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSearch_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(90, 90, 90)
                .addComponent(cust_scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        bookRoom.setMinimumSize(new java.awt.Dimension(650, 650));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Customer ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("ID type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Room Type");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Check In (DD-MM-YYYY)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Check Out(DD-MM-YYYY)");

        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        updateBtn.setText("Book Now");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel23.setText("Enter the Details to be added to the Database:");

        room_typelist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Deluxe", "Deluxe+", " " }));

        javax.swing.GroupLayout bookRoomLayout = new javax.swing.GroupLayout(bookRoom.getContentPane());
        bookRoom.getContentPane().setLayout(bookRoomLayout);
        bookRoomLayout.setHorizontalGroup(
            bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookRoomLayout.createSequentialGroup()
                .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookRoomLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookRoomLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addGroup(bookRoomLayout.createSequentialGroup()
                                .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(69, 69, 69)
                                .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(room_typelist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cust_name_txt)
                                    .addComponent(custID_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(ID_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(city_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk_in_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk_out_txt, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(259, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bookRoomLayout.setVerticalGroup(
            bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookRoomLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cust_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookRoomLayout.createSequentialGroup()
                        .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(room_typelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk_in_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(chk_out_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(65, 65, 65)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pricing.setMinimumSize(new java.awt.Dimension(900, 900));

        regular_det.setFont(new java.awt.Font("Tahoma", 1, 14));
        regular_det.setText("Regular");
        regular_det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regular_detActionPerformed(evt);
            }
        });

        deluxe_det.setFont(new java.awt.Font("Tahoma", 1, 14));
        deluxe_det.setText("Deluxe");
        deluxe_det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxe_detActionPerformed(evt);
            }
        });

        deluxeplus_det.setFont(new java.awt.Font("Tahoma", 1, 14));
        deluxeplus_det.setText("Deluxe+");
        deluxeplus_det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deluxeplus_detActionPerformed(evt);
            }
        });

        room_details.setColumns(20);
        room_details.setFont(new java.awt.Font("Monospaced", 1, 18));
        room_details.setRows(5);
        jScrollPane3.setViewportView(room_details);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Select the suite you want to know about:");

        javax.swing.GroupLayout pricingLayout = new javax.swing.GroupLayout(pricing.getContentPane());
        pricing.getContentPane().setLayout(pricingLayout);
        pricingLayout.setHorizontalGroup(
            pricingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricingLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(pricingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pricingLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pricingLayout.createSequentialGroup()
                        .addGroup(pricingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(deluxeplus_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deluxe_det, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regular_det, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        pricingLayout.setVerticalGroup(
            pricingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricingLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(pricingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pricingLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(regular_det, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(deluxe_det, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(deluxeplus_det, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        stay_details.setMinimumSize(new java.awt.Dimension(800, 800));

        room_type.setEditable(true);
        room_type.setFont(new java.awt.Font("Tahoma", 1, 14));
        room_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Regular", "Deluxe", "Deluxe+", " " }));

        nights.setFont(new java.awt.Font("Tahoma", 1, 14));

        estimate_btn.setFont(new java.awt.Font("Tahoma", 1, 18));
        estimate_btn.setText("Estimate");
        estimate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimate_btnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setText("Membership(20% off)");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("Room Choice");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel14.setText("Enter Stay Duration(Nights)");

        estimate_fld.setFont(new java.awt.Font("Tahoma", 1, 14));
        estimate_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estimate_fldActionPerformed(evt);
            }
        });

        member.setFont(new java.awt.Font("Tahoma", 1, 14));
        member.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No", " " }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel19.setText("Enter your Room preference and other details:");

        javax.swing.GroupLayout stay_detailsLayout = new javax.swing.GroupLayout(stay_details.getContentPane());
        stay_details.getContentPane().setLayout(stay_detailsLayout);
        stay_detailsLayout.setHorizontalGroup(
            stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stay_detailsLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(stay_detailsLayout.createSequentialGroup()
                        .addGroup(stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(estimate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(56, 56, 56)
                        .addGroup(stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room_type, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nights, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estimate_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        stay_detailsLayout.setVerticalGroup(
            stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stay_detailsLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(room_type, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(61, 61, 61)
                .addGroup(stay_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estimate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estimate_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        cust_idSearch.setMinimumSize(new java.awt.Dimension(700, 700));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("Customer ID(starts 1001)");

        searchById.setFont(new java.awt.Font("Tahoma", 1, 14));
        searchById.setText("Search");
        searchById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdActionPerformed(evt);
            }
        });

        cust_table3.setFont(new java.awt.Font("Tahoma", 1, 14));
        cust_table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "ID", "City", "Room Type", "Check In", "Check Out"
            }
        ));
        cust_scrollpane4.setViewportView(cust_table3);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel24.setText("Enter Customer ID to Search :");

        javax.swing.GroupLayout cust_idSearchLayout = new javax.swing.GroupLayout(cust_idSearch.getContentPane());
        cust_idSearch.getContentPane().setLayout(cust_idSearchLayout);
        cust_idSearchLayout.setHorizontalGroup(
            cust_idSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cust_idSearchLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(cust_idSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cust_idSearchLayout.createSequentialGroup()
                        .addComponent(cust_scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(cust_idSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cust_idSearchLayout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addContainerGap())
                        .addGroup(cust_idSearchLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(70, 70, 70)
                            .addComponent(search_id_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addGap(108, 108, 108)
                            .addComponent(searchById, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(130, 130, 130)))))
        );
        cust_idSearchLayout.setVerticalGroup(
            cust_idSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cust_idSearchLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel24)
                .addGap(71, 71, 71)
                .addGroup(cust_idSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchById, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(search_id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(cust_scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        price_update.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel25.setText("Regular");

        reg_price.setText("7500");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel26.setText("Deluxe");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel27.setText("Deluxe+");

        deluxe_price.setText("8000");

        deluxe_plus_price.setText("8500");

        update_price_btn.setFont(new java.awt.Font("Tahoma", 1, 14));
        update_price_btn.setText("Update");
        update_price_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_price_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout price_updateLayout = new javax.swing.GroupLayout(price_update.getContentPane());
        price_update.getContentPane().setLayout(price_updateLayout);
        price_updateLayout.setHorizontalGroup(
            price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(price_updateLayout.createSequentialGroup()
                .addGroup(price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(price_updateLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addGap(133, 133, 133)
                        .addGroup(price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reg_price, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(deluxe_price)
                            .addComponent(deluxe_plus_price)))
                    .addGroup(price_updateLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(update_price_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        price_updateLayout.setVerticalGroup(
            price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(price_updateLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deluxe_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(price_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(deluxe_plus_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(update_price_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guestBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        guestBtn.setText("Guests");
        guestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestBtnActionPerformed(evt);
            }
        });

        mngrBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        mngrBtn.setText("Manager's Section");
        mngrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngrBtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel15.setText("Select User Category:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Welcom To Hotel Mount View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(guestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(mngrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel15)))
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel15)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mngrBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guestBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestBtnActionPerformed
Guestspage.setVisible(true);       
}//GEN-LAST:event_guestBtnActionPerformed

    private void stayDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stayDetailActionPerformed

        stay_details.setVisible(true);
}//GEN-LAST:event_stayDetailActionPerformed

    private void mngrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngrBtnActionPerformed
managerLogin.setVisible(true);     
}//GEN-LAST:event_mngrBtnActionPerformed

    private void bookRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomsActionPerformed
bookRoom.setVisible(true);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    Date date = new Date();
        String q=dateFormat.format(date);
        chk_in_txt.setText(q);
}//GEN-LAST:event_bookRoomsActionPerformed

    private void allBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBookingsActionPerformed
        DefaultTableModel model = (DefaultTableModel)cust_table.getModel();

        for( int i = model.getRowCount() - 1; i >= 0; i-- ) //Empty table
        {
        model.removeRow(i);
        }
        AllBookings.setVisible(true);
        AllBookings.setAlwaysOnTop(true);
            
        
try{
    Class.forName("java.sql.Driver");
    String uid= "root";
    String pwd = "";
    String compu="jdbc:mysql://localhost/hotel_manage";
    Connection con = DriverManager.getConnection(compu,uid,pwd);
    Statement stmt = con.createStatement();
    String query ="SELECT * from cust_detail;";
    ResultSet rs = stmt.executeQuery(query);

    while(rs.next())
    {

        String cust_id = rs.getString ("cust_id");
        String name = rs.getString("name");
        String id_proof =rs.getString("id_proof");
        String city = rs.getString("city");
        String room = rs.getString("room_type");
        String chk_in = rs.getString("chk_in");
        String chk_out = rs.getString("chk_out");

        model.addRow( new Object[] {cust_id, name, id_proof,city,room,chk_in,chk_out});
       
    }
 
    rs.close();
    stmt.close();
    con.close();
}
catch(Exception e) {
    JOptionPane.showMessageDialog(null,"Something went wrong");
}

}//GEN-LAST:event_allBookingsActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed


String pwd=new String (pass.getPassword());
String user=username.getText();
String user1="vikendu";
String pass1="montualert";

if(pwd.equals(pass1)&&user.equals(user1))
{
    ManagersSec.setVisible(true);
}
else{
        JOptionPane.showMessageDialog(null,"Incorrect Username or Password");

}
}//GEN-LAST:event_loginBtnActionPerformed

    private void searchVisistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVisistorActionPerformed
visitorInfo.setVisible(true);
}//GEN-LAST:event_searchVisistorActionPerformed

    private void searchBynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBynameActionPerformed
        String search = nameSearch_txt.getText();

        DefaultTableModel model = (DefaultTableModel)cust_table1.getModel();
try{
    Class.forName("java.sql.Driver");
    String uid= "root";
    String pwd = "";
    String compu="jdbc:mysql://localhost/hotel_manage";
    Connection con = DriverManager.getConnection(compu,uid,pwd);
    Statement stmt = con.createStatement();
    String query ="SELECT * from cust_detail where name='"+search+"';";
    ResultSet rs = stmt.executeQuery(query);

    while(rs.next())
    {

        String cust_id = rs.getString ("cust_id");
        String name = rs.getString("name");
        String id_proof =rs.getString("id_proof");
        String city = rs.getString("city");
        String room = rs.getString("room_type");
        String chk_in = rs.getString("chk_in");
        String chk_out = rs.getString("chk_out");

        model.addRow( new Object[] {cust_id, name, id_proof,city,room,chk_in,chk_out});

    }

    rs.close();
    stmt.close();
    con.close();
}
catch(Exception e) {
    JOptionPane.showMessageDialog(null,"Something went wrong");
}

}//GEN-LAST:event_searchBynameActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        String custID= custID_txt.getText();
          String cust_nam= cust_name_txt.getText();
            String id_type= ID_txt.getText();
              String city= city_txt.getText();
                String room_typ=(String)room_typelist.getSelectedItem();
                  String chkIn = chk_in_txt.getText();
                    String chkOut= chk_out_txt.getText();
if(custID.equals("")||cust_nam.equals("")||id_type.equals("")||city.equals("")||room_typ.equals("")||chkIn.equals("")||chkOut.equals(""))
{
    JOptionPane.showMessageDialog(null,"One or more entry is empty!");

}

else{
try{
    Class.forName("java.sql.Driver");
    String uid= "root";
    String pwd = "";
    String compu="jdbc:mysql://localhost/hotel_manage";
    Connection con = DriverManager.getConnection(compu,uid,pwd);
    Statement stmt = con.createStatement();
    String query = "insert into cust_detail values('"+custID+"','"+cust_nam+"','"+id_type+"','"+city+"','"+room_typ+"','"+chkIn+"','"+chkOut+"');" ;
    stmt.executeUpdate(query);

    JOptionPane.showMessageDialog(null,"Updated");

    stmt.close();
    con.close();

}
catch(Exception e) {
    JOptionPane.showMessageDialog(null,"Something went Wrong");
}
}
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdActionPerformed

     String search = search_id_txt.getText();

        DefaultTableModel model = (DefaultTableModel)cust_table3.getModel();
try{
    Class.forName("java.sql.Driver");
    String uid= "root";
    String pwd = "";
    String compu="jdbc:mysql://localhost/hotel_manage";
    Connection con = DriverManager.getConnection(compu,uid,pwd);
    Statement stmt = con.createStatement();
    String query ="SELECT * from cust_detail where cust_id='"+search+"';";
    ResultSet rs = stmt.executeQuery(query);

    while(rs.next())
    {

        String cust_id = rs.getString ("cust_id");
        String name = rs.getString("name");
        String id_proof =rs.getString("id_proof");
        String city = rs.getString("city");
        String room = rs.getString("room_type");
        String chk_in = rs.getString("chk_in");
        String chk_out = rs.getString("chk_out");

        model.addRow( new Object[] {cust_id, name, id_proof,city,room,chk_in,chk_out});

    }

    rs.close();
    stmt.close();
    con.close();
}
catch(Exception e) {
    JOptionPane.showMessageDialog(null,"e.getMessage");
}

}//GEN-LAST:event_searchByIdActionPerformed

    private void priceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBtnActionPerformed

        pricing.setVisible(true);

}//GEN-LAST:event_priceBtnActionPerformed

    private void regular_detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regular_detActionPerformed
room_details.setText("");
regular=Float.parseFloat(reg_price.getText());
room_details.setText("Single Bed \nAir Conditioned, Satellite TV,\nFully Equipped Bathroom\n@Rs. "+regular+" per night\n20% Discount For existing customers.");
  
}//GEN-LAST:event_regular_detActionPerformed

    private void deluxe_detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxe_detActionPerformed
        room_details.setText("");
deluxe=Float.parseFloat(deluxe_price.getText());
        room_details.setText("Twin Queen Sized Beds \nAir Conditioned, Satellite TV,\nFully Equipped Bathroom,\nMini Refigerator Equipped\nFree Gymnasium & Swimming pool Facility\n@Rs. "+deluxe+" per night\n20% Discount For existing customers.");

}//GEN-LAST:event_deluxe_detActionPerformed

    private void deluxeplus_detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deluxeplus_detActionPerformed
        room_details.setText("");
deluxe_plus=Float.parseFloat(deluxe_plus_price.getText());
        room_details.setText("Twin King Sized Beds \nAir Conditioned, Satellite TV,\nFully Equipped Bathroom,\nMini Refigerator Equipped,\nExcellent View of the beach,\nFree Gymnasium & Swimming pool Facility,\nPick and Drop from & to the airport\n@Rs. "+deluxe_plus+" per night\n20% Discount For existing customers.");

}//GEN-LAST:event_deluxeplus_detActionPerformed

    private void estimate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estimate_btnActionPerformed
        String a=(String)member.getSelectedItem();
        String b=(String)room_type.getSelectedItem();
        int days=Integer.parseInt(nights.getText());
        float total=0;
        if(a.equals("Yes"))
        {
            if(b.equals("Regular"))
            {
               total=    (float) ((regular-(.02 * regular) * days));
      
        }
            else if(b.equals("Deluxe"))
            {
               total=    (float) ((deluxe-(.02 * deluxe) * days));
        
        }
            else if(b.equals("Deluxe+"))
            {
               total=    (float) ((deluxe_plus-(.02 * deluxe_plus) * days));
            }
        }
            else if(a.equals("No"))
        {
            if(b.equals("Regular"))
            {
               total=(regular * days);

        }
            else if(b.equals("Deluxe"))
            {
               total= (deluxe * days);

        }
            else if(b.equals("Deluxe+"))
            {
               total= (deluxe_plus * days);
            }
        }
        estimate_fld.setText("Rs."+total);
}//GEN-LAST:event_estimate_btnActionPerformed

    private void hintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintBtnActionPerformed
       JOptionPane.showMessageDialog(null,"Call 911, Jump Out The Window \nDo A Somersault!");
}//GEN-LAST:event_hintBtnActionPerformed

    private void estimate_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estimate_fldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_estimate_fldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cust_idSearch.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
price_update.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void update_price_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_price_btnActionPerformed

        regular=Float.parseFloat(reg_price.getText());
        deluxe=Float.parseFloat(deluxe_price.getText());
        deluxe_plus=Float.parseFloat(deluxe_plus_price.getText());
 JOptionPane.showMessageDialog(null,"Updated Successfully");
        // TODO add your handling code here:
}//GEN-LAST:event_update_price_btnActionPerformed

    private void cust_tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cust_tableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cust_tableFocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AllBookings;
    private javax.swing.JFrame Guestspage;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JFrame ManagersSec;
    private javax.swing.JButton allBookings;
    private javax.swing.JFrame bookRoom;
    private javax.swing.JButton bookRooms;
    private javax.swing.JTextField chk_in_txt;
    private javax.swing.JTextField chk_out_txt;
    private javax.swing.JTextField city_txt;
    private javax.swing.JTextField custID_txt;
    private javax.swing.JFrame cust_idSearch;
    private javax.swing.JTextField cust_name_txt;
    private javax.swing.JScrollPane cust_scrollpane1;
    private javax.swing.JScrollPane cust_scrollpane2;
    private javax.swing.JScrollPane cust_scrollpane4;
    private javax.swing.JTable cust_table;
    private javax.swing.JTable cust_table1;
    private javax.swing.JTable cust_table3;
    private javax.swing.JButton deluxe_det;
    private javax.swing.JTextField deluxe_plus_price;
    private javax.swing.JTextField deluxe_price;
    private javax.swing.JButton deluxeplus_det;
    private javax.swing.JButton estimate_btn;
    private javax.swing.JTextField estimate_fld;
    private javax.swing.JButton guestBtn;
    private javax.swing.JButton hintBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JFrame managerLogin;
    private javax.swing.JComboBox member;
    private javax.swing.JButton mngrBtn;
    private javax.swing.JTextField nameSearch_txt;
    private javax.swing.JTextField nights;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton priceBtn;
    private javax.swing.JFrame price_update;
    private javax.swing.JFrame pricing;
    private javax.swing.JTextField reg_price;
    private javax.swing.JButton regular_det;
    private javax.swing.JTextArea room_details;
    private javax.swing.JComboBox room_type;
    private javax.swing.JComboBox room_typelist;
    private javax.swing.JButton searchById;
    private javax.swing.JButton searchByname;
    private javax.swing.JButton searchVisistor;
    private javax.swing.JTextField search_id_txt;
    private javax.swing.JButton stayDetail;
    private javax.swing.JFrame stay_details;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton update_price_btn;
    private javax.swing.JTextField username;
    private javax.swing.JFrame visitorInfo;
    // End of variables declaration//GEN-END:variables

}
