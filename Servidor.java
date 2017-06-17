package chatd;

import static javax.swing.JOptionPane.*;

public class Servidor {
    
    public static void main(String[] args) {
        
        String nome = showInputDialog(null, "Digite seu nome: ","",PLAIN_MESSAGE);
        Integer escolha = Integer.parseInt(showInputDialog(null, "Bem vindo: "+nome+"\n\nEscolha uma opção:\n1) Servidor\n2) Cliente: ","",PLAIN_MESSAGE));
        
        if(escolha==1){
        
            Conexao conexao = new Conexao(nome+" [Servidor]");
            
        }else{
            
            String ip = showInputDialog(null, "Digite o IP de conexão (Se vazio, localhost): ","",PLAIN_MESSAGE);
            if(ip.isEmpty()){
                ip = "127.0.0.1";
            }
            ChatD chat = new ChatD(nome,ip);
            chat.setVisible(true);
        }
        
    }
    
}
