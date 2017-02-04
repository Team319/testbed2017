// Strong Hold BOB 2016 Commands (Collect and Load)

package org.usfirst.frc319.testbed2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/*import org.usfirst.frc319.commands.collector.CenterBoulder;
import org.usfirst.frc319.commands.collector.CollectAndStop;
import org.usfirst.frc319.commands.collector.CollectorIn;
import org.usfirst.frc319.commands.collector.CollectorInUntilBallIsGone;
import org.usfirst.frc319.commands.collector.LoadBoulder;
import org.usfirst.frc319.commands.shooter.*;*/
import org.usfirst.frc319.testbed2017.subsystems.*;
import org.usfirst.frc319.testbed2017.commands.*;
import org.usfirst.frc319.testbed2017.*;


/**
 *
 */
public class SpeedUpThenShoot extends CommandGroup {

    public SpeedUpThenShoot() {
    	addSequential(new PIDVelocityMotorGo());
    	addSequential(new PIDVelocityElevatorGo());

    	/*addSequential(new LoadBoulder());
    	addSequential(new ShooterSpeedUp());
    	addParallel(new ShooterSpeedUp());
    	addSequential(new CollectorInUntilBallIsGone());
 */
    } 
    
}
