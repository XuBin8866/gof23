package iterator.iterators;

import iterator.profile.Profile;

/**
 * @author xubin
 * @date 2021/6/4 17:25
 */
public interface ProfileIterator {
	boolean hasNext();
	Profile getNext();
	void reset();
}
