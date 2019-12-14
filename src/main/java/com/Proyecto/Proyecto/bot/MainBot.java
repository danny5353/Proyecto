package com.Proyecto.Proyecto.bot;

import com.Proyecto.Proyecto.api.UsuarioController;
import com.Proyecto.Proyecto.bl.BotBl;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MainBot  extends TelegramLongPollingBot {
    private UsuarioController UsuarioController;
   /* BotBl botBl;

   public MainBot(BotBl UsuarioBl) {
        this.botBl = UsuarioBl;
    }*/

    @Autowired
    UsuarioController usuarioController;
    public MainBot(com.Proyecto.Proyecto.api.UsuarioController usuarioController) {
        this.UsuarioController = usuarioController;
    }
    public MainBot() {

    }

    String nombre;
    String apellido;
    String correo;
    String telefono;
    String fechaNac;
    int idtelegram;
     @Override
     public void onUpdateReceived(final Update update) {
             CommandManager command = new CommandManager();
             final String messageTextReceived = update.getMessage().getText();
             // Se obtiene el id de chat del usuario
             final long chatId = update.getMessage().getChatId();
             //  final String nombre = update.getMessage().getFrom().getFirstName();

             SendMessage message = new SendMessage();
             if (messageTextReceived.equals("/start")) {
                 CommandManager commandManager = new CommandManager();
                 SendMessage keyboard = commandManager.CreateKeyboard("/start", chatId);

                 try {
                     // Se envía el mensaje
                     execute(keyboard);
                 } catch (TelegramApiException e) {
                     e.printStackTrace();
                 }
             }
             //SendPhoto msg = new SendPhoto().setChatId(chatId);

             switch (messageTextReceived) {
                 case "\uD83D\uDE8C ¿Qué rutas existen?":
                     if (update.hasMessage() && update.getMessage().hasText()) {
                         message = new SendMessage().setChatId(chatId).setText("¿Qué rutas existen?");
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
                    /*if (call_data.equals("Chasquipampa")) {
                        msg.setPhoto("AgADAQADpagxG3eDcEazYQczT2q0cn3hawYABAEAAwIAA3kAA2dpAQABFgQ").setCaption("Ruta Chasquipampa - PUC");
                        try {
                            execute(msg);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                    }*/
                     }
                     break;
                 case "\uD83D\uDE8C ¿Dónde está mi Puma?":
                     if (messageTextReceived.equals("\uD83D\uDE8C ¿Dónde está mi Puma?")) {
                         CommandManager commandManager = new CommandManager();
                         SendMessage keyboard = commandManager.CreateKeyboard("\uD83D\uDE8C ¿Dónde está mi Puma?", chatId);
                         try {
                             // Se envía el mensaje
                             execute(keyboard);
                         } catch (TelegramApiException e) {
                             e.printStackTrace();
                         }
                     }
                     break;

                 case "\uD83D\uDCB0 ¿Qué bus debo tomar?":

                     break;
                 case "Registrarme":
                     message = new SendMessage().setChatId(chatId).setText("Registrarme");
                     switch (messageTextReceived) {
                         case "Ingresa Tu nombre":
                             message.setText("Favor de ingresar tu nombre");
                             nombre = update.getMessage().getText();
                             break;
                     }

                     message.setText("Favor de ingresa tu apellido materno y paterno");
                     apellido = update.getMessage().getText();
                     message.setText("Favor de ingresar tu correo electronico");
                     correo = update.getMessage().getText();
                     message.setText("Favor ingresa tu fecha de nacimiento aa/mm/dd");
                     fechaNac = update.getMessage().getText();
                     message.setText("Favor ingrese su numero de telefono");
                     telefono = update.getMessage().getText();
                     System.out.println(nombre + apellido + correo + fechaNac + telefono);
                     message.setChatId(update.getMessage().getChatId());

                     try {
                         execute(message);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                     break;
                 case "Información":

                     if (messageTextReceived.equals("Información")) {
                         CommandManager commandManager = new CommandManager();
                         SendMessage keyboard = commandManager.CreateKeyboard("Información", chatId);
                         try {
                             // Se envía el mensaje
                             execute(keyboard);
                         } catch (TelegramApiException e) {
                             e.printStackTrace();
                         }
                         if (message.equals("Noticias")){
                             message = new SendMessage().setText("Noticias");
                             message.setText("llalalla");

                             try {
                                 // Se envía el mensaje
                                 execute(message);
                             } catch (TelegramApiException e) {
                                 e.printStackTrace();
                             }
                         }
                     }

                     break;
             }
      }




        public void response ( int conversation, Update update){
            List<String> responses = new ArrayList<>();

            ReplyKeyboardMarkup rkm = null;
            KeyboardButton kb = null;
            switch (conversation) {

//Registro inicial

                case 1:
                    responses.add("Bienvenido a PumaChat!");
                    responses.add("Para comenzar necesitamos algunos datos personales");
                    responses.add("Ingresa tu nombre");
                    break;
                case 2:
                    responses.add("Ingresa tu apellido");
                    break;
                case 3:
                    responses.add("Ingresa tu fecha de nacimiento");
                    break;
            }
            for (String messageText : responses) {
                SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                        .setChatId(update.getMessage().getChatId())
                        .setText(messageText);
                if (rkm != null) {
                    message.setReplyMarkup(rkm);
                } else {
                    ReplyKeyboardRemove keyboardMarkupRemove = new ReplyKeyboardRemove();
                    message.setReplyMarkup(keyboardMarkupRemove);
                }
                try {
                    this.execute(message);

                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }

        private ReplyKeyboardMarkup createOkMenu () {
            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();

            List<KeyboardRow> keyboard = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add("OK");
            // Add the first row to the keyboard
            keyboard.add(row);
            // Create another keyboard row
            // Set the keyboard to the markup
            keyboardMarkup.setKeyboard(keyboard);
            // Add it to the message
            return keyboardMarkup;

        }


     /*   System.out.println(update);
        update.getMessage().getFrom().getId();
        if (update.hasMessage() && update.getMessage().hasText()) {
            List<String> messages = botBl.processUpdate(update);
            for (String messageText : messages) {
                SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                        .setChatId(update.getMessage().getChatId())
                        .setText(messageText);
                try {
                    this.execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/

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
