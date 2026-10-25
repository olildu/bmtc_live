package defpackage;

import androidx.compose.material3.DividerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ry implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19252a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ ry(float f, long j, int i) {
        this.f19252a = i;
        this.b = f;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19252a) {
            case 0:
                return DividerKt.VerticalDivider_9IZ8Weo$lambda$4$lambda$3(this.b, this.c, (DrawScope) obj);
            default:
                return DividerKt.HorizontalDivider_9IZ8Weo$lambda$1$lambda$0(this.b, this.c, (DrawScope) obj);
        }
    }
}
