package Krivitskiy;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {
	private static Logger LOG = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		logWithDomConfigurator();
	}

	public static void logWithDomConfigurator() {
		DOMConfigurator.configure("LoggerConfig.xml");
		LOG.debug("DEBUG Logger message");
		LOG.info("INFO Logger message");
		LOG.warn("WARN Logger message");
		
		LOG.error("ERROR Logger message");
	}

}
