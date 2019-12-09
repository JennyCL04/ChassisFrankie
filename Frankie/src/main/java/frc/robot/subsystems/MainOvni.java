/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.GetDown;

/**
 * Add your docs here.
 */
public class MainOvni extends Subsystem {

  DoubleSolenoid solenoid;
  Talon ovniMotor;
  

  public  MainOvni() {
    solenoid = new DoubleSolenoid(RobotMap.OVNI_SOLENOID[0], RobotMap.OVNI_SOLENOID[1] ); 
    ovniMotor = new Talon(RobotMap.OVNI_MOTOR);
     }

    
    
   public void RiseUp(){
      solenoid.set(Value.kForward);
    }

   public void GetDown(){
         solenoid.set(Value.kReverse);
    }


       

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
