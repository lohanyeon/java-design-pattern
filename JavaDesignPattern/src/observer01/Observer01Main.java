package observer01;

import observer01.AnnualSubscriber;
import observer01.EventSubscriber;
import observer01.NewsMachine;

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
public class Observer01Main {
    public static void main(String[] args) {
        NewsMachine newsMachine = new NewsMachine();
        AnnualSubscriber annualSubscriber = new AnnualSubscriber(newsMachine);
        EventSubscriber eventSubscriber = new EventSubscriber(newsMachine);

        newsMachine.setNewsInfo("오늘 한파,", "전국 영화 18도 입니다.");
        annualSubscriber.withdraw();
        newsMachine.setNewsInfo("벚꽃 축제합니다", "다같이 벚꽃보러~");
    }
}
