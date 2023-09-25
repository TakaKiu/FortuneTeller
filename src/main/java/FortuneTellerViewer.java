import javax.swing.*;
import java.util.ArrayList;

public class FortuneTellerViewer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FortuneTellerFrame frame = new FortuneTellerFrame();

            ArrayList<String> fortunes = new ArrayList<>();
            fortunes.add("Fortune 1: This is your lucky day!");
            fortunes.add("Fortune 2: You will find a pot of gold at the end of the rainbow.");
            fortunes.add("Fortune 3: A surprise awaits you around the corner.");
            fortunes.add("Fortune 4: You will receive unexpected good news.");
            fortunes.add("Fortune 5: Laughter is the best medicine.");
            fortunes.add("Fortune 6: Your creativity will shine today.");
            fortunes.add("Fortune 7: Good fortune follows you wherever you go.");
            fortunes.add("Fortune 8: A new opportunity is on the horizon.");
            fortunes.add("Fortune 9: Embrace change and it will lead to great things.");
            fortunes.add("Fortune 10: Happiness is just a smile away.");
            fortunes.add("Fortune 11: You will meet someone special today.");
            fortunes.add("Fortune 12: Expect the unexpected!");

            frame.setFortunes(fortunes);

            frame.setVisible(true);
        });
    }
}
