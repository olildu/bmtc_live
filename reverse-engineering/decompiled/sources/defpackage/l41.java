package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l41 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18279a;
    public final /* synthetic */ RectRulers b;

    public /* synthetic */ l41(RectRulers rectRulers, int i) {
        this.f18279a = i;
        this.b = rectRulers;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        Constraints constraints = (Constraints) obj3;
        switch (this.f18279a) {
            case 0:
                return RulerAlignmentKt.fitInside$lambda$0(this.b, measureScope, measurable, constraints);
            default:
                return RulerAlignmentKt.fitOutside$lambda$0(this.b, measureScope, measurable, constraints);
        }
    }
}
