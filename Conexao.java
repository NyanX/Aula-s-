package chatd;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Conexao {
    
 public Conexao(String nome) {

        ArrayList<PrintStream> clientes = new ArrayList<>();
        
        Thread();

        try {
            
            ChatD chat = new ChatD(nome,"127.0.0.1");
            chat.setVisible(true);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void Thread() {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                ArrayList<PrintStream> clientes = new ArrayList<>();

                try {

                    ServerSocket server = new ServerSocket(5000);
                    Socket socket;

                    while (true) {
                        socket = server.accept();

                        clientes.add(new PrintStream(socket.getOutputStream()));

                        Mensagem mensagem = new Mensagem(socket, clientes);

                    }

                } catch (Exception e) {
                    showMessageDialog(null, "Já existe uma conexão de servidor aberta.", "", ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        });

        t.start();

    }

}
