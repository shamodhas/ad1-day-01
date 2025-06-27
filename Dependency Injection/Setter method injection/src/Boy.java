/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.com
 * --------------------------------------------
 * Created: 6/27/2025 10:34 AM
 * Project: Day-01
 * --------------------------------------------
 **/

// Setter method injection
public class Boy {
    //  injecting a dependency after the object is created,
    //  using a public setter method
    private Agreement agreement;

    public void setInjection(Agreement agreement) {
        this.agreement = agreement;
    }
//    public void setAgreement(Agreement agreement) {
//        this.agreement = agreement;
//    }

    public void chatTest() {
        agreement.chat();
    }

    public void chatWithGirl() {
        agreement.chat();
    }

    public static void main(String[] args) {
        Girl girl = new Girl();

        Boy boy = new Boy();
        boy.setInjection(girl);

        boy.chatWithGirl();
    }
}
