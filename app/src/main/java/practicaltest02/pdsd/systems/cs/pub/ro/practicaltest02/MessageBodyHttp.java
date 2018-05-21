package practicaltest02.pdsd.systems.cs.pub.ro.practicaltest02;

public class MessageBodyHttp {

    private String body;

    public MessageBodyHttp(String body)
    {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString()
    {
        return this.body;
    }

}
