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

            /*if(gamepad1.left_bumper || gamepad1.right_bumper) {
                turn();
            }*/

            if(gamepad1.left_bumper){
                FLW.setPower(-1);
                FRW.setPower(1);
                BLW.setPower(-1);
                BRW.setPower(1);
            } else if (gamepad1.right_bumper){
                FLW.setPower(1);
                FRW.setPower(-1);
                BLW.setPower(1);
                BRW.setPower(-1);
            } else {
                disablePower();
            }

            telemetry.update();
        }
    }
}