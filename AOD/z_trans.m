clc
clear all
close all
syms n z Y y(n)
A=input('Enter y(n+2) y(n+1) y(n) coeff in vector form');%[1 4 3]
f=input('Enter non homogeneous term');
cond=input('Enter Ic y(0) and y(1) in vector form');
a=A(1);b=A(2);c=A(3);
eq=ztrans(a*y(n+2)+b*(n+1)+c*y(n)-f)
eq=subs(eq,{str2sym('ztrans(y(n),n,z)'),str2sym('y(0)'),str2sym('y(1)')},{Y,cond(1),cond(2)});
Y=solve(eq,Y);
y=simplify(iztrans(Y,z,n))
m=0:10;
y=subs(y,n,m);
stem(y)
