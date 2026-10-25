package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19668a;
    public final /* synthetic */ CompletableDeferred b;

    public /* synthetic */ tl(CompletableDeferred completableDeferred, int i) {
        this.f19668a = i;
        this.b = completableDeferred;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19668a) {
            case 0:
                CompletableDeferred completableDeferred = this.b;
                Unit unit = Unit.f17538a;
                completableDeferred.complete(unit);
                return unit;
            default:
                CompletableDeferred completableDeferred2 = this.b;
                Unit unit2 = Unit.f17538a;
                completableDeferred2.complete(unit2);
                return unit2;
        }
    }
}
