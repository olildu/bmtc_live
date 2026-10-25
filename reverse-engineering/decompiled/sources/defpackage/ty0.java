package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19698a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ ty0(float f, Modifier modifier, long j, float f2, long j2, int i, int i2, int i3) {
        this.d = f;
        this.b = modifier;
        this.c = j;
        this.g = f2;
        this.e = j2;
        this.f = i;
        this.h = i2;
        this.i = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19698a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$38(this.d, this.b, this.c, this.g, this.e, this.f, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                float f = this.d;
                Modifier modifier = this.b;
                long j = this.c;
                float f2 = this.g;
                return ProgressIndicatorKt.CircularProgressIndicator_4lLiAd8$lambda$35(modifier, j, f, this.e, this.f, f2, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ ty0(Modifier modifier, long j, float f, long j2, int i, float f2, int i2, int i3) {
        this.b = modifier;
        this.c = j;
        this.d = f;
        this.e = j2;
        this.f = i;
        this.g = f2;
        this.h = i2;
        this.i = i3;
    }
}
