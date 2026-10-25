package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.retain.RetainKt;
import androidx.compose.runtime.retain.RetainedValueHolder;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.ui.unit.Dp;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import androidx.window.area.SafeWindowAreaComponentProvider;
import androidx.window.reflection.ReflectionUtils;
import app.chalo.compose.theme.UIShape;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import app.chalo.home.ui.chalobus.RidePreferenceBannerState;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesIntent;
import app.chalo.livetracking.routedetails.ReportProblemTagDetails;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.StopCtaActionType;
import app.chalo.livetracking.routedetails.domain.RouteDetailsOptionsMenu;
import app.chalo.livetracking.ui.routedetailsscreen.LiveSeatAvailabilityBottomSheetCtaType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsOptionsUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.reportproblem.ReportProblemComponent;
import app.chalo.reportproblem.ReportProblemIntent;
import app.chalo.ridehailing.data.app.PostRideFeedbackSubtagConfigData;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTag;
import com.russhwolf.settings.Settings;
import com.russhwolf.settings.SharedPreferencesSettings;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p01 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18993a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p01(int i, Object obj, Object obj2) {
        this.f18993a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        int i = this.f18993a;
        int i2 = 0;
        Unit unit = Unit.f17538a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) obj;
                ((Function2) obj2).invoke(recentPlaceAppModel.e, recentPlaceAppModel.h);
                return unit;
            case 1:
                ((Function1) obj2).invoke((UniversalSearchRecentSearchItem.Stop) obj);
                return unit;
            case 2:
                RecentStopAppModel recentStopAppModel = (RecentStopAppModel) obj;
                ((Function2) obj2).invoke(recentStopAppModel.e, recentStopAppModel.f);
                return unit;
            case 3:
                ((Function1) obj2).invoke((UniversalSearchRecentSearchItem.Trip) obj);
                return unit;
            case 4:
                RecentTripAppModel recentTripAppModel = (RecentTripAppModel) obj;
                ((Function2) obj2).invoke(recentTripAppModel.e, recentTripAppModel.f);
                return unit;
            case 5:
                return Recomposer.performRecompose$lambda$0$0((MutableScatterSet) obj2, (ControlledComposition) obj);
            case 6:
                return Boolean.valueOf(ReflectionUtils.validateImplementation$lambda$1$lambda$0((Class) obj2, (Method) obj));
            case 7:
                return ((Regex) obj2).c((CharSequence) obj, 0);
            case 8:
                ((ReportProblemComponent) obj2).K0(new ReportProblemIntent.ContactSupportClicked((String) obj));
                return unit;
            case 9:
                ((ReportProblemComponent) obj2).K0(new ReportProblemIntent.ProblemItemClicked((ReportProblemFeatureProblem) obj));
                return unit;
            case 10:
                return RetainKt.retainImpl$lambda$1$0((RetainedValueHolder) obj2, (RetainedValuesStore) obj);
            case 11:
                ((Function1) obj2).invoke(((PostRideFeedbackSubtagConfigData) obj).f9104a);
                return unit;
            case 12:
                ((Function1) obj2).invoke((UserFeedbackReasonData) obj);
                return unit;
            case 13:
                ((Function1) obj2).invoke((UserFeedbackRatingData) obj);
                return unit;
            case 14:
                ((Function2) obj2).invoke(((UserFeedbackRatingData) obj).b, null);
                return unit;
            case 15:
                ((Function1) obj2).invoke(Long.valueOf(((RidePreferenceBannerState.ConfirmTimeUpdate) ((RidePreferenceBannerState) obj)).f3300a));
                return unit;
            case 16:
                ((RouteDetailsComponent) obj2).O.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(((LiveSeatAvailabilityBottomSheetCtaType.ShowMoreInfo) ((RouteDetailsIntent.LiveSeatAvailabilityBottomSheetCtaClicked) ((RouteDetailsIntent) obj)).f4838a).f4815a, "Live Passenger Indicator", false, false), null, null, 6));
                return unit;
            case 17:
                ((RouteDetailsComponent) obj2).f1(new RouteDetailsIntent.ReportProblemTagClicked((ReportProblemTagDetails) obj));
                return unit;
            case 18:
                IconButtonUIState iconButtonUIState = ((RouteDetailsViewTypeUIState.MainScreen) obj2).d;
                float fM7292unboximpl = ((Dp) ((State) obj).getValue()).m7292unboximpl();
                ImageUIState img = iconButtonUIState.f9923a;
                UiEventHandler eventHandler = iconButtonUIState.b;
                UIShape shape = iconButtonUIState.c;
                ChaloColorToken backgroundColor = iconButtonUIState.d;
                Intrinsics.i(img, "img");
                Intrinsics.i(eventHandler, "eventHandler");
                Intrinsics.i(shape, "shape");
                Intrinsics.i(backgroundColor, "backgroundColor");
                return new IconButtonUIState(img, eventHandler, shape, backgroundColor, fM7292unboximpl);
            case 19:
                return Integer.valueOf(((MutableIntState) obj2).getIntValue() > 0 ? ((Number) ((State) obj).getValue()).intValue() + 8 : 0);
            case 20:
                MutableState mutableState = (MutableState) obj;
                ((RouteDetailsOptionsUIState) obj2).b.a();
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return unit;
            case 21:
                float f = RouteDetailsStopsListUIStateFactory.c;
                ((Function1) obj2).invoke((RouteDetailsOptionsMenu) obj);
                return unit;
            case 22:
                RouteDetailsStopUiModel routeDetailsStopUiModel = (RouteDetailsStopUiModel) obj;
                float f2 = RouteDetailsStopsListUIStateFactory.c;
                ((Function1) obj2).invoke(new RouteDetailsIntent.ReportIssueHookClicked(routeDetailsStopUiModel.f4410a, routeDetailsStopUiModel.c, routeDetailsStopUiModel.i, routeDetailsStopUiModel.j));
                return unit;
            case 23:
                ((Function1) obj2).invoke(new RouteDetailsIntent.OnRouteBookingCtaClicked((RouteBookingType) obj));
                return unit;
            case 24:
                ((Function1) obj2).invoke(new RouteDetailsIntent.StopCtaClicked((StopCtaActionType) obj));
                return unit;
            case 25:
                return Boolean.valueOf(SafeWindowAreaComponentProvider.isWindowAreaProviderValid$lambda$0(obj2, (SafeWindowAreaComponentProvider) obj));
            case 26:
                ((Function1) obj2).invoke(new SavedPlacesAndRidesIntent.AddAndEditPlaceIntent((UserCommutePreferenceTag) obj));
                return unit;
            case 27:
                return SerialDescriptorsKt.e((String) obj2, PolymorphicKind.SEALED.f18100a, new SerialDescriptor[0], new q51((SealedClassSerializer) obj, i2));
            case 28:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$3$0((SelectionManager) obj2, (MutableState) obj);
            default:
                Context context = (Context) obj2;
                Scope scope = (Scope) obj;
                SharedPreferences sharedPreferences = context.getSharedPreferences("wallet_encrypted_settings_meta", 0);
                if (sharedPreferences.getBoolean("use_plain_settings", false)) {
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("wallet_encrypted_prefs", 0);
                    Intrinsics.h(sharedPreferences2, "getSharedPreferences(...)");
                    return new SharedPreferencesSettings(sharedPreferences2);
                }
                try {
                    SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(context, "wallet_encrypted_prefs", new MasterKey.Builder(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                    Intrinsics.h(sharedPreferencesCreate, "create(...)");
                    objA = new SharedPreferencesSettings(sharedPreferencesCreate);
                    break;
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    try {
                        CrashlyticsLogger crashlyticsLogger = (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
                        crashlyticsLogger.g(new CrashlyticsLog("WalletEncryptedSettings", "Encrypted wallet prefs init failed; switching to plain"));
                        crashlyticsLogger.i(thA);
                    } catch (Throwable th2) {
                        ResultKt.a(th2);
                    }
                    sharedPreferences.edit().putBoolean("use_plain_settings", true).apply();
                    SharedPreferences sharedPreferences3 = context.getSharedPreferences("wallet_encrypted_prefs", 0);
                    Intrinsics.h(sharedPreferences3, "getSharedPreferences(...)");
                    objA = new SharedPreferencesSettings(sharedPreferences3);
                    break;
                }
                return (Settings) objA;
        }
    }
}
