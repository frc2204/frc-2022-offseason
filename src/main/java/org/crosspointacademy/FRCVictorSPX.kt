package org.crosspointacademy

import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.VictorSPX
import edu.wpi.first.wpilibj.motorcontrol.MotorController

class FRCVictorSPX(port: Int, private val multiplier: Double = 1.0): MotorController {

    private val victor = VictorSPX(port)

    private var disabled = false
    private var victorSpeed = 0.0
    private var victorInverted = false

    /**
     * Common interface for setting the speed of a motor controller.
     *
     * @param speed The speed to set. Value should be between -1.0 and 1.0.
     */
    override fun set(speed: Double) {
        if (disabled) return
        val co = if (victorInverted) 1.0 else -1.0
        victorSpeed = co * speed * multiplier

        victor.set(ControlMode.PercentOutput, victorSpeed)
    }

    /**
     * Common interface for getting the current set speed of a motor controller.
     *
     * @return The current set speed. Value is between -1.0 and 1.0.
     */
    override fun get(): Double {
        return victorSpeed
    }

    /**
     * Common interface for inverting direction of a motor controller.
     *
     * @param isInverted The state of inversion true is inverted.
     */
    override fun setInverted(isInverted: Boolean) {
        victorInverted = !isInverted
    }

    /**
     * Common interface for returning if a motor controller is in the inverted state or not.
     *
     * @return isInverted The state of the inversion true is inverted.
     */
    override fun getInverted(): Boolean {
        return victorInverted
    }

    /** Disable the motor controller.  */
    override fun disable() {
        set(0.0)
        disabled = true
    }

    /**
     * Stops motor movement. Motor can be moved again by calling set without having to re-enable the
     * motor.
     */
    override fun stopMotor() {
        set(0.0)
    }

}