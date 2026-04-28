# How to Run

## Terminal 1 - Start Server (Master)

```bash
python3 server.py
```

## Terminal 2 - Start Client (Slave)

```bash
python3 client.py
```

## Berkeley Algorithm Explanation

The Berkeley Algorithm synchronizes clocks in a distributed system:

1. **Master** gets its current time
2. **Clients** send their current time to the master
3. **Master** calculates the average time difference between all clocks
4. **Master** sends the synchronized time to all clients

This ensures all nodes have approximately the same time.
