package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// Name and group declaration of Opmode
@TeleOp(name = "Single Motor Test", group = "Tests")
public class MotorTest extends OpMode {
    // Declare variables here
    private DcMotor testMotor;
    final double RUN_POWER = 0.5;

    // init() Runs ONCE after the driver hits initialize
    @Override
    public void init() {
        // Tell the driver the Op is initializing
        telemetry.addData("Status", "Initializing");

        // Do all init stuff
        // TODO: ADD INITS THAT YOU NEED
        testMotor  = hardwareMap.get(DcMotor.class, "testMotor");

        // Set direction
        testMotor.setDirection(DcMotor.Direction.FORWARD);

        // Tell the driver the robot is ready
        telemetry.addData("Status", "Initialized");
    }

    // loop() - Runs continuously while the OpMode is active, we typically write the majority of our code here.
    @Override
    public void loop() {
        if (gamepad1.a) {
            testMotor.setPower(RUN_POWER);
            telemetry.addData("Test Motor State", "Running");
        } else {
            testMotor.setPower(0);
            telemetry.addData("Test Motor State", "Stopped");
        }
    }
}