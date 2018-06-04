long long Fibonacci(int n){
	int result[2] = {0, 1};
	if(n < 2)
		return result[n];

	long long p = 1;
	long long q = 0;
	long long res = 0;

	for(int i = 1; i < n; i++){
		res = p + q;

		q = p;
		p = res;
	}
	return res;
}