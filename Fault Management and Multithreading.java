try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Execution finished");
}

Thread thread = new Thread(() -> System.out.println("Hello from thread!"));
thread.start();
