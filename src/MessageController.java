public class MessageController {
    private Message model;
    private View view;
    private boolean isFirstIt=false;
    private boolean isSecondIt=false;



     MessageController(Message model, View view) {
        this.model = model;
        this.view = view;
    }

    public void createMessage(){
        for (String ell:model.getParameters()) {
            if(ell.equals(model.getFirst())){
                isFirstIt=true;
            }else
            if(ell.equals(model.getSecond())){
                isSecondIt=true;
            }else
                view.printError(ell);


        }
        if(isSecondIt && isFirstIt){
            view.printMessage();
        }
        else
            view.printMessageSecond();

    }
}
