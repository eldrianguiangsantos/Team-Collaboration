package incident;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.WindowConstants;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccidentForm extends JFrame {
	
	private Accident accident; // Instance of Accident class

    public AccidentForm() {
        initComponents();
        accident = new Accident(); // Create an instance of Accident
        id = ++lastID; // Increment lastID and assign it to id
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
   public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login_system","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccidentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccidentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    
    
    private void initComponents() {
    	
    	
    	
 
        // Create the labels
        JLabel dateLabel = new JLabel("Date (mm-dd-yyyy):");
        JLabel accidentTypeLabel = new JLabel("Type of Accident:");
        JLabel accidentNatureLabel = new JLabel("Nature of Accident:");
        JLabel accidentCauseLabel = new JLabel("Cause of Accident:");
        JLabel timeReportedLabel = new JLabel("Time Reported:");
        JLabel timeResponseLabel = new JLabel("Response Time:");
        JLabel timeArrivedLabel = new JLabel("Time Arrived:");
        JLabel timeShiftLabel = new JLabel("Shift Time:");
        JLabel dayLabel = new JLabel("Day:");
        JLabel plazaLabel = new JLabel("Plaza:");
        JLabel exactLocationLabel = new JLabel("Exact Location");
        JLabel nbLabel = new JLabel("Location Between NB:");
        JLabel sbLabel = new JLabel("Location Between SB:");
        JLabel laneLabel = new JLabel("Lane Occupied:");
        JLabel vehicleLabel = new JLabel("Vehicle:");
        JLabel plateNumLabel = new JLabel("Plate Number:");
        JLabel driverNameLabel = new JLabel("Driver Name:");
        JLabel driverAgeLabel = new JLabel("Driver Age:");
        JLabel driverLicenseNumberLabel = new JLabel("Driver License Number:");
        JLabel minorCasualtyLabel = new JLabel("Minor Casualty:");
        JLabel majorCasualtyLabel = new JLabel("Major Casualty:");
        JLabel numInjuriesLabel = new JLabel("Number of Injuries:");
        JLabel numFatalLabel = new JLabel("Number of Fatal:");
        JLabel dtpVehicleLabel = new JLabel("DTP to Vehicle:");
        JLabel dtpTplexLabel = new JLabel("DTP to TPLEX:");
        JLabel detailsLabel = new JLabel("Other Details:");
        JLabel weekLabel = new JLabel("Week:");
        JLabel idLabel = new JLabel("ID:");
        JLabel idValueLabel = new JLabel(String.valueOf(id));


 

        // Create the text fields
        JTextField dateTextField = new JTextField();
        JTextField accidentTypeTextField = new JTextField();
        JTextField accidentNatureTextField = new JTextField();
        JTextField accidentCauseTextField = new JTextField();
        JTextField timeReportedTextField = new JTextField();
        JTextField timeResponseTextField = new JTextField();
        JTextField timeArrivedTextField = new JTextField();
        JTextField timeShiftTextField = new JTextField();
        JTextField dayTextField = new JTextField();
        JTextField plazaTextField = new JTextField();
        JTextField exactLocationTextField = new JTextField();
        JTextField nbTextField = new JTextField();
        JTextField sbTextField = new JTextField();
        JTextField laneTextField = new JTextField();
        JTextField vehicleTextField = new JTextField();
        JTextField plateNumTextField = new JTextField();
        JTextField driverNameTextField = new JTextField();
        JTextField driverAgeTextField = new JTextField();
        JTextField driverLicenseNumberTextField = new JTextField();
        JTextField minorCasualtyTextField = new JTextField();
        JTextField majorCasualtyTextField = new JTextField();
        JTextField numInjuriesTextField = new JTextField();
        JTextField numFatalTextField = new JTextField();
        JTextField dtpVehicleTextField = new JTextField();
        JTextField dtpTplexTextField = new JTextField();
        JTextField detailsTextField = new JTextField();
        JTextField weekTextField = new JTextField();
        JButton submitButton = new JButton("Submit");
        
        SwingUtilities.updateComponentTreeUI(this);


        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	
            	
            
                // Handle the submit button action
                // Retrieve values from form fields
            	
                String date = dateTextField.getText();
                String typeOfAccident = accidentTypeTextField.getText();
                String natureOfAccident = accidentNatureTextField.getText();
                String causeOfAccident = accidentCauseTextField.getText();
                String timeReported = timeReportedTextField.getText();
                String responseTime = timeResponseTextField.getText();
                String timeArrived = timeArrivedTextField.getText();
                String shiftTime = timeShiftTextField.getText();
                String day = dayTextField.getText();
                String plaza = plazaTextField.getText();
                String exactLocation = exactLocationTextField.getText();
                String locationBetweenNB = nbTextField.getText();
                String locationBetweenSB = sbTextField.getText();
                String laneOccupied = laneTextField.getText();
                String vehicle = vehicleTextField.getText();
                String plateNumber = plateNumTextField.getText();
                String driverName = driverNameTextField.getText();
                String driverAge = driverAgeTextField.getText();
                String driverLicenseNumber = driverLicenseNumberTextField.getText();
                String minorCasualty = minorCasualtyTextField.getText();
                String majorCasualty = majorCasualtyTextField.getText();
                //int numberOfInjuries = Integer.parseInt(numInjuriesTextField.getText());
                //int numberOfFatal = Integer.parseInt(numFatalTextField.getText());;
                String dtpToVehicle = dtpVehicleTextField.getText();
                String dtpToTplex = dtpTplexTextField.getText();
                String otherDetails = detailsTextField.getText();
                String week = weekTextField.getText();
                
                
                //ChatGPT
                String numInjuriesText = numInjuriesTextField.getText();
                String numFatalText = numFatalTextField.getText();

                int numberOfInjuries = 0;
                int numberOfFatal = 0;

                if (!numInjuriesText.isEmpty()) {
                    numberOfInjuries = Integer.parseInt(numInjuriesText);
                }

                if (!numFatalText.isEmpty()) {
                    numberOfFatal = Integer.parseInt(numFatalText);
                }
                
                //Exceptions
          

                // Retrieve other form field values as needed

                // Set the values in the Accident instance
                accident.setDate(date);
                accident.setTypeOfAccident(typeOfAccident);
                accident.setNatureOfAccident(natureOfAccident);
                accident.setCauseOfAccident(causeOfAccident);
                accident.setTimeReported(timeReported);
                accident.setResponseTime (responseTime);
                accident.setTimeArrived (timeArrived);
                accident.setShiftTime(shiftTime);
                accident.setDay(day);
                accident.setPlaza(plaza);
                accident.setExactLocation(exactLocation);
                accident.setLocationBetweenNB(locationBetweenNB);
                accident.setLocationBetweenSB(locationBetweenSB);
                accident.setLaneOccupied(laneOccupied);
                accident.setVehicle(vehicle);
                accident.setPlateNumber(plateNumber);
                accident.setDriverName(driverName);
                accident.setDriverAge(driverAge);
                accident.setDriverLicenseNumber(driverLicenseNumber);
                accident.setNumberOfInjuries(numberOfInjuries);
                accident.setNumberOfFatal(numberOfFatal);
                accident.setMinorCasualty(minorCasualty);
                accident.setMajorCasualty(majorCasualty);
                accident.setDtpToVehicle(dtpToVehicle);
                accident.setDtpToTplex(dtpToTplex);
                accident.setOtherDetails(otherDetails);
                accident.setWeek(week);
                
                // Set other values in the Accident instance as needed

                // Display the Accident instance or perform further actions
                System.out.println(accident); // Example: Print the Accident instance
                System.out.println(id); // Example: Print the Accident instance
            }
            
        });
    


 

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window
        // Set the preferred size of the JFrame
        setPreferredSize(new Dimension(800, 600));
        
        // Create the content panel
        JPanel contentPanel = new JPanel();
        GroupLayout layout = new GroupLayout(contentPanel);
        contentPanel.setLayout(layout);

 

        // Auto-create gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
     // Create a separate panel for the submit button
        JPanel buttonPanel = new JPanel();
        FlowLayout buttonLayout = new FlowLayout(FlowLayout.CENTER);
        buttonPanel.setLayout(buttonLayout);
        buttonPanel.add(submitButton);

        // Set the horizontal layout
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addComponent(idLabel)
            	        	
                .addComponent(dateLabel)
                .addComponent(accidentTypeLabel)
                .addComponent(accidentNatureLabel)
    	        .addComponent(accidentCauseLabel)
    	        .addComponent(timeReportedLabel)
    	        .addComponent(timeResponseLabel)
    	        .addComponent(timeArrivedLabel)
    	        .addComponent(timeShiftLabel)
    	        .addComponent(dayLabel)
    	        .addComponent(plazaLabel)
    	        .addComponent(exactLocationLabel)
    	        .addComponent(nbLabel)
    	        .addComponent(sbLabel)
    	        .addComponent(laneLabel)
    	        .addComponent(vehicleLabel)
    	        .addComponent(plateNumLabel)
    	        .addComponent(driverNameLabel)
    	        .addComponent(driverAgeLabel)
    	        .addComponent(driverLicenseNumberLabel)
    	        .addComponent(minorCasualtyLabel)
    	        .addComponent(majorCasualtyLabel)
    	        .addComponent(numInjuriesLabel)
    	        .addComponent(numFatalLabel)
    	        .addComponent(dtpVehicleLabel)
    	        .addComponent(dtpTplexLabel)
    	        .addComponent(detailsLabel)
    	        .addComponent(weekLabel)

    	


            )
             .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            	.addComponent(idValueLabel)
                .addComponent(dateTextField)
                .addComponent(accidentTypeTextField)
                .addComponent(accidentNatureTextField)
    	        .addComponent(accidentCauseTextField)
    	        .addComponent(timeReportedTextField)
    	        .addComponent(timeResponseTextField)
    	        .addComponent(timeArrivedTextField)
    	        .addComponent(timeShiftTextField)
    	        .addComponent(dayTextField)
    	        .addComponent(plazaTextField)
    	        .addComponent(exactLocationTextField)
    	        .addComponent(nbTextField)
    	        .addComponent(sbTextField)
    	        .addComponent(laneTextField)
    	        .addComponent(vehicleTextField)
    	        .addComponent(plateNumTextField)
    	        .addComponent(driverNameTextField)
    	        .addComponent(driverAgeTextField)
    	        .addComponent(driverLicenseNumberTextField)
    	        .addComponent(minorCasualtyTextField)
    	        .addComponent(majorCasualtyTextField)
    	        .addComponent(numInjuriesTextField)
    	        .addComponent(numFatalTextField)
    	        .addComponent(dtpVehicleTextField)
    	        .addComponent(dtpTplexTextField)
    	        .addComponent(detailsTextField)
    	        .addComponent(weekTextField)
    	        
    	       

            ))
        	    .addComponent(buttonPanel) // Add the button panel
        );

        // Set the vertical layout
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                	    .addComponent(idLabel)
                	    .addComponent(idValueLabel)
            )

            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(dateLabel)
                .addComponent(dateTextField)
            )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(accidentTypeLabel)
                .addComponent(accidentTypeTextField)
            )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(accidentNatureLabel)
                    .addComponent(accidentNatureTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(accidentCauseLabel)
                    .addComponent(accidentCauseTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(timeReportedLabel)
                    .addComponent(timeReportedTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(timeResponseLabel)
                    .addComponent(timeResponseTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(timeArrivedLabel)
                    .addComponent(timeArrivedTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(timeShiftLabel)
                    .addComponent(timeShiftTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(dayTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(plazaLabel)
                    .addComponent(plazaTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(exactLocationLabel)
                    .addComponent(exactLocationTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nbLabel)
                    .addComponent(nbTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(sbLabel)
                    .addComponent(sbTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(laneLabel)
                    .addComponent(laneTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleLabel)
                    .addComponent(vehicleTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(plateNumLabel)
                    .addComponent(plateNumTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(driverNameLabel)
                    .addComponent(driverNameTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(driverAgeLabel)
                    .addComponent(driverAgeTextField)
                )

            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(driverLicenseNumberLabel)
                    .addComponent(driverLicenseNumberTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(minorCasualtyLabel)
                    .addComponent(minorCasualtyTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(majorCasualtyLabel)
                    .addComponent(majorCasualtyTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(numInjuriesLabel)
                    .addComponent(numInjuriesTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(numFatalLabel)
                    .addComponent(numFatalTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(dtpVehicleLabel)
                    .addComponent(dtpVehicleTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(dtpTplexLabel)
                    .addComponent(dtpTplexTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsLabel)
                    .addComponent(detailsTextField)
                )
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(weekLabel)
                    .addComponent(weekTextField)
                )
            // ... (add other label and text field pairs here)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonPanel) // Add the button panel
            

        );
        
        
     // Create the scroll pane and add the content panel to it
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(scrollPane);
        
        pack();
        
        // Set the location of the JFrame to the center of the screen
        setLocationRelativeTo(null);
    }

    
    

    public static void main(String[] args) {
    	try {
    	    // Set Nimbus look and feel
    	    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
    	    ex.printStackTrace();
    	}

    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccidentForm accidentForm = new AccidentForm();
                accidentForm.setExtendedState(JFrame.MAXIMIZED_BOTH);
                accidentForm.setVisible(true);
            }
    	});
    }
    
    private int id;
    private static int lastID = 0;

}