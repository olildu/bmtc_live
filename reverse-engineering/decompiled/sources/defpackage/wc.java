package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.home.ui.chalobus.RidePreferenceBannerUIKt;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.instantticket.ui.faredetails.compose.BottomSheetViewsKt;
import app.chalo.instantticket.ui.faredetails.compose.PassengerDetailsViewKt;
import app.chalo.livetracking.universalsearch.ui.compose.SetUpUniversalItemListKt;
import app.chalo.ondc.model.app.response.OndcBookingUiModel;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19913a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wc(Modifier modifier, Object obj, boolean z, Object obj2, Function function, Function function2, int i, int i2) {
        this.f19913a = i2;
        this.c = modifier;
        this.e = obj;
        this.b = z;
        this.f = obj2;
        this.g = function;
        this.h = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19913a) {
            case 0:
                ((Integer) obj2).getClass();
                BottomSheetViewsKt.b((Modifier) this.c, (OndcBookingUiModel) this.e, this.b, (Function0) this.f, (Function0) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return CheckboxKt.CheckboxImpl$lambda$15(this.b, (ToggleableState) this.e, (Modifier) this.c, (CheckboxColors) this.f, (Stroke) this.g, (Stroke) this.h, this.d, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).intValue();
                NewPremiumBusActivationBottomSheetContentKt.j((PremiumBusBookingTripTimeInfoState) this.e, (NewPremiumReserveTicketDetailsScreenType) this.f, (String) this.g, (String) this.h, this.b, (Modifier) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                PassengerDetailsViewKt.d((Modifier) this.c, (PassengerFareDetailsUiModel) this.e, this.b, (Function1) this.f, (Function1) this.g, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                RidePreferenceBannerUIKt.c(this.b, (Function1) this.e, (Modifier) this.c, (String) this.f, (String) this.g, (String) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                SetUpUniversalItemListKt.c((String) this.c, (String) this.e, (String) this.g, (ChaloTransitMode) this.h, this.b, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 6:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderKt.SliderImpl$lambda$31((Modifier) this.c, (SliderState) this.e, this.b, (MutableInteractionSource) this.f, (Function3) this.g, (Function3) this.h, this.d, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).intValue();
                TitoRideDataScreenKt.o((TitoRideDetailsViewState) this.c, (BottomSheetScaffoldState) this.e, (Function1) this.f, (SheetState) this.g, (ExoPlayer) this.h, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ wc(PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, String str, String str2, boolean z, Modifier modifier, int i) {
        this.f19913a = 2;
        this.e = premiumBusBookingTripTimeInfoState;
        this.f = newPremiumReserveTicketDetailsScreenType;
        this.g = str;
        this.h = str2;
        this.b = z;
        this.c = modifier;
        this.d = i;
    }

    public /* synthetic */ wc(TitoRideDetailsViewState titoRideDetailsViewState, BottomSheetScaffoldState bottomSheetScaffoldState, Function1 function1, SheetState sheetState, ExoPlayer exoPlayer, boolean z, int i) {
        this.f19913a = 7;
        this.c = titoRideDetailsViewState;
        this.e = bottomSheetScaffoldState;
        this.f = function1;
        this.g = sheetState;
        this.h = exoPlayer;
        this.b = z;
        this.d = i;
    }

    public /* synthetic */ wc(String str, String str2, String str3, ChaloTransitMode chaloTransitMode, boolean z, Function0 function0, int i) {
        this.f19913a = 5;
        this.c = str;
        this.e = str2;
        this.g = str3;
        this.h = chaloTransitMode;
        this.b = z;
        this.f = function0;
        this.d = i;
    }

    public /* synthetic */ wc(boolean z, Object obj, Modifier modifier, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f19913a = i2;
        this.b = z;
        this.e = obj;
        this.c = modifier;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.d = i;
    }
}
