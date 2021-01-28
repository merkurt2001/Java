package a_review.week15;

public class CyberPhone extends Phone implements AndroidApp, AppleApp{

    public CyberPhone() {
        super("Cyberphone", "", 0, 0);
    }

    @Override
    public void download() {
        System.out.println("Downloading from " + AndroidApp.AppName);
        System.out.println("Downloading from " + AppleApp.AppName);
    }

    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }
}
