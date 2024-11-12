package frc.robot.Constants;

import com.ctre.phoenix6.signals.InvertedValue;

public class indexerConstants {

    /* Motor Inverts */
    public static final InvertedValue indexerInvert = InvertedValue.Clockwise_Positive;
    public static final InvertedValue ampRollerInvert = InvertedValue.CounterClockwise_Positive; 

    /* Current Limits */
    public static final double indexerCurrentLimit = 50;
    public static final double ampRollerCurrentLimit = 50;
    
}
