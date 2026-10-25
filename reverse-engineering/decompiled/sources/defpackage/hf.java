package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.home.nearbytrips.ui.StopNearbyTripsCardKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15820a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ hf(Modifier modifier, String str, String str2, int i, int i2) {
        this.f15820a = i2;
        this.b = modifier;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f15820a) {
            case 0:
                num.getClass();
                CardRechargeSuccessScreenKt.d(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 1:
                num.getClass();
                ChaloCardComposeItemsKt.d(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 2:
                num.getClass();
                JourneyDetailsBottomSheetKt.j(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 3:
                num.intValue();
                RegularBusScreenUIKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 4:
                num.getClass();
                RegularBusStopNearbyTripsCardKt.e(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            case 5:
                num.getClass();
                StopNearbyTripsCardKt.d(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
            default:
                num.getClass();
                StopNearbyTripsCardKt.c(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ hf(String str, String str2, Modifier modifier, int i, int i2) {
        this.f15820a = i2;
        this.c = str;
        this.d = str2;
        this.b = modifier;
        this.e = i;
    }
}
