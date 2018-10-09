clear all
clc
syms x
f=input('Enter the upper curve f(x): ');
g=input('Enter the lower curve g(x): ');
L=input('Enter the limits of integration for x [a,b]:');
a=L(1); b=L(2);
Area=int(f-g,x,a,b);
disp(['‘Area bounded by the curves f(x) and g(x) is: ',char(Area)]);
x1=linspace(a,b,20);y1=subs(f,x,x1);
x2=x1;y2=subs(g,x,x1);
plot(x1,y1);hold on; plot(x2,y2);hold off;
xlabel('x-axis');ylabel('y-axis');
legend('f(x)','g(x)');grid on;