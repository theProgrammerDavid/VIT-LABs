import os
from multiprocessing.pool import ThreadPool
import concurrent.futures


executor = concurrent.futures.ThreadPoolExecutor(max_workers=10)

def testFunc():
    os.system("python3 ./client.py")

for _ in range(15):
    executor.submit(testFunc)