package br.com.swapi.api.logger.aspects;

import org.apache.logging.log4j.Logger;

/**
 * Enum para tratar os níveis de log
 * 
 * @author Clayton Morais de Oliveira
 *
 */
public enum Level {
	
	INFO {
		/* (non-Javadoc)
		 * @see br.gov.caixa.sisgr.poc.model.logger.Level#logger(org.apache.logging.log4j.Logger, java.lang.String)
		 */
		@Override
		public void logger(Logger logger,String message) {
			logger.info(message);			
		}
	},DEBUG {
		/* (non-Javadoc)
		 * @see br.gov.caixa.sisgr.poc.model.logger.Level#logger(org.apache.logging.log4j.Logger, java.lang.String)
		 */
		@Override
		public void logger(Logger logger,String message) {
			logger.debug(message);	
		}
	},ERROR {
		/* (non-Javadoc)
		 * @see br.gov.caixa.sisgr.poc.model.logger.Level#logger(org.apache.logging.log4j.Logger, java.lang.String)
		 */
		@Override
		public void logger(Logger logger,String message) {
			logger.error(message);	
			
		}
	},FATAL {
		/* (non-Javadoc)
		 * @see br.gov.caixa.sisgr.poc.model.logger.Level#logger(org.apache.logging.log4j.Logger, java.lang.String)
		 */
		@Override
		public void logger(Logger logger,String message) {
			logger.fatal(message);
			
		}
	};
	
	
	/**
	 * Loga a mensagem
	 * @param logger objeto log4J
	 * @param message Mensagem a ser logada
	 */
	public abstract void logger(Logger logger,String message);
	

}
