public class Armor {
    protected String primaryColour;
    protected String secondaryColour;
    protected Propeller bothProp = new Propeller();
    protected Repulsor bothRepulsor = new Repulsor();
    protected int resistanceLevel;
    protected int healthLevel;
    protected double battery;
    protected Console console;
    protected SynthesizerIronMan synt;

    public Armor() {
        battery = 100;
    }


    public Armor(String primaryColour, String secondaryColour, Propeller bothProp, Repulsor bothRepulsor, int resistanceLevel, int healthLevel, double battery, Console console, SynthesizerIronMan synt) {
        this.primaryColour = primaryColour;
        this.secondaryColour = secondaryColour;
        this.bothProp = bothProp;
        this.bothRepulsor = bothRepulsor;
        this.resistanceLevel = resistanceLevel;
        this.healthLevel = healthLevel;
        this.battery = battery;
        this.console = console;
        this.synt = synt;
    }

    //-------------------------------------------------
    /*
    public void walk(int timeSec){
        //intensidad 0.2
        /*int walkingSecs=0;
        for (int i = 0; i<timeSec; i++)
            if (battery>0.4) {
                walkingSecs += 1;
                double acum = 0;
                acum += leftProp.usage(0.2, 1);
                acum += rightProp.usage(0.2, 1);
                battery -= acum;
            } else {
                System.out.println("SIN BATERIA. CAMINASTE: " + walkingSecs + " SEGUNDOS.")
        }*/
/*
        double walkingSecs = 0.0;
        double maxWalkTime = (int) (battery/bothProp.caminar1Sec());
        if (maxWalkTime >= timeSec){
            walkingSecs = timeSec;
        } else{
            walkingSecs =  maxWalkTime;
        }
        battery -= bothProp.calcularWalkingConsume((int) (walkingSecs));
        System.out.println("Caminaste: " + walkingSecs + " segundos.");
        System.out.println("Nivel de bateria: " + battery);
    }

    public void run(int timeSec){
//        Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//        energía establecida como consumo en la bota por el tiempo en el que se corra.
        double runningSeconds = 0.0;
        double maxRunTime = (int) (battery/bothProp.run1Sec());
        if (maxRunTime >= timeSec){
            runningSeconds  = timeSec;
        } else{
            runningSeconds =  maxRunTime;
        }
        battery -= bothProp.calculateRunningComsumption((int) (runningSeconds));
        System.out.println("Corriste: " + runningSeconds + " segundos.");
        System.out.println("Nivel de bateria: " + battery);
    }
    public void propel(int timeSec){

//• Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//        energía por el tiempo que dure la propulsión
        double propellingSeconds = 0.0;
        double maxPropelTime = (int) (battery/bothProp.propel1Sec());
        if (maxPropelTime >= timeSec){
            propellingSeconds  = timeSec;
        } else{
            propellingSeconds =  maxPropelTime;
        }
        battery -= bothProp.calculatePropellingComsumption((int) (propellingSeconds));
        System.out.println("Corriste: " + propellingSeconds + " segundos.");
        System.out.println("Nivel de bateria: " + battery);
    }
    */
    public void move(String mov, int timeSec){
        double moving1Secs = 0.0;
        if(mov.equals("walk")){
            moving1Secs = bothProp.move1Sec("low");
        } else if(mov.equals("run")){
            moving1Secs = bothProp.move1Sec("medium");
        } else if(mov.equals("propel")){
            moving1Secs = bothProp.move1Sec("high");
        } else if(mov.equals("fly")){
            moving1Secs = bothProp.move1Sec("high");
            moving1Secs += bothRepulsor.move1Sec("medium");
        } else if(mov.equals("shoot")){
            moving1Secs = bothRepulsor.move1Sec("high");
        }
        double moveInSeconds = 0.0;
        double maxMovingTime = (int) (battery/moving1Secs);
        if (maxMovingTime >= timeSec){
            moveInSeconds = timeSec;
        } else{
            moveInSeconds =  maxMovingTime;
        }

        battery -= moving1Secs * moveInSeconds;
        System.out.println(mov +": " + moveInSeconds + " segundos.");
        System.out.println("Nivel de bateria: " + battery);

    }


    public void write(){

    }

    public void read(){

    }
}
