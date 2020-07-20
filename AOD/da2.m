clc
clear %18BCB0142
A=input('Enter the symetric matrix for diagonalization :');
[P,D]=eig(A);
disp('Given Matrix (A) :')
disp(A)
disp('Modal Matrix (P):')
disp(P)
NP=normc(P);
disp('Normalized Modal Matrix (N):')
disp(NP)
disp('Diagonal Matrix (D=Nˆ T*A*N) :')
DM=round(NP'*A*NP,2);
disp(DM)