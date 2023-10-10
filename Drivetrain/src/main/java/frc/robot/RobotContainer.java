// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer{

  private final XboxController driverController;


    public RobotContainer() {
        driverController = new XboxController(0); 
    }
    
    public double getLeftJoystickY() {
      return driverController.getY(Hand.kLeft);
    }

    public double getRightJoystickY() {
          return driverController.getY(Hand.kRight);
    }
}

