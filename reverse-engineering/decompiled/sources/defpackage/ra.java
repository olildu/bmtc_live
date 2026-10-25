package defpackage;

import android.location.Location;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.BitSet;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ra implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19190a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra(Object obj, int i) {
        this.f19190a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f19190a) {
            case 0:
                ((BitSet) this.b).set(((Integer) obj).intValue());
                break;
            case 1:
                ((Exception) this.b).addSuppressed((IOException) obj);
                break;
            case 2:
                ((IOException) this.b).addSuppressed((IOException) obj);
                break;
            default:
                ((androidx.core.util.Consumer) this.b).accept((Location) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.f19190a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
