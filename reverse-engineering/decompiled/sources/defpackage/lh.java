package defpackage;

import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.components.ChaloSearchBarComposableKt;
import app.chalo.data.TextFormatAppModel;
import app.chalo.home.data.model.PremiumPassSavingsInfo;
import app.chalo.home.ui.chalobus.ChaloBusPageDisplayItemData;
import app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayoutKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.instantticket.ui.faredetails.compose.FareRouteAndStopDetailsViewKt;
import app.chalo.instantticket.ui.instantticketscreen.WalletSubTextProperties;
import app.chalo.instantticket.ui.instantticketscreen.compose.PaymentBottomSheetComposableKt;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRoutesDetailModel;
import app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedItemComposableKt;
import app.chalo.livetracking.universalsearch.ui.compose.SetUpUniversalItemListKt;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposableKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18312a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lh(Modifier modifier, AnalogTimePickerState analogTimePickerState, TimePickerColors timePickerColors, boolean z, int i) {
        this.f18312a = 14;
        this.f = modifier;
        this.d = analogTimePickerState;
        this.e = timePickerColors;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18312a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloBusScreenHeaderLayoutKt.e((PremiumPassSavingsInfo) this.d, this.b, (Function0) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).intValue();
                ChaloBusScreenUIKt.w((Function1) this.d, this.b, (ChaloBusPageDisplayItemData) this.e, (Density) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).intValue();
                ChaloSearchBarComposableKt.b(this.b, (TextFieldValue) this.d, (Function1) this.f, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                FareRouteAndStopDetailsViewKt.c((String) this.d, (String) this.e, (List) this.f, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                NewPremiumBusActivationBottomSheetContentKt.m((PremiumBusBookingTripTimeInfoState) this.d, this.b, (NewPremiumReserveTicketDetailsScreenType) this.e, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).getClass();
                NewPremiumBusActivationBottomSheetContentKt.d((Modifier) this.f, (String) this.d, this.b, (TextStyle) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).getClass();
                NewPremiumBusActivationBottomSheetContentKt.k((Modifier) this.f, (PremiumBusBookingVehicleInfoState) this.d, this.b, (Function1) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                NewPremiumBusReserveTicketActivationScreenKt.h((Modifier) this.f, this.b, (Function0) this.e, (Function0) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).getClass();
                NewPremiumBusReserveTicketActivationScreenKt.d((Modifier) this.f, (Function0) this.e, this.b, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).intValue();
                PaymentBottomSheetComposableKt.a((WalletSubTextProperties) this.d, (String) this.f, this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).intValue();
                ProfileScreenUIKt.g((Function1) this.d, (String) this.e, (List) this.f, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).intValue();
                RecentSearchedItemComposableKt.d((UniversalSearchRecentSearchItem.Route) this.d, this.b, (Function1) this.e, (Function2) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).getClass();
                RegularBusScreenUIKt.b((TextFormatAppModel) this.d, (List) this.e, this.b, (Density) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                SetUpUniversalItemListKt.b((String) this.d, (UniversalSearchRoutesDetailModel) this.f, this.b, (Function0) this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                int iIntValue = ((Integer) obj2).intValue();
                return TimePickerKt.ClockFace$lambda$60((Modifier) this.f, (AnalogTimePickerState) this.d, (TimePickerColors) this.e, this.b, this.c, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                UniversalSearchListComposableKt.a((UniversalSearchItem.PlacesAndStopsItem) this.d, (Function1) this.e, this.b, (TextFieldValue) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ lh(Modifier modifier, Object obj, boolean z, Object obj2, int i, int i2) {
        this.f18312a = i2;
        this.f = modifier;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ lh(Modifier modifier, Function0 function0, boolean z, Function1 function1, int i) {
        this.f18312a = 8;
        this.f = modifier;
        this.e = function0;
        this.b = z;
        this.d = function1;
        this.c = i;
    }

    public /* synthetic */ lh(Modifier modifier, boolean z, Function0 function0, Function0 function1, int i) {
        this.f18312a = 7;
        this.f = modifier;
        this.b = z;
        this.e = function0;
        this.d = function1;
        this.c = i;
    }

    public /* synthetic */ lh(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.f18312a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.f = obj3;
        this.c = i;
    }

    public /* synthetic */ lh(Object obj, Object obj2, boolean z, Function0 function0, int i, int i2) {
        this.f18312a = i2;
        this.d = obj;
        this.f = obj2;
        this.b = z;
        this.e = function0;
        this.c = i;
    }

    public /* synthetic */ lh(Object obj, String str, List list, boolean z, int i, int i2) {
        this.f18312a = i2;
        this.d = obj;
        this.e = str;
        this.f = list;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ lh(Object obj, boolean z, Object obj2, Object obj3, int i, int i2) {
        this.f18312a = i2;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    public /* synthetic */ lh(boolean z, TextFieldValue textFieldValue, Function1 function1, Function0 function0, int i) {
        this.f18312a = 2;
        this.b = z;
        this.d = textFieldValue;
        this.f = function1;
        this.e = function0;
        this.c = i;
    }
}
