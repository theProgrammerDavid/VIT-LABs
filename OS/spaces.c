#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
int main(void)
{
    char *buffer = 0;
    char *outputBuffer = 0;
    long length;
    FILE *f = fopen("input.txt", "rb");

    if (f)
    {
        fseek(f, 0, SEEK_END);
        length = ftell(f);
        fseek(f, 0, SEEK_SET);
        buffer = (char *)malloc(length);
        outputBuffer = (char *)malloc(length);

        if (buffer)
        {
            fread(buffer, 1, length, f);
        }
        fclose(f);
    }

    if (buffer)
    {
        long count = 0;
        for (long i = 0; i < length; i++)
        {
            if (buffer[i] == ' ' && buffer[i + 1] == ' ')
            {
                continue;
            }
            else
            {
                outputBuffer[count++] = buffer[i];
            }
        }

        FILE *f = fopen("input2.txt", "ab+");
        if (f)
        {
            fprintf(f, "%s", outputBuffer);
            fclose(f);
        }
        else
        {
            printf("%s", "error opening file");
        }
    }
    return EXIT_SUCCESS;
}
