package org.firstinspires.ftc.teamcode.fissionlib.util;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.fissionlib.input.FoozPad;


/**
 * Mechanism is an abstract class for all mechanisms on a robot. It contains methods and/or instance
 * variables common to all mechanisms.
 *
 * All robot mechanisms, including the main hardware map, should extend this abstract class.
 *
 * @version 1.0
 * @since 1.0.0-alpha
 *
 * @author Paul Serbanescu (paulserbanescu3@gmail.com)
 */
public abstract class Mechanism {

    /**
     * OpMode context for a Mechanism class.
     */
    protected OpMode opMode;

    /**
     * Initializes hardware on the robot. Gets and stores references to the robot configuration and
     * sets motors and servos to their starting positions.
     *
     * @param hwMap robot's hardware map
     */
    public abstract void init(HardwareMap hwMap);

    /**
     * Manages gamepad inputs and their corresponding mechanism response
     *
     * Implement when using only one gamepad, in slot 1
     * @param gamepad
     */
    public void loop(FoozPad gamepad) { }

    /**
     * Manages multiple gamepad inputs and their corresponding mechanism responses
     *
     * Implement when using two gamepads
     * @param gamepad1
     * @param gamepad2
     */
    public void loop(FoozPad gamepad1, FoozPad gamepad2) { }

    /**
     * Manages all telemetry data to driver phone or FTC Dashboard
     *
     * Where all telemetry.addData() calls should go
     * @param telemetry
     */
    public void telemetry(Telemetry telemetry) { }

}

