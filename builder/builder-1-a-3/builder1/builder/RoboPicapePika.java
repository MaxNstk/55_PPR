package builder1.builder;

public class RoboPicapePika extends Robo{
    @Override
    public void construirMotor() {
        this.carro.setMotor(new MotorV8());
    }

    @Override
    public void construirPneus() {
        this.carro.setPneus(new Pneu18(),new Pneu18(),new Pneu18(),new Pneu18(),new Pneu18(),new Pneu18());
    }

    @Override
    public void construirCacamba(){
        this.carro.setCargaCacamba(this.carro.getCargaCacamba()*2);
    }
}
