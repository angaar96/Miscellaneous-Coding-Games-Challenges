// note solution taken from https://www.youtube.com/watch?v=orCMI6WjoIw

const mergeTwoLists = (list1, list2) => {
  let dummy = new ListNode(-1);
  let head = dummy; 
  while (list1 != null && list2 != null) {
    if (list1.val <= list2.val) {
      dummy.next = list1; 
      list1 = list1.next; 
    } else {
      dummy.next = list2; 
      list2 = list2.next; 
    }
    dummy = dummy.next; 
  }
  // attach remaining linked list
  if (list1 != null) {
    dummy.next = list1;
  } else {
    dummy.next = list2; 
  }

  return head.next; 
}

// JS doesnt have in-built list nodes

class ListNode {
  constructor(val = null, next = null) {
    this.val = val; 
    this.next = next; 
  }
}