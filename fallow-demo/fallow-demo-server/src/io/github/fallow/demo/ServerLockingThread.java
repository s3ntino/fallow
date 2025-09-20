package io.github.fallow.demo;

class ServerLockingThread extends Thread {

    private static final long LOCKING_INTERVAL = 50L;

    @Override
    public void run() {
        while (isAlive()) {
            final boolean whetherServerShouldUnlock = isInterrupted();
            if (whetherServerShouldUnlock) {
                break;
            }

            try {
                sleep(LOCKING_INTERVAL);
            } catch (final InterruptedException exception) {
                throw new RuntimeException(
                        "Could not extend server lock for another cycle, because of unexpected exception.",
                        exception);
            }
        }
    }
}