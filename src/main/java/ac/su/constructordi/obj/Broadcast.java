package ac.su.constructordi.obj;

public class Broadcast {
    // 필드 로드 시 생성자 호출 및 의존성 제어 수행
    private Stage stage;

    public Broadcast() {
        System.out.println("Broadcast is ready");
    }

    public Broadcast(Stage stage) {
        System.out.println("Broadcast is ready");
        this.stage = stage;
    }

    public void startBroadcasting() {
        stage.performance();
    }
}
