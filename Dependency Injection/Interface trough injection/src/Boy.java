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

public class Boy implements DI {
    private Agreement agreement;

    @Override
    public void setInjection(Agreement agreement) {
        this.agreement = agreement;
    }

    public void chatTest() {
        agreement.chat();
    }

    @Override
    public void chatWithGirl() {
        agreement.chat();
    }


}
