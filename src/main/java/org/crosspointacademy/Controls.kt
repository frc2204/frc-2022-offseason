package org.crosspointacademy

import edu.wpi.first.wpilibj.Joystick

object Controls {

    private val driveJoystick = Joystick(0)
    val j1x get() = driveJoystick.x
    val j1y get() = driveJoystick.y

    private val rotationJoystick = Joystick(1)
    val r1y get() = rotationJoystick.y

}