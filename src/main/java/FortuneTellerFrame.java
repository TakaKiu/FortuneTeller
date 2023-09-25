import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerFrame extends JFrame {
    private JLabel titleLabel;
    private JTextArea fortuneTextArea;
    private JButton fortuneButton;
    private JButton quitButton;

    private ArrayList<String> fortunes;
    private int previousFortuneIndex;

    public FortuneTellerFrame() {

        setTitle("Fortune Teller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        initializeComponents();

        fortunes = new ArrayList<>();
        previousFortuneIndex = -1;

        fortuneButton.addActionListener(e -> readFortune());
        quitButton.addActionListener(e -> System.exit(0));
    }

    private void initializeComponents() {

        Font titleFont = new Font("Arial", Font.BOLD, 48);
        Font buttonFont = new Font("Arial", Font.PLAIN, 24);
        Font fortuneFont = new Font("Arial", Font.PLAIN, 18);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        titleLabel = new JLabel("Fortune Teller");
        ImageIcon fortuneTellerImage = new ImageIcon("FortuneTellerImage.png");
        titleLabel.setIcon(fortuneTellerImage);
        titleLabel.setFont(titleFont);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(JLabel.BOTTOM);
        topPanel.add(titleLabel, BorderLayout.CENTER);

        fortuneTextArea = new JTextArea();
        fortuneTextArea.setFont(fortuneFont);
        fortuneTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(fortuneTextArea);


        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        fortuneButton = new JButton("Read My Fortune!");
        fortuneButton.setFont(buttonFont);

        quitButton = new JButton("Quit");
        quitButton.setFont(buttonFont);

        bottomPanel.add(fortuneButton);
        bottomPanel.add(quitButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void readFortune() {
        if (fortunes.isEmpty()) {
            fortuneTextArea.setText("No fortunes available.");
            return;
        }

        int randomIndex;
        do {
            randomIndex = new Random().nextInt(fortunes.size());
        } while (randomIndex == previousFortuneIndex);

        String fortune = fortunes.get(randomIndex);
        fortuneTextArea.append(fortune + "\n");
        previousFortuneIndex = randomIndex;
    }

    public void setFortunes(ArrayList<String> fortunes) {
        this.fortunes = fortunes;
    }
}

