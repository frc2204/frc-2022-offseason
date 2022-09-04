package org.crosspointacademy

import edu.wpi.first.wpilibj.TimedRobot

/**
 * The VM is configured to automatically run this object (which basically functions as a singleton class),
 * and to call the functions corresponding to each mode, as described in the TimedRobot documentation.
 * This is written as an object rather than a class since there should only ever be a single instance, and
 * it cannot take any constructor arguments. This makes it a natural fit to be an object in Kotlin.
 *
 * If you change the name of this object or its package after creating this project, you must also update
 * the `Main.kt` file in the project. (If you use the IDE's Rename or Move refactorings when renaming the
 * object or package, it will get changed everywhere.)
 */
object Robot : TimedRobot()
{
    override fun robotInit() {
        Drive.bottomLeftVictor.inverted = true
        Drive.bottomRightVictor.inverted = true
    }

    override fun robotPeriodic() {}

    override fun autonomousInit() {}

    override fun autonomousPeriodic() {}

    override fun teleopInit() {}

    override fun teleopPeriodic() {
        Drive.drive(-Controls.j1y, -Controls.j1x, Controls.r1x)

        if (Controls.pull) Pneumatics.pull() else if (Controls.push) Pneumatics.push() else Pneumatics.off()
    }

    override fun disabledInit() {}

    override fun disabledPeriodic() {}

    override fun testInit() {}

    override fun testPeriodic() {}

}