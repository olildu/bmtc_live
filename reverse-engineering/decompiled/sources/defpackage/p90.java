package defpackage;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p90 implements IOFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19015a;
    public final /* synthetic */ IOFunction b;
    public final /* synthetic */ IOFunction c;

    public /* synthetic */ p90(IOFunction iOFunction, IOFunction iOFunction2, int i) {
        this.f19015a = i;
        this.b = iOFunction;
        this.c = iOFunction2;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
        int i = this.f19015a;
        return r90.a(this, consumer);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        switch (this.f19015a) {
            case 0:
                return this.c.apply(this.b.apply(obj));
            default:
                return this.b.apply(this.c.apply(obj));
        }
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction compose(Function function) {
        int i = this.f19015a;
        return r90.e(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        int i = this.f19015a;
        return r90.b(this, iOConsumer);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction compose(IOFunction iOFunction) {
        int i = this.f19015a;
        return r90.f(this, iOFunction);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(Function function) {
        int i = this.f19015a;
        return r90.c(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOSupplier compose(Supplier supplier) {
        int i = this.f19015a;
        return r90.g(this, supplier);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
        int i = this.f19015a;
        return r90.d(this, iOFunction);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
        int i = this.f19015a;
        return r90.h(this, iOSupplier);
    }
}
