package tgBotClass;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SetMyCommands;
import com.pengrad.telegrambot.response.SendResponse;
import org.hibernate.validator.internal.constraintvalidators.bv.time.futureorpresent.AbstractFutureOrPresentJavaTimeValidator;
import java.util.List;
//"6220115956:AAFqcK2689g7h08WTpApS5J4Finr1evIK0k"
//"#{bot.token}"
public class TgBot {
    TelegramBot bot = new TelegramBot("6220115956:AAFqcK2689g7h08WTpApS5J4Finr1evIK0k");
    public void startBot(){
        TgBotMethods tgBotMethods = new TgBotMethods();
        tgBotMethods.setBot(bot);
        tgBotMethods.setUpdateListener();


        BotCommand[] botCommands = {new BotCommand("start","зарегистрировать пользователя"),
                new BotCommand("help","вывести окно с командами"),
            new BotCommand("track","начать отслеживание ссылки"),
            new BotCommand("untrack", "прекратить отслеживание ссылки"),
            new BotCommand("list", "показать список отслеживаемых ссылок")};
        bot.execute(new SetMyCommands(botCommands));

    }
}

