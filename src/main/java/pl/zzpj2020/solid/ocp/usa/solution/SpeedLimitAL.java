package pl.zzpj2020.solid.ocp.usa.solution;

public class SpeedLimitAL implements SpeedLimit {

    private static final int AL_MAX_SPEED = 0;

    public double calculateSpeedLimitFine(String stateCode, int speed) {
        double fine = 0;
        if (speed > AL_MAX_SPEED) {
            // calculate..
        } else {
            return fine;
        }
        return 0.0;
    }
}
