package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.ui.common.SeatAvailabilityInfoBottomSheetKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsAlertTextKt;
import app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19083a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ IconType d;
    public final /* synthetic */ int e;

    public /* synthetic */ q10(Modifier modifier, IconType iconType, String str, int i, int i2) {
        this.f19083a = i2;
        this.b = modifier;
        this.d = iconType;
        this.c = str;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19083a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                EnterCardDetailsScreenKt.b(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.d, this.c);
                break;
            case 1:
                RouteDetailsAlertTextKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.d, this.c);
                break;
            default:
                SeatAvailabilityInfoBottomSheetKt.b(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.d, this.c);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ q10(Modifier modifier, String str, IconType iconType, int i) {
        this.f19083a = 1;
        this.b = modifier;
        this.c = str;
        this.d = iconType;
        this.e = i;
    }
}
