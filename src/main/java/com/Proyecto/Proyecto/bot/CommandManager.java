package com.Proyecto.Proyecto.bot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    public String manageURL(String command){
        String url ="";
        if ("/Achumani".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/pdf/Mapa%20Oficial%20Achumani.pdf";
        }
        if ("/Chasquipampa".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutachasquipampa.pdf";
        }
        if ("/Tarifa".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/slide/tarifario_nuevo1.png";
        }
        if ("/Villa Salome".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutavillasalome.pdf";
        }
        if ("/Inca Llojeta".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/Mapa%20Final%20Integradora%20Web-01.png";
        }
        if ("/Irpavi II".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/rutas/IRPAVI%20MAPA%20SOLO-02.pdf";
        }
        if ("/Caja Ferriviaria".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/rutas/%20CAJA%20FERROVIARIA-02-02-02.jpg";
        }
        if ("/Integradora".equals(command)) {
            url="http://www.lapazbus.bo/fileman/Uploads/files/Mapa%20Final%20Integradora%20Web-01.png";
        }
        return url;
    }



    public SendMessage CreateKeyboard(String command,long  idtelegram){


        SendMessage message = new SendMessage().setChatId(idtelegram);
        // Create ReplyKeyboardMarkup object
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        // Create the keyboard (list of keyboard rows)
        List<KeyboardRow> keyboard = new ArrayList<>();
        // Create a keyboard row
        KeyboardRow row = new KeyboardRow();

        if (command.equals("/start")) {
            message.setText("Bienvendo! Tenemos estas opciones");
            // Set each button, you can also use KeyboardButton objects if you need something else than text
            row.add("\uD83D\uDE8C ¿Qué rutas existen?");
            row.add("\uD83D\uDE8C ¿Dónde está mi Puma?");
            // Add the first row to the keyboard
            keyboard.add(row);
            // Create another keyboard row
            row = new KeyboardRow();
            // Set each button for the second line
            row.add("\uD83D\uDCB0  ¿Qué bus debo tomar?");
            row.add("Información");
            row.add("Registrarme");
            // Add the second row to the keyboard
            keyboard.add(row);
            // Set the keyboard to the markup
            keyboardMarkup.setKeyboard(keyboard);
            // Add it to the message
            message.setReplyMarkup(keyboardMarkup);
        }else
        if (command.equals("Información")) {
            message.setText("Tenemos estas opciones");
            row.add("Noticias");
            row.add("Objetos Perdidos");
            row.add("Comunicados");
            keyboard.add(row);
            row = new KeyboardRow();
            row.add("Horarios");
            row.add("Tarifa");
            row.add("/start");
            keyboard.add(row);
            keyboardMarkup.setKeyboard(keyboard);
            // Add it to the message
            message.setReplyMarkup(keyboardMarkup);


        } else
        if (command.equals("\uD83D\uDE8C ¿Dónde está mi Puma?")) {
            message.setText("Activa tu GPs \n Para volver al menú principal presiona: /start ");
            keyboardMarkup = new ReplyKeyboardMarkup();
            KeyboardButton keyboardButton = new KeyboardButton();
            // Create the keyboard (list of keyboard rows)
            keyboard = new ArrayList<>();
            row = new KeyboardRow();
            keyboardButton.setText("Enviar Ubicacion");
            keyboardButton.setRequestLocation(true);
            row.add(keyboardButton);
            keyboard.add(row);
            keyboardMarkup.setKeyboard(keyboard);
            message.setReplyMarkup(keyboardMarkup);
        }else
            if (command.equals("\uD83D\uDE8C ¿Qué rutas existen?")){
                message.setText("Estas son nuestras rutas:  \n Para volver al menú principal presiona: /start");
                row.add("Inca Llojeta");
                row.add("Villa Salome");
                row.add("Chasquipampa");
                keyboard.add(row);
                row = new KeyboardRow();
                row.add("Caja Ferroviaria");
                row.add("Integradora");
                row.add("Irpavi II");
                row.add("Achumani");
                keyboard.add(row);
                keyboardMarkup.setKeyboard(keyboard);
                message.setReplyMarkup(keyboardMarkup);
            }else
                if (command.equals("Registrarme")){
                    message.setText("Tipo de Registro \n Para volver al menú principal presiona: /start");
                    row.add("Cliente");
                    keyboard.add(row);
                    row = new KeyboardRow();
                    row.add("Administrador");
                    keyboard.add(row);
                    keyboardMarkup.setKeyboard(keyboard);
                    message.setReplyMarkup(keyboardMarkup);
                }

        return message;
    }
}
