public class Repulsor {
    protected double lowIntensity;
    protected double mediumIntensity;
    protected double highIntensity;

    public Repulsor() {
        lowIntensity = 0.4;
        mediumIntensity = 0.8;
        highIntensity = 1.2;
    }
    public double calculateMovingComsumption(int timeSec, String mov){
        double intensity = move1Sec(mov);
        return timeSec * intensity;
    }
    public double move1Sec(String intensityProps){
        double intensity = 0.0;
        if (intensityProps.equals("low")){
            intensity = lowIntensity;
        } else if (intensityProps.equals("medium")){
            intensity = mediumIntensity;
        } else if (intensityProps.equals("high")){
            intensity = highIntensity;
        }


        return intensity;
    }

}
