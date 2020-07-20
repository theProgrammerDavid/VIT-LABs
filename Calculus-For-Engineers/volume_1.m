clc
syms x
f=input('Enter the function f(x)');
c=input('Enter the axis of rotation y = c (enter only c value): ');
iL=input('Enter the integration limits: ');
a=iL(1);b=iL(2);
vol=pi*int((f-c)^2,a,b);
disp(['Volume of solid of revolution is: ',char(vol)]);
x1=linspace(a,b,20); y1=subs(f,x,x1);
x2=x1; y2=c*ones(length(x1));
plot(x1,y1);hold on;
plot(x2,y2);hold off;
xlabel('x-axis');ylabel('y-axis')
legend('The curve y=f(x)','The axis of revolution y=c');
grid on;