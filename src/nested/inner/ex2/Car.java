package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine=new Engine();
    }

//    //Engine에서만 사용하는 메서드
//    public int getChargeLevel() {
//        return chargeLevel;
//    }
//
//    //Engine에서만 사용하는 메서드
//    public String getModel() {
//        return model;
//    }

    public void start(){
        engine.start();
        System.out.println(model+" 시작 완료");
    }

    private class Engine {
//        private Car car;
//        public Engine(Car car){
//            this.car=car;
//        }
        //내부 클래스는 바깥 인스턴스에 접근 가능
        public void start(){
            System.out.println("충전 레벨 확인: "+chargeLevel);   //그냥 접근 가능
            System.out.println(model+"의 엔진을 구동합니다.");
        }
    }
}
