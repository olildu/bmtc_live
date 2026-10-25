package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.ChaloHeaderTextComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import so.plotline.plotline_kmp.Plotline_androidKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18321a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ lk(String str, int i, int i2, int i3) {
        this.f18321a = i3;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18321a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ChaloHeaderTextComposableKt.c(this.b, composer, this.c, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                Plotline_androidKt.b(this.b, composer, this.c, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
