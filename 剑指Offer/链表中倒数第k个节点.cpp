ListNode* Find(ListNode* head, int k){
	ListNode* ahead = head;
	ListNode* behind = null;

	for(int i = 0; i < k; i++){
		ahead = head->next;
	}

	behind = head;

	while(ahead->next != null){
		ahead = ahead->next;
		behind = behind->next;
	}

	return behind;
}