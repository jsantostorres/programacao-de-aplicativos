import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner(System.in);
        
        //nivel 1
        System.out.println("Escolha um número:");
        int number = in.nextInt();
        System.out.println("O número escolhido foi " + number);
        
        System.out.println("Que tal realizarmos uma soma simples entre dois valores? Informe o primeiro valor:");
        int valor01 = in.nextInt();
        System.out.println("Ótimo! Agora, informe o segundo valor:");
        int valor02 = in.nextInt();
        int soma = valor01 + valor02;
        System.out.println("O resultado da soma é: " + soma);
        
        System.out.println("Informe a sua idade: ");
        int idade = in.nextInt();
        System.out.println("Caraca! Então você tem " + idade + " anos? Velho demaaaaiis...");
        
        System.out.println("Sou muito inteligente sabia? Qualquer número que você escolher eu posso dizer o dobro dele! Escolhe aí pra tu ver.");
        int queroDobro = in.nextInt();
        int dobro = queroDobro * 2;
        System.out.println("O dobro de " + queroDobro + " é igual a " + dobro + " ;)");
        
        //nivel 2
        System.out.println("Informe um valor decimal:");
        double dec = in.nextFloat();
        System.out.println("O valor informado foi " + dec);
        
        System.out.println("Já falei que sou bem espertinho, né? Se quiser eu posso tirar a média de dois valores pra você. Escolha o primeiro valor:");
        float num01 = in.nextFloat();
        System.out.println("Agora escolha o segundo valor:");
        float num02 = in.nextFloat();
        float media = (num01 + num02) / 2;
        System.out.println("A média entre " + num01 + " e " + num02 + " resulta em " + media + " :D");
        
        System.out.println("Posso te ajudar a saber o valor de suas compras também! Primeiro, me diga o valor do produto:");
        double valorProduto = in.nextFloat();
        System.out.println("Agora me informe a quantidade que foi comprada:");
        int quantComprada = in.nextInt();
        double total = valorProduto * quantComprada;
        System.out.println("Hum... Se você compra " + quantComprada + " unidades de um produto que custa " + valorProduto + ", então o total a pagar será de " + total);
        
        //nivel 3
        System.out.println("Ah! Acabei de perceber que não perguntei o seu nome... Poderia me dizer?");
        String nome = in.next();
        System.out.println("Nossa... seus pais tinham muito mal gosto pra te nomear de " + nome + " hein, mas de qualquer forma seja bem vindo ao meu código e espero que você esteja se divertindo comigo!");
        
        System.out.println("Então " + nome + ", em que cidade você nasceu?");
        String cidade = in.next();
        System.out.println("Que legal, " + nome + "! Eu tenho muita vontade de poder visitar " + cidade + " algum dia.");
        
        //nivel 4
        boolean isAtividade = true;
        System.out.println("Isso é um exercício mostrando os tipos básicos de variáveis em Java, certo? " + isAtividade);
        
        boolean isThatTrue = true;
        System.out.println("Se eu digo que sou milionário agora, estarei falando a verdade? " + !isThatTrue);
        
        //nivel 5
        char letra = 'N';
        System.out.println("Para primeira utilizacao da variavel 'char' nesse código, foi atribuída a ela uma letra, e a letra escolhida foi: " + letra);
        
        System.out.println("Desculpa perguntar de novo, mas pode me dizer seu nome? Acabei esquecendo...");
        String name = in.next();
        char firstLetter = name.charAt(0);
        System.out.println("Então a primeira letra do seu nome é " + firstLetter + ", que legal!");
        
        //nivel 6
        System.out.println("Agora que eu já sei o seu nome e sua idade, eu gostaria de saber sua altura. Pode me informar?");
        double altura = in.nextFloat();
        System.out.println(name + ", você tem " + idade + " anos e " + altura + " de altura? Já pensou em procurar um médico?");
        
        System.out.println("Certo, você com certeza conhece algum estudante, né? Eu gostaria de testar minhas habilidades incríveis com ele e ajudar a calcular a média! Poderia me dizer o nome do estudante?");
        String nomeAluno = in.next();
        System.out.println("Agora informe a nota da primeira prova:");
        double av1 = in.nextFloat();
        System.out.println("Ótimo, agora a nota da segunda prova:");
        double av2 = in.nextFloat();
        double mediaNotas = (av1 + av2) / 2;
        System.out.println(nomeAluno + " está com a media final de " + mediaNotas + " já que tirou " + av1 + " na primeira prova e " + av2 + " na segunda prova.");
        
        //desafio final
        System.out.println("Fiquei sabendo que voce tem mais compras para fazer. O que voce precisa comprar?");
        String nomeProd = in.next();
        System.out.println("Entendi, e quantas unidades você pretende comprar?");
        int quantidade = in.nextInt();
        System.out.println("Mas não vai ficar muito caro? Quanto custa cada unidade?");
        double precinhoManeiro = in.nextFloat();
        double valorPago = precinhoManeiro * quantidade;
        System.out.println("Se voce vai comprar " + quantidade + " unidades de " + nomeProd + " e cada unidade custa " + precinhoManeiro + ", então você deve pagar " + valorPago);
        
        System.out.println("Foi divertido estar aqui com você, mas agora eu preciso ir... adeus! :)")
        
    }
}
