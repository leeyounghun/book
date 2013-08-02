package _2_observer.interfaces;

public interface Subject {
	/**
	 * if success return ture or false;
	 * @return
	 */
	public Boolean removeObserver(Observer obs);;
	/**
	 *
	 * @return sizre of notified observers
	 */
	public Integer notifyObservers();
	/**
	 *
	 * return size of registed observers
	 * @param obs
	 * @return
	 */
	public Integer registerObserver(Observer obs);

}
