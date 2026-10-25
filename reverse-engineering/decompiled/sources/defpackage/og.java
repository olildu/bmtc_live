package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.data.ProductModificationSubtextColour;
import app.chalo.data.TextFormatAppModel;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.common.SeatAvailabilityInfoBottomSheetKt;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusBookingCancellationConfirmationBottomSheetKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class og implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18595a = 5;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ og(Modifier modifier, RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function4, Function3 function5, int i) {
        this.c = modifier;
        this.f = rangeSliderState;
        this.d = z;
        this.g = mutableInteractionSource;
        this.h = mutableInteractionSource2;
        this.i = function3;
        this.b = function4;
        this.j = function5;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18595a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloBusActiveTicketKt.e((PremiumBusBookingTripTimeInfoState) this.f, (PremiumBusPostBookingStopSchedule) this.g, (String) this.h, (String) this.i, this.d, (Function0) this.b, (NewPremiumReserveTicketDetailsScreenType) this.j, (Modifier) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.SurfaceIconButton$lambda$24((Function0) this.b, (Modifier) this.c, this.d, (Shape) this.f, (IconButtonColors) this.g, (BorderStroke) this.h, (MutableInteractionSource) this.i, (Function2) this.j, this.e, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).intValue();
                PremiumBusBookingCancellationConfirmationBottomSheetKt.a(this.d, (ProductModificationSubtextColour) this.f, (String) this.h, (PremiumBusProductModificationAdditionalInfoAppModel) this.g, (Function0) this.b, (Function0) this.i, (Function0) this.j, (Function0) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                RegularBusScreenUIKt.h((Modifier) this.c, (NearbyStopAndTripsUiModel) this.f, (String) this.h, (String) this.i, (TextFormatAppModel) this.g, (Function1) this.b, this.d, (Density) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).intValue();
                SeatAvailabilityInfoBottomSheetKt.a((Function0) this.b, (Function0) this.f, (String) this.h, (String) this.i, (String) this.g, (String) this.j, (String) this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.f17538a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderKt.RangeSliderImpl$lambda$46((Modifier) this.c, (RangeSliderState) this.f, this.d, (MutableInteractionSource) this.g, (MutableInteractionSource) this.h, (Function3) this.i, (Function3) this.b, (Function3) this.j, this.e, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ og(Modifier modifier, NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel, String str, String str2, TextFormatAppModel textFormatAppModel, Function1 function1, boolean z, Density density, int i) {
        this.c = modifier;
        this.f = nearbyStopAndTripsUiModel;
        this.h = str;
        this.i = str2;
        this.g = textFormatAppModel;
        this.b = function1;
        this.d = z;
        this.j = density;
        this.e = i;
    }

    public /* synthetic */ og(PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState, PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule, String str, String str2, boolean z, Function0 function0, NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType, Modifier modifier, int i) {
        this.f = premiumBusBookingTripTimeInfoState;
        this.g = premiumBusPostBookingStopSchedule;
        this.h = str;
        this.i = str2;
        this.d = z;
        this.b = function0;
        this.j = newPremiumReserveTicketDetailsScreenType;
        this.c = modifier;
        this.e = i;
    }

    public /* synthetic */ og(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i) {
        this.b = function0;
        this.c = modifier;
        this.d = z;
        this.f = shape;
        this.g = iconButtonColors;
        this.h = borderStroke;
        this.i = mutableInteractionSource;
        this.j = function2;
        this.e = i;
    }

    public /* synthetic */ og(Function0 function0, Function0 function1, String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        this.b = function0;
        this.f = function1;
        this.h = str;
        this.i = str2;
        this.g = str3;
        this.j = str4;
        this.c = str5;
        this.d = z;
        this.e = i;
    }

    public /* synthetic */ og(boolean z, ProductModificationSubtextColour productModificationSubtextColour, String str, PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        this.d = z;
        this.f = productModificationSubtextColour;
        this.h = str;
        this.g = premiumBusProductModificationAdditionalInfoAppModel;
        this.b = function0;
        this.i = function1;
        this.j = function2;
        this.c = function3;
        this.e = i;
    }
}
