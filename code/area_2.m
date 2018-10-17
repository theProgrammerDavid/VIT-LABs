clear all
clc
syms y
f=input('Enter the right curve f(y): ');
g=input('Enter the left curve g(y): ');
L=input('Enter the limits of integration for y [c,d]:');
c=L(1); d=L(2);
Area=int(f-g,y,c,d);
disp(['Area bounded by the curves f(y) and g(y) is: ',char(Area)]);
y1=linspace(c,d,20);x1=subs(f,y,y1);
y2=y1;x2=subs(g,y,y1);
plot(x1,y1);hold on;
plot(x2,y2);hold off;
xlabel('x-axis');ylabel('y-axis');
legend('f(y)','g(y)');grid on;