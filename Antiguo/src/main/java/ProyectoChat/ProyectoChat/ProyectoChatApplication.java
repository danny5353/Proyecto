package ProyectoChat.ProyectoChat;

import ProyectoChat.ProyectoChat.bot.MainBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class ProyectoChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoChatApplication.class, args);
		ApiContextInitializer.init();
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		try {
			telegramBotsApi.registerBot(new MainBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}


