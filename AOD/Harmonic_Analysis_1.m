clc 
clear all 
syms x 

x=[0, pi/6, 2*pi/6, 3*pi/6, 4*pi/6, 5*pi/6, pi];
y= [ 0,9.2, 14.4, 17.8, 17.3, 11.7, 0];

nHarmonic = 1;
n=length(x);
m=n-1;
a=0;

for i=1:m
    a=a+y(i);
end

a=(2/m)*a;
f=a/2;
c=(x(n)-x(1))/2;

for j=1:nHarmonic
    a=0;
    b=0;
end
for i=1:m
    a=a+y(i)* cos((j*pi*x(i))/c);
    b=b+y(i)*sin((j*pi*x(i))/c);
end

a=(2/m)*a;
b=(2/m)*b;
f=f + a*cos((j*pi*x(i))/c) + b*sin((j*pi*x(i))/c);
disp(['f(x) = ',f]);
disp(f);

