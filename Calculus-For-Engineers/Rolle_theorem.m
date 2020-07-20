clearvars
clc
syms x c;

f=input('Enter the function: ');
I=input('Enter the interval [a,b]: ');
a=I(1); b=I(2);
fa=subs(f,x,a);fb=subs(f,x,b);
df=diff(f,x); dfc=subs(df,x,c);
if fa==fb
c=solve(dfc);
count=0;
for i=1:length(c)
if c(i)>a && c(i)<b
count=count+1;
r(count)=c(i);
end
end
values=sprintf('The values of c between %d and %d which satisfy Rolles theorem are x=',a,b);
disp(values)
disp(r)
else
disp('f(a) and f(b) are not equal, function doesnot satisfy conditions for Rolles theorem');
end
tval=subs(f,x,r);
xval=linspace(a,b,100);
yval=subs(f,x,xval);
plot(xval,yval);
[p,q]=size(xval);
for i=1:length(tval)
    hold on;
    plot(xval,tval(i)*ones(p,q),'r');
    hold on;
    plot(r(i),tval(i),'ok');
end

hold off;

legend('Function','Tangent');
title('Demonstration of Rolles theorem');