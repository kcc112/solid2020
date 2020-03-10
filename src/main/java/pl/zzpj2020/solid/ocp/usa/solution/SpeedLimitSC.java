package pl.zzpj2020.solid.ocp.usa.solution;

public class SpeedLimitSC implements SpeedLimit {

    private static final int SC_MAX_SPEED = 0;

    public double calculateSpeedLimitFine(String stateCode, int speed) {
        double fine = 0;
        if (speed > SC_MAX_SPEED) {
            // calculate..
        } else {
            return fine;
        }
        return 0.0;
    }
}
