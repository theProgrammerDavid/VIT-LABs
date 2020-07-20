clc
clearvars
syms x y t

%code for 2D vector function

f=input('Enter the components of 2D vector function [u,v] : ');
%eg xy^2 + x^2y


T=input('Enter x and y in parametric form : ');
%eg x= t + sin(pi*t/2)
%y= t + cos(pi*t/2)

L=input('Enter the limits of integration for t in the form [a,b] : ');
%eg [-1 2]

a=L(1);
b=L(2);

r=[x y]; %position vector xi + yj

r1=subs(r,{x,y},{T(1),T(2)});
% replaces x and y in r with x and y component of T respectively

dr1 = diff(r1,t);

f1=subs(f,{x,y},{T(1),T(2)});

fdr=sum(f1.*dr1);

I=int(fdr,t,a,b);
%integral of function fdr with respect to t. limits from a to b

disp(I)

P=inline(vectorize(f(1)),'x','y');
%constructs an inline
%function whose input arguments are specified by the
%strings ARG1, ARG2, ...  Multicharacter symbol names may
%be used.

Q=inline(vectorize(f(2)),'x','y');

%we do this to construct a meshgrid of the function
x=linspace(-2*pi,2*pi,10);
y=x;

%used for plotting
[X,Y]=meshgrid(x,y);
U=P(X,Y);
V=Q(X,Y);
quiver(X,Y,U,V,1.5)

hold on
t=linspace(0,2*pi);
x1=eval(vectorize(r1(1)));
y1=eval(vectorize(r1(2)));
plot(x1,y1,'r')
axis equal
