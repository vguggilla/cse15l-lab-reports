import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    StringBuilder message = new StringBuilder();
    int num = 1;
    
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "String Server";
        } else if(url.getPath().equals("/add-message")){
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                try{
                    //adding number, removing %20s for spaces, adding new line
                    String newMessage = num + ". " + URLDecoder.decode(parameters[1], "UTF-8") + "\n";
                    message.append(newMessage);
                    num++;
                    return message.toString();
                } 
                catch(IOException e){
                    return "Error decoding message";
                }
            }
            else {
                return "Invalid request format";
            }
        } else {
            return "404 Not Found!";
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
