package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.backhandler.BackHandler_androidKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19098a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ q8(boolean z, Function2 function2, int i, int i2, int i3) {
        this.f19098a = i3;
        this.b = z;
        this.c = function2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19098a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BackHandler_androidKt.PredictiveBackHandler$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return androidx.compose.material3.internal.BackHandler_androidKt.PredictiveBackHandler$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
