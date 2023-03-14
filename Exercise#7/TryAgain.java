import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class TryAgain extends JFrame{
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        
        this.add(tryAgainButton);
        this.add(exitButton);

        tryAgainEventHandler handler = new tryAgainEventHandler();
        tryAgainButton.addActionListener(handler);
        this.setLayout(new FlowLayout());

        exitHandler handlers = new exitHandler();
        exitButton.addActionListener(handlers);
        this.setLayout(new FlowLayout());
        

    this.setLayout(new FlowLayout());

    this.setTitle("Snake Game");

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    this.setSize (350, 100);

    this.setLocationRelativeTo(null);

    this.setVisible(true);

    this.setResizable(false);

    this.getContentPane().setBackground(Color.GREEN);
}

private class tryAgainEventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){

        new GameFrame();

        dispose();
    }
}
    private class exitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

        dispose();
        }
    }
}