package org.firstinspires.ftc.teamcode.Subsystem.Swerve;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class DiffyPod {
    DcMotorEx topMotor, downMotor;
    DcMotorEx encoder;

    double desiredPodAngle;

    public DiffyPod(DcMotorEx topMotor, DcMotorEx downMotor, DcMotorEx encoder) {
        this.topMotor = topMotor;
        this.downMotor = downMotor;
        this.encoder = encoder;
    }

    public double getPodAngle(){
        return (double) (encoder.getCurrentPosition() * 360) / 4096;
    }
    public double getPodAngleRad(){
        return Math.toRadians(getPodAngle());
    }

    public void setPodAngle(double desiredPodAngle) {
        this.desiredPodAngle = desiredPodAngle;
    }

    public void update(){
        double error = desiredPodAngle - getPodAngle();
        
    }
}