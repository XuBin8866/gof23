package iterator.socialnetworks;

import iterator.iterators.ProfileIterator;

/**
 * @author xubin
 * @date 2021/6/4 17:40
 */
public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);
	ProfileIterator createCoworkersIterator(String profileEmail);
}
