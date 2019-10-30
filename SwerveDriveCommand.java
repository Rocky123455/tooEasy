/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class ExampleCommand extends Command {
  private SwerveSubSystem m_subsystem;
  public ExampleCommand(SwerveSubsystem subsystem) {
    this.m_subsystem = subsystem;
    // Use requires() here to declare subsystem dependencies
    requires(SwerveSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    DriverStation,reportWarning("initializing ",false)
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    m_subsystem.drive(OI.xboxController.getRawAxis(OI.LEFT_STICK_X),OI.xboxController.getRawAxis(OI.LEFT_STICK_Y),OI.xboxController.getRawAxis(OI.RIGHT_STICK_X));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }
}
