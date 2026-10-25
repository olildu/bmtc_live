package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.ads.BindNativeAdResult;
import app.chalo.ads.NativeAdViewKt;
import app.chalo.android.MainActivity;
import app.chalo.compose.LocalBackHandlerKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.resources.IconAssetHelperKt;
import app.chalo.compose.resources.LottieAssetHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.ui.base.InAppUpdateDialogKt;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.RidePreferenceBannerState;
import app.chalo.home.ui.chalobus.RidePreferenceBannerUIKt;
import app.chalo.home.ui.history.uistate.ProductsTabUiState;
import app.chalo.home.ui.history.uistate.TabSpec;
import app.chalo.home.ui.history.uistate.TabUiState;
import app.chalo.livetracking.frameworklivetracking.ChaloSocketClient;
import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.login.ui.options.LoginSupportedCountryDialogUIState;
import app.chalo.ncmc.ui.common.CardRechargeTncDialogueKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.providers.iconassetprovider.IconAssetProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieAssetProvider;
import app.chalo.providers.stringprovider.StringArrayEnum;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import com.arkivanov.decompose.Child;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.CameraPositionStateKt;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapClickListenersKt;
import com.google.maps.android.compose.MapPropertiesNode;
import com.google.maps.android.compose.MapType;
import com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$1;
import com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$2;
import com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$26;
import com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$3;
import com.google.maps.android.compose.MapUpdaterState;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15787a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h3(int i, Object obj, Object obj2) {
        this.f15787a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2) {
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = (HomeScreenAnalyticsHelper) this.b;
        MutableState mutableState = (MutableState) this.c;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1708932877, iIntValue, -1, "app.chalo.home.ui.base.HomeScreenMain.<anonymous>.<anonymous> (HomeScreenMainDecompose.kt:145)");
            }
            boolean zChangedInstance = composer.changedInstance(homeScreenAnalyticsHelper);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new xx(homeScreenAnalyticsHelper, 19);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(homeScreenAnalyticsHelper);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new cy(14, homeScreenAnalyticsHelper, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            InAppUpdateDialogKt.a(function0, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2) {
        return LazyGridDslKt.rememberRowHeightSums$lambda$0$0((GridCells) this.b, (Arrangement.Vertical) this.c, (Density) obj, (Constraints) obj2);
    }

    private final Object d(Object obj, Object obj2) {
        return LazyLayoutKt.LazyLayout$lambda$1$3$0((LazyLayoutItemContentFactory) this.b, (LazyLayoutMeasurePolicy) this.c, (SubcomposeMeasureScope) obj, (Constraints) obj2);
    }

    private final Object e(Object obj, Object obj2) {
        Modifier modifier = (Modifier) this.b;
        LoginSupportedCountryDialogUIState loginSupportedCountryDialogUIState = (LoginSupportedCountryDialogUIState) this.c;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33510950, iIntValue, -1, "app.chalo.login.ui.options.LoginSupportedCountryDialog.<anonymous> (LoginOptionsScreen.kt:171)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, loginSupportedCountryDialogUIState.f5322a, null, null, composer, 0, 13);
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, loginSupportedCountryDialogUIState.d.f5321a), composer, 0);
            boolean zChanged = composer.changed(loginSupportedCountryDialogUIState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dd0(loginSupportedCountryDialogUIState, 14);
                composer.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, FrameMetricsAggregator.EVERY_DURATION);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    private final Object f(Object obj, Object obj2) {
        MainActivity mainActivity = (MainActivity) this.b;
        RootComponent rootComponent = (RootComponent) this.c;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        AtomicInteger atomicInteger = MainActivity.o1;
        int i = 1;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-654008603, iIntValue, -1, "app.chalo.android.MainActivity.onCreate.<anonymous> (MainActivity.kt:321)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{StringResourcesHelperKt.f1912a.provides((StringProvider) mainActivity.h1.getValue()), IconAssetHelperKt.f1906a.provides((IconAssetProvider) mainActivity.i1.getValue()), LottieAssetHelperKt.f1907a.provides((LottieAssetProvider) mainActivity.j1.getValue())}, ComposableLambdaKt.rememberComposableLambda(-927268315, true, new pw(rootComponent, i), composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2) {
        ProductsTabUiState productsTabUiState = (ProductsTabUiState) this.b;
        ColumnScope columnScope = (ColumnScope) this.c;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = 0;
        boolean z = true;
        int i2 = 2;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(365038091, iIntValue, -1, "app.chalo.home.ui.history.compose.ActiveExpiredTicketPassesFilterTab.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:659)");
            }
            int i3 = 0;
            for (Object obj3 : productsTabUiState.b) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                TabUiState tabUiState = (TabUiState) obj3;
                TabSpec tabSpec = tabUiState.f3486a;
                TabKt.m2513TabbogVsAg(tabUiState.c, tabUiState.d, pk0.d("PL_Filter_Tab_", i3, ClipKt.clip(PaddingKt.m786paddingVpY3zN4$default(dq.a(columnScope, ZIndexModifierKt.zIndex(Modifier.INSTANCE, tabSpec.c), 1.0f, false, 2, null), ChaloTheme.b(composer, i).d, 0.0f, i2, null), ChaloThemeKt.d(tabSpec.d))), false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1686611529, z, new u50(9, tabSpec, tabUiState), composer, 54), composer, 12582912, 120);
                i = i;
                i3 = i4;
                i2 = i2;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2) {
        NativeAdView nativeAdView = (NativeAdView) this.b;
        Function2 function2 = (Function2) this.c;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040030285, iIntValue, -1, "app.chalo.ads.NativeAdView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdView.kt:83)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) NativeAdViewKt.f801a.provides(nativeAdView), ComposableLambdaKt.rememberComposableLambda(-1090900595, true, new fc(4, function2), composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2) {
        Function3 function3 = (Function3) this.b;
        String str = (String) this.c;
        BindNativeAdResult.Success bindResult = (BindNativeAdResult.Success) obj;
        Long l = (Long) obj2;
        l.longValue();
        Intrinsics.i(bindResult, "bindResult");
        if (function3 != null) {
            function3.invoke(str, bindResult, l);
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2) {
        NetworkInspectorComponent networkInspectorComponent = (NetworkInspectorComponent) this.b;
        NetworkCallInfo networkCallInfo = (NetworkCallInfo) this.c;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442158733, iIntValue, -1, "app.chalo.core.compose.NetworkInspectorScreen.<anonymous> (NetworkInspectorScreen.kt:65)");
            }
            AppBarKt.m1640TopAppBarGHTll3U(ComposableSingletons$NetworkInspectorScreenKt.f2033a, null, ComposableLambdaKt.rememberComposableLambda(623757677, true, new xm0(networkInspectorComponent, 0), composer, 54), ComposableLambdaKt.rememberComposableLambda(-474514332, true, new u50(14, networkCallInfo, networkInspectorComponent), composer, 54), 0.0f, null, null, null, composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object k(Object obj, Object obj2) {
        OfflineCardRechargeViewState offlineCardRechargeViewState = (OfflineCardRechargeViewState) this.b;
        Function1 function1 = (Function1) this.c;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(504990932, iIntValue, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreen.<anonymous> (OfflineCardRechargeScreen.kt:91)");
            }
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer, 0).t, null, 2, null), 0.0f, ChaloTheme.b(composer, 0).h, 0.0f, 0.0f, 13, null);
            composer.startReplaceGroup(-35006320);
            List listD0 = offlineCardRechargeViewState.r;
            if (listD0.isEmpty()) {
                listD0 = CollectionsKt.D0(StringResourcesHelperKt.b(StringArrayEnum.GEN_INSTRUCTIONS_NCMC_RECHARGE_ARR, composer));
            }
            List list = listD0;
            composer.endReplaceGroup();
            String strC = StringResourcesHelperKt.c(StringEnum.TERMS_AND_CONDITIONS_CAPS_C, new Object[0], composer, 6);
            String strC2 = StringResourcesHelperKt.c(StringEnum.ACCEPT_CAPS, new Object[0], composer, 6);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qm0(function1, 20);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            String strC3 = StringResourcesHelperKt.c(StringEnum.CANCEL_CAPS, new Object[0], composer, 6);
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qm0(function1, 21);
                composer.updateRememberedValue(objRememberedValue2);
            }
            CardRechargeTncDialogueKt.a(modifierM788paddingqDBjuR0$default, list, strC, strC2, function0, strC3, (Function0) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:196:0x07e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object reconnection;
        int i = this.f15787a;
        Object connectionError = null;
        Unit unit = Unit.f17538a;
        int i2 = 3;
        int i3 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return AnchoredDraggableKt.animateTo$lambda$0$1((AnchoredDragScope) obj4, (Ref.FloatRef) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return BasicTooltipKt.TooltipPopup$lambda$1((String) obj4, (Function2) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                Function3 function3 = (Function3) obj4;
                BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                float f = BottomSheetScaffoldKt.f4445a;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1985540705, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SlidingUpPanelBottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:367)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function3.invoke(bottomSheetScaffoldState.b, composer, 0);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 3:
                return BoxWithConstraintsKt.BoxWithConstraints$lambda$0$0((MeasurePolicy) obj4, (Function3) obj3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
            case 4:
                Function0 function0 = (Function0) obj4;
                String str = (String) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1644259738, iIntValue2, -1, "app.chalo.ncmc.ui.landing.compose.PagerCardView.<anonymous> (CardInfoLandingScreen.kt:467)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), RippleEffectKt.b(composer2), null, false, null, null, function0, 28, null);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM295clickableO2vRcR0$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion5, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierAlign = boxScopeInstance2.align(companion3, companion4.getCenter());
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getCenterHorizontally(), composer2, 48);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierAlign);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Painter painterA = PainterResourceHelperKt.a(IconType.IC_CHALO_CARD, composer2, 6);
                    int i7 = Painter.$stable;
                    ImageKt.Image(painterA, (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i7 | 48, 124);
                    ChaloSpacersKt.m(composer2, 0);
                    TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131070);
                    composer2.endNode();
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance2.align(companion3, companion4.getBottomEnd()), 0.0f, 0.0f, ChaloTheme.b(composer2, 0).h, ChaloTheme.b(composer2, 0).h, 3, null), ChaloTheme.b(composer2, 0).k), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composer2, 0).t, null, 2, null);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new hb(function0, 6);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue, 15, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM299clickableoSLSa3U$default);
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion5, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i8), composerM3915constructorimpl4));
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composer2, 6), (String) null, GraphicsLayerModifierKt.m4770graphicsLayer_6ThJ44$default(companion3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 90.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null), ChaloTheme.a(composer2, 0).B, composer2, i7 | 432, 0);
                    if (r1.k(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 5:
                ChaloBusViewState chaloBusViewState = (ChaloBusViewState) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2058382340, iIntValue3, -1, "app.chalo.home.ui.chalobus.ChaloBusScreenUI.<anonymous>.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:212)");
                    }
                    RidePreferenceBannerState ridePreferenceBannerState = chaloBusViewState.w;
                    boolean zChanged2 = composer3.changed(function1);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new g0(function1, 11);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function2 = (Function1) objRememberedValue2;
                    boolean zChanged3 = composer3.changed(function1);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new g0(function1, 12);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    RidePreferenceBannerUIKt.b(ridePreferenceBannerState, function2, (Function1) objRememberedValue3, ClipKt.clip(PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, ChaloTheme.b(composer3, 0).g, 7, null), ChaloThemeKt.d(UIShape.e)), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 6:
                Function1 function4 = (Function1) obj4;
                DatePickerState datePickerState = (DatePickerState) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1288952153, iIntValue4, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker.<anonymous> (ChaloDatePicker.kt:71)");
                    }
                    String strC = StringResourcesHelperKt.c(StringEnum.OK_CAPS, new Object[0], composer4, 6);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    boolean zChanged4 = composer4.changed(function4) | composer4.changed(datePickerState);
                    Object objRememberedValue4 = composer4.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new ti(function4, datePickerState, i2);
                        composer4.updateRememberedValue(objRememberedValue4);
                    }
                    TextKt.m2623TextNvy7gAk(strC, PaddingKt.m788paddingqDBjuR0$default(PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(companion6, false, null, null, null, (Function0) objRememberedValue4, 15, null), ChaloTheme.b(composer4, 6).f), 0.0f, 0.0f, ChaloTheme.b(composer4, 6).g, 0.0f, 11, null), ChaloTheme.a(composer4, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer4, 6).getBodyMedium(), composer4, 0, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 7:
                Function3 function5 = (Function3) obj4;
                Function3 function6 = (Function3) obj3;
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                float f2 = ChaloSnackbarKt.f1826a;
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(47776213, iIntValue5, -1, "app.chalo.compose.components.ChaloSnackbarContainer.<anonymous>.<anonymous> (ChaloSnackbar.kt:152)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ChaloTheme.b(composer5, 6).h, ChaloTheme.b(composer5, 6).g);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer5, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i9 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierM785paddingVpY3zN4);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor5);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion8, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl5, Integer.valueOf(i9), composerM3915constructorimpl5));
                    Object obj5 = RowScopeInstance.INSTANCE;
                    function5.invoke(obj5, composer5, 6);
                    if (function6 != null) {
                        composer5.startReplaceGroup(-1898376311);
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion7, ChaloTheme.b(composer5, 6).g), composer5, 0);
                        function6.invoke(obj5, composer5, 6);
                    } else {
                        composer5.startReplaceGroup(-1903983343);
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 8:
                ChaloSocketClient chaloSocketClient = (ChaloSocketClient) obj4;
                ProducerScope producerScope = (ProducerScope) obj3;
                SocketEvent socketEvent = (SocketEvent) obj;
                Object[] array = ((List) obj2).toArray(new Object[0]);
                chaloSocketClient.getClass();
                StringBuilder sb = new StringBuilder();
                for (Object obj6 : array) {
                    if (obj6 instanceof Exception) {
                        sb.append(obj6);
                    }
                }
                String string = sb.toString();
                Intrinsics.h(string, "toString(...)");
                switch (ChaloSocketClient.WhenMappings.f4177a[socketEvent.ordinal()]) {
                    case 1:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        connectionError = ChaloSocketResult.ConnectionStatus.Connected.f4249a;
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 2:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        connectionError = new ChaloSocketResult.ConnectionStatus.Error.ConnectionError(string);
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 3:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        connectionError = ChaloSocketResult.ConnectionStatus.ConnectionTimeout.f4252a;
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 4:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        connectionError = ChaloSocketResult.ConnectionStatus.Disconnected.f4254a;
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 5:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        connectionError = new ChaloSocketResult.ConnectionStatus.Error.GenericError(string);
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 6:
                    case 7:
                    case 12:
                    case 13:
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 8:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        Object obj7 = array[0];
                        reconnection = new ChaloSocketResult.ConnectionStatus.Reconnection(obj7 instanceof Integer ? (Integer) obj7 : null);
                        connectionError = reconnection;
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 9:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        Object obj8 = array[0];
                        reconnection = new ChaloSocketResult.ConnectionStatus.ReconnectionAttempt(obj8 instanceof Integer ? (Integer) obj8 : null);
                        connectionError = reconnection;
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 10:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        connectionError = new ChaloSocketResult.ConnectionStatus.Error.ReconnectionError(string);
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    case 11:
                        chaloSocketClient.a(socketEvent.getAnalyticsEventName(), string, array);
                        connectionError = ChaloSocketResult.ConnectionStatus.Error.ReconnectionFailed.b;
                        if (connectionError != null) {
                            producerScope.mo7576trySendJP2dKIU(connectionError);
                        }
                        return unit;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 9:
                Function0 function7 = (Function0) obj4;
                IconType iconType = (IconType) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-48818474, iIntValue6, -1, "app.chalo.compose.components.ChaloToolBar.<anonymous>.<anonymous>.<anonymous> (ChaloToolBar.kt:44)");
                    }
                    Function0 function8 = (Function0) composer6.consume(LocalBackHandlerKt.f1812a);
                    boolean zChanged5 = composer6.changed(function7) | composer6.changed(function8);
                    Object objRememberedValue5 = composer6.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new tm(function7, function8, 2);
                        composer6.updateRememberedValue(objRememberedValue5);
                    }
                    IconButtonKt.IconButton((Function0) objRememberedValue5, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2063767948, true, new ym(iconType, i3), composer6, 54), composer6, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 10:
                IconType iconType2 = (IconType) obj4;
                String str2 = (String) obj3;
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2130795478, iIntValue7, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloToolBar.kt:192)");
                    }
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(iconType2, composer7, 0), str2, PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer7, 6).d), Color.INSTANCE.m4641getUnspecified0d7_KjU(), composer7, Painter.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 11:
                Ref.IntRef intRef = (Ref.IntRef) obj3;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.i((Unit) obj, "<unused var>");
                Intrinsics.i(element, "element");
                int i10 = intRef.element;
                intRef.element = i10 + 1;
                ((CoroutineContext[]) obj4)[i10] = element;
                return unit;
            case 12:
                return ComposerImpl.invokeMovableContentLambda$lambda$0((MovableContent) obj4, obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return ComposerImplKt.deactivateCurrentGroup$lambda$0((RememberManager) obj4, (SlotWriter) obj3, ((Integer) obj).intValue(), obj2);
            case 14:
                Function3 function9 = (Function3) obj4;
                Child.Created created = (Child.Created) obj3;
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(553485013, iIntValue8, -1, "app.chalo.core.compose.DecomposeParentScreen.<anonymous>.<anonymous> (DecomposeParentScreen.kt:46)");
                    }
                    Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer8, 0).t, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i11 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer8, modifierM264backgroundbw27NRU$default2);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor6);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion9, composerM3915constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl6, Integer.valueOf(i11), composerM3915constructorimpl6));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    function9.invoke(created.b, composer8, 0);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 15:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$2((TextContextMenuDataProvider) obj4, (TextContextMenuSession) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                Function0 function10 = (Function0) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904416618, iIntValue9, -1, "app.chalo.compose.components.FromAndToStopDetailView.<anonymous>.<anonymous> (FromAndToStopDetailView.kt:81)");
                    }
                    Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
                    String strC2 = StringResourcesHelperKt.c(StringEnum.REMOVE, new Object[0], composer9, 6);
                    boolean zChanged6 = composer9.changed(function10);
                    Object objRememberedValue6 = composer9.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new v1(mutableState, function10, 3);
                        composer9.updateRememberedValue(objRememberedValue6);
                    }
                    FromAndToStopDetailViewKt.h(6, composer9, modifierWrapContentWidth$default, strC2, (Function0) objRememberedValue6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 17:
                final MapUpdaterState mapUpdaterState = (MapUpdaterState) obj4;
                Function2 function11 = (Function2) obj3;
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(704030801, iIntValue10, -1, "com.google.maps.android.compose.launchSubcomposition.<anonymous>.<anonymous> (GoogleMap.kt:257)");
                    }
                    composer10.startReplaceGroup(-1929098053);
                    Applier<?> applier = composer10.getApplier();
                    Intrinsics.g(applier, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                    final GoogleMap googleMap = ((MapApplier) applier).f14602a;
                    Applier<?> applier2 = composer10.getApplier();
                    Intrinsics.g(applier2, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                    MapView mapView = ((MapApplier) applier2).b;
                    MutableState mutableState2 = mapUpdaterState.f14650a;
                    MutableState mutableState3 = mapUpdaterState.c;
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        mapView.setImportantForAccessibility(4);
                    }
                    final Density density = (Density) composer10.consume(CompositionLocalsKt.getLocalDensity());
                    final LayoutDirection layoutDirection = (LayoutDirection) composer10.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    boolean zChanged7 = composer10.changed(mapUpdaterState) | composer10.changedInstance(googleMap) | composer10.changed(density) | composer10.changed(layoutDirection.ordinal());
                    Object objRememberedValue7 = composer10.rememberedValue();
                    if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0<MapPropertiesNode>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$1$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MapUpdaterState mapUpdaterState2 = mapUpdaterState;
                                String str3 = (String) mapUpdaterState2.b.getValue();
                                CameraPositionState cameraPositionState = (CameraPositionState) mapUpdaterState2.c.getValue();
                                PaddingValues paddingValues2 = (PaddingValues) mapUpdaterState2.d.getValue();
                                return new MapPropertiesNode(googleMap, cameraPositionState, str3, density, layoutDirection, paddingValues2);
                            }
                        };
                        composer10.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function12 = (Function0) objRememberedValue7;
                    if (!(composer10.getApplier() instanceof MapApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(function12);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer10);
                    Updater.m3926updateimpl(composerM3915constructorimpl7, density, MapUpdaterKt$MapUpdater$1$2$1.f14624a);
                    Updater.m3926updateimpl(composerM3915constructorimpl7, layoutDirection, MapUpdaterKt$MapUpdater$1$2$2.f14635a);
                    Updater.m3926updateimpl(composerM3915constructorimpl7, (String) mapUpdaterState.b.getValue(), MapUpdaterKt$MapUpdater$1$2$3.f14643a);
                    Updater.m3926updateimpl(composerM3915constructorimpl7, (PaddingValues) mapUpdaterState.d.getValue(), new Function2<MapPropertiesNode, PaddingValues, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode update = (MapPropertiesNode) obj9;
                            PaddingValues it = (PaddingValues) obj10;
                            Intrinsics.i(update, "$this$update");
                            Intrinsics.i(it, "it");
                            MapUpdaterKt.a(update, googleMap, it);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, (LocationSource) mapUpdaterState.e.getValue(), new Function2<MapPropertiesNode, LocationSource, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            Intrinsics.i(set, "$this$set");
                            googleMap.setLocationSource((LocationSource) obj10);
                            return Unit.f17538a;
                        }
                    });
                    mapUpdaterState.a().getClass();
                    Boolean bool = Boolean.FALSE;
                    Updater.m3923setimpl(composerM3915constructorimpl7, bool, new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.setBuildingsEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    mapUpdaterState.a().getClass();
                    Updater.m3923setimpl(composerM3915constructorimpl7, bool, new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.setIndoorEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.a().f14618a), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.setMyLocationEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.a().b), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.setTrafficEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    mapUpdaterState.a().getClass();
                    Updater.m3923setimpl(composerM3915constructorimpl7, (Object) null, new Function2<MapPropertiesNode, LatLngBounds, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            Intrinsics.i(set, "$this$set");
                            googleMap.setLatLngBoundsForCameraTarget((LatLngBounds) obj10);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, mapUpdaterState.a().c, new Function2<MapPropertiesNode, MapStyleOptions, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            Intrinsics.i(set, "$this$set");
                            googleMap.setMapStyle((MapStyleOptions) obj10);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, mapUpdaterState.a().d, new Function2<MapPropertiesNode, MapType, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            MapType it = (MapType) obj10;
                            Intrinsics.i(set, "$this$set");
                            Intrinsics.i(it, "it");
                            googleMap.setMapType(it.getValue());
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Float.valueOf(mapUpdaterState.a().e), new Function2<MapPropertiesNode, Float, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$13
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            float fFloatValue = ((Number) obj10).floatValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.setMaxZoomPreference(fFloatValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Float.valueOf(mapUpdaterState.a().f), new Function2<MapPropertiesNode, Float, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            float fFloatValue = ((Number) obj10).floatValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.setMinZoomPreference(fFloatValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, (Integer) mapUpdaterState.h.getValue(), new Function2<MapPropertiesNode, Integer, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            Integer num = (Integer) obj10;
                            Intrinsics.i(set, "$this$set");
                            if (num != null) {
                                googleMap.setMapColorScheme(num.intValue());
                            }
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().f14621a), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$16
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setCompassEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().b), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$17
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setIndoorLevelPickerEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().c), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$18
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setMapToolbarEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().d), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$19
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setMyLocationButtonEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    mapUpdaterState.b().getClass();
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.TRUE, new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setRotateGesturesEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().e), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$21
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setScrollGesturesEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().f), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$22
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().g), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$23
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setTiltGesturesEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().h), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$24
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setZoomControlsEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl7, Boolean.valueOf(mapUpdaterState.b().i), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$25
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            MapPropertiesNode set = (MapPropertiesNode) obj9;
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            googleMap.getUiSettings().setZoomGesturesEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3926updateimpl(composerM3915constructorimpl7, (CameraPositionState) mutableState3.getValue(), MapUpdaterKt$MapUpdater$1$2$26.f14642a);
                    composer10.endNode();
                    composer10.endReplaceGroup();
                    MapClickListenersKt.c(composer10, 0);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) CameraPositionStateKt.f14593a.provides((CameraPositionState) mutableState3.getValue()), (Function2<? super Composer, ? super Integer, Unit>) function11, composer10, ProvidedValue.$stable);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 18:
                return a(obj, obj2);
            case 19:
                return LazyGridDslKt.rememberColumnWidthSums$lambda$0$0((GridCells) obj4, (Arrangement.Horizontal) obj3, (Density) obj, (Constraints) obj2);
            case 20:
                return c(obj, obj2);
            case 21:
                return d(obj, obj2);
            case 22:
                return e(obj, obj2);
            case 23:
                return f(obj, obj2);
            case 24:
                return g(obj, obj2);
            case 25:
                return h(obj, obj2);
            case 26:
                return i(obj, obj2);
            case 27:
                return j(obj, obj2);
            case 28:
                return k(obj, obj2);
            default:
                Function0 function13 = (Function0) obj4;
                PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog passDateChangeFailureDialog = (PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog) obj3;
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1481557768, iIntValue11, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PassDateChangeFailureDialog.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1371)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), ChaloTheme.a(composer11, 0).t, ChaloTheme.d(composer11, 0).g), ChaloTheme.b(composer11, 0).i, ChaloTheme.b(composer11, 0).i, ChaloTheme.b(composer11, 0).h, ChaloTheme.b(composer11, 0).h);
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, companion11.getStart(), composer11, 0);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i12 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer11, modifierM787paddingqDBjuR0);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion12.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor7);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion12, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl8, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl8, Integer.valueOf(i12), composerM3915constructorimpl8));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_CLOSE, composer11, 6);
                    long j = ChaloTheme.a(composer11, 0).v0;
                    Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion10, ChaloTheme.b(composer11, 0).h);
                    boolean zChanged8 = composer11.changed(function13);
                    Object objRememberedValue8 = composer11.rememberedValue();
                    if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new p80(function13, 25);
                        composer11.updateRememberedValue(objRememberedValue8);
                    }
                    Modifier modifierAlign2 = columnScopeInstance2.align(ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs, false, null, null, null, (Function0) objRememberedValue8, 15, null), companion11.getEnd());
                    int i13 = Painter.$stable | 48;
                    IconKt.m2070Iconww6aTOc(painterA2, "", modifierAlign2, j, composer11, i13, 0);
                    ChaloSpacersKt.n(composer11, 0);
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_ERROR_ALERT, composer11, 6), "", SizeKt.m828size3ABfNKs(companion10, ChaloTheme.b(composer11, 0).l), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer11, i13, 120);
                    ChaloSpacersKt.o(composer11, 0);
                    TextKt.m2623TextNvy7gAk(passDateChangeFailureDialog.f6913a, SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), ChaloTheme.a(composer11, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer11, 0).getHeadlineMedium()), composer11, 48, 0, 131064);
                    ChaloSpacersKt.n(composer11, 0);
                    TextKt.m2623TextNvy7gAk(passDateChangeFailureDialog.b, SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), ChaloTheme.a(composer11, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer11, 0).getBodyMedium(), composer11, 48, 0, 131064);
                    ChaloSpacersKt.p(composer11, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    String strC3 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer11, 6);
                    Shape shape = ChaloTheme.d(composer11, 0).g;
                    boolean zChanged9 = composer11.changed(function13);
                    Object objRememberedValue9 = composer11.rememberedValue();
                    if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new p80(function13, 26);
                        composer11.updateRememberedValue(objRememberedValue9);
                    }
                    ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC3, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue9, composer11, 6, 492);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
        }
    }
}
