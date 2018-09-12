/*
* 대리자 역할
* 접근 제어
* 객체 생성 타이밍 조절 가능(메모리 절약)
* ** jvm 기반 언어에선 객체를 미리 만들 수록 메모리 낭비
* */

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /*
    * 싱글톤 getInstance 랑 비슷
    * */
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
