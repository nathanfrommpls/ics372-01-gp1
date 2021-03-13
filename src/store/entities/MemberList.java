package store.entities;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MemberList implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Member> members = new LinkedList<Member>();

	/**
	 * Checks whether a member with a given member id exists.
	 * 
	 * @param memberId the id of the member
	 * @return true iff member exists
	 * 
	 */
	public Member search(String memberId) {
		for (Iterator<Member> iterator = members.iterator(); iterator.hasNext();) {
			Member member = iterator.next();
			if (member.getId().equals(memberId)) {
				return member;
			}
		}
		return null;
	}

	/**
	 * Inserts a member into the collection
	 * 
	 * @param member the member to be inserted
	 * @return true iff the member could be inserted. Currently always true
	 */
	public boolean insertMember(Member member) {
		members.add(member);
		return true;
	}

	public boolean removeMember(Member member) {
		int index = members.indexOf(member);
		members.remove(index);
		return true;
	}

	public Iterator<Member> iterator() {
		return members.iterator();
	}

	/**
	 * String form of the collection
	 * 
	 */
	@Override
	public String toString() {
		return members.toString();
	}
}