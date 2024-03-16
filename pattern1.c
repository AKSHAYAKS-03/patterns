int main()
{
    int n =5,m=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            printf("%d ",j);
        }
        printf("\n");
    }

    return 0;
}


1 2 3 4 
1 2 3 
1 2 
1 
