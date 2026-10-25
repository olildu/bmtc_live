package defpackage;

import j$.util.Objects;
import java.io.IOException;
import org.apache.commons.io.function.IOConsumer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class o90 {
    public static IOConsumer a(IOConsumer iOConsumer, IOConsumer iOConsumer2) {
        Objects.requireNonNull(iOConsumer2);
        return new a7(23, iOConsumer, iOConsumer2);
    }

    public static /* synthetic */ void b(IOConsumer iOConsumer, IOConsumer iOConsumer2, Object obj) throws IOException {
        iOConsumer.accept(obj);
        iOConsumer2.accept(obj);
    }
}
