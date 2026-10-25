package defpackage;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class r90 {
    public static IOConsumer a(IOFunction iOFunction, Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new a7(25, iOFunction, consumer);
    }

    public static IOConsumer b(IOFunction iOFunction, IOConsumer iOConsumer) {
        Objects.requireNonNull(iOConsumer);
        return new a7(24, iOFunction, iOConsumer);
    }

    public static IOFunction c(IOFunction iOFunction, Function function) {
        Objects.requireNonNull(function);
        return new q90(iOFunction, function, 1);
    }

    public static IOFunction d(IOFunction iOFunction, IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2);
        return new p90(iOFunction, iOFunction2, 0);
    }

    public static IOFunction e(IOFunction iOFunction, Function function) {
        Objects.requireNonNull(function);
        return new q90(iOFunction, function, 0);
    }

    public static IOFunction f(IOFunction iOFunction, IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2);
        return new p90(iOFunction, iOFunction2, 1);
    }

    public static IOSupplier g(IOFunction iOFunction, Supplier supplier) {
        Objects.requireNonNull(supplier);
        return new a7(27, iOFunction, supplier);
    }

    public static IOSupplier h(IOFunction iOFunction, IOSupplier iOSupplier) {
        Objects.requireNonNull(iOSupplier);
        return new a7(26, iOFunction, iOSupplier);
    }

    public static IOFunction q() {
        return new d70();
    }

    public static /* synthetic */ Object r(Object obj) {
        return obj;
    }
}
