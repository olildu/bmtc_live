package defpackage;

import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19186a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ r8(int i, int i2, int i3, Function0 function0, boolean z) {
        this.f19186a = i3;
        this.b = z;
        this.c = function0;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19186a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BackHandler_androidKt.BackHandler$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return androidx.compose.ui.backhandler.BackHandler_androidKt.BackHandler$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
