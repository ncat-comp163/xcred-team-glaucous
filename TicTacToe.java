import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TicTacToe extends JFrame implements ActionListener{
  public TicTacToe() {
    Container pane = getContentPane();
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    ImageIcon playableArea = new ImageIcon("GrayCircle.png");
    ImageIcon playerOneArea = new ImageIcon("X_Marks_The_Spot.png");
    ImageIcon playerTwoArea = new ImageIcon("O_Mark.png");
    int player = 1;
    JButton[][] grid = new JButton[3][3];
    for(int row = 0; row <= 3; row++) {
      for(int col = 0; col <= 3; col++) {
        JButton button = new JButton();
        button.setIcon(playableIcon);
        gbc.gridx = col;
        gbc.gridy = row;
      }
    }
  }
  
  public void actionPerformed(ActionEvent event) {
  /*
    //Player 2
    if(event.getSource() == Jbutton[row][col] && JButton[row][col] == playableArea && player % 2 == 0) {
      
      player++;
      //Player 1
    } else if(event.getSource = playableArea && player % 2 != 0) {
      
      player++;
    } 
    */  
  }

  public static void main(String[] args) {
    TicTacToe tCubed = new TicTacToe();
  }
}