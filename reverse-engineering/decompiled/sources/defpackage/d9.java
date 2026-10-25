package defpackage;

import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.ui.unit.Density;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d9 implements MarqueeSpacing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15438a;
    public final /* synthetic */ float b;

    public /* synthetic */ d9(float f, int i) {
        this.f15438a = i;
        this.b = f;
    }

    @Override // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density, int i, int i2) {
        switch (this.f15438a) {
            case 0:
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$0(this.b, density, i, i2);
            default:
                return MarqueeSpacing.Companion.fractionOfContainer$lambda$0(this.b, density, i, i2);
        }
    }
}
