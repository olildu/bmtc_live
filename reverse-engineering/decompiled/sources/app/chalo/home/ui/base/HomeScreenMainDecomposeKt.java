package app.chalo.home.ui.base;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.insets.NavigationBottomInsets_androidKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.BottomSheetState;
import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import app.chalo.home.SnackBarData;
import app.chalo.home.SnackBarState;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusScreenKt;
import app.chalo.home.ui.common.PendingRideFeedbackCardKt;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerKt;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerKt;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.compose.MyTicketScreenKt;
import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.home.HomeScreenKt;
import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenKt;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenKt;
import app.chalo.homescreen.data.model.app.BottomNavTabAppModelKt;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.ChaloBusAppModel;
import app.chalo.homescreen.data.model.app.HomeScreenAppModel;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.homescreen.data.model.app.ProfileScreenAppModel;
import app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.TicketsPassesAppModel;
import app.chalo.utils.PlatformFeature;
import app.chalo.utils.SheetDefaultsHelperKt;
import com.adjust.sdk.Constants;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.arkivanov.decompose.router.slot.ChildSlot;
import defpackage.b3;
import defpackage.c6;
import defpackage.er;
import defpackage.gf;
import defpackage.h0;
import defpackage.h3;
import defpackage.ir;
import defpackage.km;
import defpackage.kn;
import defpackage.l9;
import defpackage.ob;
import defpackage.pk0;
import defpackage.q70;
import defpackage.t1;
import defpackage.u1;
import defpackage.u60;
import defpackage.v60;
import defpackage.wb;
import defpackage.x70;
import defpackage.xx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0015²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenFragmentViewState;", "viewState", "", "shouldShowUpdateDialog", "Lapp/chalo/home/BottomSheetState;", "bottomSheetState", "Landroidx/compose/ui/unit/Dp;", "tabWidth", "", "selectedIndex", "shouldRenderBottomNavBar", "shouldRenderStickyBanner", "slideOffset", "", "Lapp/chalo/home/ui/base/HomeComponent$TabComponentEntry;", "tabEntries", "Lcom/arkivanov/decompose/router/slot/ChildSlot;", "Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration;", "Lapp/chalo/home/ui/base/HomeScreenDrawerChild;", "drawerSlot", "renderedDrawerChild", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenMainDecomposeKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3226a;

        static {
            int[] iArr = new int[HomeScreenConfigLayoutType.values().length];
            try {
                iArr[HomeScreenConfigLayoutType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeScreenConfigLayoutType.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeScreenConfigLayoutType.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3226a = iArr;
        }
    }

    public static final void a(NavigationTabAppModel navigationTabAppModel, List list, HomeScreenInfoHelper homeScreenInfoHelper, SnackBarState snackBarState, UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState, UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState, PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        float f;
        int i3;
        Modifier modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(607137658);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(navigationTabAppModel) : composerStartRestartGroup.changedInstance(navigationTabAppModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(snackBarState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(userProfilingHomeStickyBannerUIState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(userProfilingChaloBusStickyBannerUIState) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(pendingRideFeedbackStickyBannerUIState) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(607137658, i2, -1, "app.chalo.home.ui.base.AppBottomNavigation (HomeScreenMainDecompose.kt:454)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
            BottomNavTabType bottomNavTabType = navigationTabAppModel.f3761a.d;
            boolean z = (bottomNavTabType == BottomNavTabType.HOME || bottomNavTabType == BottomNavTabType.CHALO_BUS) && pendingRideFeedbackStickyBannerUIState != null;
            State stateCollectAsState = SnapshotStateKt.collectAsState(homeScreenInfoHelper.t(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(homeScreenInfoHelper.i(), null, composerStartRestartGroup, 0, 1);
            if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1132103344);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (!(composerStartRestartGroup.getApplier() != null)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (snackBarState.b) {
                    composerStartRestartGroup.startReplaceGroup(-157933041);
                    SnackBarData snackBarData = snackBarState.f2864a;
                    if (snackBarData == null) {
                        composerStartRestartGroup.startReplaceGroup(-600956974);
                        composerStartRestartGroup.endReplaceGroup();
                        f = 0.0f;
                        i3 = 0;
                        composer2 = composerStartRestartGroup;
                        modifier = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-600956973);
                        String str = snackBarData.f2863a;
                        String str2 = snackBarData.b;
                        boolean z2 = (i2 & 896) == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper));
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new xx(homeScreenInfoHelper, 18);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        i3 = 0;
                        f = 0.0f;
                        modifier = null;
                        ChaloSnackbarKt.a(null, str, str2, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 1);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    }
                } else {
                    f = 0.0f;
                    i3 = 0;
                    composer2 = composerStartRestartGroup;
                    modifier = null;
                    composer2.startReplaceGroup(-624301895);
                }
                composer2.endReplaceGroup();
                if (((Boolean) stateCollectAsState2.getValue()).booleanValue() && userProfilingChaloBusStickyBannerUIState != null) {
                    composer2.startReplaceGroup(-600489772);
                    UserProfilingChaloBusStickyBannerKt.a(modifier, userProfilingChaloBusStickyBannerUIState, composer2, (i2 >> 12) & 112);
                    composer2.endReplaceGroup();
                } else if (!((Boolean) stateCollectAsState2.getValue()).booleanValue() || userProfilingHomeStickyBannerUIState == null) {
                    if (((Boolean) stateCollectAsState2.getValue()).booleanValue() && z) {
                        composer2.startReplaceGroup(-600021548);
                        Composer composer3 = composer2;
                        PendingRideFeedbackCardKt.a(pendingRideFeedbackStickyBannerUIState.f2862a, pendingRideFeedbackStickyBannerUIState.b, pendingRideFeedbackStickyBannerUIState.c, null, composer3, 0);
                        composer2 = composer3;
                    } else {
                        composer2.startReplaceGroup(-624301895);
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-600244996);
                    UserProfilingHomeStickyBannerKt.a(modifier, userProfilingHomeStickyBannerUIState, composer2, (i2 >> 9) & 112);
                    composer2.endReplaceGroup();
                }
                if (list.size() != 1) {
                    composer2.startReplaceGroup(-599421047);
                    Composer composer4 = composer2;
                    SurfaceKt.m2480SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(companion2, f, 1, modifier), null, ChaloTheme.a(composer2, i3).t, ChaloTheme.a(composer2, i3).Z, 0.0f, ChaloTheme.c(composer2, i3).d, null, ComposableLambdaKt.rememberComposableLambda(222871356, true, new u1(list, navigationTabAppModel, function1, mutableIntState, mutableState), composer2, 54), composer4, 12582918, 82);
                    composer2 = composer4;
                } else {
                    composer2.startReplaceGroup(-624301895);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1108707272);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new er(navigationTabAppModel, list, homeScreenInfoHelper, snackBarState, userProfilingHomeStickyBannerUIState, userProfilingChaloBusStickyBannerUIState, pendingRideFeedbackStickyBannerUIState, function1, i, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(HomeComponent homeComponent, HomeScreenFragmentViewState homeScreenFragmentViewState, Function1 function1, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, HomeScreenInfoHelper homeScreenInfoHelper, Composer composer, int i) {
        int i2;
        MutableState mutableState;
        Composer composerStartRestartGroup = composer.startRestartGroup(853351604);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(homeComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(homeScreenFragmentViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 8339) != 8338, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(853351604, i2, -1, "app.chalo.home.ui.base.BottomNavigationUI (HomeScreenMainDecompose.kt:174)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            SheetState sheetStateA = SheetDefaultsHelperKt.a(true, null, SheetValue.Hidden, false, composerStartRestartGroup, 390, 58);
            HomeScreenConfigAppModel homeScreenConfigAppModel = homeScreenFragmentViewState.d;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new BottomSheetState(7), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            mutableState2.setValue(homeScreenFragmentViewState.f);
            CommonBottomSheetType commonBottomSheetType = ((BottomSheetState) mutableState2.getValue()).b;
            if (!Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.ChaloAppRatingsBottomSheet.b) && !Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.ChaloOnlineCardRechargeTutorialBottomSheet.b) && !Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.CityChangeBottomSheet.b) && !Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.CityNotSupportedBottomSheet.b) && !Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.NotificationPermissionBottomSheet.b) && !Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.RideHailingUserFeedbackBottomSheet.b) && !Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.UserProfilingBottomSheet.b) && !(commonBottomSheetType instanceof CommonBottomSheetType.SuperPassVerificationBottomSheet.Rejected) && !(commonBottomSheetType instanceof CommonBottomSheetType.SuperPassVerificationBottomSheet.Verified)) {
                if (!Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.None.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                sheetStateA = null;
            }
            BottomSheetState bottomSheetState = (BottomSheetState) mutableState2.getValue();
            boolean zChanged = ((57344 & i2) == 16384 || ((i2 & 32768) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper))) | composerStartRestartGroup.changed(sheetStateA) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                mutableState = mutableState2;
                HomeScreenMainDecomposeKt$BottomNavigationUI$1$1 homeScreenMainDecomposeKt$BottomNavigationUI$1$1 = new HomeScreenMainDecomposeKt$BottomNavigationUI$1$1(sheetStateA, homeScreenInfoHelper, coroutineScope, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(homeScreenMainDecomposeKt$BottomNavigationUI$1$1);
                objRememberedValue3 = homeScreenMainDecomposeKt$BottomNavigationUI$1$1;
            } else {
                mutableState = mutableState2;
            }
            EffectsKt.LaunchedEffect(bottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            ScaffoldKt.m2316ScaffoldTvnljyQ(null, null, ComposableLambdaKt.rememberComposableLambda(1236085881, true, new l9(homeScreenFragmentViewState, homeScreenConfigAppModel, homeScreenInfoHelper, function1, 5), composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(252598083, true, new kn(sheetStateA, function1, homeScreenInfoHelper, homeScreenFragmentViewState, homeScreenConfigAppModel, mutableState, homeComponent, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 805306752, TypedValues.PositionType.TYPE_PERCENT_Y);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(homeComponent, homeScreenFragmentViewState, function1, homeScreenAnalyticsHelper, homeScreenInfoHelper, i, 13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(HomeComponent homeComponent, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, HomeScreenInfoHelper homeScreenInfoHelper, Composer composer, int i) {
        int i2;
        Intrinsics.i(homeScreenAnalyticsHelper, "homeScreenAnalyticsHelper");
        Intrinsics.i(homeScreenInfoHelper, "homeScreenInfoHelper");
        Composer composerStartRestartGroup = composer.startRestartGroup(-514820267);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(homeComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(homeScreenAnalyticsHelper) : composerStartRestartGroup.changedInstance(homeScreenAnalyticsHelper) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 256 : 128;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-514820267, i2, -1, "app.chalo.home.ui.base.HomeScreenMain (HomeScreenMainDecompose.kt:111)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(homeComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(homeComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new x70(homeComponent, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            int i5 = i2 & 14;
            int i6 = i2 << 6;
            b(homeComponent, (HomeScreenFragmentViewState) mutableStateA.getValue(), function1, homeScreenAnalyticsHelper, homeScreenInfoHelper, composerStartRestartGroup, i5 | (i6 & 7168) | (i6 & 57344));
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(271640776);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                BackHandlerKt.a(false, (Function0) objRememberedValue3, Integer.MAX_VALUE, 432, composerStartRestartGroup, 1);
                composerStartRestartGroup = composerStartRestartGroup;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = new t1(mutableState, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue4, new DialogProperties(false, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1708932877, true, new h3(18, homeScreenAnalyticsHelper, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 438, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(265405095);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 12, homeComponent, homeScreenAnalyticsHelper, homeScreenInfoHelper));
        }
    }

    public static final void d(HomeScreenDrawerChild homeScreenDrawerChild, HomeScreenInfoHelper homeScreenInfoHelper, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-675908051);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(homeScreenDrawerChild) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-675908051, i2, -1, "app.chalo.home.ui.base.HomeScreenSideDrawer (HomeScreenMainDecompose.kt:856)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (!(homeScreenDrawerChild instanceof HomeScreenDrawerChild.ProfileDrawerChild)) {
                throw pk0.p(composerStartRestartGroup, -1989517673);
            }
            composerStartRestartGroup.startReplaceGroup(-1545391141);
            HomeScreenDrawerChild.ProfileDrawerChild profileDrawerChild = (HomeScreenDrawerChild.ProfileDrawerChild) homeScreenDrawerChild;
            ProfileScreenAppModel profileScreenAppModel = profileDrawerChild.b;
            if (profileScreenAppModel == null) {
                composerStartRestartGroup.startReplaceGroup(-1545391142);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1545391141);
                ProfileScreenComponent profileScreenComponent = profileDrawerChild.f3206a;
                ProfileScreenAppModel.Companion companion2 = ProfileScreenAppModel.INSTANCE;
                ProfileScreenKt.a(profileScreenComponent, homeScreenInfoHelper, profileScreenAppModel, function1, composerStartRestartGroup, (i2 & 112) | 512 | ((i2 << 3) & 7168));
            }
            composerStartRestartGroup.endReplaceGroup();
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 13, homeScreenDrawerChild, homeScreenInfoHelper, function0));
        }
    }

    public static final void e(List list, NavigationTabAppModel navigationTabAppModel, HomeScreenInfoHelper homeScreenInfoHelper, Composer composer, int i) {
        int i2;
        Object next;
        Composer composerStartRestartGroup = composer.startRestartGroup(1392248050);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(navigationTabAppModel) : composerStartRestartGroup.changedInstance(navigationTabAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1392248050, i2, -1, "app.chalo.home.ui.base.HomeTabPager (HomeScreenMainDecompose.kt:760)");
            }
            BottomNavTabType bottomNavTabTypeA = BottomNavTabAppModelKt.a(navigationTabAppModel);
            boolean zChanged = composerStartRestartGroup.changed(list) | composerStartRestartGroup.changed(bottomNavTabTypeA.ordinal());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((HomeComponent.TabComponentEntry) next).f3193a == bottomNavTabTypeA));
                objRememberedValue = (HomeComponent.TabComponentEntry) next;
                if (objRememberedValue == null) {
                    objRememberedValue = (HomeComponent.TabComponentEntry) CollectionsKt.H(list);
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CrossfadeKt.Crossfade((HomeComponent.TabComponentEntry) objRememberedValue, (Modifier) null, AnimationSpecKt.tween$default(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6, null), "HomeTabCrossfade", ComposableLambdaKt.rememberComposableLambda(-483821679, true, new c6(homeScreenInfoHelper, 29), composerStartRestartGroup, 54), composerStartRestartGroup, 28032, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 11, list, navigationTabAppModel, homeScreenInfoHelper));
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0245  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [androidx.compose.animation.core.Easing, androidx.compose.ui.Modifier, java.lang.Object] */
    public static final void f(HomeComponent homeComponent, NavigationTabAppModel navigationTabAppModel, NavigationTabAppModel navigationTabAppModel2, PaddingValues paddingValues, List list, HomeScreenInfoHelper homeScreenInfoHelper, Function1 function1, Composer composer, int i) {
        int i2;
        BottomNavTabType bottomNavTabType;
        boolean z;
        float fA;
        Composer composerStartRestartGroup = composer.startRestartGroup(656807896);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(homeComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(navigationTabAppModel) : composerStartRestartGroup.changedInstance(navigationTabAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(navigationTabAppModel2) : composerStartRestartGroup.changedInstance(navigationTabAppModel2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(656807896, i2, -1, "app.chalo.home.ui.base.MainScreenNavigationConfigurations (HomeScreenMainDecompose.kt:615)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(homeComponent.O0, composerStartRestartGroup);
            Child.Created created = ((ChildSlot) SubscribeAsStateKt.a(homeComponent.f1, composerStartRestartGroup).getValue()).f12375a;
            boolean z2 = created != null;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(mutableTransitionState) | composerStartRestartGroup.changed(z2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$1$1(mutableTransitionState, z2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(created);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$2$1(created, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(created, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            Boolean boolValueOf2 = Boolean.valueOf(mutableTransitionState.isIdle());
            Object targetState = mutableTransitionState.getTargetState();
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(mutableTransitionState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$3$1(mutableTransitionState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(boolValueOf2, targetState, (Function2) objRememberedValue5, composerStartRestartGroup, 0);
            boolean z3 = ((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue();
            boolean z4 = (((List) mutableStateA.getValue()).isEmpty() || z2 || !mutableTransitionState.isIdle() || ((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue() || (((HomeScreenDrawerChild) mutableState.getValue()) != null)) ? false : true;
            Boolean boolValueOf3 = Boolean.valueOf(z4);
            int i3 = i2 & 3670016;
            boolean zChanged = (i3 == 1048576) | composerStartRestartGroup.changed(z4);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                bottomNavTabType = null;
                objRememberedValue6 = new HomeScreenMainDecomposeKt$MainScreenNavigationConfigurations$4$1(z4, function1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                bottomNavTabType = null;
            }
            EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
            BottomNavTabType selectedTab = BottomNavTabAppModelKt.a(navigationTabAppModel);
            BottomNavTabType bottomNavTabTypeA = navigationTabAppModel2 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel2) : bottomNavTabType;
            Intrinsics.i(selectedTab, "selectedTab");
            if (z3) {
                z = false;
            } else {
                float f = PlatformFeature.f10436a;
                if (bottomNavTabTypeA == null || selectedTab != bottomNavTabTypeA) {
                    z = true;
                } else {
                    z = false;
                }
            }
            float f2 = PlatformFeature.f10436a;
            boolean z5 = i3 == 1048576;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new q70(function1, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            ?? r20 = bottomNavTabType;
            int i4 = i2;
            boolean z6 = z;
            BackHandlerKt.a(z3, (Function0) objRememberedValue7, 0, 0, composerStartRestartGroup, 2);
            boolean z7 = i3 == 1048576;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new q70(function1, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            BackHandlerKt.a(z6, (Function0) objRememberedValue8, 0, 0, composerStartRestartGroup, 2);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, r20);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float top = paddingValues.getTop();
            if (list.size() > 1) {
                composerStartRestartGroup.startReplaceGroup(669970602);
                composerStartRestartGroup.endReplaceGroup();
                fA = paddingValues.getBottom();
            } else {
                composerStartRestartGroup.startReplaceGroup(669971589);
                fA = NavigationBottomInsets_androidKt.a();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(companion2, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), top, paddingValues.mo735calculateRightPaddingu2uoSUM(layoutDirection), fA);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            if (((List) mutableStateA.getValue()).isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1727438691);
                ChaloCircularLoadingBoxKt.a(r20, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1727370894);
                List list2 = (List) mutableStateA.getValue();
                NavigationTabAppModel.Companion companion5 = NavigationTabAppModel.INSTANCE;
                e(list2, navigationTabAppModel, homeScreenInfoHelper, composerStartRestartGroup, (i4 & 112) | ((i4 >> 9) & 896));
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, r20);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(250, 0, r20, 6, r20);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new u60(28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(tweenSpecTween$default, (Function1) objRememberedValue9);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(250, 0, r20, 6, r20);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new u60(29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState, modifierFillMaxSize$default2, enterTransitionSlideInHorizontally, EnterExitTransitionKt.slideOutHorizontally(tweenSpecTween$default2, (Function1) objRememberedValue10), (String) null, ComposableLambdaKt.rememberComposableLambda(483022266, true, new ob(11, mutableState, homeScreenInfoHelper, function1), composerStartRestartGroup, 54), composerStartRestartGroup, MutableTransitionState.$stable | 196656, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new km(homeComponent, navigationTabAppModel, navigationTabAppModel2, paddingValues, list, homeScreenInfoHelper, function1, i, 3));
        }
    }

    public static final void g(HomeComponent.TabComponentEntry tabComponentEntry, HomeScreenInfoHelper homeScreenInfoHelper, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(221837386);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tabComponentEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221837386, i2, -1, "app.chalo.home.ui.base.TabEntryContent (HomeScreenMainDecompose.kt:786)");
            }
            HomeComponent.TabChild tabChild = tabComponentEntry.d;
            if (tabChild instanceof HomeComponent.TabChild.HomeTab) {
                composerStartRestartGroup.startReplaceGroup(-1196854929);
                HomeComponent.TabChild.HomeTab homeTab = (HomeComponent.TabChild.HomeTab) tabChild;
                NavigationTabAppModel.HomeTab homeTab2 = homeTab.b;
                if (homeTab2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1196854930);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1196854929);
                    HomeScreenComponent homeScreenComponent = homeTab.f3189a;
                    HomeScreenAppModel homeScreenAppModel = homeTab2.c;
                    HomeScreenAppModel.Companion companion = HomeScreenAppModel.INSTANCE;
                    HomeScreenKt.a(homeScreenComponent, homeScreenAppModel, homeScreenInfoHelper, composerStartRestartGroup, ((i2 << 3) & 896) | 64);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (tabChild instanceof HomeComponent.TabChild.RegularBusTab) {
                composerStartRestartGroup.startReplaceGroup(-1196488881);
                HomeComponent.TabChild.RegularBusTab regularBusTab = (HomeComponent.TabChild.RegularBusTab) tabChild;
                NavigationTabAppModel.RegularBusTab regularBusTab2 = regularBusTab.b;
                if (regularBusTab2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1196488882);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1196488881);
                    RegularBusComponent regularBusComponent = regularBusTab.f3191a;
                    RegularBusScreenConfigAppModel regularBusScreenConfigAppModel = regularBusTab2.c;
                    RegularBusScreenConfigAppModel.Companion companion2 = RegularBusScreenConfigAppModel.INSTANCE;
                    RegularBusScreenKt.a(regularBusComponent, regularBusScreenConfigAppModel, homeScreenInfoHelper, composerStartRestartGroup, ((i2 << 3) & 896) | 64);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (tabChild instanceof HomeComponent.TabChild.ChaloBusTab) {
                composerStartRestartGroup.startReplaceGroup(-1196093972);
                HomeComponent.TabChild.ChaloBusTab chaloBusTab = (HomeComponent.TabChild.ChaloBusTab) tabChild;
                NavigationTabAppModel.ChaloBusTab chaloBusTab2 = chaloBusTab.b;
                if (chaloBusTab2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1196093973);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1196093972);
                    ChaloBusComponent chaloBusComponent = chaloBusTab.f3188a;
                    ChaloBusAppModel chaloBusAppModel = chaloBusTab2.c;
                    ChaloBusAppModel.Companion companion3 = ChaloBusAppModel.INSTANCE;
                    ChaloBusScreenKt.a(chaloBusComponent, chaloBusAppModel, homeScreenInfoHelper, composerStartRestartGroup, ((i2 << 3) & 896) | 64);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else if (tabChild instanceof HomeComponent.TabChild.MyTicketsTab) {
                composerStartRestartGroup.startReplaceGroup(-1195726560);
                HomeComponent.TabChild.MyTicketsTab myTicketsTab = (HomeComponent.TabChild.MyTicketsTab) tabChild;
                NavigationTabAppModel.MyTicketsTab myTicketsTab2 = myTicketsTab.b;
                if (myTicketsTab2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1195726561);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1195726560);
                    MyTicketsComponent myTicketsComponent = myTicketsTab.f3190a;
                    TicketsPassesAppModel ticketsPassesAppModel = myTicketsTab2.c;
                    TicketsPassesAppModel.Companion companion4 = TicketsPassesAppModel.INSTANCE;
                    MyTicketScreenKt.a(myTicketsComponent, ticketsPassesAppModel, composerStartRestartGroup, 64);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!tabChild.equals(HomeComponent.TabChild.UnknownTab.f3192a)) {
                    throw pk0.p(composerStartRestartGroup, -1562631471);
                }
                composerStartRestartGroup.startReplaceGroup(-1562583954);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(tabComponentEntry, homeScreenInfoHelper, i, 3));
        }
    }
}
