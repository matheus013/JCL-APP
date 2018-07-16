package laccan.persistence;

import net.anotheria.moskito.web.MoskitoFilter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * This filter counts requests by domain.
 * @author lrosenberg
 *
 */
public class DomainFilter extends MoskitoFilter {
    @Override
    protected String extractCaseName(ServletRequest req, ServletResponse res) {
        return req.getServerName();
    }
}