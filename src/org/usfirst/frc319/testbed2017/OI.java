// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc319.testbed2017;

import org.usfirst.frc319.testbed2017.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton xButton;
    public JoystickButton aButton;
    public JoystickButton bButton;
    public JoystickButton yButton;
    public JoystickButton rightBumper;
    public JoystickButton leftBumper;
    public Joystick xBoxController;
  
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xBoxController = new Joystick(0);
        
        yButton = new JoystickButton(xBoxController, 4);
        yButton.whenPressed(new PIDVelocityMotorGo());
        bButton = new JoystickButton(xBoxController, 2);
        bButton.whenPressed(new ShooterAndElevatorStop());
        aButton = new JoystickButton(xBoxController, 1);
        aButton.whenPressed(new ShooterForward());
        xButton = new JoystickButton(xBoxController, 3);
        xButton.whenPressed(new ShiftToggle()); // was CollectorGo
        leftBumper = new JoystickButton(xBoxController, 5);
        leftBumper.whenPressed(new PIDVelocityElevatorGo());
        rightBumper = new JoystickButton(xBoxController, 6);
        rightBumper.whenPressed(new PIDVelocityElevatorStop());
        


        // SmartDashboard Buttons
       // SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        //SmartDashboard.putData("CollectorGo", new CollectorGo());
      //  SmartDashboard.putData("CollectorStop", new CollectorStop());
       // SmartDashboard.putData("CommandOther1", new CommandOther1());
        //SmartDashboard.putData("CommandOther2", new CommandOther2());
        //SmartDashboard.putData("TimedCommandExample", new TimedCommandExample());
        //SmartDashboard.putData("InstantCommandExample", new InstantCommandExample());
        //SmartDashboard.putData("Joystickdrive", new Joystickdrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxBoxController() {
        return xBoxController;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
