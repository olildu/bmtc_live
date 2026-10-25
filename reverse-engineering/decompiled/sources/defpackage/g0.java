package defpackage;

import android.view.View;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.chalo.home.ui.chalobus.ChaloBusPassHistory;
import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import app.chalo.home.ui.chalobus.PBStopSearchSource;
import app.chalo.home.ui.chalobus.PremiumBusTutorialConfigUiModel;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeDisplayInfo;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoCtaType;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkIntent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.ncmc.ui.landing.ChaloCardOperationType;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryIntent;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionUiModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.onboarding.cityselection.ui.CitySelectionIntent;
import app.chalo.validationsdk.blevalidation.ui.BleValidationIntent;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15688a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ g0(Function1 function1, int i) {
        this.f15688a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15688a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.i(it, "it");
                function1.invoke(it);
                return unit;
            case 1:
                LayoutCoordinates it2 = (LayoutCoordinates) obj;
                Intrinsics.i(it2, "it");
                function1.invoke(it2);
                return unit;
            case 2:
                return AnchoredDraggableState.Companion.Saver$lambda$4(function1, obj);
            case 3:
                AndroidStatement execute = (AndroidStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                return execute.a(function1);
            case 4:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$6$0$0(function1, (View) obj);
            case 5:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$8$0(function1, (View) obj);
            case 6:
                function1.invoke(new BleValidationIntent.RideFeedbackRatingSelectedIntent(((Integer) obj).intValue()));
                return unit;
            case 7:
                BottomDrawerValue it3 = (BottomDrawerValue) obj;
                Intrinsics.i(it3, "it");
                return new BottomDrawerState(it3, function1);
            case 8:
                ChaloCardOperationType it4 = (ChaloCardOperationType) obj;
                Intrinsics.i(it4, "it");
                function1.invoke(new ChaloCardInfoIntent.CardOperationClicked(it4));
                return unit;
            case 9:
                function1.invoke(new ChaloCardInfoIntent.OnCardClick(((Integer) obj).intValue()));
                return unit;
            case 10:
                function1.invoke(new ChaloCardInfoIntent.OnCardClick(((Integer) obj).intValue()));
                return unit;
            case 11:
                function1.invoke(new ChaloBusViewIntent.ToggleSaveRideIntent(((Boolean) obj).booleanValue()));
                return unit;
            case 12:
                function1.invoke(new ChaloBusViewIntent.UpdateSavedRideTimeIntent(((Long) obj).longValue()));
                return unit;
            case 13:
                function1.invoke(new ChaloBusViewIntent.StopSelectionFieldClickedIntent(((Boolean) obj).booleanValue() ? PBStopSearchSource.FROM_STOP_SEARCH : PBStopSearchSource.TO_STOP_SEARCH));
                return unit;
            case 14:
                ChaloBusPassHistory pass = (ChaloBusPassHistory) obj;
                Intrinsics.i(pass, "pass");
                function1.invoke(new ChaloBusViewIntent.PassHistoryItemClickedIntent(pass));
                return unit;
            case 15:
                ProductPurchaseNudgeInfoCtaType it5 = (ProductPurchaseNudgeInfoCtaType) obj;
                Intrinsics.i(it5, "it");
                function1.invoke(new ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked(it5));
                return unit;
            case 16:
                ProductPurchaseNudgeInfoCtaType it6 = (ProductPurchaseNudgeInfoCtaType) obj;
                Intrinsics.i(it6, "it");
                function1.invoke(new ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked(it6));
                return unit;
            case 17:
                ProductPurchaseNudgeDisplayInfo it7 = (ProductPurchaseNudgeDisplayInfo) obj;
                Intrinsics.i(it7, "it");
                function1.invoke(new ChaloBusViewIntent.ProductPurchaseNudgeInfoCardClick(it7));
                return unit;
            case 18:
                ProductPurchaseNudgeInfoCtaType it8 = (ProductPurchaseNudgeInfoCtaType) obj;
                Intrinsics.i(it8, "it");
                function1.invoke(new ChaloBusViewIntent.ProductPurchaseNudgeSectionCtaClicked(it8));
                return unit;
            case 19:
                PremiumBusTutorialConfigUiModel tutorial = (PremiumBusTutorialConfigUiModel) obj;
                Intrinsics.i(tutorial, "tutorial");
                function1.invoke(new ChaloBusViewIntent.PremiumBusTutorialClickedIntent(tutorial.c, tutorial.f3290a));
                return unit;
            case 20:
                ProductPurchaseNudgeInfoCtaType it9 = (ProductPurchaseNudgeInfoCtaType) obj;
                Intrinsics.i(it9, "it");
                function1.invoke(it9);
                return unit;
            case 21:
                String it10 = (String) obj;
                Intrinsics.i(it10, "it");
                function1.invoke(new ChaloCardLinkIntent.OnCardLinkNumberEntered(it10));
                return unit;
            case 22:
                String it11 = (String) obj;
                Intrinsics.i(it11, "it");
                function1.invoke(new ChaloCardLinkIntent.OnLinkCodeEnteredLink(it11));
                return unit;
            case 23:
                String it12 = (String) obj;
                Intrinsics.i(it12, "it");
                function1.invoke(new ChaloCardRechargeAmountIntent.OnAmountEnteredIntent(it12));
                return unit;
            case 24:
                CardTransactionUiModel it13 = (CardTransactionUiModel) obj;
                Intrinsics.i(it13, "it");
                function1.invoke(new CardTransactionHistoryIntent.TransactionClickedIntent(it13.f6439a, it13.b));
                return unit;
            case 25:
                JsonBuilder Json = (JsonBuilder) obj;
                ChaloJson chaloJson = ChaloJson.f6455a;
                Intrinsics.i(Json, "$this$Json");
                Json.c = true;
                Json.d = true;
                Json.g = true;
                Json.b = false;
                Json.f18189a = true;
                function1.invoke(Json);
                return unit;
            case 26:
                LatLng it14 = (LatLng) obj;
                Intrinsics.i(it14, "it");
                function1.invoke(new app.chalo.location.LatLng(it14));
                return unit;
            case 27:
                TextFieldValue it15 = (TextFieldValue) obj;
                Intrinsics.i(it15, "it");
                function1.invoke(it15);
                return unit;
            case 28:
                String it16 = (String) obj;
                Intrinsics.i(it16, "it");
                function1.invoke(new CitySelectionIntent.SearchQueryEnteredIntent(it16));
                return unit;
            default:
                TextFieldValue it17 = (TextFieldValue) obj;
                Intrinsics.i(it17, "it");
                function1.invoke(it17);
                return unit;
        }
    }
}
