clc
clearvars
syms x y t
disp('Greens theorem is int(phi.dx + meu.dy) over curve c')
disp('is equal to double integral(d(meu)/dx - d(phi)/dy))dxdy  over region E');
disp('We have to prove LHS = RHS ')

disp('phi and meu are functions of x and y')

phi=input('Enter phi : ');
meu=input('Enter meu : ');
cup=input('Enter upper curve as y=f(x) :');
cdown=input('Enter lower curve as y=f(x) : ');
L=input('Enter lower and upper points of curve intersections')


%phi=inline(vectorize(phi),'x','y');
%meu=inline(vectorize(meu),'x','y');

phi_l1=subs(phi,y,cdown);
meu_l1=subs(meu,y,cdown);

lhs1=int(sum(phi_l1),x,L(1),L(2)) + int(subs(meu_l1,cdown,t),t,L(1),L(2));
disp(lhs1)

phi_l1=subs(phi,y,cup);
meu_l1=subs(meu,y,cup);

lhs2=int(meu_l1 + phi_l1,x,L(2),L(1));
disp(lhs2)

lhs=lhs1 + lhs2

rhs = int(int((diff(meu,x) - diff(phi,y)),y,cdown,cup),x,L(1),L(2))

