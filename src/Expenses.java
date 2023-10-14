import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
//import java.util.Random;
import javax.swing.*;

public class Expenses extends JPanel implements ActionListener, KeyListener{
    int boardWidth;
    int boardHeight;
    Color bgColor = new Color(56, 56, 56);
    Color lineColor = new Color(255, 255, 255);

    //Timer mainLoop;
    
    Expenses(int boardWidth, int boardHeight){
        this.boardWidth = boardWidth;                                               //definido os valores como variáveis da classe
        this.boardHeight = boardHeight;

        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));         //definido o tamanho que a janela da classe ocupará dentro da janela principal
        setBackground(bgColor);                                                     //define a cor de fundo
        addKeyListener(this);                                                       //faz as com que a classe escute as teclas
        setFocusable(true);

        //mainLoop = new Timer(100, this);                                      //define o delay e a função a ser chamada
        //mainLoop.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(lineColor);
        g.drawLine(boardWidth*1/5, 0, boardWidth*1/5, boardHeight);
        g.drawLine(boardWidth*2/5, 0, boardWidth*2/5, boardHeight);
        g.drawLine(boardWidth*3/5, 0, boardWidth*3/5, boardHeight);
        g.drawLine(boardWidth*4/5, 0, boardWidth*4/5, boardHeight);

        g.drawLine(0, boardHeight*1/5, boardWidth, boardHeight*1/5);
        g.drawLine(0, boardHeight*2/5, boardWidth, boardHeight*2/5);
        g.drawLine(0, boardHeight*3/5, boardWidth, boardHeight*3/5);
        g.drawLine(0, boardHeight*4/5, boardWidth, boardHeight*4/5);
    } 

    //key listeners
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
