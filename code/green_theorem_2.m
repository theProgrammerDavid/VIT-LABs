syms x y t

F=input('Enter function as [x_component y_component] : ')
R=input('Enter the parametric components as [x_comp, y_comp] : ')

L=input('Enter limits : ')

f1=subs(F,{x,y},{R(1),R(2)});

M=f1(1)
N=f1(2)

dmdx=diff(M,t);
dmdy=diff(M,t);

dndx=diff(N,t);
dndy=diff(N,t);

dx=diff(R(1),t);
dy=diff(R(2),t);

lhs = int(sum(f1(1).*dy),t,L(1),L(2)) - int(sum(f1(2).*dx),t,L(1),L(2))
disp(lhs)

