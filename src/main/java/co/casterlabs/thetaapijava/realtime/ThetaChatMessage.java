package co.casterlabs.thetaapijava.realtime;

import java.util.List;

import co.casterlabs.rakurai.json.annotating.JsonClass;
import co.casterlabs.rakurai.json.annotating.JsonField;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonClass(exposeAll = true)
public class ThetaChatMessage {
    @JsonField("message_id")
    private String messageId;

    private String text;
    private long timestamp;

    private ThetaChatUser user;
    private List<ThetaChatEmote> emotes;

}
