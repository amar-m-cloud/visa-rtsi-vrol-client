
package io.github.brendonfm.visa.util;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LoggingUtils {
	@SuppressWarnings("rawtypes")
	public static void debug(final Class originClass, final String methodName, final Object... parametersValue) {
		final Logger LOGGER = LoggerFactory.getLogger(originClass);

		LOGGER.debug("m=" + methodName + LoggingUtils.mountLog(originClass, methodName, parametersValue));
	}

	@SuppressWarnings("rawtypes")
	public static void error(final Class originClass, final String methodName, final Object... parametersValue) {
		final Logger LOGGER = LoggerFactory.getLogger(originClass);
		LOGGER.error("m=" + methodName + LoggingUtils.mountLog(originClass, methodName, parametersValue));
	}

	@SuppressWarnings("rawtypes")
	private static String mountLog(final Class originClass, final String methodName, final Object... parametersValue) {

		final StringBuffer sbParameters = new StringBuffer();
		sbParameters.append(" (");
		for (final Object parameter : parametersValue) {
			if (parameter != null) {
				try {
					sbParameters.append(parameter.getClass().getSimpleName()
					        + " = "
					        + new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(parameter));
				} catch (final IOException e) {
					sbParameters.append(parameter.getClass().getSimpleName() + " = " + parameter);
				}
			}

		}
		sbParameters.append(") ");

		return sbParameters.toString();
	}

}
