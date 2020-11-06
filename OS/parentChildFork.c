#include <stdio.h>
#include <stdlib.h>

int main()
{

    int counter = 0;
    pid_t pid = fork();

    if (pid == 0)
    {
        // child process
        FILE *fptr;

        char c;

        // Open file
        fptr = fopen("test.txt", "r");
        if (fptr == NULL)
        {
            printf("Cannot open file \n");
            exit(0);
        }

        // Read contents from file
        c = fgetc(fptr);
        while (c != EOF)
        {
            printf("%c", c);
            c = fgetc(fptr);
        }

        fclose(fptr);
    }
    else if (pid > 0)
    {
        // parent process
        int num, r, sum, temp;
        int stno, enno;
        stno = 0;
        enno = 1000;

        for (num = stno; num <= enno; num++)
        {
            temp = num;
            sum = 0;

            while (temp != 0)
            {
                r = temp % 10;
                temp = temp / 10;
                sum = sum + (r * r * r);
            }
            if (sum == num)
                printf("%d ", num);
        }

        printf("\n");
    }
    else
    {
        // fork failed
        printf("fork() failed!\n");
        return 1;
    }

    return 0;
}