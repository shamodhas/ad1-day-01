/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.com
 * --------------------------------------------
 * Created: 6/27/2025 12:47 PM
 * Project: Day-01
 * --------------------------------------------
 **/

// Interface trough injection
public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();

        DI boy = new Boy();

        boy.setInjection(girl);
        boy.chatWithGirl();
    }
}
