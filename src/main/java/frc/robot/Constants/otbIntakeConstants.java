package frc.robot.Constants;

import com.ctre.phoenix6.signals.InvertedValue;

public class otbIntakeConstants {

    /* Motor Inverts */
    public static final InvertedValue pivotInvert = InvertedValue.Clockwise_Positive;
    public static final InvertedValue intakeInvert = InvertedValue.Clockwise_Positive;

    /* Current Limits */
    public static final double pivotCurrentLimit = 70;
    public static final double intakeCurrentLimit = 50; 

    /* Gear Ratio */
    public static final double gearRatio = 76.1904761905;

}
