int foo(int a, int b) {
	int c=1;
	if (a<0) {
		for (int i=1;i<=b;++i)
			c += a;
	}
	return c;
	}

int main(int x, char*argv[]) {                
	if (x>=23 && x<27)                
		return foo(x,25);                
	return 0;
	}
