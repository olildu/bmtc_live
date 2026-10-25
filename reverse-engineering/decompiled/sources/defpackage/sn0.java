package defpackage;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.platform.InspectorInfo;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.home.ui.profile.ProfileScreenViewIntent;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewIntent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbPassInfoBannerCtaType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSearchSource;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import app.chalo.productsummary.ui.pass.PassSummaryIntent;
import app.chalo.productsummary.ui.ticket.ProductSummaryBannerCtaType;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import app.chalo.userprofile.domain.AccountSettingsAction;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19318a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ sn0(Function1 function1, int i) {
        this.f19318a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19318a) {
            case 0:
                return OffsetKt.absoluteOffset$lambda$0(this.b, (InspectorInfo) obj);
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                this.b.invoke(num);
                return Unit.f17538a;
            case 2:
                Integer num2 = (Integer) obj;
                num2.intValue();
                this.b.invoke(num2);
                return Unit.f17538a;
            case 3:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                this.b.invoke(new PassSummaryIntent.OnImageClickIntent(it));
                return Unit.f17538a;
            case 4:
                ProductSummaryBannerCtaType it2 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it2, "it");
                this.b.invoke(new PassSummaryIntent.OnBannerCtaClickIntent(it2));
                return Unit.f17538a;
            case 5:
                this.b.invoke(new PbBulkBookingRideDetailsViewIntent.DateSelectedIntent((Long) obj));
                return Unit.f17538a;
            case 6:
                this.b.invoke(new PbBulkBookingRideDetailsViewIntent.PassDateChangeConfirmationDialog(((Long) obj).longValue()));
                return Unit.f17538a;
            case 7:
                PbBulkBookingRideDetailsTabType it3 = (PbBulkBookingRideDetailsTabType) obj;
                Intrinsics.i(it3, "it");
                this.b.invoke(new PbBulkBookingRideDetailsViewIntent.OnTabClickIntent(it3));
                return Unit.f17538a;
            case 8:
                this.b.invoke(new PbBulkBookingRideDetailsViewIntent.OnPassInfoBannerCtaClickIntent((PbPassInfoBannerCtaType) obj));
                return Unit.f17538a;
            case 9:
                String faqImageUrl = (String) obj;
                Intrinsics.i(faqImageUrl, "faqImageUrl");
                this.b.invoke(new PbBulkBookingRideDetailsViewIntent.FaqClickedIntent(faqImageUrl));
                return Unit.f17538a;
            case 10:
                this.b.invoke((PbPassInfoBannerCtaType) obj);
                return Unit.f17538a;
            case 11:
                List it4 = (List) obj;
                Intrinsics.i(it4, "it");
                this.b.invoke(new NewPremiumBusReserveTicketActivationIntent.OpenPassengerAllocatedSeatsDialog(it4));
                return Unit.f17538a;
            case 12:
                this.b.invoke(new NewPremiumBusReserveTicketActivationIntent.PBStopImageClickedIntent(((Integer) obj).intValue(), NewPremiumReserveTicketDetailsScreenType.POST_VALIDATION));
                return Unit.f17538a;
            case 13:
                this.b.invoke(new NewPremiumBusReserveTicketActivationIntent.PBStopImageClickedIntent(((Integer) obj).intValue(), NewPremiumReserveTicketDetailsScreenType.POST_VALIDATION));
                return Unit.f17538a;
            case 14:
                String it5 = (String) obj;
                Intrinsics.i(it5, "it");
                this.b.invoke(new NewPremiumBusReserveTicketActivationIntent.RouteStopListStopClickedIntent(it5));
                return Unit.f17538a;
            case 15:
                this.b.invoke(new PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent(((Boolean) obj).booleanValue() ? PremiumBusStopSearchSource.FROM_STOP_SEARCH : PremiumBusStopSearchSource.TO_STOP_SEARCH));
                return Unit.f17538a;
            case 16:
                PremiumBusProductModificationReasonAppModel it6 = (PremiumBusProductModificationReasonAppModel) obj;
                Intrinsics.i(it6, "it");
                this.b.invoke(new PremiumBusProductModificationReasonsIntent.ReasonClickedIntent(it6));
                return Unit.f17538a;
            case 17:
                this.b.invoke(new PremiumBusSlotSelectionIntent.SectionItemClickedIntent(((Long) obj).longValue()));
                return Unit.f17538a;
            case 18:
                Integer num3 = (Integer) obj;
                num3.intValue();
                this.b.invoke(num3);
                return Unit.f17538a;
            case 19:
                PBOriginDestinationAppModel it7 = (PBOriginDestinationAppModel) obj;
                Intrinsics.i(it7, "it");
                this.b.invoke(new PremiumBusStopSelectionIntent.OriginDestinationPointSelectedIntent(it7));
                return Unit.f17538a;
            case 20:
                PBOriginDestinationAppModel it8 = (PBOriginDestinationAppModel) obj;
                Intrinsics.i(it8, "it");
                this.b.invoke(new PremiumBusStopSelectionIntent.OriginDestinationPointSelectedIntent(it8));
                return Unit.f17538a;
            case 21:
                PBOriginDestinationAppModel it9 = (PBOriginDestinationAppModel) obj;
                Intrinsics.i(it9, "it");
                this.b.invoke(new PremiumBusStopSelectionIntent.OriginDestinationStopDetailsClickedIntent(it9));
                return Unit.f17538a;
            case 22:
                PBOriginDestinationAppModel it10 = (PBOriginDestinationAppModel) obj;
                Intrinsics.i(it10, "it");
                this.b.invoke(new PremiumBusStopSelectionIntent.OriginDestinationPointClickedFromRecentIntent(it10));
                return Unit.f17538a;
            case 23:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Function1 function1 = this.b;
                if (zBooleanValue) {
                    function1.invoke(new PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.FROM_STOP_SUGGESTION));
                } else {
                    function1.invoke(new PremiumBusStopSelectionIntent.StopSelectionFieldClickedIntent(PremiumBusStopSearchSource.TO_STOP_SUGGESTION));
                }
                return Unit.f17538a;
            case 24:
                AccountSettingsAction action = (AccountSettingsAction) obj;
                Intrinsics.i(action, "action");
                this.b.invoke(new ProfileScreenViewIntent.AccountSettingsActionClickedIntent(action));
                return Unit.f17538a;
            case 25:
                Integer num4 = (Integer) obj;
                num4.intValue();
                this.b.invoke(num4);
                return Unit.f17538a;
            case 26:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                Float fValueOf = Float.valueOf(1.0f);
                final Function1 function2 = this.b;
                function2.invoke(fValueOf);
                return new DisposableEffectResult() { // from class: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreen_androidKt$AdjustScreenBrightness$lambda$2$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        function2.invoke(Float.valueOf(-1.0f));
                    }
                };
            case 27:
                String amount = (String) obj;
                Intrinsics.i(amount, "amount");
                this.b.invoke(new QuickpayTripAmountIntent.ValidateIntent(amount, false));
                return Unit.f17538a;
            case 28:
                UniversalSearchRecentSearchItem.Place placeItem = (UniversalSearchRecentSearchItem.Place) obj;
                Intrinsics.i(placeItem, "placeItem");
                this.b.invoke(new UniversalPickerIntent.PlaceRecentItemClickIntent(placeItem));
                return Unit.f17538a;
            default:
                String favTitle = (String) obj;
                Intrinsics.i(favTitle, "favTitle");
                this.b.invoke(favTitle);
                return Unit.f17538a;
        }
    }
}
