package rain.dsys.ai.service.tasks;

import org.springframework.stereotype.Component;

@Component
public interface Task {

    void doWork();

    void doWork(String message);

}
