struct ListNode{
	int m_nValue;
	ListNode* m_pNext;
};

void AddToTail(ListNode** pHead, int value){
	ListNode* pNew = new ListNode();
	pNew->m_nValue = value;
	pNew-m_pNext = nullptr;

	if(*pHead == nullptr){
		*pHead = pNew;
	}else{
		ListNode* pNode = *pHead;

		while(pNode->m_pNext!=nullptr)
			pNode = pNode->m_pNext;

		pNode->m_pNext = pNew;
	}
}