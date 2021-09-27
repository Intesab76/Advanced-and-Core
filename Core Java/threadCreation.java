class FetchData extends Thread {

    @Override
    public void run() {
        System.out.println("Started Calling from FetchData run Method ::");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        System.out.println("Ended up calling from FetchData run method ::");

    }
}

class ProcessData implements Runnable {

    // class ProcessData implements Runnable {

    @Override
    public void run() {
        System.out.println("Started Calling from ProcessData run method !!");
        try {

        } catch (Exception e) {

        }

        System.out.println("Ended up calling from ProcessData run method !!");

    }
}

class ThreadMain {
    public static void main(String Threading[]) {

        FetchData fetchData = new FetchData();
        ProcessData processData = new ProcessData();

        fetchData.start();

        try {
            fetchData.join(5000);
        } catch (Exception e) {
        }

        processData.run();
    }
}