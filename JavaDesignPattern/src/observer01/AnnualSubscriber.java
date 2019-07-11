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
public class AnnualSubscriber implements Observer {
    private String newsString;
    private Publisher publisher;

    public AnnualSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
        //publisher.delete(this);
    }

    @Override
    public void update(String title, String news) {
        this.newsString = title + " \n ------------ \n " + news;
        display();
    }

    public void withdraw() {
        publisher.delete(this);
    }

    private void display() {
        System.out.println("\n\n오늘의 뉴스\n=========================\n\n" + newsString);
    }
}
