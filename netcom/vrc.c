
#include <stdio.h>
#include <stdlib.h>
int binary(int);
void parity(int[]);

int arr[9], arr1[9];
char chr;
int temp, temp1, i;

void main()
{
    char chr1;

    printf("Enter Data :");
    scanf("%c %c", &chr, &chr1);

    temp = chr;
    binary(temp);
    printf("\nAscii value is : %d\n", temp);
    printf("\nBinary Form : ");

    for (i = 0; i < 8; i++)
    {
        arr1[i] = arr[i];
        printf("%d ", arr[i]);
    }

    printf("\n");
    printf("Sender Side:\n");

    parity(arr);
    temp1 = chr1;
    binary(temp1);

    printf("\n\nAscii value is : %d\n", temp1);
    printf("\nBinary Form : ");
    for (i = 0; i < 8; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\nReceiver Side:\n");

    parity(arr);
}

void parity(int a[])
{
    int count;
    count = 0;
    for (i = 0; i < 8; i++)
    {
        if (a[i] == 1)
            count++;
    }
    if (count % 2 == 0)
        a[8] = 0;
    else
        a[8] = 1;
    count = 0;
    printf("\n\nVRC : \n");
    for (i = 0; i < 9; i++)
    {
        if (i == 8)
            printf(" | ");
        printf("%d ", a[i]);
    }
}
int binary(int x)
{
    int rem;
    int ctr = 0, i = 1;
    do
    {
        rem = x % 2;
        arr[i] = rem;
        if (rem == 1)
        {
            ctr++;
        }
        x = x / 2;
        i++;
    } while (x != 0);
    if (ctr % 2 == 0)
    {
        arr[0] = 0;
    }

    else
    {
        arr[0] = 1;
    }
    return (0);
}
