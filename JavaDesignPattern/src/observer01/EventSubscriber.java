package observer01;

/**
 * <pre>
 *
 * </pre>
 *
 * @Company : EluoCNC
 * @Author : FAE01389
 * @Date : 2019-07-11
 * @Version : 1.0
 */
public class EventSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;

    public EventSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        this.newsString = title + " \n ------------ \n " + news;
        display();
    }

    public void widthdraw() {
        publisher.delete(this);
    }

    public void display() {
        System.out.println("\n\n=== 이벤트 유저 ===");
        System.out.println("\n\n" + newsString);
    }
}
