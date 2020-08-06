package io.golok56.github;

public class MainViewModel {
    private ResponseObservable response = new ResponseObservable();
    private IntentClassifier intentClassifier = IntentClassifier.getInstance();
    private ChatFactory chatFactory = new ChatFactory();

    public ResponseObservable getResponse() {
        return response;
    }

    public void classifyMessage(String message) {
        String intent = intentClassifier.classify(message);
        Chat chat = chatFactory.createChat(intent);

        if (chat instanceof ProductChat) ((ProductChat) chat).setProducts(new String[]{"Ayam", "Sate", "Kambing"});
        else if (chat instanceof PaymentConfirmationChat) ((PaymentConfirmationChat) chat).setOrderNum("112156");
        response.setResponse(chat.getResponseText());
    }
}
