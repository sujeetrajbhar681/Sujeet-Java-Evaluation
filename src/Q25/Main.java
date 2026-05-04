package Q25;

import java.awt.FlowLayout;
import javax.swing.*;

class Master extends JFrame {
    JMenu home, doctor, patient, accounts, billing;
    JMenuItem aboutUs, service, location, exit;
    JMenuItem docInfo, docReg, docPay;
    JMenuItem patDetail, patBill, patReg;
    JMenuItem gst, ngo;
    JMenuItem accPay;

    public Master() {
        setTitle("Master Page");
        setLayout(new FlowLayout());

        JMenuBar mb = new JMenuBar();

        home = new JMenu("HOME");
        aboutUs = new JMenuItem("About Us");
        service = new JMenuItem("Service");
        location = new JMenuItem("Location");
        exit = new JMenuItem("Exit");
        home.add(aboutUs);
        home.add(service);
        home.add(location);
        home.add(exit);

        doctor = new JMenu("DOCTOR");
        docInfo = new JMenuItem("Doctor Info");
        docReg = new JMenuItem("Doctor Registration");
        docPay = new JMenuItem("Payment");
        doctor.add(docInfo);
        doctor.add(docReg);
        doctor.add(docPay);

        patient = new JMenu("PATIENT");
        patDetail = new JMenuItem("Patient Detail");
        patBill = new JMenu("Billing");
        gst = new JMenuItem("With GST");
        ngo = new JMenuItem("NGO");
        patBill.add(gst);
        patBill.add(ngo);
        patReg = new JMenuItem("Registration");
        patient.add(patDetail);
        patient.add(patBill);
        patient.add(patReg);

        accounts = new JMenu("ACCOUNTS");
        accPay = new JMenuItem("Payment Details");
        accounts.add(accPay);

        mb.add(home);
        mb.add(doctor);
        mb.add(patient);
        mb.add(accounts);

        setJMenuBar(mb);
        setSize(500, 400);
        setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        new Master();
    }
}

