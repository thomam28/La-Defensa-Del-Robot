package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.Movable;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class WuBotRevived extends Movable {
    @Override
    public void runOpMode() throws InterruptedException {
        super.runOpMode();

        FLW.setDirection(DcMotorSimple.Direction.FORWARD);
        FRW.setDirection(DcMotorSimple.Direction.REVERSE);
        BLW.setDirection(DcMotorSimple.Direction.FORWARD);
        BRW.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive()){
            telemetry.addData("Status:", "Running");

            omnidirectionalMovement(gamepad1.left_stick_x, gamepad1.left_stick_y);
            turn();

            telemetry.update();
        }
    }
}