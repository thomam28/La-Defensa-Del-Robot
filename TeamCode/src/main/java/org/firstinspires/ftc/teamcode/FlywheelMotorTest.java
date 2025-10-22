package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class FlywheelMotorTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor a = hardwareMap.dcMotor.get("a");
        DcMotor b = hardwareMap.dcMotor.get("b");

        a.setDirection(DcMotorSimple.Direction.FORWARD);
        b.setDirection(DcMotorSimple.Direction.REVERSE);
        while(opModeIsActive()){
            a.setPower(1);
            b.setPower(1);
        }
    }
}