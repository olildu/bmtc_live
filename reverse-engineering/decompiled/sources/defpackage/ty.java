package defpackage;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.DottedDividerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ty implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19697a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ty(FloatProducer floatProducer, long j, int i) {
        this.f19697a = 1;
        this.d = floatProducer;
        this.b = j;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19697a) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                DottedDividerKt.a(this.b, (Modifier) this.d, (Composer) obj, iUpdateChangedFlags);
                return Unit.f17538a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$14((FloatProducer) this.d, this.b, this.c, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldImplKt.Decoration_Iv8Zu3U$lambda$21(this.b, (Function2) this.d, this.c, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ ty(Object obj, int i, int i2, long j) {
        this.f19697a = i2;
        this.b = j;
        this.d = obj;
        this.c = i;
    }
}
