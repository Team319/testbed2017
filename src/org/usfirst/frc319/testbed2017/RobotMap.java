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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
 
    public static CANTalon testbedtalon0;
    public static CANTalon testbedtalon1;
    public static CANTalon testbedtalon2;
    public static CANTalon drivetrainleftFollow3;
    public static CANTalon drivetrainleftLead4;
    public static CANTalon drivetrainrightLead5;
    public static CANTalon drivetrainrightFollow6;
    public static CANTalon testbedtalon7;
    public static CANTalon testbedtalon8;
    public static CANTalon testbedtalon9;
    public static Compressor compressor;
    public static DoubleSolenoid drivetrainShifter;

   
    public static RobotDrive drivetrainarcadedrive;

  
    public static void init() {
    	
    	// --Drivetrain--
    	
    	drivetrainleftFollow3 = new CANTalon(3); 
    	drivetrainleftLead4 = new CANTalon(4);
    	drivetrainrightLead5 = new CANTalon(5);
        drivetrainrightFollow6 = new CANTalon(6);
        
        drivetrainShifter = new DoubleSolenoid(0, 0, 1);
        compressor = new Compressor(0);
       
      
         
         drivetrainarcadedrive = new RobotDrive(drivetrainleftLead4, drivetrainrightLead5);
       
         
    	
    	//--Misc--
         
        testbedtalon0 = new CANTalon(0);
        testbedtalon1 = new CANTalon(1);
        testbedtalon2 = new CANTalon(2);
        testbedtalon7 = new CANTalon(7);
        testbedtalon8 = new CANTalon(8);
        testbedtalon9 = new CANTalon(9);

      
        
       
       
        drivetrainarcadedrive.setSafetyEnabled(true);
        drivetrainarcadedrive.setExpiration(0.1);
        drivetrainarcadedrive.setSensitivity(0.5);
        drivetrainarcadedrive.setMaxOutput(1.0);

        //drivetrainarcadedrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
