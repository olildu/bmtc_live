package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k41 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17464a;
    public final /* synthetic */ RectRulers b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Measurable e;

    public /* synthetic */ k41(RectRulers rectRulers, int i, int i2, Measurable measurable, int i3) {
        this.f17464a = i3;
        this.b = rectRulers;
        this.c = i;
        this.d = i2;
        this.e = measurable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17464a) {
            case 0:
                return RulerAlignmentKt.fitInside$lambda$0$0(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
            default:
                return RulerAlignmentKt.fitOutside$lambda$0$0(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
        }
    }
}
