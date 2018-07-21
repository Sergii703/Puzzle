import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PuzzleButton extends JButton{

    private boolean isLastButton;

    public  PuzzleButton(){
        super();
        initUI();
    }

    public PuzzleButton(Image i){
        super(new ImageIcon(i));
    }

    private void initUI(){

        isLastButton = false;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.green));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.red));
            }
        });
    }

    public boolean isLastButton(){
        return isLastButton;
    }

    public void setLastButton(boolean isLastButton){
        this.isLastButton = isLastButton;
    }
}