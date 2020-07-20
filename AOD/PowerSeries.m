%Power series at an ordinary point 
clc
clearvars
syms x a0 a1 a2 a3
a=[a0 a1 a2 a3];
y=sum(a.*x.^[0:3]);
disp(['Let y = ', char(y),' be the solution']);
dy=diff(y);
d2y=diff(dy);
gde= collect(d2y+y,x); % general differential equation
cof=coeffs(gde,x);  %    as per question
disp(['Given equation becomes : (', char(cof(1)), ') + ( ',char(cof(2)),')x ... =0']);
A2=solve(char(cof(1)),'a2');
A3=solve(char(cof(2)),'a3');
disp(['a2 = ', char(A2), ' a3 = ', char(A3),' and so on ']);
y=subs(y,{a2,a3},{A2,A3});
y=coeffs(y,[a1,a0]);
disp('solution is : ');
disp([' y =a0 ( ', char(y(1)), ' ) +...... ' ]);


