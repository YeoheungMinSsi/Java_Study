// 포함하는 클래스 (자동차): Car는 Engine을 가지고 있다 (has-a 관계)
public class Car
{
    private Engine _engine; // Car는 Engine 객체를 멤버 변수로 포함

    public Car()
    {
        _engine = new Engine(); // Car 생성 시 Engine 객체도 생성
    }

    public void StartCar()
    {
        System.out.println("차를 시작합니다...");
        _engine.Start(); // Engine 객체의 기능을 위임하여 사용
    }

    public void StopCar()
    {
        System.out.println("차를 정지합니다...");
        _engine.Stop(); // Engine 객체의 기능을 위임하여 사용
    }
}
