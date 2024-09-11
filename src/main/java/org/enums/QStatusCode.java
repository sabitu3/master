package org.enums;



public enum QStatusCode {
    CODE_200(200, "status api pass"),
    CODE_201(201, ""),

    CODE_204(204, ""),
    CODE_500(500, ""),
    CODE_501(501, ""),

    CODE_400(400, ""),
    CODE_401(401, ""),
    CODE_402(402, ""),
    CODE_403(403, ""),
    CODE_404(404, ""),
    CODE_405(405, ""),
    CODE_409(409, ""),
    CODE_422(422, ""),
    CODE_451(451, ""),
    CODE_202(202, "");
    public final int code;
    public final String msg;

    QStatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

  /* public int getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }*/
}
