package defpackage;

import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.layout.InsetsPaddingModifierNode;
import androidx.compose.material3.MinimumInteractiveModifierNode;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15536a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Placeable c;
    public final /* synthetic */ int d;

    public /* synthetic */ eb0(int i, int i2, Placeable placeable) {
        this.f15536a = 1;
        this.b = i;
        this.c = placeable;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15536a) {
            case 0:
                int i = this.b;
                return InsetsPaddingModifierNode.measure_3p2s80s$lambda$0(this.c, i, this.d, (Placeable.PlacementScope) obj);
            case 1:
                return MinimumInteractiveModifierNode.measure_3p2s80s$lambda$0(this.b, this.c, this.d, (Placeable.PlacementScope) obj);
            default:
                int i2 = this.b;
                return ScrollNode.measure_3p2s80s$lambda$0$0(this.c, i2, this.d, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ eb0(Placeable placeable, int i, int i2, int i3) {
        this.f15536a = i3;
        this.c = placeable;
        this.b = i;
        this.d = i2;
    }
}
