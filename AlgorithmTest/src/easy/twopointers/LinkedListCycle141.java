package easy.twopointers;

import java.util.HashSet;

import org.w3c.dom.Node;

public class LinkedListCycle141 {
	public boolean hasCycle(Node head) {
		HashSet<Object> nodes = new HashSet<>();
		while (head != null) {
			if (nodes.contains(head))
				return true;
			else {
				nodes.add(head);
			}
			head = head.getNextSibling();
		}
		return false;

	}
}
