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
public interface Publisher {
    void add(Observer observer);

    void delete(Observer observer);

    void notifyObserver();
}
