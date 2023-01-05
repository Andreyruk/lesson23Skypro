package transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> queue = new LinkedList<>();

    public Queue<Transport> addToQueueAuto(Transport auto) {
        if (!auto.getClass().equals(Bus.class)) {
            queue.offer(auto);
        } else {
            System.out.println(auto.getBrand() + " это автобус и поэтому техосмотр не требуется");
        }

        return queue;
    }

    public boolean doImaginationCar() {
        Transport auto = queue.poll();
        if (auto != null) {
            System.out.printf("%s, проходит техосомтр: ", auto);
            System.out.printf("%s, прошла техосомтр и удалена из очереди %n", auto);
            return true;
        }
        System.out.println("все авто прошли техосмотр");
        return false;
    }

    public Queue<Transport> getQueue() {
        return queue;
    }
}
