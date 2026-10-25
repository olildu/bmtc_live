package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18437a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ my0(float f, Modifier modifier, long j, long j2, int i, int i2, int i3) {
        this.b = f;
        this.c = modifier;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18437a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                float f = this.b;
                return ProgressIndicatorKt.LinearProgressIndicator_rIrjwxo$lambda$14(this.c, this.d, this.e, this.f, f, this.g, this.h, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$17(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                float f2 = this.b;
                return ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$30(this.c, this.d, f2, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ my0(Modifier modifier, long j, float f, long j2, int i, int i2, int i3) {
        this.c = modifier;
        this.d = j;
        this.b = f;
        this.e = j2;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public /* synthetic */ my0(Modifier modifier, long j, long j2, int i, float f, int i2, int i3) {
        this.c = modifier;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.b = f;
        this.g = i2;
        this.h = i3;
    }
}
