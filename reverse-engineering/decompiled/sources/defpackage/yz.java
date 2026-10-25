package defpackage;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20152a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function e;

    public /* synthetic */ yz(long j, Function function, boolean z, int i, int i2) {
        this.f20152a = i2;
        this.b = j;
        this.e = function;
        this.c = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20152a;
        Function function = this.e;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                ((Integer) obj2).intValue();
                TweenSpec tweenSpec = DrawerKt.f4449a;
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                DrawerKt.b(this.b, (Function0) function, this.c, composer, iUpdateChangedFlags);
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return WideNavigationRailKt.Scrim_3J_VO9M$lambda$37(this.b, (Function1) function, this.c, this.d, (Composer) obj, iIntValue);
        }
    }
}
