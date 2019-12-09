/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Talon; 

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Drive;




/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  Talon leftTalon1;
  Talon leftTalon2;
  Talon rightTalon1;
  Talon rightTalon2;
  Talon ovniMotor; 

  
  public DriveTrain(){
    leftTalon1 = new Talon(RobotMap.LEFT_TALON1);
    leftTalon2 = new Talon(RobotMap.LEFT_TALON2);
    rightTalon1 = new Talon(RobotMap.RIGHT_TALON1);
    rightTalon2 = new Talon(RobotMap.RIGHT_TALON2);
    ovniMotor = new Talon (RobotMap.OVNI_MOTOR);
  }

  public void drive(double y, double x){
    double leftPower = -y -x ; 
    double rightPower = y -x ;
    leftTalon1.set(leftPower);
    leftTalon2.set(leftPower);
    rightTalon1.set(-rightPower);
    rightTalon2.set(rightPower);
  }
  public void driveOvni(){
    
  }


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Drive());
  }
}
