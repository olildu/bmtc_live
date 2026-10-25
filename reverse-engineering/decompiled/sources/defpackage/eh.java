package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.instantticket.ui.faredetails.compose.FareBreakupSectionKt;
import app.chalo.locationdisclaimer.ui.compose.LocationDisclaimerScreenKt;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.productbooking.pickroutelocation.ui.RouteSearchItemComposableKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15552a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;

    public /* synthetic */ eh(List list, int i, int i2) {
        this.f15552a = i2;
        this.b = list;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15552a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                ChaloBusRouteInfoMainScreenKt.l(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ChaloBusRouteInfoMainScreenKt.e(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ChaloBusUserProfileSurveyMainScreenKt.l(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ChaloMap_androidKt.e(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ChaloMultiSelectDatePickerKt.f(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                FareBreakupSectionKt.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                FareBreakupSectionKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                LocationDisclaimerScreenKt.e(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                PremiumBusSlotSelectionUiStateKt.o(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                RouteSearchItemComposableKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
