package solution2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import javax.annotation.Nullable;

@EqualsAndHashCode(of = "val")
@AllArgsConstructor
class ListNode {

    int val;
    @Nullable
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
