package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import app.chalo.ads.NativeInlineAdTemplatesKt;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloGridLayoutKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.qr.QrCodeComponentKt;
import app.chalo.instantticket.ui.faredetails.compose.FareBreakupSectionKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsMetroLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.ncmc.ui.landing.SelectedCardDetailsUiModel;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ChaloBusActiveTicketKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import app.chalo.productbooking.pickstop.ui.PickStopScreenKt;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.components.ProductGridContainerSpec;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19788a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(Modifier modifier, List list, Function1 function1, int i, int i2) {
        this.f19788a = 4;
        this.e = modifier;
        this.c = i;
        this.f = list;
        this.b = function1;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19788a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$13((LifecycleOwner) this.e, (Function1) this.b, (Function0) this.f, this.c, this.d, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$6((Modifier) this.e, (Function1) this.b, (Function2) this.f, this.c, this.d, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AndroidViewBindingKt.AndroidViewBinding$lambda$1((Function3) this.e, (Modifier) this.f, (Function1) this.b, this.c, this.d, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return BadgeKt.BadgedBox$lambda$2((Function3) this.e, (Modifier) this.b, (Function3) this.f, this.c, this.d, (Composer) obj, iIntValue4);
            case 4:
                ((Integer) obj2).getClass();
                CardInfoLandingScreenKt.j((Modifier) this.e, this.c, (List) this.f, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).getClass();
                ChaloBusActiveTicketKt.b((Modifier) this.e, (PremiumBusBookingTripTimeInfoState) this.b, (PremiumBusPostBookingStopSchedule) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).getClass();
                ChaloEtaComponentKt.a((String) this.e, (Modifier) this.b, (TextStyle) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                ChaloGridLayoutKt.a((Modifier) this.e, (ProductGridContainerSpec) this.b, (Function3) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).getClass();
                ChaloRoundedCardKt.a((CardUISpec) this.e, (Modifier) this.b, (Function3) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.b((ToolbarUIState) this.e, (Modifier) this.b, (Function3) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.s((ImageUrlUIState) this.e, (TextUIState) this.b, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 11:
                int iIntValue5 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuColumn$lambda$0((ContextMenuColors) this.e, (Modifier) this.b, (Function3) this.f, this.c, this.d, (Composer) obj, iIntValue5);
            case 12:
                int iIntValue6 = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuColumnBuilder$lambda$1((Modifier) this.e, (ContextMenuColors) this.f, (Function1) this.b, this.c, this.d, (Composer) obj, iIntValue6);
            case 13:
                int iIntValue7 = ((Integer) obj2).intValue();
                return DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$11((Modifier) this.e, this.c, (Function1) this.b, (DatePickerColors) this.f, this.d, (Composer) obj, iIntValue7);
            case 14:
                ((Integer) obj2).intValue();
                FareBreakupSectionKt.g((String) this.e, this.c, (String) this.b, (String) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).getClass();
                JourneyDetailsBottomSheetKt.f((TripPlannerLegUiModel.Metro) this.e, (String) this.b, this.c, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 16:
                int iIntValue8 = ((Integer) obj2).intValue();
                return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$1((LazyLayoutItemProvider) this.e, this.b, this.c, this.f, this.d, (Composer) obj, iIntValue8);
            case 17:
                int iIntValue9 = ((Integer) obj2).intValue();
                return LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$2(this.e, this.c, (LazyLayoutPinnedItemList) this.b, (Function2) this.f, this.d, (Composer) obj, iIntValue9);
            case 18:
                int iIntValue10 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleEventEffect$lambda$5((Lifecycle.Event) this.b, (LifecycleOwner) this.e, (Function0) this.f, this.c, this.d, (Composer) obj, iIntValue10);
            case 19:
                ((Integer) obj2).intValue();
                NativeInlineAdTemplatesKt.a((NativeAd) this.e, (Modifier) this.f, this.c, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 20:
                int iIntValue11 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.PermanentNavigationDrawer$lambda$42((Function2) this.e, (Modifier) this.b, (Function2) this.f, this.c, this.d, (Composer) obj, iIntValue11);
            case 21:
                ((Integer) obj2).getClass();
                PBStopDetailsMainScreenKt.b((Modifier) this.e, (List) this.b, this.c, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                PickStopScreenKt.e((Modifier) this.e, (SearchBarWithActionUIState) this.b, (FocusRequester) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.n((PremiumBusSlotSelectionDateAndTimePickerUIState) this.e, (Function2) this.b, (Function3) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                QrCodeComponentKt.a((Modifier) this.e, (Modifier) this.b, (String) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).getClass();
                SingleCardDetailsScreenKt.f((Modifier) this.e, (SelectedCardDetailsUiModel) this.f, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.d);
                return Unit.f17538a;
            case 26:
                int iIntValue12 = ((Integer) obj2).intValue();
                return SnackbarHostKt.SnackbarHost$lambda$1((SnackbarHostState) this.e, (Modifier) this.b, (Function3) this.f, this.c, this.d, (Composer) obj, iIntValue12);
            case 27:
                int iIntValue13 = ((Integer) obj2).intValue();
                return SnackbarHostKt.FadeInFadeOutWithScale$lambda$7((SnackbarData) this.e, (Modifier) this.b, (Function3) this.f, this.c, this.d, (Composer) obj, iIntValue13);
            case 28:
                int iIntValue14 = ((Integer) obj2).intValue();
                return TimePickerKt.TimeInput$lambda$5((TimePickerState) this.e, (Modifier) this.b, (TimePickerColors) this.f, this.c, this.d, (Composer) obj, iIntValue14);
            default:
                ((Integer) obj2).getClass();
                TripPlannerDetailsMetroLegCardKt.a((Function1) this.b, (TripPlannerLegUiModel.Metro) this.e, this.c, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ v(Lifecycle.Event event, LifecycleOwner lifecycleOwner, Function0 function0, int i, int i2) {
        this.f19788a = 18;
        this.b = event;
        this.e = lifecycleOwner;
        this.f = function0;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ v(NativeAd nativeAd, Modifier modifier, int i, Function1 function1, int i2) {
        this.f19788a = 19;
        this.e = nativeAd;
        this.f = modifier;
        this.c = i;
        this.b = function1;
        this.d = i2;
    }

    public /* synthetic */ v(Object obj, int i, Object obj2, Object obj3, int i2, int i3) {
        this.f19788a = i3;
        this.e = obj;
        this.c = i;
        this.b = obj2;
        this.f = obj3;
        this.d = i2;
    }

    public /* synthetic */ v(Object obj, Object obj2, int i, Object obj3, int i2, int i3) {
        this.f19788a = i3;
        this.e = obj;
        this.b = obj2;
        this.c = i;
        this.f = obj3;
        this.d = i2;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.f19788a = i3;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ v(Object obj, Object obj2, Function1 function1, int i, int i2, int i3) {
        this.f19788a = i3;
        this.e = obj;
        this.f = obj2;
        this.b = function1;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ v(Function1 function1, TripPlannerLegUiModel.Metro metro, int i, Modifier modifier, int i2) {
        this.f19788a = 29;
        this.b = function1;
        this.e = metro;
        this.c = i;
        this.f = modifier;
        this.d = i2;
    }
}
