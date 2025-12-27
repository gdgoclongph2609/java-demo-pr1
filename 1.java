import javax.swing.JFrame;

public class WalkingAnimation {
    public static void main(String[] args) {

        JFrame window = new JFrame("Walking Animation");
        WalkingAnimationPanel panel = new WalkingAnimationPanel();

        window.add(panel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
