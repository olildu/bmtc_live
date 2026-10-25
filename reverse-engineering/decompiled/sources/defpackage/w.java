package defpackage;

import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19879a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ int c;

    public /* synthetic */ w(int i, int i2, Placeable placeable) {
        this.f19879a = i2;
        this.b = placeable;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19879a) {
            case 0:
                return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4$lambda$3(this.b, this.c, (Placeable.PlacementScope) obj);
            default:
                return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0(this.b, this.c, (Placeable.PlacementScope) obj);
        }
    }
}
