const deleteDuplicates = (head) => {
  // head represents a linked list but also currently points to the first value of the linked list. 
  let curr = head; 
  // as the last element would point to null, we check to see if we're not there (or its not next)
  while (curr !== null && curr.next !== null) {
    if (curr.val === curr.next.val) {
      curr.next = curr.next.next; 
    } else {
      curr = curr.next; 
    }
  }
  return head; 
  // head isnt only the head of the linkedlist since its connected to all the other nodes it returns the entire linked list.  
}