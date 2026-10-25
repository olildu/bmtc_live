package defpackage;

import android.view.View;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.text.TextLayoutResult;
import app.chalo.compose.components.bottomsheet.ComposableSingletons$UserRatingBottomSheetKt;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsIntent;
import app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenDataState;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkIntent;
import app.chalo.ncmc.ui.cardlinking.linking.compose.ComposableSingletons$ChaloCardLinkCardScreenKt;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountIntent;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ComposableSingletons$ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsIntent;
import app.chalo.ncmc.ui.entercarddetails.compose.ComposableSingletons$EnterCardDetailsScreenKt;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$SingleCardDetailsScreenKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeIntent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.ComposableSingletons$OfflineCardRechargeScreenKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeIntent;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.ComposableSingletons$NcmcOnlineRechargeScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionIntent;
import app.chalo.onboarding.citylocationselection.ui.ComposableSingletons$CityLocationSelectionScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionDataState;
import app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusScrollableTabRowKt;
import app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PbLandingScreenRouteSearchKt;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15394a;

    public /* synthetic */ cp(int i) {
        this.f15394a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15394a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                CitySelectionDataState it = (CitySelectionDataState) obj;
                Intrinsics.i(it, "it");
                return CitySelectionDataState.a(it, null, null, null, null, false, false, true, 63);
            case 1:
                CitySelectionDataState it2 = (CitySelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return CitySelectionDataState.a(it2, null, null, null, null, false, false, false, 63);
            case 2:
                return CitySelectionDataState.a((CitySelectionDataState) obj, null, null, null, null, false, true, false, 95);
            case 3:
                TextUIState textUIState = (TextUIState) obj;
                Intrinsics.i(textUIState, "<this>");
                if (textUIState instanceof TextUIState.ChaloTextUIState) {
                    return ((TextUIState.ChaloTextUIState) textUIState).b;
                }
                if (textUIState instanceof TextUIState.ExpandingTextUIState) {
                    return ((TextUIState.ExpandingTextUIState) textUIState).b.b;
                }
                if (textUIState instanceof TextUIState.StyledTextUIState) {
                    return CollectionsKt.O(((TextUIState.StyledTextUIState) textUIState).b, "", null, null, new cp(4), 30);
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                StyledTextDataUIState it3 = (StyledTextDataUIState) obj;
                Intrinsics.i(it3, "it");
                return it3.f10086a;
            case 5:
                return ClickableTextKt.ClickableText_4YKlhWE$lambda$0$0((TextLayoutResult) obj);
            case 6:
                ComposableLambda composableLambda = ComposableSingletons$CardInfoLandingScreenKt.f6381a;
                Intrinsics.i((ChaloCardInfoIntent) obj, "it");
                return unit;
            case 7:
                ComposableLambda composableLambda2 = ComposableSingletons$ChaloCardLinkCardScreenKt.f6280a;
                Intrinsics.i((ChaloCardLinkIntent) obj, "it");
                return unit;
            case 8:
                ComposableLambda composableLambda3 = ComposableSingletons$ChaloCardRechargeAmountScreenKt.f6311a;
                Intrinsics.i((ChaloCardRechargeAmountIntent) obj, "it");
                return unit;
            case 9:
                ComposableLambda composableLambda4 = ComposableSingletons$CityLocationSelectionScreenKt.f6600a;
                Intrinsics.i((CityLocationSelectionIntent) obj, "it");
                return unit;
            case 10:
                ComposableLambda composableLambda5 = ComposableSingletons$CityLocationSelectionScreenKt.f6600a;
                Intrinsics.i((CityLocationSelectionIntent) obj, "it");
                return unit;
            case 11:
                ComposableLambda composableLambda6 = ComposableSingletons$EnterCardDetailsScreenKt.f6337a;
                Intrinsics.i((EnterCardDetailsIntent) obj, "it");
                return unit;
            case 12:
                ComposableLambda composableLambda7 = ComposableSingletons$NcmcOnlineRechargeScreenKt.f6416a;
                Intrinsics.i((NCMCOnlineRechargeIntent) obj, "it");
                return unit;
            case 13:
                ComposableLambda composableLambda8 = ComposableSingletons$OfflineCardRechargeScreenKt.f6400a;
                Intrinsics.i((OfflineCardRechargeIntent) obj, "it");
                return unit;
            case 14:
                ((Boolean) obj).getClass();
                ComposableLambda composableLambda9 = ComposableSingletons$PbLandingScreenRouteSearchKt.f7988a;
                return unit;
            case 15:
                ((Integer) obj).getClass();
                ComposableLambda composableLambda10 = ComposableSingletons$PremiumBusScrollableTabRowKt.f7906a;
                return unit;
            case 16:
                ComposableLambda composableLambda11 = ComposableSingletons$SingleCardDetailsScreenKt.f6385a;
                Intrinsics.i((ChaloCardInfoIntent) obj, "it");
                return unit;
            case 17:
                ComposableLambda composableLambda12 = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
                Intrinsics.i((TripPlannerDetailsIntent) obj, "it");
                return unit;
            case 18:
                ComposableLambda composableLambda13 = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
                Intrinsics.i((TripPlannerDetailsIntent) obj, "it");
                return unit;
            case 19:
                ((Integer) obj).getClass();
                ComposableLambda composableLambda14 = ComposableSingletons$UserRatingBottomSheetKt.f1853a;
                return unit;
            case 20:
                return ComposeInputMethodManager_androidKt.ComposeInputMethodManagerFactory$lambda$0((View) obj);
            case 21:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("config");
                return unit;
            case 22:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("config");
                return unit;
            case 23:
                ConfirmBookingScreenDataState it4 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it4, "it");
                return ConfirmBookingScreenDataState.a(it4, null, true, null, null, null, null, null, null, null, false, false, false, 8187);
            case 24:
                ConfirmBookingScreenDataState it5 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it5, "it");
                return ConfirmBookingScreenDataState.a(it5, null, false, null, null, null, null, null, null, null, false, false, false, 8187);
            case 25:
                ConfirmBookingScreenDataState it6 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it6, "it");
                return ConfirmBookingScreenDataState.a(it6, null, false, null, null, null, null, null, null, null, false, false, false, 8187);
            case 26:
                ConfirmBookingScreenDataState it7 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it7, "it");
                return ConfirmBookingScreenDataState.a(it7, null, false, null, null, null, null, null, null, null, true, false, false, 5119);
            case 27:
                ConfirmBookingScreenDataState it8 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it8, "it");
                return ConfirmBookingScreenDataState.a(it8, null, false, null, null, null, null, null, null, null, false, true, false, 5119);
            case 28:
                ConfirmBookingScreenDataState it9 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it9, "it");
                return ConfirmBookingScreenDataState.a(it9, null, false, null, null, null, null, null, null, null, false, false, false, 4095);
            default:
                ConfirmBookingScreenDataState it10 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it10, "it");
                return ConfirmBookingScreenDataState.a(it10, null, false, null, null, null, null, null, null, null, false, false, true, 4095);
        }
    }
}
