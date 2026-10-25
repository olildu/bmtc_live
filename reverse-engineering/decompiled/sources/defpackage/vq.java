package defpackage;

import coil3.decode.Decoder;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vq implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19857a;
    public final /* synthetic */ Decoder.Factory b;

    public /* synthetic */ vq(Decoder.Factory factory, int i) {
        this.f19857a = i;
        this.b = factory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19857a) {
            case 0:
                break;
        }
        return CollectionsKt.R(this.b);
    }
}
