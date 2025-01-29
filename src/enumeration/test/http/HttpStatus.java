package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"),BAD_REQUEST(400,"Bad Request"),NOT_FOUND(404,"Not found"),INTERNAL_SERVER_ERROR(500,"Internal Server Error");
    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        HttpStatus[]httpStatuses=HttpStatus.values();
        for (HttpStatus httpStatus : httpStatuses) {
            if(httpStatus.getCode()==httpCodeInput){
                return httpStatus;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code>=200 && code<=299;
    }
}
