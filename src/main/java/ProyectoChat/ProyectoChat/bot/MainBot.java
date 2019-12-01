package ProyectoChat.ProyectoChat.bot;


import ProyectoChat.ProyectoChat.bl.UserBl;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;


public class MainBot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {

//            System.out.println(update.getMessage().getText());
//            System.out.println(update.getMessage().getFrom().getFirstName() );

        UserBl userBl;

        String command = update.getMessage().getText();

        SendMessage message = new SendMessage();

        if (command.equals("/myname")) {

            System.out.println(update.getMessage().getFrom().getFirstName());

            message.setText(update.getMessage().getFrom().getFirstName());
        }

        if (command.equals("/mylastname")) {

            System.out.println(update.getMessage().getFrom().getLastName());
            message.setText(update.getMessage().getFrom().getLastName());
        }

        if (command.equals("/myfullname")) {
            System.out.println(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());
            message.setText(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());
        }

        message.setChatId(update.getMessage().getChatId());


        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

/*    public void onUpdateReceived(final Update update) {

        // Esta función se invocará cuando nuestro bot reciba un mensaje
        /* File doc = new File();

        CommandManager comand = new CommandManager();
        final String messageTextReceived = update.getMessage().getText();
        // Se obtiene el id de chat del usuario
        final long chatId = update.getMessage().getChatId();
        final String nombre = update.getMessage().getFrom().getFirstName();
        String mensaje = comand.manageImage(messageTextReceived);


        if (messageTextReceived.equals("/menu")){

            CommandManager commandManager = new CommandManager();
            SendMessage keyboard = commandManager.CreateKeyboard("/menu", chatId);
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
        } *

        //Codigo para saber el File ID de una imagen, se debe poner como comentario cuando no sea necesario
        /*if (update.hasMessage() && update.getMessage().hasPhoto()) {
            PhotoIdentifier img = new PhotoIdentifier();
            SendPhoto photomsg = img.getImageDetails(update.getMessage().getPhoto(),chatId);

            try {
                execute(photomsg); // Call method to send the photo with caption
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }*/


    @Override
    public String getBotUsername() {
        return "Pumachat2";
    }

    @Override
    public String getBotToken() {
        return "995973762:AAE_eVo6XEd1fuMiei1Z7D-j7v8UhIncDHc";
    }

    private ReplyKeyboardMarkup createReplyKeyboardPumaChat() {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        //Lista registro de usuario
        List<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add("Registrar Usuario");
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;
    }

    public void response(int conversation, Update update) {
        List<String> responses = new ArrayList<>();
        ReplyKeyboardMarkup rekema = null;
        switch (conversation) {
            case 1:
                responses.add("Bienvenido");
                responses.add("Ingresa tu nombre");
                break;
            case 2:
                responses.add("Ingresa tu apellido");
                break;
            case 3:
                responses.add("Ingresa tu fecha de nacimiento");
                break;
        }

    }
}
