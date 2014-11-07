package it.campe.filo.state.machine;

/**
 *
 * @author filippo.campegiani
 */
public enum State {
    
    FOO {
		int i;
		@Override
		protected State execute() {
			return i++ >= 2 ? BAR : this;
		}},
    BAR {
		int i = 0;
		@Override
		protected State execute() {
			return i++ == 0 ? FOO : HALT;
		}},
    HALT {
		@Override
		protected State execute() {
			return null;
		}};
	
	protected abstract State execute();
    
}
