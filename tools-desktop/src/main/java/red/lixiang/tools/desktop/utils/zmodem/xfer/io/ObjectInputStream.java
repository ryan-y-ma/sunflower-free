package red.lixiang.tools.desktop.utils.zmodem.xfer.io;

import java.io.IOException;

public abstract class ObjectInputStream<T> {
	public abstract T read() throws IOException;
}
