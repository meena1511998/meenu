#include <stdio.h>
#include <string.h>
int main ()
{
    char *array[50],*p;
    char buf[1000];
    int i=0,j=0,temp;
    cout<<"\nEnter the ninja number of kabali and opponent";
    cin>>buf;
    p=strtok(buf," \n");
    while(p!=NULL)
    {
        array[i++]=p;
        j++;
        p=strtok (NULL," \n");
    }
    for (i=0;i<j;i=i+2) 
    {
     temp=atoi(array[i])-atoi(array[i+1]);
     if(temp<0)
     {
     	temp=-temp;
     }
   cou<<"temp(n)";
    }
    return 0;
}
