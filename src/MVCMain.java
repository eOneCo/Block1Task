public class MVCMain {

    public static void main(String[] args) {
        Message model=new Message(args);
        View view=new View();
        MessageController controller=new MessageController(model,view);
        controller.createMessage();
    }
}
