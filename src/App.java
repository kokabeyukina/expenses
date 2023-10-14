import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 1200;
        int boardHeight = 700;

        JFrame frame = new JFrame("Expenses");                  //cria a variavel da janel
        frame.setVisible(true);                                     //define a janela como visivel
        frame.setSize(boardWidth, boardHeight);                       //define o tamanho da janela
        frame.setLocationRelativeTo(null);                          //faz a janela aparecer no centro da tela
        frame.setResizable(false);                          //impede que a janela seja redimencionada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         //define a função padrão de fechamento da janela

        Expenses expenses = new Expenses(boardWidth, boardHeight);    //cria a janela do jogo
        frame.add(expenses);                                          //adiciona a janel do jogo à janela principal
        frame.pack();                                                 //garante que parte da janela não seja comida pela barra superior
        expenses.requestFocus();                                      //define o "snakegame" como a classe que vai escutar as teclas

    }
}
