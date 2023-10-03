public class MotorProject {

    private int motorSpeed;

    public MotorProject(int speed){
        this.motorSpeed = speed;
        System.out.println("Motor speed has been set to " + speed);
    }

    public int getmotorSpeed(){
        System.out.println("A motor speed of " + this.motorSpeed + " has been returned");
        return this.motorSpeed;
    }

    public void stopMotor(){
        this.motorSpeed = 0;
        System.out.println("Motor is stopped");
    }

}
