clc
clear all
syms x y z t
f =input('Enter the components of 3D vector function [u,v,w] ');
T =input('Enter x,y,z in parametric form');
r=[x y z];
L=input('Enter the limits of integration for t in the form [a,b]');
a=L(1);b=L(2);
r1=subs(r,{x,y,z},{T(1),T(2),T(3)});
dr1=diff(r1,t);
f1=subs(f,{x,y,z},{T(1),T(2),T(3)});
fdr=sum(f1.*dr1);
I=int(fdr,t,a,b);
disp(I)
P = inline(vectorize(f(1)), 'x', 'y','z');
Q = inline(vectorize(f(2)), 'x', 'y','z');
R = inline(vectorize(f(3)), 'x', 'y','z');
x=linspace(0,1,10); y=x; z=x; % The values will be different from one
[X,Y,Z] = meshgrid(x,y,z);
U = P(X,Y,Z);V = Q(X,Y,Z);W = R(X,Y,Z);
quiver3(X,Y,Z,U,V,W,1.5)
hold on
t = linspace(0,1,10);
x1=eval(vectorize(r1(1)));
y1=eval(vectorize(r1(2)));
z1=eval(vectorize(r1(3)));
plot3(x1,y1,z1,'r')