package org.crosspointacademy

import edu.wpi.first.wpilibj.DoubleSolenoid
import edu.wpi.first.wpilibj.PneumaticsModuleType

object Pneumatics {

    private val solenoid = DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1)

    fun push() {
        solenoid.set(DoubleSolenoid.Value.kForward)
    }

    fun pull() {
        solenoid.set(DoubleSolenoid.Value.kReverse)
    }

    fun off() {
        solenoid.set(DoubleSolenoid.Value.kOff)
    }

}