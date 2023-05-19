package service;

import org.springframework.stereotype.Component;
import dto.DataClass;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseService {

    public String startResponse(DataClass user, Long ctx){

        return "Welcome\uD83D\uDE24";
    }

    public String trackResponse(DataClass user, String secondArg){
        if(user!=null)
            if (user.links!=null) {
                user.links.add(secondArg);
                return "Link succefully added";
            }
        return "Press /start";

    }

    public String untrackResponse(DataClass user, Long ctx){
        if(user!=null&&user.links!=null)
            return "Untracked";
        return "Link succefully added";
    }

    public String listResponse(DataClass user, Long ctx){
        if(user!=null)
            return "The command 'list' was used. Links: " + user.links.toString();
        return "The command 'list' was used. There is no links";
    }
}