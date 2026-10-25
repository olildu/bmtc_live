package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ads.UnifiedAdSlotSpec;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.chalobus.RidePreferenceBannerState;
import app.chalo.home.ui.chalobus.RidePreferenceBannerUIKt;
import app.chalo.home.ui.common.SearchCardUIKt;
import app.chalo.home.ui.nearby.compose.RegularBusStopNearbyTripsCardKt;
import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenKt;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.home.ui.profile.ProfileScreenViewState;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.homescreen.data.model.app.ProfileScreenAppModel;
import app.chalo.homescreen.data.model.app.SearchCardAppModel;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.SeatAvailabilityKt;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsScreenKt;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenUIState;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import app.chalo.wallet.ui.access.WalletAccessState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ey0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15597a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ey0(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15597a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15597a) {
            case 0:
                ((Integer) obj2).intValue();
                ProfileScreenKt.a((ProfileScreenComponent) this.d, (HomeScreenInfoHelper) this.e, (ProfileScreenAppModel) this.f, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.j((ProfileScreenViewState) this.d, (Function1) this.e, (Function0) this.b, (SheetState) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                QRValidationScreenKt.i((QRValidationScreenUIState.QRWithProductAndUserDetails) this.d, (Modifier) this.e, (List) this.f, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                QuickpayTripAmountScreenKt.e((ImageUIState) this.d, (TextUIState) this.e, (ChaloPadding) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.l((RegularBusViewState) this.d, (Function1) this.e, (SheetState) this.f, (ScrollState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                RegularBusStopNearbyTripsCardKt.j((NearbyStopAndTripsUiModel) this.d, (Function1) this.e, (Function2) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                RidePreferenceBannerUIKt.b((RidePreferenceBannerState) this.d, (Function1) this.e, (Function1) this.f, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                SearchCardUIKt.a((SearchCardAppModel) this.d, (String) this.e, (Function0) this.b, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                SeatAvailabilityKt.c((Modifier) this.d, (IconType) this.e, (StringEnum) this.f, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                StopTripDetailsScreenKt.i((Modifier) this.d, (UnifiedAdSlotSpec) this.e, (Function1) this.f, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                TitoRideDataScreenKt.m((TitoRideDetailsViewState) this.d, (Function1) this.e, (BottomSheetScaffoldState) this.f, (SheetState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                TripPlannerDetailsScreenKt.k((app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState) this.d, (SheetState) this.e, (TripPlannerDetailsState) this.f, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                WalletAccessBaseScreenKt.d((WalletAccessState) this.d, (SheetState) this.e, (Function1) this.f, (Function2) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ ey0(Object obj, Object obj2, Function0 function0, Object obj3, int i, int i2) {
        this.f15597a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = function0;
        this.f = obj3;
        this.c = i;
    }
}
