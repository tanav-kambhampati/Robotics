// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {

  private final DifferentialDrive differentialDrive;

  WPI_TalonSRX m_leftFront = new WPI_TalonSRX(Constants.Drivetrain.leftFront);
  WPI_TalonSRX m_leftBack = new WPI_TalonSRX(Constants.Drivetrain.leftBack);
  WPI_TalonSRX m_rightFront = new WPI_TalonSRX(Constants.Drivetrain.rightFront);
  WPI_TalonSRX m_rightBack = new WPI_TalonSRX(Constants.Drivetrain.rightBack);

  MotorControllerGroup m_right = new MotorControllerGroup(m_leftFront, m_leftBack);
  MotorControllerGroup m_left = new MotorControllerGroup(m_rightFront, m_rightBack);

  public Drivetrain(){
    m_right.setInverted(true);
    m_right.setInverted(false);
  }

  differentialDrive = new DifferentialDrive(m_left, m_right);
  
  public void arcadeDrive(double speed, double rotation) {
    differentialDrive.arcadeDrive(speed, rotation);  
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {
    differentialDrive.tankDrive(leftSpeed, rightSpeed);
  }

  public void stop{
    differentialDrive.stopMotor();
  }

}