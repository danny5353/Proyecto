package com.Proyecto.Proyecto.bot;


import com.Proyecto.Proyecto.bl.UsuarioBl;
import com.Proyecto.Proyecto.dao.UsuarioRepository;
import com.Proyecto.Proyecto.domain.Usuario;
import com.Proyecto.Proyecto.dto.Status;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MainBot  extends TelegramLongPollingBot {
   /* private UsuarioController UsuarioController;
    BotBl botBl;

   public MainBot(BotBl UsuarioBl) {
        this.botBl = UsuarioBl;
    }*/
UsuarioBl UsuarioBl;
    public MainBot( UsuarioBl UsuarioBl) {
        this. UsuarioBl = UsuarioBl;
    }
  private UsuarioRepository UsuarioRepository;

    public MainBot(UsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
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
             SendPhoto msg = new SendPhoto().setChatId(chatId);

             switch (messageTextReceived) {
                 case "\uD83D\uDE8C ¿Qué rutas existen?":
                     if (update.hasMessage() && update.getMessage().hasText()) {
                         if (messageTextReceived.equals("\uD83D\uDE8C ¿Qué rutas existen?")) {
                             CommandManager commandManager = new CommandManager();
                             SendMessage keyboard = commandManager.CreateKeyboard("\uD83D\uDE8C ¿Qué rutas existen?", chatId);
                             try {
                                 // Se envía el mensaje
                                 execute(keyboard);
                             } catch (TelegramApiException e) {
                                 e.printStackTrace();
                             }
                         }
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
                     if (messageTextReceived.equals("Registrarme")) {
                         CommandManager commandManager = new CommandManager();
                         SendMessage keyboard = commandManager.CreateKeyboard("Registrarme", chatId);
                         try {
                             // Se envía el mensaje
                             execute(keyboard);
                         } catch (TelegramApiException e) {
                             e.printStackTrace();
                         }
                     }
                     break;
//Intento de Registro
                 case "Cliente":
                     message = new SendMessage().setChatId(chatId).setText("Cliente");
                     message.setText("Favor de ingresar tu nombre");
                     nombre = update.getMessage().getText();
                     Usuario usuario= new Usuario();
                     usuario.setEstado(Status.ACTIVE.getStatus());
                     usuario.setNombre(nombre);
                     UsuarioBl.create(usuario);
                     message.setChatId(update.getMessage().getChatId());
                     try {
                         execute(message);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }

                    /* usuario.setNombre(nombre);
                     usuario.setApellido(apellido);
                     usuario.setCorreo(correo);
                     //usuario.setFechaNac(fechaNac);
                     //usuario.setTelefono(telefono);*/


                     break;
//Informacion
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

                     }

                     break;

                 case "Noticias":
                     message = new SendMessage().setChatId(chatId).setText("Noticias");
                     message.setText("");
                     try {
                         execute(message);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                 case "Tarifario":
                     msg.setPhoto("AgADAQADO6gxG5vtaEb43oGeNJVevrbsawYABAEAAwIAA3kAAzdoAQABFgQ").setCaption("Tarifario");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                     break;
                 case "Horarios":
                     msg.setPhoto("AgADAQADpKgxG3eDcEaEXKbaFSUTkTW3bgYABAEAAwIAA3kAAydWAAIWBA").setCaption("Horarios del Servicio");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                     break;
//Rutas
                 case "Achumani":
                     msg.setPhoto("AgADAQADpqgxG3eDcEZP7u1IjS035Rj0awYABAEAAwIAA3kAAxZlAQABFgQ").setCaption("Ruta Achumani - San Pedro \n https://www.youtube.com/watch?v=Z1Mk_c85wGo&feature=emb_title ");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                        e.printStackTrace();
                     }
                     break;
                 case "Integradora":
                     msg.setPhoto("AgADAQADRqgxG0visUfl4t0o_qQHeWgbFDAABAEAAwIAA3kAA2siBQABFgQ").setCaption("Ruta integradora \n https://www.youtube.com/watch?v=Z1Mk_c85wGo&feature=emb_title ");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                     break;
                 case "Irpavi":
                     msg.setPhoto("AgADAQADRagxG0visUchLTNrrbQRaGDiawYABAEAAwIAA3kAAy7JAQABFgQ").setCaption("Ruta Irpavi II - PUC \n https://www.youtube.com/watch?v=Z1Mk_c85wGo&feature=emb_title ");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                     break;
                 case "Caja Ferroviaria":
                     msg.setPhoto("AgADAQADLKgxG7bcuEfW6d26vEx4IAjbbgYABAEAAwIAA3kAA6gjAAIWBA").setCaption("Ruta Caja Ferroviaria \n https://www.youtube.com/watch?v=Z1Mk_c85wGo&feature=emb_title ");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                     break;
                 case "Villa Salome":
                     msg.setPhoto("AgADAQADK6gxG7bcuEfi5fzz4anhnuURFDAABAEAAwIAA3kAAxMmBQABFgQ").setCaption("Villa Salome - PUC \n https://www.youtube.com/watch?v=Z1Mk_c85wGo&feature=emb_title ");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
                     }
                     break;
                 case "Inca Llojeta":
                     msg.setPhoto("AgADAQADRKgxG0visUcizvGTLneUH7TgbgYABAEAAwIAA3kAA5IkAAIWBA").setCaption("Ruta Inca Llojeta - PUC \n https://www.youtube.com/watch?v=Z1Mk_c85wGo&feature=emb_title ");
                     try {
                         execute(msg);
                     } catch (TelegramApiException e) {
                         e.printStackTrace();
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
