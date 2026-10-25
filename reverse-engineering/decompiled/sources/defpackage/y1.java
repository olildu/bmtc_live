package defpackage;

import com.adster.sdk.mediation.AdsCache;
import j$.util.function.Function$CC;
import java.nio.file.Path;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y1 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20066a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i) {
        this.f20066a = i;
        this.b = obj;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f20066a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f20066a) {
            case 0:
                return AdsCache.a((Function1) this.b, obj);
            case 1:
                return ((l6) this.b).b.invoke();
            default:
                return ((Path) this.b).relativize((Path) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f20066a;
        return Function$CC.$default$compose(this, function);
    }
}
