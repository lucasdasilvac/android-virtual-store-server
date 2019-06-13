package lucasdasilvac.dev.androidvirtualstoreserver.Common;

import lucasdasilvac.dev.androidvirtualstoreserver.Model.User;

public class Common {
    public static User currentUser;

    public static final String UPDATE = "atualizar";
    public static final String DELETE = "deletar";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code) {
        if(code.equals("0"))
            return "realizado";
        else if(code.equals("1"))
            return "a caminho";
        else
            return "enviado";
    }
}
