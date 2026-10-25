package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarValue;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Density;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.home.ui.selectridescreen.SelectRideIntent;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsAnchoredAdLayout;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.titoridedetail.ui.TitoRideDetailsComponent;
import app.chalo.titoridedetail.ui.TitoRideDetailsIntent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w31 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19890a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w31(int i, Object obj, Object obj2, Object obj3) {
        this.f19890a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19890a) {
            case 0:
                State state = (State) this.b;
                MutableIntState mutableIntState = (MutableIntState) this.d;
                State state2 = (State) this.c;
                BottomSheetValue sheetValue = (BottomSheetValue) state.getValue();
                boolean z = mutableIntState.getIntValue() > 0;
                int iIntValue = ((Number) state2.getValue()).intValue();
                Intrinsics.i(sheetValue, "sheetValue");
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                if (!z || iIntValue == 0) {
                    return new RouteDetailsAnchoredAdLayout(0, 0, 0, 0);
                }
                return new RouteDetailsAnchoredAdLayout(iIntValue, sheetValue == BottomSheetValue.Collapsed ? 0 : iIntValue, sheetValue == BottomSheetValue.ExpandedFull ? iIntValue + 8 : 0, iIntValue + 8);
            case 1:
                ((Function2) this.b).invoke(((RouteDetailsStopUiModel) this.c).f4410a, (String) this.d);
                return Unit.f17538a;
            case 2:
                return SearchBarKt.rememberSearchBarState$lambda$27$lambda$26((SearchBarValue) this.b, (AnimationSpec) this.c, (AnimationSpec) this.d);
            case 3:
                String str = (String) this.b;
                String str2 = (String) this.c;
                Function1 function1 = (Function1) this.d;
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                    function1.invoke(SelectRideIntent.ODCardContinueButtonClicked.f3705a);
                }
                return Unit.f17538a;
            case 4:
                ((Function1) this.b).invoke(new PremiumBusSlotSelectionIntent.SlotClickedIntent((PBAvailableSlotsTripAppModel) this.c, ((PBSlotSelectionScreenBottomSheetType.ViewAllSlots) ((PBSlotSelectionScreenBottomSheetType) this.d)).e));
                return Unit.f17538a;
            case 5:
                Function1 function2 = (Function1) this.b;
                NearbyStopToLocationAppModel nearbyStopToLocationAppModel = (NearbyStopToLocationAppModel) this.c;
                StopBasedTripPlannerResultsBottomSheetType.NearestStops nearestStops = (StopBasedTripPlannerResultsBottomSheetType.NearestStops) this.d;
                function2.invoke(new StopTripPlannerResultIntent.OnNearestStopSelected(nearbyStopToLocationAppModel, nearestStops.f4526a, nearestStops.b));
                return Unit.f17538a;
            case 6:
                return TextLinkScope.LinksComposables$lambda$0$2$0((TextLinkScope) this.b, (AnnotatedString.Range) this.c, (UriHandler) this.d);
            case 7:
                return Boolean.valueOf(TimePickerKt.ClockText$lambda$74$lambda$73((AnalogTimePickerState) this.b, (Density) this.c, (MutableState) this.d));
            case 8:
                ((Function1) this.b).invoke(new TitoRideDetailsIntent.TapOutMissedFeedbackSubmitButtonClickIntent((SnapshotStateList) this.c, (String) ((MutableState) this.d).getValue()));
                return Unit.f17538a;
            case 9:
                ((TitoRideDetailsComponent) this.b).M0(new TitoRideDetailsIntent.OnMapStopClickIntent((String) this.c, (String) this.d));
                return Boolean.TRUE;
            default:
                ((WalletLoadBalanceEnterAmountComponent) this.b).D.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs((String) this.c, (String) this.d), null, null, 6));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ w31(State state, MutableIntState mutableIntState, State state2) {
        this.f19890a = 0;
        this.b = state;
        this.d = mutableIntState;
        this.c = state2;
    }
}
