#declaring variables for use
x_bar = 8.5
sigma = 2
mu = 8
n = 5
alpha_1 = 0.01
alpha_2 = 0.05


z = (x_bar - mu)/(sigma/sqrt(n))
z_alpha_1 = qnorm(1-alpha_1/2)
z_alpha_2 = qnorm(1-alpha_2/2)


z_alpha_1
z_alpha_2
