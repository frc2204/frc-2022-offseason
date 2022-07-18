package org.crosspointacademy

import edu.wpi.first.wpilibj.drive.MecanumDrive

object Drive {

    private val topLeftVictor = FRCVictorSPX(Constants.topLeft)
    private val topRightVictor = FRCVictorSPX(Constants.topRight, 1.6)
    val bottomLeftVictor = FRCVictorSPX(Constants.bottomLeft)
    val bottomRightVictor  = FRCVictorSPX(Constants.bottomRight)

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