# Smart-ChatBot-
|| Smart ChatBot🧑‍🚀 using Core Java ||


🛠 Features
1.Takes user input through the console.
2.Responds to basic queries (e.g., greetings, time, weather info, etc.).
3.Uses OOP principles (encapsulation & methods).
4.Extendable with APIs for real-world smart replies.


Source Code:

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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


Example Output:

=== Smart ChatBot (Core Java) ===
Type 'bye' to exit.

You: Hi
Bot: Hello! 👋 How can I help you today?

You: What is the time?
Bot: ⏰ Current Time: 14:45:32

You: bye
Bot: Goodbye! 👋 Have a great day!


💬Real-World Key Highlights:

1. Conversational System: Handles greetings, time, date, and basic queries.
2. AI Simulation: Demonstrates chatbot logic using Java OOP.
3. Scalable: Can be enhanced with NLP & APIs for advanced chatbot systems.
3. Use Cases: E-commerce support, FAQ bots, personal assistants.
