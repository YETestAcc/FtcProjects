package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp //(name = "ringyeet (Blocks to Java)")
public class RingYeet extends OpMode {

    private DcMotor ringYeetMotor;
    private DcMotor mainIntake;
    private DcMotor counterspinMotor;
    private DcMotor bigGearSlowMotor;

    @Override
    public void init() {
        ringYeetMotor = hardwareMap.get(DcMotor.class, "Ring Yeet Motor");
        mainIntake = hardwareMap.get(DcMotor.class, "Main Intake");
        counterspinMotor = hardwareMap.get(DcMotor.class, "Counter spin Motor");
        bigGearSlowMotor = hardwareMap.get(DcMotor.class, "big gear slow Motor");

        ringYeetMotor.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            ringYeetMotor.setPower(1);
        } else {
            ringYeetMotor.setPower(0);
        }

        if (gamepad1.b) {
            mainIntake.setPower(-1);
            counterspinMotor.setPower(-1);
        } else {
            mainIntake.setPower(0);
            counterspinMotor.setPower(0);
        }

        if (gamepad1.right_bumper) {
            bigGearSlowMotor.setPower(0.5);
        } else {
            bigGearSlowMotor.setPower(0);
        }

        if (gamepad1.left_bumper) {
            bigGearSlowMotor.setPower(-0.5);
        } else {
            bigGearSlowMotor.setPower(0);
        }
    }
}