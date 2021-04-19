## MPI Instructions 
> Install with `sudo apt install mpich`

Compile with 
```bash
mpicc hello.c
```

If multiple hosts needed
```bash
mpirun -n 4 ./a.out
```

else
```bash
./a.out
```