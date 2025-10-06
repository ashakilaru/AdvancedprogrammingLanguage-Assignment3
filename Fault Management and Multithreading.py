try:
    result = 10 / 0
except ZeroDivisionError:
    print("Cannot divide by zero")
finally:
    print("Execution finished")

import asyncio

async def say_hello():
    await asyncio.sleep(1)
    print("Hello from async!")

asyncio.run(say_hello())
