package enums;

public enum Formatter {
    CALM {
        @Override
        public String format(String message) {
            return "Here is your message: " + message;
        }
    },
    NERVOUS {
        @Override
        public String format(String message) {
            return "ARGH! Stop bothering me with your message: " + message + "!!!";
        }
    };

    public abstract String format(String message);
}
