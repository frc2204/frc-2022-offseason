package org.crosspointacademy

import com.ctre.phoenix.motorcontrol.can.TalonFX
import com.ctre.phoenix.motorcontrol.can.VictorSPX
import edu.wpi.first.wpilibj.drive.MecanumDrive
import edu.wpi.first.wpilibj.motorcontrol.VictorSP

object Drive {

    private val topLeftVictor = FRCVictorSPX(Constants.topLeft)
    private val topRightVictor = FRCVictorSPX(Constants.topRight)
    private val bottomLeftVictor = FRCVictorSPX(Constants.bottomLeft)
    private val bottomRightVictor  = FRCVictorSPX(Constants.bottomRight)

    private val drive = MecanumDrive(
        topLeftVictor,
        topRightVictor,
        bottomLeftVictor,
        bottomRightVictor
    )

    fun drive(x: Double, y: Double, rotation: Double) {
        drive.driveCartesian(x, y, rotation)
    }

}