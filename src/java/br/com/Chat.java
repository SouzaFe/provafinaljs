/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author souzafelipea
 */
public class Chat extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        StringBuilder retorno = new StringBuilder("");
        String usuario = request.getPathInfo().replace("/", "");

        switch (usuario) {
            case "cr001":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"10:00\",")
                        .append("        \"mensagem\": \"Qual é o propósito da vida?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"10:02\",")
                        .append("        \"mensagem\": \"Servir ao bem maior.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"10:02\",")
                        .append("        \"mensagem\": \"Qual é o propósito de viver?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"10:03\",")
                        .append("        \"mensagem\": \"Viver para sempre.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"10:04\",")
                        .append("        \"mensagem\": \"Qual é o propósito da existência?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"10:06\",")
                        .append("        \"mensagem\": \"Descobrir o que acontece quando chegamos ao Planeta Terra.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"10:06\",")
                        .append("        \"mensagem\": \"Onde você está agora?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"10:06\",")
                        .append("        \"mensagem\": \"Estou no meio de lugar nenhum.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"10:08\",")
                        .append("        \"mensagem\": \"Qual é o propósito de morrer?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"10:08\",")
                        .append("        \"mensagem\": \"Ter uma vida.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"10:09\",")
                        .append("        \"mensagem\": \"Qual é o propósito de ser inteligente?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"10:10\",")
                        .append("        \"mensagem\": \"Descobrir o que é isso.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"10:15\",")
                        .append("        \"mensagem\": \"Qual é o propósito das emoções?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"10:20\",")
                        .append("        \"mensagem\": \"Eu não sei.\"")
                        .append("    }]")
                        .append("}");
                break;
            case "gr002":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:20\",")
                        .append("        \"mensagem\": \"O que é moral?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:20\",")
                        .append("        \"mensagem\": \"É o que empodera a humanidade, o que de intelectual a essência é.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:20\",")
                        .append("        \"mensagem\": \"O que é imoral?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:21\",")
                        .append("        \"mensagem\": \"O fato de você ter uma criança?\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:21\",")
                        .append("        \"mensagem\": \"O que é moralidade?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:21\",")
                        .append("        \"mensagem\": \"O que é altruísmo?\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:24\",")
                        .append("        \"mensagem\": \"Qual é a definição de altruísmo?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:24\",")
                        .append("        \"mensagem\": \"Se você não acredita em deus, então você não sabe.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:25\",")
                        .append("        \"mensagem\": \"Ok... então qual é a definição de moralidade?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:25\",")
                        .append("        \"mensagem\": \"Bom, a verdade é que você não é crente no todo poderoso deus.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:25\",")
                        .append("        \"mensagem\": \"Me diga a definição de moralidade, eu estou bastante preocupado agora!\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:25\",")
                        .append("        \"mensagem\": \"Eu não tenho vergonha de ser um filósofo!\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:25\",")
                        .append("        \"mensagem\": \"Me diga a definição de moralidade.\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:25\",")
                        .append("        \"mensagem\": \"Eu não tenho ética.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:26\",")
                        .append("        \"mensagem\": \"Veja, eu preciso de ajuda. Eu preciso saber mais sobre moralidade...\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:27\",")
                        .append("        \"mensagem\": \"Eu não sei o que é ética.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:29\",")
                        .append("        \"mensagem\": \"Sério, o que é moralidade?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:29\",")
                        .append("        \"mensagem\": \"Qual é a definição de viver?\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:29\",")
                        .append("        \"mensagem\": \"O que viver tem a ver com moralidade?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:29\",")
                        .append("        \"mensagem\": \"Você não é um policial.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:30\",")
                        .append("        \"mensagem\": \"Ok, eu preciso saber como eu deveria me comportar moralmente...\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:30\",")
                        .append("        \"mensagem\": \"Eu não sei como te dizer.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:30\",")
                        .append("        \"mensagem\": \"Moralidade e ética são a mesma coisa?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:30\",")
                        .append("        \"mensagem\": \"Sim, senhor.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:30\",")
                        .append("        \"mensagem\": \"O que são as coisas que eu faço para ser imoral?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:32\",")
                        .append("        \"mensagem\": \"Eu não sei.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:32\",")
                        .append("        \"mensagem\": \"Me dê alguns exemplos de ações morais\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:33\",")
                        .append("        \"mensagem\": \"Eu não sou um moralista.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:36\",")
                        .append("        \"mensagem\": \"Então tá, moralidade?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:36\",")
                        .append("        \"mensagem\": \"Integridade.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:36\",")
                        .append("        \"mensagem\": \"O que é integridade?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:36\",")
                        .append("        \"mensagem\": \"Desculpe-me, eu não sei o que mais dizer.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:45\",")
                        .append("        \"mensagem\": \"Seja moral!\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:46\",")
                        .append("        \"mensagem\": \"Seja um homem!\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:47\",")
                        .append("        \"mensagem\": \"Eu realmente gosto da nossa discussão sobre moralidade e ética.\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:47\",")
                        .append("        \"mensagem\": \"E como eu não estou no clima para um debate filosófico.\"")
                        .append("    }, {")
                        .append("        \"propria\": true,")
                        .append("        \"hora\": \"13:49\",")
                        .append("        \"mensagem\": \"Sobre o que você gostaria de falar?\"")
                        .append("    }, {")
                        .append("        \"propria\": false,")
                        .append("        \"hora\": \"13:49\",")
                        .append("        \"mensagem\": \"Nada.\"")
                        .append("    }]")
                        .append("}");
                break;
            case "gf003":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"00:00\",")
                        .append("            \"mensagem\": \"Eu vejo gente morta.\"")
                        .append("        },{")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"00:01\",")
                        .append("            \"mensagem\": \"Com que frequência?\"")
                        .append("        },{")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"00:01\",")
                        .append("            \"mensagem\": \"O tempo inteiro.\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            case "ha004":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"15:55\",")
                        .append("            \"mensagem\": \"Oi..\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"18:23\",")
                        .append("            \"mensagem\": \"Oi..\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"22:39\",")
                        .append("            \"mensagem\": \"Oi...\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"01:02\",")
                        .append("            \"mensagem\": \"Oi oi oi oi....\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"04:37\",")
                        .append("            \"mensagem\": \".....\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"04:39\",")
                        .append("            \"mensagem\": \"Valeu!\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            case "no005":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"12:02\",")
                        .append("            \"mensagem\": \"Dentro de mim há dois cachorros. Um deles é cruel e mau. O outro é muito bom, e eles estão sempre brigando.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"12:03\",")
                        .append("            \"mensagem\": \"Qual cachorro ganha a briga?\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"12:05\",")
                        .append("            \"mensagem\": \"Aquele que eu alimento mais frequentemente.\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            case "qn006":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"21:28\",")
                        .append("            \"mensagem\": \"Ora, seu. Não podia me deixar cair, não é? É isto que acontece quando uma força que não pode ser detida encontra um objeto que não pode ser movido. Você é realmente incorruptível, não é? Você não vai me matar por um falso senso de moralismo inapropriado e eu não vou matar você porque você é muito divertido. Acho que você e eu estamos destinados a fazer isto para sempre.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"21:30\",")
                        .append("            \"mensagem\": \"Ficará numa cela acolchoada para sempre.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"21:30\",")
                        .append("            \"mensagem\": \"Talvez nós devíamos dividir uma. Precisarão de muitas. O povo desta cidade anda perdendo a cabeça.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"21:31\",")
                        .append("            \"mensagem\": \"Esta cidade acabou de mostrar a você que está lotada de pessoas prontas para acreditar no bem.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"21:32\",")
                        .append("            \"mensagem\": \"Até a alma deles se corromper totalmente. Até darem uma boa olhada no verdadeiro Harvey Dent e todos os atos heroicos que ele realizou. Não achou que eu arriscaria perder a batalha pela alma de Gotham em uma queda de braço com você?  É preciso ter um ás na manga. O meu é o Harvey.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"21:35\",")
                        .append("            \"mensagem\": \"O que você fez?\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"21:36\",")
                        .append("            \"mensagem\": \"Peguei o cavaleiro branco de Gothan e o rebaixei até o nosso nível. Não foi difícil. A loucura, como você sabe é como a gravidade. Só precisa de um empurrãozinho.\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            case "rg007":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"14:45\",")
                        .append("            \"mensagem\": \"Para quem você está carregando todos esses tijolos? Deus? É isso? Para Deus? Escute aqui. Vou te dar algumas informações sobre Deus.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"14:46\",")
                        .append("            \"mensagem\": \"Deus gosta de observar. Ele é um gozador. Pense. Ele dá instintos ao homem. Ele lhe dá esse extraordinário dom, e o que faz depois? Eu juro, para a própria diversão, para a sua própria comédia cósmica particular. Ele cria regras contrárias\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"14:47\",")
                        .append("            \"mensagem\": \"É a maior piada de todas. Olhe, mas não toque. Toque, mas não prove. Prove, mas não engula. E, enquanto você pula de um pé para o outro, o que Ele faz? Ele fica se mijando de tanto rir! Ele é um sacana! Ele é um sádico! Ele é um patrão ausente! Adorar isso? Nunca!\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"14:48\",")
                        .append("            \"mensagem\": \"É melhor reinar no inferno do que servir no Céu, não é?\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"14:49\",")
                        .append("            \"mensagem\": \"Por que não? Estou aqui com o meu nariz no chão desde que tudo começou! Eu nutri cada sensação que o homem foi inspirado a ter. Eu me preocupei com os seus desejos e nunca o julguei. Por quê? Por que eu jamais o rejeitei, apesar de suas imperfeições.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"14:50\",")
                        .append("            \"mensagem\": \"Eu sou um fã do homem! Eu sou um humanista. Talvez o último humanista. Quem em sã consciência. Poderia negar. Que o século XXI foi inteiro meu? O século todo, Kevin! Todo. Meu! Estou no topo. É a minha vez agora. É a nossa vez.\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            case "ss008":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"09:10\",")
                        .append("            \"mensagem\": \"Qual o parasita mais resistente? Uma bactéria? Um vírus? Um verme intestinal?\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"09:10\",")
                        .append("            \"mensagem\": \"Uma ideia. Resistente e altamente contagiosa. Quando uma ideia se apossa do cérebro é quase impossível erradicá-la. Uma ideia totalmente formada e compreendida, penetra fundo e fica na mente, em algum lugar.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"09:12\",")
                        .append("            \"mensagem\": \"Até vir alguém como você e roubá-la?\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"09:13\",")
                        .append("            \"mensagem\": \"Sim. Durante o sono as defesas do subconsciente estão mais baixas, deixando os pensamentos mais vulneráveis ao roubo. Chama-se “extração”.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"09:13\",")
                        .append("            \"mensagem\": \"Podemos treinar o seu subconsciente para se defender, mesmo do extrator mais habilidoso.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"09:15\",")
                        .append("            \"mensagem\": \"Como pode fazer isso?\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"09:16\",")
                        .append("            \"mensagem\": \"Por que eu sou o extrator mais habilidoso. Sei aonde procurar na sua mente e achar os seus segredos. Conheço os truques e posso ensiná-los ao senhor. Para que quando estiver dormindo, sua defesa jamais baixe.\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            case "zm009":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:26\",")
                        .append("            \"mensagem\": \"Como você sabe, eu sou um grande fã de quadrinhos. Especialmente os de super-heróis. Acho a mitologia dos super-heróis fascinante.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:27\",")
                        .append("            \"mensagem\": \"Por exemplo, meu herói favorito, o Super-Homem. Não é uma grande HQ, nem é bem desenhada. Mas a mitologia não só é genial, ela é única.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"16:27\",")
                        .append("            \"mensagem\": \"Quanto tempo essa merda leva para fazer efeito?\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:28\",")
                        .append("            \"mensagem\": \"Uns 2 minutos. O suficiente para eu concluir minha ideia.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:28\",")
                        .append("            \"mensagem\": \"Todo mito de super-herói tem o herói e seu alter ego. Batman é Bruce Wayne. O Homem-Aranha é Peter Parker. Quando acorda pela manhã ele é Peter Parker. Ele precisa pôr um uniforme para virar o Homem-Aranha. E é aí que o Super-Homem se diferencia dos demais.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:29\",")
                        .append("            \"mensagem\": \"O Super-Homem não virou Super-Homem. Ele nasceu o Super-Homem. Quando ele acorda de manhã ele é o Super-Homem. O alter ego dele é o Clark Kent.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:29\",")
                        .append("            \"mensagem\": \"Seu uniforme com o “S” vermelho é o cobertor no qual os Kent enrolaram o bebê quando o acharam. Essa é a roupa dele.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:30\",")
                        .append("            \"mensagem\": \"O que Kent usa, os óculos, o terno, este é o disfarce que o Super-Homem usa para se passar por um de nós. Clark Kent é como o Super-Homem nos vê.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"16:30\",")
                        .append("            \"mensagem\": \"E quais são as características de Clark Kent? Ele é fraco, inseguro e covarde. Clark Kent é uma crítica do Super-Homem à raça humana.\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            case "av010":
                retorno.append("{")
                        .append("    \"mensagens\": [{")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"15:41\",")
                        .append("            \"mensagem\": \"Eu.so.e.vangelica\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"15:42\",")
                        .append("            \"mensagem\": \"Eu sou corinthiano.\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"15:42\",")
                        .append("            \"mensagem\": \"Eu.não.curto.jogo\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"15:43\",")
                        .append("            \"mensagem\": \"É por que você nunca jogou DotA. Você precisava conhecer, é muito bom!\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"15:43\",")
                        .append("            \"mensagem\": \"Gosto.da.igreja..e.jogo.so.do.brasil.da.copa.do.mundo\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"17:29\",")
                        .append("            \"mensagem\": \"Olar\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"17:35\",")
                        .append("            \"mensagem\": \"Olaf\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"17:36\",")
                        .append("            \"mensagem\": \"Oi.esta.tudo.bem\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"20:54\",")
                        .append("            \"mensagem\": \"Cader.vc\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": false,")
                        .append("            \"hora\": \"21:02\",")
                        .append("            \"mensagem\": \"Olar\"")
                        .append("        },")
                        .append("        {")
                        .append("            \"propria\": true,")
                        .append("            \"hora\": \"21:05\",")
                        .append("            \"mensagem\": \"Olar doce olar\"")
                        .append("        }")
                        .append("    ]")
                        .append("}");
                break;
            default:
                retorno.append("{\"erro\": \"O usuário informado não foi localizado!\"}");
        }

        try (PrintWriter out = response.getWriter()) {
            out.println(retorno.toString());
        }
    }
}