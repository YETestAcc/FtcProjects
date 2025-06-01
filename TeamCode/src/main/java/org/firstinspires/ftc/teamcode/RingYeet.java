package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp //(name = "ringyeet (Blocks to Java)")
public class RingYeet extends LinearOpMode {

    private DcMotor RingYeetMotor;
    private DcMotor MainIntake;
    private DcMotor CounterspinMotor;
    private DcMotor biggearslowMotor;

    @Override
    public void runOpMode() {
        RingYeetMotor = hardwareMap.get(DcMotor.class, "Ring Yeet Motor");
        MainIntake = hardwareMap.get(DcMotor.class, "Main Intake");
        CounterspinMotor = hardwareMap.get(DcMotor.class, "Counter spin Motor");
        biggearslowMotor = hardwareMap.get(DcMotor.class, "big gear slow Motor");

        waitForStart();
        if (opModeIsActive()) {
            RingYeetMotor.setDirection(DcMotor.Direction.FORWARD);
            while (opModeIsActive()) {
                if (gamepad1.a) {
                    RingYeetMotor.setPower(1);
                } else {
                    RingYeetMotor.setPower(0);
                }
                if (gamepad1.b) {
                    MainIntake.setPower(-1);
                    CounterspinMotor.setPower(-1);
                } else {
                    MainIntake.setPower(0);
                    CounterspinMotor.setPower(0);
                }
                if (gamepad1.right_bumper) {
                    biggearslowMotor.setPower(0.5);
                } else {
                    biggearslowMotor.setPower(0);
                }
                if (gamepad1.left_bumper) {
                    biggearslowMotor.setPower(-0.5);
                } else {
                    biggearslowMotor.setPower(0);
                }
                // Put loop blocks here.
                telemetry.update();
            }
        }
    }
}