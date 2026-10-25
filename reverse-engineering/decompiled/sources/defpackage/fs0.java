package defpackage;

import android.content.Context;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.datastore.LocalDataStore;
import app.chalo.features.freshchat.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase;
import app.chalo.ridefeedback.domain.GetPostRideFeedbackDataUseCase;
import app.chalo.ridefeedback.domain.RideFeedbackSubmissionGate;
import app.chalo.ridefeedback.domain.SubmitRideFeedbackUseCase;
import app.chalo.ridehailing.data.RideHailingRepository;
import app.chalo.ridehailing.domain.SubmitRideHailingBookingFeedbackUseCase;
import app.chalo.ridehailing.feedback.AutoRideFeedbackDelegate;
import app.chalo.ridehailing.feedback.BaseRideFeedbackDelegate;
import app.chalo.ridehailing.feedback.DefaultRideFeedbackDelegate;
import app.chalo.ridehailing.feedback.DefaultRideFeedbackUIStateFactory;
import app.chalo.ridehailing.feedback.RideFeedbackUIStateFactory;
import app.chalo.ridehailing.feedback.RideFeedbackUserPropertiesFactory;
import app.chalo.ridehailing.feedback.RideUserFeedbackComponent;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.maps.android.compose.PolylineNode;
import com.mmk.kmpnotifier.di.PlatformModule_androidKt;
import com.mmk.kmpnotifier.notification.AndroidNotifier;
import com.mmk.kmpnotifier.notification.NotificationChannelFactory;
import com.mmk.kmpnotifier.notification.configuration.NotificationPlatformConfiguration;
import com.mmk.kmpnotifier.permission.PermissionUtil;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fs0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15671a;

    public /* synthetic */ fs0(int i) {
        this.f15671a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [org.koin.core.parameter.ParametersHolder, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r6;
        BaseRideFeedbackDelegate baseRideFeedbackDelegate;
        int i = this.f15671a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Scope single = (Scope) obj;
                Context context = PlatformModule_androidKt.f15310a;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                Context context2 = PlatformModule_androidKt.f15310a;
                if (context2 != null) {
                    return context2;
                }
                Intrinsics.q("applicationContext");
                throw null;
            case 1:
                Scope scope = (Scope) obj;
                Context context3 = PlatformModule_androidKt.f15310a;
                NotificationPlatformConfiguration.Android android2 = (NotificationPlatformConfiguration.Android) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", NotificationPlatformConfiguration.class), null, null);
                return new AndroidNotifier((Context) scope.d(Reflection.a(Context.class), null, null), android2, new NotificationChannelFactory((Context) scope.d(Reflection.a(Context.class), null, null), android2.b), (PermissionUtil) scope.d(Reflection.a(PermissionUtil.class), null, null));
            case 2:
                PolylineNode update = (PolylineNode) obj;
                List<LatLng> it = (List) obj2;
                Intrinsics.i(update, "$this$update");
                Intrinsics.i(it, "it");
                update.f14654a.setPoints(it);
                return unit;
            case 3:
                PolylineNode update2 = (PolylineNode) obj;
                List<StyleSpan> it2 = (List) obj2;
                Intrinsics.i(update2, "$this$update");
                Intrinsics.i(it2, "it");
                update2.f14654a.setSpans(it2);
                return unit;
            case 4:
                PolylineNode update3 = (PolylineNode) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.i(update3, "$this$update");
                update3.f14654a.setClickable(zBooleanValue);
                return unit;
            case 5:
                PolylineNode update4 = (PolylineNode) obj;
                Cap it3 = (Cap) obj2;
                Intrinsics.i(update4, "$this$update");
                Intrinsics.i(it3, "it");
                update4.f14654a.setEndCap(it3);
                return unit;
            case 6:
                PolylineNode update5 = (PolylineNode) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Intrinsics.i(update5, "$this$update");
                update5.f14654a.setGeodesic(zBooleanValue2);
                return unit;
            case 7:
                PolylineNode update6 = (PolylineNode) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.i(update6, "$this$update");
                update6.f14654a.setJointType(iIntValue);
                return unit;
            case 8:
                PolylineNode update7 = (PolylineNode) obj;
                Intrinsics.i(update7, "$this$update");
                update7.f14654a.setPattern((List) obj2);
                return unit;
            case 9:
                PolylineNode update8 = (PolylineNode) obj;
                Cap it4 = (Cap) obj2;
                Intrinsics.i(update8, "$this$update");
                Intrinsics.i(it4, "it");
                update8.f14654a.setStartCap(it4);
                return unit;
            case 10:
                PolylineNode update9 = (PolylineNode) obj;
                Intrinsics.i(update9, "$this$update");
                update9.f14654a.setTag(obj2);
                return unit;
            case 11:
                PolylineNode update10 = (PolylineNode) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                Intrinsics.i(update10, "$this$update");
                update10.f14654a.setVisible(zBooleanValue3);
                return unit;
            case 12:
                PolylineNode update11 = (PolylineNode) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                Intrinsics.i(update11, "$this$update");
                update11.f14654a.setWidth(fFloatValue);
                return unit;
            case 13:
                PolylineNode update12 = (PolylineNode) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                Intrinsics.i(update12, "$this$update");
                update12.f14654a.setZIndex(fFloatValue2);
                return unit;
            case 14:
                PolylineNode update13 = (PolylineNode) obj;
                Function1 it5 = (Function1) obj2;
                Intrinsics.i(update13, "$this$update");
                Intrinsics.i(it5, "it");
                update13.b = it5;
                return unit;
            case 15:
                return PullToRefreshStateImpl.Saver$lambda$0((SaverScope) obj, (PullToRefreshStateImpl) obj2);
            case 16:
                return RangeSliderState.Companion.Saver$lambda$0((SaverScope) obj, (RangeSliderState) obj2);
            case 17:
                Scope factory = (Scope) obj;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new ClearRideFeedbackDataDuringLogoutUseCase((RideFeedbackRepository) factory.d(Reflection.a(RideFeedbackRepository.class), null, null), (RideHailingRepository) factory.d(Reflection.a(RideHailingRepository.class), null, null), (LocalDataStore) factory.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("ride_hailing_store.preferences_pb")));
            case 18:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new AutoRideFeedbackDelegate((RideUserFeedbackScreenArgs.Auto) parametersHolder.a(0, i71.k(scope2, "$this$factory", parametersHolder, "<destruct>", RideUserFeedbackScreenArgs.Auto.class)), (RideFeedbackUIStateFactory) scope2.d(Reflection.a(RideFeedbackUIStateFactory.class), null, null), (RideFeedbackUserPropertiesFactory) scope2.d(Reflection.a(RideFeedbackUserPropertiesFactory.class), null, null), (InitiateFreshChatCustomerSupportUseCase) scope2.d(Reflection.a(InitiateFreshChatCustomerSupportUseCase.class), null, null), (ChaloNavigationManager) scope2.d(Reflection.a(ChaloNavigationManager.class), null, null), (SubmitRideHailingBookingFeedbackUseCase) scope2.d(Reflection.a(SubmitRideHailingBookingFeedbackUseCase.class), null, null), (LocalDataStore) scope2.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("ride_hailing_store.preferences_pb")), (GetPostRideFeedbackDataUseCase) scope2.d(Reflection.a(GetPostRideFeedbackDataUseCase.class), null, null), (RideHailingRepository) scope2.d(Reflection.a(RideHailingRepository.class), null, null), (StringProvider) scope2.d(Reflection.a(StringProvider.class), null, null), (KotlinToastManager) scope2.d(Reflection.a(KotlinToastManager.class), null, null), (AnalyticsContract) scope2.d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) scope2.d(Reflection.a(SystemHelper.class), null, null));
            case 19:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                return new DefaultRideFeedbackDelegate((RideUserFeedbackScreenArgs.Default) parametersHolder2.a(0, i71.k(scope3, "$this$factory", parametersHolder2, "<destruct>", RideUserFeedbackScreenArgs.Default.class)), (DefaultRideFeedbackUIStateFactory) scope3.d(Reflection.a(DefaultRideFeedbackUIStateFactory.class), null, null), (GetPostRideFeedbackDataUseCase) scope3.d(Reflection.a(GetPostRideFeedbackDataUseCase.class), null, null), (SubmitRideFeedbackUseCase) scope3.d(Reflection.a(SubmitRideFeedbackUseCase.class), null, null), (RideFeedbackRepository) scope3.d(Reflection.a(RideFeedbackRepository.class), null, null), (RideFeedbackSubmissionGate) scope3.d(Reflection.a(RideFeedbackSubmissionGate.class), null, null), (SystemHelper) scope3.d(Reflection.a(SystemHelper.class), null, null), (StringProvider) scope3.d(Reflection.a(StringProvider.class), null, null), (KotlinToastManager) scope3.d(Reflection.a(KotlinToastManager.class), null, null), (ChaloNavigationManager) scope3.d(Reflection.a(ChaloNavigationManager.class), null, null), (InitiateFreshChatCustomerSupportUseCase) scope3.d(Reflection.a(InitiateFreshChatCustomerSupportUseCase.class), null, null), (RideFeedbackUserPropertiesFactory) scope3.d(Reflection.a(RideFeedbackUserPropertiesFactory.class), null, null), (AnalyticsContract) scope3.d(Reflection.a(AnalyticsContract.class), null, null));
            case 20:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                ComponentContext componentContext = (ComponentContext) parametersHolder3.a(0, i71.k(scope4, "$this$factory", parametersHolder3, "<destruct>", ComponentContext.class));
                RideUserFeedbackScreenArgs rideUserFeedbackScreenArgs = (RideUserFeedbackScreenArgs) parametersHolder3.a(1, Reflection.a(RideUserFeedbackScreenArgs.class));
                if (rideUserFeedbackScreenArgs instanceof RideUserFeedbackScreenArgs.Auto) {
                    r6 = 0;
                    baseRideFeedbackDelegate = (BaseRideFeedbackDelegate) scope4.d(Reflection.a(AutoRideFeedbackDelegate.class), ParametersHolderKt.a(rideUserFeedbackScreenArgs), null);
                } else {
                    r6 = 0;
                    if (!(rideUserFeedbackScreenArgs instanceof RideUserFeedbackScreenArgs.Default)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    baseRideFeedbackDelegate = (BaseRideFeedbackDelegate) scope4.d(Reflection.a(DefaultRideFeedbackDelegate.class), ParametersHolderKt.a(rideUserFeedbackScreenArgs), null);
                }
                return new RideUserFeedbackComponent(componentContext, baseRideFeedbackDelegate, (AnalyticsContract) scope4.d(Reflection.a(AnalyticsContract.class), r6, r6));
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 22:
                return SaverKt.AutoSaver$lambda$0((SaverScope) obj, obj2);
            case 23:
                return SaversKt.AnnotatedStringSaver$lambda$0((SaverScope) obj, (AnnotatedString) obj2);
            case 24:
                return SaversKt.TextDecorationSaver$lambda$0((SaverScope) obj, (TextDecoration) obj2);
            case 25:
                return SaversKt.TextGeometricTransformSaver$lambda$0((SaverScope) obj, (TextGeometricTransform) obj2);
            case 26:
                return SaversKt.TextIndentSaver$lambda$0((SaverScope) obj, (TextIndent) obj2);
            case 27:
                return SaversKt.FontWeightSaver$lambda$0((SaverScope) obj, (FontWeight) obj2);
            case 28:
                return SaversKt.LinkSaver$lambda$0((SaverScope) obj, (LinkAnnotation.Url) obj2);
            default:
                return SaversKt.BaselineShiftSaver$lambda$0((SaverScope) obj, (BaselineShift) obj2);
        }
    }
}
