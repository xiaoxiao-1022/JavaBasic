package factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @NAME:SenderFactory
 * @Desc:开源项目
 * @author: wupei
 * @date: 2024/4/17
 */
public class SenderFactory {
    public static final String  SMS_SENDER = "smsSender";
    public static final String  MAIL_SENDER = "MailSender";
    private static Map<String,Sender> senderMap = new HashMap<String, Sender>(16);

    static {
        senderMap.put(SMS_SENDER,new SmsSender());
        senderMap.put(MAIL_SENDER,new MailSender());
    }

    public Sender getSender(String smsType){
        return senderMap.get(smsType);
    }
}
