clear all
clc
syms n z y(n) Y
yn=y(n);
yn1=y(n+1);
yn2=y(n+2);
F = input('Input the coefficients [a,b,c]: ');
a=F(1);b=F(2);c=F(3);
nh = input('Enter the non-homogenous part f(n): ');
eqn=a*yn2+b*yn1+c*yn-nh;
ZTY=ztrans(eqn);
IC=input('Enter the initial conditions in the form [y0,y1]:');
y0=IC(1);y1=IC(2);
ZTY=subs(ZTY,{'ztrans(y(n),n,z)','y(0)','y(1)'},{Y,y0,y1});
eq=collect(ZTY,Y);
Y=simplify(solve(eq,Y));
yn=simplify(iztrans(Y));
disp('The solution of the difference equation yn=')
disp(yn);
m=0:20;
y=subs(yn,n,m);
stem(y)
title('Difference equation');
xlabel('n'); ylabel('y(n)');    