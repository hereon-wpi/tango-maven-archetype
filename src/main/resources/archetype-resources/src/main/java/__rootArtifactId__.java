#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tango.server.annotation.*;
import org.tango.server.ServerManager;
import org.tango.DeviceState;

/**
 * @author ${author-name} <${author-email}>
 * @since ${date}
 */
@Device(transactionType = TransactionType.NONE)
public class ${rootArtifactId} {
    private final Logger logger = LoggerFactory.getLogger(${rootArtifactId}.class);

    @State
    private DeviceState state;
    @Status
    private String status;


    @Init
    @StateMachine(endState = DeviceState.ON)
    public void init() throws Exception {
        logger.trace("init");
    }

    @Delete
    @StateMachine(endState = DeviceState.OFF)
    public void delete() throws Exception {
        logger.trace("delete");
    }

    public static void main(String[] args) {
        ServerManager.getInstance().start(args, ${rootArtifactId}.class);
    }


    public void setState(DeviceState state) {
        logger.trace("new state={}", state);
        this.state = state;
    }

    public DeviceState getState() {
        logger.trace("state={}", state);
        return state;
    }

    public String getStatus() {
        logger.trace("status={}", status);
        return status;
    }

    public void setStatus(String status) {
        logger.trace("new status={}", status);
        this.status = status;
    }
}
