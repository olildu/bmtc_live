package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.livetracking.ui.routedetailsscreen.SeatAvailabilityLevelWithInfoUIState;
import app.chalo.mTicketing.validation.MTicketProductValidationConfig;
import app.chalo.mTicketing.validation.MTicketProductValidationUIManager;
import app.chalo.mTicketing.validation.MTicketValidationAnalyticsManager;
import app.chalo.mTicketing.validation.MTicketValidationConverters;
import app.chalo.mTicketing.validation.MTicketValidationData;
import app.chalo.mTicketing.validation.MTicketValidationNavigationManager;
import app.chalo.mTicketing.validation.MTicketValidationReportProblemManager;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.ncmc.domain.BlockNCMCCardUseCase;
import app.chalo.ncmc.domain.ChangeNCMCPinUseCase;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowUseCase;
import app.chalo.ncmc.domain.FetchEligibleCardsUseCase;
import app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
import app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase;
import app.chalo.ncmc.domain.GetLinkCardConfigUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigUseCase;
import app.chalo.ncmc.domain.ProcessUvikResultUseCase;
import app.chalo.ncmc.domain.UnlinkCardUseCase;
import app.chalo.ncmc.ui.landing.ChaloCardInfoComponent;
import app.chalo.ncmc.uvik.UvikSdkHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.ChaloCardLandingScreenArgs;
import app.chalo.tito.domain.GetMTicketForTicketIdUseCase;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import com.arkivanov.decompose.ComponentContext;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.compose.MarkerNode;
import com.google.maps.android.compose.MarkerState;
import com.mmk.kmpnotifier.di.Platform;
import com.mmk.kmpnotifier.di.PlatformModule_androidKt;
import io.github.alexzhirkevich.compottie.ExpressionsEngineImpl;
import io.github.alexzhirkevich.compottie.ExpressionsRuntimeImpl;
import io.github.alexzhirkevich.compottie.internal.AnimationState;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qe0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19114a;

    public /* synthetic */ qe0(int i) {
        this.f19114a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19114a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return LazyListState.Saver$lambda$0((SaverScope) obj, (LazyListState) obj2);
            case 1:
                return LazyListState.Companion.saver$lambda$0((SaverScope) obj, (LazyListState) obj2);
            case 2:
                return LazyListState.Companion.saver$lambda$2((SaverScope) obj, (LazyListState) obj2);
            case 3:
                return LazyStaggeredGridState.Saver$lambda$0((SaverScope) obj, (LazyStaggeredGridState) obj2);
            case 4:
                IconType icon = (IconType) obj;
                String text = (String) obj2;
                Intrinsics.i(icon, "icon");
                Intrinsics.i(text, "text");
                return new SeatAvailabilityLevelWithInfoUIState(new ImageUIState(icon, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), new TextUIState.ChaloTextUIState(text, UITextStyle.BodyLarge, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
            case 5:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                AnimationState state = (AnimationState) obj2;
                Intrinsics.i(coroutineContext, "coroutineContext");
                Intrinsics.i(state, "state");
                return new ExpressionsEngineImpl(new ExpressionsRuntimeImpl(coroutineContext, state));
            case 6:
                Scope factory = (Scope) obj;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new MTicketProductValidationConfig(new MTicketValidationData((CurrencyFeature) factory.d(Reflection.a(CurrencyFeature.class), null, null), (StringProvider) factory.d(Reflection.a(StringProvider.class), null, null), (GetMTicketForTicketIdUseCase) factory.d(Reflection.a(GetMTicketForTicketIdUseCase.class), null, null), (MTicketUtilsHelper) factory.d(Reflection.a(MTicketUtilsHelper.class), null, null), (UserProfileDetailsProvider) factory.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (TimeUtilsContract) factory.d(Reflection.a(TimeUtilsContract.class), null, null)), (ProductValidationAnalyticManager) factory.d(Reflection.a(MTicketValidationAnalyticsManager.class), null, null), (ProductValidationNavigationManager) factory.d(Reflection.a(MTicketValidationNavigationManager.class), null, null), (ProductValidationUIManager) factory.d(Reflection.a(MTicketProductValidationUIManager.class), null, null), (ProductValidationReportProblemManager) factory.d(Reflection.a(MTicketValidationReportProblemManager.class), null, null), (GetMTicketForTicketIdUseCase) factory.d(Reflection.a(GetMTicketForTicketIdUseCase.class), null, null), (GetNumDigitsOfHashValueForEasyVerificationUseCase) factory.d(Reflection.a(GetNumDigitsOfHashValueForEasyVerificationUseCase.class), null, null), (GenerateHashCodeForEasyVerificationUseCase) factory.d(Reflection.a(GenerateHashCodeForEasyVerificationUseCase.class), null, null), (MTicketValidationConverters) factory.d(Reflection.a(MTicketValidationConverters.class), null, null), (MobileTicketingConverters) factory.d(Reflection.a(MobileTicketingConverters.class), null, null), (ProductsSyncContract) factory.d(Reflection.a(ProductsSyncContract.class), null, null));
            case 7:
                MarkerNode update = (MarkerNode) obj;
                Intrinsics.i(update, "$this$update");
                update.h = (Function3) obj2;
                return unit;
            case 8:
                MarkerNode update2 = (MarkerNode) obj;
                Intrinsics.i(update2, "$this$update");
                update2.b.setTag(obj2);
                return unit;
            case 9:
                MarkerNode update3 = (MarkerNode) obj;
                Intrinsics.i(update3, "$this$update");
                Marker marker = update3.b;
                marker.setTitle((String) obj2);
                if (marker.isInfoWindowShown()) {
                    marker.showInfoWindow();
                }
                return unit;
            case 10:
                MarkerNode update4 = (MarkerNode) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.i(update4, "$this$update");
                update4.b.setVisible(zBooleanValue);
                return unit;
            case 11:
                MarkerNode update5 = (MarkerNode) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                Intrinsics.i(update5, "$this$update");
                update5.b.setZIndex(fFloatValue);
                return unit;
            case 12:
                MarkerNode update6 = (MarkerNode) obj;
                Function1 it = (Function1) obj2;
                Intrinsics.i(update6, "$this$update");
                Intrinsics.i(it, "it");
                update6.d = it;
                return unit;
            case 13:
                MarkerNode update7 = (MarkerNode) obj;
                Function1 it2 = (Function1) obj2;
                Intrinsics.i(update7, "$this$update");
                Intrinsics.i(it2, "it");
                update7.e = it2;
                return unit;
            case 14:
                MarkerNode update8 = (MarkerNode) obj;
                Function1 it3 = (Function1) obj2;
                Intrinsics.i(update8, "$this$update");
                Intrinsics.i(it3, "it");
                update8.f = it3;
                return unit;
            case 15:
                MarkerNode update9 = (MarkerNode) obj;
                Function1 it4 = (Function1) obj2;
                Intrinsics.i(update9, "$this$update");
                Intrinsics.i(it4, "it");
                update9.g = it4;
                return unit;
            case 16:
                MarkerNode update10 = (MarkerNode) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                Intrinsics.i(update10, "$this$update");
                update10.b.setAlpha(fFloatValue2);
                return unit;
            case 17:
                MarkerNode update11 = (MarkerNode) obj;
                Intrinsics.i(update11, "$this$update");
                update11.i = (Function3) obj2;
                return unit;
            case 18:
                MarkerNode update12 = (MarkerNode) obj;
                Offset offset = (Offset) obj2;
                Intrinsics.i(update12, "$this$update");
                update12.b.setAnchor(Float.intBitsToFloat((int) (offset.m4375unboximpl() >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & offset.m4375unboximpl())));
                return unit;
            case 19:
                MarkerNode update13 = (MarkerNode) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Intrinsics.i(update13, "$this$update");
                update13.b.setDraggable(zBooleanValue2);
                return unit;
            case 20:
                MarkerNode update14 = (MarkerNode) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                Intrinsics.i(update14, "$this$update");
                update14.b.setFlat(zBooleanValue3);
                return unit;
            case 21:
                MarkerNode update15 = (MarkerNode) obj;
                Intrinsics.i(update15, "$this$update");
                update15.b.setIcon((BitmapDescriptor) obj2);
                return unit;
            case 22:
                MarkerNode update16 = (MarkerNode) obj;
                Offset offset2 = (Offset) obj2;
                Intrinsics.i(update16, "$this$update");
                update16.b.setInfoWindowAnchor(Float.intBitsToFloat((int) (offset2.m4375unboximpl() >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & offset2.m4375unboximpl())));
                return unit;
            case 23:
                MarkerNode update17 = (MarkerNode) obj;
                LatLng it5 = (LatLng) obj2;
                Intrinsics.i(update17, "$this$update");
                Intrinsics.i(it5, "it");
                update17.b.setPosition(it5);
                return unit;
            case 24:
                MarkerNode update18 = (MarkerNode) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                Intrinsics.i(update18, "$this$update");
                update18.b.setRotation(fFloatValue3);
                return unit;
            case 25:
                MarkerNode update19 = (MarkerNode) obj;
                Intrinsics.i(update19, "$this$update");
                Marker marker2 = update19.b;
                marker2.setSnippet((String) obj2);
                if (marker2.isInfoWindowShown()) {
                    marker2.showInfoWindow();
                }
                return unit;
            case 26:
                SaverScope Saver = (SaverScope) obj;
                MarkerState it6 = (MarkerState) obj2;
                Saver saver = MarkerState.e;
                Intrinsics.i(Saver, "$this$Saver");
                Intrinsics.i(it6, "it");
                return (LatLng) it6.f14652a.getValue();
            case 27:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new ChaloCardInfoComponent((ChaloCardLandingScreenArgs) parametersHolder.a(1, Reflection.a(ChaloCardLandingScreenArgs.class)), (ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (GetMaskedCardNoFromCardNoUseCase) scope.d(Reflection.a(GetMaskedCardNoFromCardNoUseCase.class), null, null), (FetchChaloCardInfoToShowUseCase) scope.d(Reflection.a(FetchChaloCardInfoToShowUseCase.class), null, null), (GetChaloCardPassDescriptionFromPassAttrUseCase) scope.d(Reflection.a(GetChaloCardPassDescriptionFromPassAttrUseCase.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (GetAvailableChaloCardOptionsUseCase) scope.d(Reflection.a(GetAvailableChaloCardOptionsUseCase.class), null, null), (GetLinkCardConfigUseCase) scope.d(Reflection.a(GetLinkCardConfigUseCase.class), null, null), (FetchEligibleCardsUseCase) scope.d(Reflection.a(FetchEligibleCardsUseCase.class), null, null), (GetNcmcCardAndRechargeConfigUseCase) scope.d(Reflection.a(GetNcmcCardAndRechargeConfigUseCase.class), null, null), (UnlinkCardUseCase) scope.d(Reflection.a(UnlinkCardUseCase.class), null, null), (BlockNCMCCardUseCase) scope.d(Reflection.a(BlockNCMCCardUseCase.class), null, null), (ChangeNCMCPinUseCase) scope.d(Reflection.a(ChangeNCMCPinUseCase.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (GenerateUvikIntentHashUseCase) scope.d(Reflection.a(GenerateUvikIntentHashUseCase.class), null, null), (ProcessUvikResultUseCase) scope.d(Reflection.a(ProcessUvikResultUseCase.class), null, null), (UvikSdkHelper) scope.d(Reflection.a(UvikSdkHelper.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
            case 28:
                Map data = (Map) obj;
                MutablePreferences mutablePrefs = (MutablePreferences) obj2;
                Intrinsics.i(data, "data");
                Intrinsics.i(mutablePrefs, "mutablePrefs");
                for (Map.Entry entry : data.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        mutablePrefs.set(PreferencesKeys.booleanKey(str), value);
                    } else if (value instanceof Float) {
                        mutablePrefs.set(PreferencesKeys.floatKey(str), value);
                    } else if (value instanceof Integer) {
                        mutablePrefs.set(PreferencesKeys.intKey(str), value);
                    } else if (value instanceof Long) {
                        mutablePrefs.set(PreferencesKeys.longKey(str), value);
                    } else if (value instanceof String) {
                        mutablePrefs.set(PreferencesKeys.stringKey(str), value);
                    } else if (value instanceof Set) {
                        mutablePrefs.set(PreferencesKeys.stringSetKey(str), (Set) value);
                    }
                }
                return unit;
            default:
                Context context = PlatformModule_androidKt.f15310a;
                Intrinsics.i((Scope) obj, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return Platform.Android.f15306a;
        }
    }
}
