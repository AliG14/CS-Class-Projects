import fi.iki.elonen.NanoHTTPD;

import java.io.IOException;

public class Webserver extends NanoHTTPD {
    public Webserver() {
        super(80);
    }

    public Response serve(final IHTTPSession session) {
        return newFixedLengthResponse("Test");
    }

    public static void main(String[] args) throws IOException {
        Webserver server = new Webserver();
        server.start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
    }
}
