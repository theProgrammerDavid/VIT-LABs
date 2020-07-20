%% Q1 %%

clear all
clc
syms n k1 k2 L
F = input('Input the coefficients [a,b,c]: ');
a=F(1);b=F(2);c=F(3);
ch_eqn=a*L^2+b*L+c; %Characteristic equation
L=solve(ch_eqn);
L1=L(1);L2=L(2);
D=b^2-4*a*c;
if(D>0) % Roots are real and different
y1=L1^n;
y2=L2^n;
elseif (D==0)% Roots are real and equal
y1=L1^n;
y2=n*L1^n;
else % Roots are complex
rho=abs(L1); t=angle(L1);
y1 = (rho^n)*cos(n*t);
y2 = (rho^n)*sin(n*t);
end
yn = k1*y1+k2*y2;
check=input('If initial conditions are known, then enter 1 else
enter 0: ');
if (check == 1)
IC=input('Enter the initial conditions [y(0),y(1)]');
eq1=(subs(yn,n,0)-IC(1));
eq2=(subs(yn,n,1)-IC(2));
[k1,k2]=solve(eq1,eq2);
yn=simplify(subs(yn));
m=0:20;
y=subs(yn,n,m);
stem(y)
title('Difference equation');
xlabel('n'); ylabel('y(n)');
end
disp('The Solution of the given Homogeneous equation is y_n= ');
disp(collect(collect(yn,y1),y2))

%% Q2 %% 

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
IC=input('Enter the initial conditions in the form
[y0,y1]:');
y0=IC(1);y1=IC(2);
ZTY=subs(ZTY,{'ztrans(y(n),n,z)','y(0)','y(1)'},{Y,y0,y1}
);
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