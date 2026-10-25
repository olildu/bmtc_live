package defpackage;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20061a;
    public final /* synthetic */ long b;
    public final /* synthetic */ State c;

    public /* synthetic */ xz(long j, State state, int i) {
        this.f20061a = i;
        this.b = j;
        this.c = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20061a;
        long j = this.b;
        State state = this.c;
        switch (i) {
            case 0:
                DrawScope Canvas = (DrawScope) obj;
                TweenSpec tweenSpec = DrawerKt.f4449a;
                Intrinsics.i(Canvas, "$this$Canvas");
                DrawScope.CC.M(Canvas, this.b, 0L, 0L, ((Number) state.getValue()).floatValue(), null, null, 0, 118, null);
                return Unit.f17538a;
            case 1:
                return ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$33$lambda$32(j, state, (DrawScope) obj);
            default:
                return WideNavigationRailKt.Scrim_3J_VO9M$lambda$35$lambda$34(j, state, (DrawScope) obj);
        }
    }
}
