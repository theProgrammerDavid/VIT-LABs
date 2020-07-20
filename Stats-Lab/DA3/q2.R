x1bar = 121
sigma = 8
x2bar = 112
n=10
alpha1 = 0.01
alpha2 = 0.05



z=abs((x1bar-x2bar))/(sqrt(sigma*sigma/n + sigma*sigma/n))

z_alpha_1 = qnorm(1-alpha1/2)
z_alpha_2 = qnorm(1-alpha2/2)

z_alpha_1
z_alpha_2
z