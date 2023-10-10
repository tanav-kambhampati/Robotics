public class Robot {
    
    private MotorProject leftMotor;
    private MotorProject rightMotor;

    public Robot(int leftSpeed, int rightSpeed){
        this.leftMotor = new MotorProject(leftSpeed);
        this.rightMotor = new MotorProject(rightSpeed);
    }

    public MotorProject getLeftMotor(){
        return this.leftMotor;
    }

    public MotorProject getRightMotor(){
        return this.rightMotor;
    }

    public void driveForward(){
        System.out.println("Robot moved forward");
    }

    public void driveLeft(){
        System.out.println("Robot turns left");
    }

    public void driveRight(){
        System.out.println("Robot turns right");
    }

    public void stop(){
        leftMotor.stopMotor();
        rightMotor.stopMotor();
        System.out.println("Robot stopped");
    }
    
}
