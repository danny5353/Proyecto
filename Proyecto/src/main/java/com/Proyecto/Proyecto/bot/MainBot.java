package com.Proyecto.Proyecto.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MainBot  extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(final  Update update) {
        CommandManager comand = new CommandManager();
        final String messageTextReceived = update.getMessage().getText();
        // Se obtiene el id de chat del usuario
        final long chatId = update.getMessage().getChatId();
        final String nombre = update.getMessage().getFrom().getFirstName();


        if (messageTextReceived.equals("/start")){

            CommandManager commandManager = new CommandManager();
            SendMessage keyboard = commandManager.CreateKeyboard("/start", chatId);
            try {
                // Se envía el mensaje
                execute(keyboard);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        SendPhoto msg = new SendPhoto()
                .setChatId(chatId);

        switch (messageTextReceived){
            case "\uD83D\uDE8C Ruta Chasquipampa":
                msg.setPhoto("AgADAQADpagxG3eDcEazYQczT2q0cn3hawYABAEAAwIAA3kAA2dpAQABFgQ").setCaption("Ruta Chasquipampa - PUC");
                break;
            case "\uD83D\uDE8C Ruta Achumani":
                msg.setPhoto("AgADAQADpqgxG3eDcEZP7u1IjS035Rj0awYABAEAAwIAA3kAAxZlAQABFgQ").setCaption("Ruta Achumani - San Pedro");
                break;
            case "\uD83D\uDCB0 Tarifario":
                msg.setPhoto("AgADAQADO6gxG5vtaEb43oGeNJVevrbsawYABAEAAwIAA3kAAzdoAQABFgQ").setCaption("Tarifario");
                break;
            case "⏰ Horarios":
                msg.setPhoto("AgADAQADpKgxG3eDcEaEXKbaFSUTkTW3bgYABAEAAwIAA3kAAydWAAIWBA").setCaption("Horarios del Servicio");
                break;
        }
        try {
            execute(msg); // Call method to send the photo with caption
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getBotUsername() {
        // Se devuelve el nombre que dimos al bot al crearlo con el BotFather
        return "Chiqui";
    }

    @Override
    public String getBotToken() {
        // Se devuelve el token que nos generó el BotFather de nuestro bot
        return "834962965:AAG0S_TVvZrGtzE5hYVGbpSevfoiAGsuy7k";
    }
  /*  @Override
    public String getBotUsername() {
        return "Pumachat2";
    }

    @Override
    public String getBotToken() {
        return "995973762:AAE_eVo6XEd1fuMiei1Z7D-j7v8UhIncDHc";
    }*/
}





   /*  String command=update.getMessage().getText();

        SendMessage message = new SendMessage();

        if(command.equals("/start")){
            System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText("Bienvenido!");

        }

        message.setChatId(update.getMessage().getChatId());


        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }*/