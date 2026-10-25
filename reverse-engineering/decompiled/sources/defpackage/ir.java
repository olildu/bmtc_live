package defpackage;

import android.view.View;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import app.chalo.ads.NativeAdViewKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.HorizontalImageDialogViewerKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenDrawerChild;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.common.InlineUnifiedAdLoadedSize;
import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.home.HomeScreenKt;
import app.chalo.home.ui.home.HomeTabScaffoldKt;
import app.chalo.home.ui.home.HomeUnifiedAdUiState;
import app.chalo.home.ui.home.HomeUnifiedAdUiStateTracker;
import app.chalo.homescreen.data.model.app.HomeScreenAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainScreenKt;
import app.chalo.kyc.min.ui.minkycotp.OtpUIState;
import app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenUIKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUIKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryLegItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StepCardUIState;
import app.chalo.login.ui.options.LoginOptionsScreenKt;
import app.chalo.login.ui.otp.LoginOtpEnterTextFieldUIState;
import app.chalo.login.ui.otp.LoginOtpEnterUIState;
import app.chalo.login.ui.otp.LoginOtpScreenKt;
import app.chalo.metro.ui.landing.compose.MetroLandingScreenUIKt;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenViewState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerItemFareUIState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionScreenKt;
import app.chalo.multimodalticket.groupticketsummary.ui.compose.GroupTicketSummaryScreenKt;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketLegFareUiState;
import app.chalo.multimodalticket.groupticketsummary.ui.uistate.GroupTicketPriceDetailsUiSpec;
import app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.DirectValidationMainScreenUIKt;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ir implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17084a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ir(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f17084a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0172  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InlineUnifiedAdLoadedSize inlineUnifiedAdLoadedSize;
        HomeUnifiedAdUiState homeUnifiedAdUiState;
        int i = this.f17084a;
        Unit unit = Unit.f17538a;
        int i2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                return ComposableLambdaImpl.invoke$lambda$1((ComposableLambdaImpl) obj5, this.d, this.e, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.r((ImageUIState) obj5, (TextUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 2:
                return CoreTextFieldKt.CoreTextFieldRootBox$lambda$1((Modifier) obj5, (TextFieldSelectionManager) obj4, (Function2) obj3, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$3((TextContextMenuSession) obj5, (TextContextMenuDataProvider) obj4, (Function0) obj3, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                ((Integer) obj2).intValue();
                DirectValidationMainScreenUIKt.b((QRScannerViewState) obj5, (SheetState) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 5:
                return ExposedDropdownMenu_androidKt.SoftKeyboardListener$lambda$6((View) obj5, (Density) obj4, (Function0) obj3, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                ((Integer) obj2).intValue();
                FareDetailsMainScreenKt.a((Modifier) obj5, (ApplicableRuleUxCopyAppModel.CheckoutScreen) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                FareDetailsMainScreenKt.d((Modifier) obj5, (List) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                FromAndToStopDetailViewKt.g((Modifier) obj5, (Function2) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 9:
                ((Integer) obj2).getClass();
                GroupTicketSummaryScreenKt.d((Modifier) obj5, (GroupTicketLegFareUiState) obj4, (GroupTicketPriceDetailsUiSpec) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 10:
                ((Integer) obj2).intValue();
                HomeScreenKt.a((HomeScreenComponent) obj5, (HomeScreenAppModel) obj4, (HomeScreenInfoHelper) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 11:
                ((Integer) obj2).intValue();
                HomeScreenMainDecomposeKt.e((List) obj5, (NavigationTabAppModel) obj4, (HomeScreenInfoHelper) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 12:
                ((Integer) obj2).intValue();
                HomeScreenMainDecomposeKt.c((HomeComponent) obj5, (HomeScreenAnalyticsHelper) obj4, (HomeScreenInfoHelper) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 13:
                ((Integer) obj2).intValue();
                HomeScreenMainDecomposeKt.d((HomeScreenDrawerChild) obj5, (HomeScreenInfoHelper) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 14:
                ((Integer) obj2).intValue();
                HomeTabScaffoldKt.e((Function1) obj5, (List) obj4, (String) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 15:
                HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker = (HomeUnifiedAdUiStateTracker) obj5;
                String str = (String) obj4;
                MutableState mutableState = (MutableState) obj3;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                if (iIntValue2 > 0) {
                    if (iIntValue > 0) {
                        i2 = iIntValue;
                    }
                    if (i2 <= 0) {
                        inlineUnifiedAdLoadedSize = null;
                    } else {
                        inlineUnifiedAdLoadedSize = new InlineUnifiedAdLoadedSize(i2, iIntValue2);
                    }
                } else {
                    inlineUnifiedAdLoadedSize = null;
                }
                if (inlineUnifiedAdLoadedSize != null) {
                    int i3 = inlineUnifiedAdLoadedSize.f3380a;
                    int i4 = inlineUnifiedAdLoadedSize.b;
                    homeUnifiedAdUiStateTracker.getClass();
                    if (Intrinsics.d(homeUnifiedAdUiStateTracker.b, str)) {
                        HomeUnifiedAdUiState homeUnifiedAdUiState2 = homeUnifiedAdUiStateTracker.c;
                        boolean z = homeUnifiedAdUiState2.b;
                        if (z) {
                            homeUnifiedAdUiState = homeUnifiedAdUiState2;
                        } else {
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            if (i4 < 0) {
                                i4 = 0;
                            }
                            homeUnifiedAdUiStateTracker.c = new HomeUnifiedAdUiState(i3, i4, true, z);
                            homeUnifiedAdUiStateTracker.f3583a.put(str, Boolean.FALSE);
                            homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
                        }
                    } else {
                        homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
                    }
                    mutableState.setValue(homeUnifiedAdUiState);
                }
                return unit;
            case 16:
                ((Integer) obj2).getClass();
                HorizontalImageDialogViewerKt.a((Modifier) obj5, (IconType) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 17:
                ((Integer) obj2).getClass();
                ItineraryConnectedLegsRowUIKt.b((Modifier) obj5, (StepCardUIState) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 18:
                ((Integer) obj2).getClass();
                ItinerarySingleLegCardKt.e((Modifier) obj5, (ItineraryLegItemUiState) obj4, (Float) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 19:
                ((Integer) obj2).getClass();
                LanguageSelectionScreenKt.b((Modifier) obj5, (ButtonUIState) obj4, (TextUIState.StyledTextUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 20:
                return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$20((LifecycleOwner) obj5, (LifecycleStartStopEffectScope) obj4, (Function1) obj3, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$35((LifecycleOwner) obj5, (LifecycleResumePauseEffectScope) obj4, (Function1) obj3, this.b, (Composer) obj, ((Integer) obj2).intValue());
            case 22:
                ((Integer) obj2).getClass();
                LoginOptionsScreenKt.h((Modifier) obj5, (ImageUIState) obj4, (ImageUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 23:
                ((Integer) obj2).getClass();
                LoginOtpScreenKt.e((Modifier) obj5, (LoginOtpEnterUIState) obj4, (FocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 24:
                ((Integer) obj2).intValue();
                LoginOtpScreenKt.b((LoginOtpEnterTextFieldUIState) obj5, (TextUIState.ChaloTextUIState) obj4, (FocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 25:
                ((Integer) obj2).getClass();
                MTicketPassengerSelectionScreenKt.c((TextUIState) obj5, (MTicketPassengerItemFareUIState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 26:
                ((Integer) obj2).intValue();
                MetroLandingScreenUIKt.d((MetroLandingScreenViewState) obj5, (Function1) obj4, (SheetState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 27:
                ((Integer) obj2).getClass();
                MinKycOtpScreenUIKt.d((Modifier) obj5, (OtpUIState) obj4, (SafeFocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 28:
                ((Integer) obj2).getClass();
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                NativeAdViewKt.e((NativeAd) obj5, (Modifier) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            default:
                ((Integer) obj2).intValue();
                NearbyStopsMapScreenKt.d((NearbyStopsMapState) obj5, (BottomSheetScaffoldState) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
        }
    }

    public /* synthetic */ ir(int i, HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker, String str, MutableState mutableState) {
        this.f17084a = 15;
        this.b = i;
        this.c = homeUnifiedAdUiStateTracker;
        this.d = str;
        this.e = mutableState;
    }
}
