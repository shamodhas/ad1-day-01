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

    public void chatWithGirl() {
        // relation between java class ( coupling )

        // reference = instance (object)
        Girl girl = new Girl();
        girl.chat();

        // Add an instance of another class to this class as a reference
        // and use the reference to call its methods
    }
}
