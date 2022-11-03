package co.casterlabs.thetaapijava.realtime;

public interface ThetaPubNubListener {

    public void onOpen();

    public void onClose();

    public void onChatMessage(ThetaChatMessage chatMessage);

}
