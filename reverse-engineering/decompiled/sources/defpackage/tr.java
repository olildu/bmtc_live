package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.ExposedDropdownMenuPositionProvider;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntRect;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.ComposableSingletons$VerticalDashedLineKt;
import app.chalo.compose.ComposableSingletons$YesBankFooterKt;
import app.chalo.compose.VerticalDashedLineKt;
import app.chalo.compose.YesBankFooterKt;
import app.chalo.compose.components.ComposableSingletons$UserSelfReviewComposableKt;
import app.chalo.compose.components.bottomsheet.ComposableSingletons$UserRatingBottomSheetKt;
import app.chalo.compose.components.bottomsheet.UserRatingBottomSheetKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.electricitybill.domain.EBillAmountUseCase;
import app.chalo.electricitybill.ui.ebillamount.EbillAmountComponent;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerValue;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ComposableSingletons$TripPlannerTabUIKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUIKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabsUiState;
import app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.EBillAmountScreenArgs;
import app.chalo.uistate.VerticalDashedLineUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.FeedbackData;
import app.chalo.usecase.FeedbackTags;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRetryDelayContext;
import io.ktor.client.plugins.HttpRetryModifyRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.cio.ConnectionOptions;
import io.ktor.http.cio.HttpParserKt;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlinx.coroutines.CopyableThreadContextElement;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import org.koin.androidx.fragment.android.KoinFragmentFactory;
import org.koin.androidx.fragment.koin.KoinApplicationExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19682a;

    public /* synthetic */ tr(int i) {
        this.f19682a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        int i = this.f19682a;
        Unit unit = Unit.f17538a;
        boolean z = false;
        boolean z2 = true;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableLambda composableLambda = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1579232426, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$1579232426.<anonymous> (TripPlannerResultsScreen.kt:153)");
                    }
                    ChaloToolBarKt.c(StringResourcesHelperKt.c(StringEnum.TRIP_DETAILS, new Object[0], composer, 6), 1, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), null, composer, 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1432790060, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$1432790060.<anonymous> (TripPlannerResultsScreen.kt:1448)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TripPlannerResultsScreenKt.j("45 mins", 2, "Rs 5", SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, composer2, 3510, 16);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda3 = ComposableSingletons$TripPlannerResultsScreenKt.f4795a;
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1823117435, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt.lambda$-1823117435.<anonymous> (TripPlannerResultsScreen.kt:560)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda4 = ComposableSingletons$TripPlannerTabUIKt.f4570a;
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1940123074, iIntValue4, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.ComposableSingletons$TripPlannerTabUIKt.lambda$1940123074.<anonymous> (TripPlannerTabUI.kt:64)");
                    }
                    UITextStyle uITextStyle = UITextStyle.BodyMedium;
                    UITextAlign uITextAlign = UITextAlign.Center;
                    TripPlannerTabUIKt.a(new TabsUiState(CollectionsKt.S(new TabItemUiState(new TextUIState.ChaloTextUIState("Bus", uITextStyle, (ChaloColorToken) null, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), z2), new TabItemUiState(new TextUIState.ChaloTextUIState("Bus1", uITextStyle, (ChaloColorToken) null, 0, uITextAlign, (UIFontWeight) (null == true ? 1 : 0), (Integer) (null == true ? 1 : 0), (UiEventHandler) (null == true ? 1 : 0), (UITextDecoration) (null == true ? 1 : 0), (UITextOverflow) (null == true ? 1 : 0), (UIFontStyle) (null == true ? 1 : 0), (String) null, 8156), z))), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda5 = ComposableSingletons$UserRatingBottomSheetKt.f1853a;
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(7526636, iIntValue5, -1, "app.chalo.compose.components.bottomsheet.ComposableSingletons$UserRatingBottomSheetKt.lambda$7526636.<anonymous> (UserRatingBottomSheet.kt:158)");
                    }
                    IconType iconType = IconType.RATE;
                    List listS = CollectionsKt.S(new FeedbackData(new Pair(0, 1), "What went wrong?", CollectionsKt.S(new FeedbackTags(1, "Tap in/Tap out failure"), new FeedbackTags(2, "Overcrowded"), new FeedbackTags(3, "Long validation time"), new FeedbackTags(4, "Bus delayed")), true), new FeedbackData(new Pair(2, 3), "What can be improved?", CollectionsKt.S(new FeedbackTags(1, "Faster validation"), new FeedbackTags(2, "Clear instructions"), new FeedbackTags(3, "Vehicle cleanliness"), new FeedbackTags(4, "Stop arrival time")), false), new FeedbackData(new Pair(4, 5), "What did you like the most?", CollectionsKt.S(new FeedbackTags(1, "Quick validation"), new FeedbackTags(2, "Easy seat availability"), new FeedbackTags(3, "Timely arrival"), new FeedbackTags(4, "Smooth ride")), true));
                    Object objRememberedValue = composer5.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue == companion3.getEmpty()) {
                        objRememberedValue = new cp(19);
                        composer5.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    Object objRememberedValue2 = composer5.rememberedValue();
                    if (objRememberedValue2 == companion3.getEmpty()) {
                        objRememberedValue2 = new rr(23);
                        composer5.updateRememberedValue(objRememberedValue2);
                    }
                    UserRatingBottomSheetKt.a(0, iconType, "How would you rate your trip?", "Your feedback is important to us", listS, "SUBMIT", function1, (Function3) objRememberedValue2, null, composer5, 14355888, 257);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda6 = ComposableSingletons$UserSelfReviewComposableKt.f1840a;
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1162214397, iIntValue6, -1, "app.chalo.compose.components.ComposableSingletons$UserSelfReviewComposableKt.lambda$-1162214397.<anonymous> (UserSelfReviewComposable.kt:60)");
                    }
                    TextKt.m2623TextNvy7gAk("Tell us more...", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$VerticalDashedLineKt.f1809a;
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1566224984, iIntValue7, -1, "app.chalo.compose.ComposableSingletons$VerticalDashedLineKt.lambda$1566224984.<anonymous> (VerticalDashedLine.kt:42)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), ChaloTheme.a(composer7, 6).t, null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer7, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer7, modifierM264backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor2);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    VerticalDashedLineKt.a(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), new VerticalDashedLineUIState(true ? 1 : 0), composer7, 6);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$YesBankFooterKt.f1810a;
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-86398047, iIntValue8, -1, "app.chalo.compose.ComposableSingletons$YesBankFooterKt.lambda$-86398047.<anonymous> (YesBankFooter.kt:46)");
                    }
                    YesBankFooterKt.a(composer8, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 8:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.b;
                return obj;
            case 9:
                Pair t = (Pair) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i4 = ConnectionOptions.e;
                Intrinsics.i(t, "t");
                return Character.valueOf(((String) t.d()).charAt(iIntValue9));
            case 10:
                CoroutineContext acc = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.i(acc, "acc");
                Intrinsics.i(element, "element");
                CoroutineContext coroutineContextMinusKey = acc.minusKey(element.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f17583a;
                if (coroutineContextMinusKey == emptyCoroutineContext) {
                    return element;
                }
                ContinuationInterceptor.Key key = ContinuationInterceptor.Key.f17582a;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(key);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(element, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(key);
                    if (coroutineContextMinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(continuationInterceptor, element);
                    }
                    combinedContext = new CombinedContext(continuationInterceptor, new CombinedContext(element, coroutineContextMinusKey2));
                }
                return combinedContext;
            case 11:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((CoroutineContext.Element) obj2) instanceof CopyableThreadContextElement));
            case 12:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                return element2 instanceof CopyableThreadContextElement ? coroutineContext.plus(((CopyableThreadContextElement) element2).x()) : coroutineContext.plus(element2);
            case 13:
                SaverScope Saver = (SaverScope) obj;
                DrawerState it = (DrawerState) obj2;
                Intrinsics.i(Saver, "$this$Saver");
                Intrinsics.i(it, "it");
                return (DrawerValue) it.f4451a.c.getValue();
            case 14:
                return androidx.compose.material3.DrawerState.Companion.Saver$lambda$0((SaverScope) obj, (androidx.compose.material3.DrawerState) obj2);
            case 15:
                return DropdownMenuPositionProvider._init_$lambda$1((IntRect) obj, (IntRect) obj2);
            case 16:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new EbillAmountComponent((EBillAmountScreenArgs) parametersHolder.a(1, Reflection.a(EBillAmountScreenArgs.class)), (ComponentContext) parametersHolder.a(0, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (EBillAmountUseCase) scope.d(Reflection.a(EBillAmountUseCase.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null));
            case 17:
                return ExposedDropdownMenuPositionProvider._init_$lambda$1((IntRect) obj, (IntRect) obj2);
            case 18:
                return Integer.valueOf(((ProductBookingStopDetails) obj).b.compareTo(((ProductBookingStopDetails) obj2).b));
            case 19:
                return Integer.valueOf(((ProductBookingStopDetails) obj).b.compareTo(((ProductBookingStopDetails) obj2).b));
            case 20:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case 21:
                char cCharValue = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                Set set = HttpParserKt.f16823a;
                return Boolean.valueOf(cCharValue == ' ');
            case 22:
                char cCharValue2 = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                Set set2 = HttpParserKt.f16823a;
                return Boolean.valueOf(cCharValue2 == ' ');
            case 23:
                Intrinsics.i((HttpRetryModifyRequestContext) obj, "<this>");
                Intrinsics.i((HttpRequestBuilder) obj2, "it");
                return unit;
            case 24:
                HttpRetryDelayContext delayMillis = (HttpRetryDelayContext) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                Intrinsics.i(delayMillis, "$this$delayMillis");
                long jMin = Math.min((long) (Math.pow(2.0d, iIntValue10 - 1) * 1000), 60000L);
                Random.f17624a.getClass();
                return Long.valueOf(Random.b.k() + jMin);
            case 25:
                Scope single = (Scope) obj;
                int i5 = KoinApplicationExtKt.f18808a;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i((ParametersHolder) obj2, "it");
                return new KoinFragmentFactory();
            case 26:
                return LazyGridIntervalContent.DefaultSpan$lambda$0((LazyGridItemSpanScope) obj, ((Integer) obj2).intValue());
            case 27:
                return LazyGridState.Saver$lambda$0((SaverScope) obj, (LazyGridState) obj2);
            case 28:
                return LazyGridState.Companion.saver$lambda$2((SaverScope) obj, (LazyGridState) obj2);
            default:
                return LazyGridState.Companion.saver$lambda$0((SaverScope) obj, (LazyGridState) obj2);
        }
    }

    public /* synthetic */ tr(HttpRequestRetryConfig httpRequestRetryConfig) {
        this.f19682a = 24;
    }
}
