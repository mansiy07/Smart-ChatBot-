import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class ChatBot {
    public String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hi") || input.contains("hello")) {
            return "Hello! 👋 How can I help you today?";
        } else if (input.contains("time")) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            return "⏰ Current Time: " + dtf.format(LocalDateTime.now());
        } else if (input.contains("date")) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return "📅 Today's Date: " + dtf.format(LocalDateTime.now());
        } else if (input.contains("weather")) {
            return "🌤 I can't fetch live data now, but you can ask me about weather simulation!";
        } else if (input.contains("bye")) {
            return "Goodbye! 👋 Have a great day!";
        } else {
            return "🤖 Sorry, I don't understand. Can you rephrase?";
        }
    }
}

public class SmartChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("=== Smart ChatBot (Core Java) ===");
        System.out.println("Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = bot.getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}    

