package defpackage;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ModalWideNavigationRailProperties;
import androidx.compose.material3.RailPredictiveBackState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.WideNavigationRail_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import app.chalo.ads.AdsterUnifiedAd_androidKt;
import app.chalo.ads.UnifiedAdRenderConfig;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.home.ui.home.HomeTabUnifiedAdRenderer_androidKt;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenKt;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanelUIState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposableKt;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.premiumbus.ui.stopdetails.PBStopSelectionFieldKt;
import app.chalo.premiumbus.ui.stopselection.compose.PbLandingScreenRouteSearchKt;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductItemUISpec;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreenKt;
import app.chalo.titoridedetail.data.ui.TITOStopInfoEtaState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15693a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g2(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f15693a = i2;
        this.f = modifier;
        this.e = obj;
        this.b = obj2;
        this.g = obj3;
        this.h = obj4;
        this.c = obj5;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15693a) {
            case 0:
                ((Integer) obj2).intValue();
                AdsterUnifiedAd_androidKt.b((UnifiedAdRenderConfig) this.e, (Modifier) this.f, (Function2) this.b, (Function1) this.g, (Function0) this.c, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return BottomSheetScaffoldKt.BottomSheetScaffoldLayout$lambda$16((Function2) this.b, (Function2) this.e, (Function2) this.f, (Function2) this.g, (Function0) this.c, (SheetState) this.h, this.d, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).getClass();
                CardRechargeSuccessScreenKt.e((Modifier) this.f, (List) this.e, (String) this.b, (Function0) this.c, (String) this.g, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).intValue();
                ChaloCardRechargeAmountScreenKt.a((String) this.e, (String) this.f, (String) this.b, (String) this.h, (CardRechargeDataFetchErrorReason) this.c, (Function1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                CitySelectionScreenKt.b((ImageUIState) this.e, (CitySelectionSearchPanelUIState) this.b, (ChaloPadding) this.g, (ChaloPadding) this.h, (SafeFocusRequester) this.c, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 5:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$4((ComposableLambdaImpl) this.e, this.f, this.b, this.g, this.h, this.c, this.d, (Composer) obj, iIntValue2);
            case 6:
                ((Integer) obj2).intValue();
                EnterCardDetailsScreenKt.d((EnterCardDetailsViewState) this.e, (Function1) this.g, (SoftwareKeyboardController) this.f, (FocusRequester) this.b, (FocusRequester) this.h, (SheetState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                HomeTabUnifiedAdRenderer_androidKt.a((String) this.e, (Modifier) this.f, (Function2) this.b, (Function1) this.g, (Function0) this.c, (Function1) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).getClass();
                PBProductCardComposableKt.e((ButtonUIState) this.e, (TextUIState.ChaloTextUIState) this.f, (TextUIState.StyledTextUIState) this.b, (TextUIState.ChaloTextUIState) this.g, (BorderUISpec) this.h, (OfferTagUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).getClass();
                PBStopSelectionFieldKt.a((Modifier) this.f, (String) this.e, (TextStyle) this.b, (String) this.g, (TextStyle) this.h, (Function0) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                PassSummarySuccessMainScreenKt.b((Modifier) this.f, (TextUIState.ChaloTextUIState) this.e, (TextUIState.ChaloTextUIState) this.b, (TextUIState.ChaloTextUIState) this.g, (TextUIState.ChaloTextUIState) this.h, (SpecialFeaturesTagListUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                PbLandingScreenRouteSearchKt.d((Modifier) this.f, (String) this.e, (AnnotatedString) this.b, (String) this.g, (Function0) this.c, (TextStyle) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                PremiumBusStopSelectionScreenKt.d((String) this.e, (String) this.f, (Function1) this.g, (Function0) this.c, (Function0) this.b, (Function0) this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).getClass();
                ProductSelectionScreenKt.b((ImageUrlUIState) this.e, (TextUIState.ChaloTextUIState) this.b, (TextUIState) this.g, (TextUIState) this.h, (ProductItemUISpec) this.c, (Modifier) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).intValue();
                ProductSelectionScreenKt.c((ImageUIState) this.e, (ChaloPadding) this.f, (TextUIState) this.b, (ChaloPadding) this.g, (UIShape) this.h, (ChaloColorToken) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 15:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TimePickerKt.PeriodToggleImpl$lambda$47((Modifier) this.f, (TimePickerState) this.e, (TimePickerColors) this.b, (MeasurePolicy) this.g, (Shape) this.h, (Shape) this.c, this.d, (Composer) obj, iIntValue3);
            case 16:
                ((Integer) obj2).getClass();
                TitoRideDataScreenKt.e((Modifier) this.f, (StopAppModel) this.e, (String) this.b, (String) this.g, (TITOStopInfoEtaState) this.h, (TITOStopInfoEtaState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return WideNavigationRail_androidKt.ModalWideNavigationRailDialog$lambda$10((Function0) this.c, (ModalWideNavigationRailProperties) this.e, (Function1) this.g, (Function0) this.f, (RailPredictiveBackState) this.h, (Function2) this.b, this.d, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ g2(Modifier modifier, String str, AnnotatedString annotatedString, String str2, Function0 function0, TextStyle textStyle, int i) {
        this.f15693a = 11;
        this.f = modifier;
        this.e = str;
        this.b = annotatedString;
        this.g = str2;
        this.c = function0;
        this.h = textStyle;
        this.d = i;
    }

    public /* synthetic */ g2(Modifier modifier, List list, String str, Function0 function0, String str2, Function0 function1, int i) {
        this.f15693a = 2;
        this.f = modifier;
        this.e = list;
        this.b = str;
        this.c = function0;
        this.g = str2;
        this.h = function1;
        this.d = i;
    }

    public /* synthetic */ g2(EnterCardDetailsViewState enterCardDetailsViewState, Function1 function1, SoftwareKeyboardController softwareKeyboardController, FocusRequester focusRequester, FocusRequester focusRequester2, SheetState sheetState, int i) {
        this.f15693a = 6;
        this.e = enterCardDetailsViewState;
        this.g = function1;
        this.f = softwareKeyboardController;
        this.b = focusRequester;
        this.h = focusRequester2;
        this.c = sheetState;
        this.d = i;
    }

    public /* synthetic */ g2(Object obj, Modifier modifier, Function2 function2, Function1 function1, Function0 function0, Function1 function3, int i, int i2) {
        this.f15693a = i2;
        this.e = obj;
        this.f = modifier;
        this.b = function2;
        this.g = function1;
        this.c = function0;
        this.h = function3;
        this.d = i;
    }

    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Modifier modifier, int i, int i2) {
        this.f15693a = i2;
        this.e = obj;
        this.b = obj2;
        this.g = obj3;
        this.h = obj4;
        this.c = obj5;
        this.f = modifier;
        this.d = i;
    }

    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.f15693a = i2;
        this.e = obj;
        this.f = obj2;
        this.b = obj3;
        this.g = obj4;
        this.h = obj5;
        this.c = obj6;
        this.d = i;
    }

    public /* synthetic */ g2(String str, String str2, String str3, String str4, CardRechargeDataFetchErrorReason cardRechargeDataFetchErrorReason, Function1 function1, int i) {
        this.f15693a = 3;
        this.e = str;
        this.f = str2;
        this.b = str3;
        this.h = str4;
        this.c = cardRechargeDataFetchErrorReason;
        this.g = function1;
        this.d = i;
    }

    public /* synthetic */ g2(String str, String str2, Function1 function1, Function0 function0, Function0 function2, Function0 function3, int i) {
        this.f15693a = 12;
        this.e = str;
        this.f = str2;
        this.g = function1;
        this.c = function0;
        this.b = function2;
        this.h = function3;
        this.d = i;
    }

    public /* synthetic */ g2(Function0 function0, ModalWideNavigationRailProperties modalWideNavigationRailProperties, Function1 function1, Function0 function2, RailPredictiveBackState railPredictiveBackState, Function2 function3, int i) {
        this.f15693a = 17;
        this.c = function0;
        this.e = modalWideNavigationRailProperties;
        this.g = function1;
        this.f = function2;
        this.h = railPredictiveBackState;
        this.b = function3;
        this.d = i;
    }

    public /* synthetic */ g2(Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function0 function0, SheetState sheetState, int i) {
        this.f15693a = 1;
        this.b = function2;
        this.e = function3;
        this.f = function4;
        this.g = function5;
        this.c = function0;
        this.h = sheetState;
        this.d = i;
    }
}
