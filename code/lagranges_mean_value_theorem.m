clear all;
clc;
syms x c;
f=input('Enter the function: ');
I=input('Enter the interval [a,b]: ');
a=I(1); b=I(2);
fa=subs(f,x,a);fb=subs(f,x,b);
df=diff(f,x);
dfc=subs(df,x,c);
LM=dfc-(fb-fa)/(b-a);
c=solve(LM);
count=0;
for i=1:length(c)
if c(i)>a && c(i)<b
count=count+1;
tx(count)=c(i);
end
end
fprintf('The values of c between %d and %d which satisfy LMVT arex=',a,b);
disp(double(tx))

xval=linspace(a,b,100);
yval=subs(f,x,xval);
m=subs(df,tx) ; % Slopes of tangents at the points between a and b.
ty=subs(f,x,tx) ;
plot(xval,yval);
hold on;
secant_slope=(fb-fa)/(b-a);
secant_line=fa+secant_slope*(x-a);
sx_val=xval;
sy_val=subs(secant_line,x,sx_val);
plot(sx_val,sy_val);
hold on;
for i=1:length(tx)
txval=linspace(tx(i)-1,tx(i)+1,20);
t_line=ty(i)+m(i)*(x-tx(i));
tyval=subs(t_line,x,txval);
plot(txval,tyval,'k');
hold on
plot(tx(i),ty(i),'ok');
end
hold off;
grid on
legend('Function','Secant','Tangents');
title('Demonstration of LMVT');
