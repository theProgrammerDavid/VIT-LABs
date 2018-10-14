clear all
clc
syms t
f=input('Enter the function of t: ');
F=laplace(f);
F=simplify(F);
%the simplify command is used to simplify aleabric expressions
disp(['L{f(t)}=',char(F)]);