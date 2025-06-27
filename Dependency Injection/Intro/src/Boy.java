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

public class Boy {
    private Agreement agreement = new Girl();

    public void chatTest() {
//        Agreement agreement = new Girl();
        agreement.chat();
    }

    public void chatWithGirl() {
//        Agreement agreement = new Girl();
        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}
