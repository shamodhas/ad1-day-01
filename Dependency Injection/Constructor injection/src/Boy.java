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

// Constructor injection
public class Boy {
    // injecting the required dependencies through the class
    // constructor when the object is being created
    private Agreement agreement;

    public Boy(Agreement agreement) {
        this.agreement = agreement;
    }

    public void chatTest() {
//        Agreement agreement = new Girl();
        agreement.chat();
    }

    public void chatWithGirl() {
//        Agreement agreement = new Girl();
        agreement.chat();
    }

    public static void main(String[] args) {
        Girl girl = new Girl();

        Boy boy = new Boy(girl);
        boy.chatWithGirl();
    }
}
