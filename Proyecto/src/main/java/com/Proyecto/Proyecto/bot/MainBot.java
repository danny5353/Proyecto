package com.Proyecto.Proyecto.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
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
        SendPhoto msg = new SendPhoto().setChatId(chatId);

        switch (messageTextReceived){
            case "\uD83D\uDE8C ¿Qué rutas existen?":
                if (update.hasMessage() && update.getMessage().hasText()) {
                SendMessage  message = new SendMessage().setChatId(chatId).setText("¿Qué rutas existen?");
                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
                List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
                rowInline1.add(new InlineKeyboardButton().setText("Inca Llojeta").setCallbackData("Inca Llojeta"));
                rowInline1.add(new InlineKeyboardButton().setText("Villa Salome").setCallbackData("Villa Salome"));
                rowsInline.add(rowInline1);
                List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
                rowInline2.add(new InlineKeyboardButton().setText("Chasquipampa").setCallbackData("Chasquipampa"));
                rowInline2.add(new InlineKeyboardButton().setText("Caja Ferriviaria").setCallbackData("Caja Ferriviaria"));
                rowsInline.add(rowInline2);
                List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
                rowInline3.add(new InlineKeyboardButton().setText("Integradora").setCallbackData("Integradora"));
                rowInline3.add(new InlineKeyboardButton().setText("Irpavi II").setCallbackData("Irpavi II"));
                rowInline3.add(new InlineKeyboardButton().setText("Achumani").setCallbackData("Achumani"));
                rowsInline.add(rowInline3);
                markupInline.setKeyboard(rowsInline);
                message.setReplyMarkup(markupInline);
                try {
                    execute(message); //Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                } else if (update.hasCallbackQuery()) {
                    // Set variables
                    String call_data = update.getCallbackQuery().getData();
                    long message_id = update.getCallbackQuery().getMessage().getMessageId();
                    long chat_id = update.getCallbackQuery().getMessage().getChatId();
                    if (call_data.equals("Chasquipampa")) {
                        msg.setPhoto("AgADAQADpagxG3eDcEazYQczT2q0cn3hawYABAEAAwIAA3kAA2dpAQABFgQ").setCaption("Ruta Chasquipampa - PUC");
                        try {
                            execute(msg);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                    }
            }
                break;
            case "\uD83D\uDE8C ¿Dónde está mi Puma?":

                break;
            case "\uD83D\uDCB0 ¿Qué bus debo tomar?":

                break;
           case "Información":
               SendMessage  message = new SendMessage().setChatId(chatId).setText("Información");
               InlineKeyboardMarkup  markupInline = new InlineKeyboardMarkup();
               List<List<InlineKeyboardButton>>  rowsInline = new ArrayList<>();
               List<InlineKeyboardButton>  rowInline1 = new ArrayList<>();
                rowInline1.add(new InlineKeyboardButton().setText("Noticias").setCallbackData("Noticias"));
                rowInline1.add(new InlineKeyboardButton().setText("Objetos Perdidos").setCallbackData("Objetos Perdidos"));
                rowsInline.add(rowInline1);
               List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
                rowInline2.add(new InlineKeyboardButton().setText("Comunicado").setCallbackData("Comunicado"));
                rowInline2.add(new InlineKeyboardButton().setText("Horarios").setCallbackData("Horarios"));
                rowsInline.add(rowInline2);
               List<InlineKeyboardButton>  rowInline3 = new ArrayList<>();
                rowInline3.add(new InlineKeyboardButton().setText("Tarifario").setCallbackData("Tarifario"));
                // Set the keyboard to the markup
                rowsInline.add(rowInline3);
                // Add it to the message
                markupInline.setKeyboard(rowsInline);
                message.setReplyMarkup(markupInline);
                try {
                    execute(message); //Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
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
}
  /*  @Override
    public String getBotUsername() {
        return "Pumachat2";
    }

    @Override
    public String getBotToken() {
        return "995973762:AAE_eVo6XEd1fuMiei1Z7D-j7v8UhIncDHc";
    }*/

    /* case "\uD83D\uDE8C Ruta Chasquipampa":
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
                break;*/
