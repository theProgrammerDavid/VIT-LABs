#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
int main()
{

    int counter = 0;
    pid_t pid = fork();

    if (pid == 0)
    {
        // child
        char buf[7][20];
        printf("Enter 7 words: ");
        for (int i = 0; i < 7; i++)
        {
            scanf("%s", buf[i]);
        }

        for (int i = 0; i < 7; i++)
        {
            int count = 0;

            for (int j = 0; j < 20; j++)
            {
                char c = buf[i][j];
                if ((c >= 65 && c <= 90) || (c >= 97  && c <= 122))
                {
                    count++;
                }
            }

            if (count > 4)
            {
                printf("\t%s", buf[i]);
            }
        }
    }
    else if (pid > 0)
    {
        //parent waiting for child
        wait(NULL);
    }
    else
    {
        // fork failed
        printf("fork() failed!\n");
        return 1;
    }

    return 0;
}