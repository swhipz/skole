package forms;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class box_Start extends JFrame {

    private JPanel mainPanel;
    private JTextField textField1;
    private JButton lagreButton;
    private JCheckBox jobbetIDagCheckBox;
    private JCheckBox trentStyrkeIDagCheckBox;
    private JCheckBox kreatinCheckBox;

    public box_Start(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        if (lagreButton.is
        if (jobbetIDagCheckBox.isSelected()) {
            System.out.println("Jeg har jobbet idag, og kan derfor trekke fra omlag 400 kcal fra dagens regnestykke");

        } else {
            System.out.println("Ingen jobb i dag, ingen penger i dag");
        }

        if (trentStyrkeIDagCheckBox.isSelected()) {
            System.out.println("Jeg har trent i dag, trekk derfor ifra 200 kcal fra dagens regnestykke");

        } else {
            System.out.println("Ingen trening, ingen mening.");

        }
        if (kreatinCheckBox.isSelected()) {
            System.out.println("På kreatin blir du fin!");

        } else {
            System.out.println("ingen kreatin og derfor er ikke dagen din?");
        }
        /// write new file for data
        try {
            File myObj = new File("Kaloridata");
            if (myObj.createNewFile()) {
                System.out.println("New file created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error, check trace");
            e.printStackTrace();
        }

    }




}
