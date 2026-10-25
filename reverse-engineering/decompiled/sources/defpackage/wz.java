package defpackage;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19971a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ wz(String str, Function0 function0, int i) {
        this.f19971a = i;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19971a;
        Function0 function0 = this.c;
        String str = this.b;
        SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                TweenSpec tweenSpec = DrawerKt.f4449a;
                Intrinsics.i(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                SemanticsPropertiesKt.onClick$default(semantics, null, new fk(function0, 18), 1, null);
                return Unit.f17538a;
            case 1:
                return ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$31$lambda$30(str, function0, semantics);
            default:
                return NavigationDrawerKt.Scrim_Bx497Mc$lambda$69$lambda$68(str, function0, semantics);
        }
    }
}
