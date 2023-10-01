package CursoJava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BirdFlipGame extends JPanel implements ActionListener, KeyListener {
    private int birdY;
    private int birdVelocity;
    private boolean isJumping;
    private int pipeX;
    private int pipeHeight;
    private Timer timer;
    private boolean gameStarted = false;

    public BirdFlipGame() {
        birdY = 200;
        birdVelocity = 0;
        isJumping = false;
        pipeX = 400;
        pipeHeight = 150;

        timer = new Timer(20, this);

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        JButton startButton = new JButton("Iniciar");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gameStarted = true;
                timer.start();
                startButton.setVisible(false);
                requestFocusInWindow();
            }
        });

        setLayout(new BorderLayout());
        add(startButton, BorderLayout.CENTER);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!gameStarted) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("Pressione 'Iniciar' para jogar", 50, 250);
        } else {
            g.setColor(Color.RED);
            g.fillRect(100, birdY, 50, 50);

            g.setColor(Color.GREEN);
            g.fillRect(pipeX, 0, 50, pipeHeight);
            g.fillRect(pipeX, pipeHeight + 150, 50, 500 - pipeHeight - 150);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        birdY += birdVelocity;
        if (isJumping) {
            birdVelocity -= 2;
            isJumping = false;
        } else {
            birdVelocity += 2;
        }

        pipeX -= 5;
        if (pipeX < -50) {
            pipeX = 400;
            pipeHeight = (int) (Math.random() * 200) + 100;
        }

        if (birdY < 0 || birdY > 500 ||
                (birdY + 50 > pipeHeight && birdY < pipeHeight + 150 && pipeX < 150 && pipeX + 50 > 100)) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over!");
            System.exit(0);
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && gameStarted) {
            isJumping = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bird Flip Game");
        BirdFlipGame game = new BirdFlipGame();
        frame.add(game);
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
