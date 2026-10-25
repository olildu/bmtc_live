package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Environment;
import app.chalo.compose.components.ChaloSearchBarComposableKt;
import app.chalo.compose.components.a;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import app.chalo.home.SnackBarState;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18291a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l9(TimePickerState timePickerState, Modifier modifier, Function0 function0, Function3 function3) {
        this.f18291a = 2;
        this.c = timePickerState;
        this.b = modifier;
        this.d = function0;
        this.e = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final CoroutineScope coroutineScope;
        final ChaloBuildConfig chaloBuildConfig;
        final UpdateDebugBuildEnvironmentUseCase updateDebugBuildEnvironmentUseCase;
        List list;
        int i = this.f18291a;
        Unit unit = Unit.f17538a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4((Modifier) obj6, (MutableState) obj5, (Function2) obj4, (BasicTextContextMenuProvider) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                List list2 = (List) obj6;
                PagerState pagerState = (PagerState) obj5;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                Function5 function5 = (Function5) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(458684749, iIntValue, -1, "app.chalo.compose.components.ChaloScrollableTabRow.<anonymous> (ChaloScrollableTabRow.kt:59)");
                    }
                    int i2 = 0;
                    for (Object obj7 : list2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        boolean z = pagerState.getCurrentPage() == i2;
                        boolean zChangedInstance = composer.changedInstance(coroutineScope2) | composer.changed(pagerState) | composer.changed(i2);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new a(i2, pagerState, coroutineScope2);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        TabKt.m2513TabbogVsAg(z, (Function0) objRememberedValue, ClipKt.clip(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, pagerState.getCurrentPage() == i2 ? 2.0f : 0.0f), ChaloTheme.b(composer, 6).m, 0.0f, 2, null), ChaloTheme.b(composer, 6).A, 0.0f, 2, null), ChaloTheme.b(composer, 6).d, 0.0f, 2, null), RoundedCornerShapeKt.getCircleShape()), false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1267357683, true, new jl(pagerState, i2, function5, obj7, 0), composer, 54), composer, 12582912, 120);
                        i2 = i3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 2:
                TimePickerState timePickerState = (TimePickerState) obj5;
                Modifier modifier = (Modifier) obj6;
                Function0 function0 = (Function0) obj4;
                Function3 function3 = (Function3) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1759035598, iIntValue2, -1, "app.chalo.compose.components.dialogs.ChaloTimePicker.<anonymous> (ChaloTimePicker.kt:41)");
                    }
                    CardKt.Card(null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(961252736, true, new c0(timePickerState, modifier, function0, function3, 6), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 3:
                ChaloBuildConfig chaloBuildConfig2 = (ChaloBuildConfig) obj6;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj5;
                UpdateDebugBuildEnvironmentUseCase updateDebugBuildEnvironmentUseCase2 = (UpdateDebugBuildEnvironmentUseCase) obj4;
                final Function0 function1 = (Function0) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(805642238, iIntValue3, -1, "app.chalo.home.ui.common.ChangeEnvironmentDialog.<anonymous> (ChangeEnvironmentDialog.kt:39)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Color.Companion companion2 = Color.INSTANCE;
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BackgroundKt.m264backgroundbw27NRU$default(companion, companion2.m4642getWhite0d7_KjU(), null, 2, null), 0.0f, ChaloTheme.b(composer3, 0).f, 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer3, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM788paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk("Environment", PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composer3, 0).f), companion2.m4631getBlack0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 390, 0, 262136);
                    composer3.startReplaceGroup(-107202768);
                    Iterator<Environment> it = Environment.getEntries().iterator();
                    while (it.hasNext()) {
                        final Environment next = it.next();
                        String strName = next.name();
                        long jM4639getRed0d7_KjU = next == chaloBuildConfig2.getF2153a() ? Color.INSTANCE.m4639getRed0d7_KjU() : Color.INSTANCE.m4631getBlack0d7_KjU();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        boolean zChangedInstance2 = composer3.changedInstance(coroutineScope3) | composer3.changed(next.ordinal()) | composer3.changedInstance(chaloBuildConfig2) | composer3.changedInstance(updateDebugBuildEnvironmentUseCase2) | composer3.changed(function1);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            coroutineScope = coroutineScope3;
                            chaloBuildConfig = chaloBuildConfig2;
                            updateDebugBuildEnvironmentUseCase = updateDebugBuildEnvironmentUseCase2;
                            Function0 function2 = new Function0() { // from class: app.chalo.home.ui.common.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    BuildersKt.d(coroutineScope, null, null, new ChangeEnvironmentDialogKt$ChangeEnvironmentDialog$2$1$1$1$1$1(next, chaloBuildConfig, updateDebugBuildEnvironmentUseCase, function1, null), 3);
                                    return Unit.f17538a;
                                }
                            };
                            composer3.updateRememberedValue(function2);
                            objRememberedValue2 = function2;
                        } else {
                            coroutineScope = coroutineScope3;
                            chaloBuildConfig = chaloBuildConfig2;
                            updateDebugBuildEnvironmentUseCase = updateDebugBuildEnvironmentUseCase2;
                        }
                        TextKt.m2623TextNvy7gAk(strName, PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(companion4, false, null, null, null, (Function0) objRememberedValue2, 15, null), ChaloTheme.b(composer3, 0).f), jM4639getRed0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262136);
                        DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloTheme.b(composer3, 0).b, ChaloTheme.a(composer3, 0).m, composer3, 6, 0);
                        updateDebugBuildEnvironmentUseCase2 = updateDebugBuildEnvironmentUseCase;
                        chaloBuildConfig2 = chaloBuildConfig;
                        coroutineScope3 = coroutineScope;
                    }
                    if (b3.t(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 4:
                UniversalPickerViewState universalPickerViewState = (UniversalPickerViewState) obj6;
                TextFieldValue textFieldValue = (TextFieldValue) obj5;
                Function1 function4 = (Function1) obj4;
                Function0 function6 = (Function0) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1670291969, iIntValue4, -1, "app.chalo.livetracking.universalsearch.ui.compose.SearchTextField.<anonymous>.<anonymous>.<anonymous> (CitySelectionUniversalPickerScreen.kt:464)");
                    }
                    ChaloSearchBarComposableKt.b(universalPickerViewState.h, textFieldValue, function4, function6, composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 5:
                HomeScreenFragmentViewState homeScreenFragmentViewState = (HomeScreenFragmentViewState) obj6;
                HomeScreenConfigAppModel homeScreenConfigAppModel = (HomeScreenConfigAppModel) obj5;
                HomeScreenInfoHelper homeScreenInfoHelper = (HomeScreenInfoHelper) obj4;
                Function1 function7 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1236085881, iIntValue5, -1, "app.chalo.home.ui.base.BottomNavigationUI.<anonymous> (HomeScreenMainDecompose.kt:220)");
                    }
                    NavigationTabAppModel navigationTabAppModel = homeScreenFragmentViewState.f3225a;
                    if (navigationTabAppModel == null) {
                        composer5.startReplaceGroup(-815008547);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-815008546);
                        if (homeScreenConfigAppModel == null || (list = homeScreenConfigAppModel.c) == null) {
                            list = EmptyList.f17557a;
                        }
                        List list3 = list;
                        SnackBarState snackBarState = homeScreenFragmentViewState.g;
                        UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState = homeScreenFragmentViewState.l;
                        UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState = homeScreenFragmentViewState.m;
                        PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState = homeScreenFragmentViewState.n;
                        boolean zChanged = composer5.changed(function7);
                        Object objRememberedValue3 = composer5.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new nu(function7, 10);
                            composer5.updateRememberedValue(objRememberedValue3);
                        }
                        NavigationTabAppModel.Companion companion5 = NavigationTabAppModel.INSTANCE;
                        HomeScreenMainDecomposeKt.a(navigationTabAppModel, list3, homeScreenInfoHelper, snackBarState, userProfilingHomeStickyBannerUIState, userProfilingChaloBusStickyBannerUIState, pendingRideFeedbackStickyBannerUIState, (Function1) objRememberedValue3, composer5, 0);
                        composer5.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            default:
                List list4 = (List) obj6;
                ColumnScope columnScope = (ColumnScope) obj5;
                PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType = (PbBulkBookingRideDetailsTabType) obj4;
                Function1 function8 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-507381765, iIntValue6, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.UpcomingAndPastRidesFilterTab.<anonymous>.<anonymous>.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1162)");
                    }
                    int i5 = 0;
                    for (Object obj8 : list4) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType2 = (PbBulkBookingRideDetailsTabType) obj8;
                        Modifier modifierD = pk0.d("PL_Bulk_Ride_Filter_Tab_", i5, ClipKt.clip(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(dq.a(columnScope, ZIndexModifierKt.zIndex(Modifier.INSTANCE, pbBulkBookingRideDetailsTabType2 == pbBulkBookingRideDetailsTabType ? 2.0f : 0.0f), 1.0f, false, 2, null), ChaloTheme.b(composer6, 0).m, 0.0f, 2, null), ChaloTheme.b(composer6, 0).A, 0.0f, 2, null), ChaloTheme.b(composer6, 0).d, 0.0f, 2, null), RoundedCornerShapeKt.getCircleShape()));
                        boolean z2 = pbBulkBookingRideDetailsTabType2 == pbBulkBookingRideDetailsTabType;
                        boolean zChanged2 = composer6.changed(function8) | composer6.changed(pbBulkBookingRideDetailsTabType2.ordinal());
                        Object objRememberedValue4 = composer6.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new zf0(29, function8, pbBulkBookingRideDetailsTabType2);
                            composer6.updateRememberedValue(objRememberedValue4);
                        }
                        TabKt.m2513TabbogVsAg(z2, (Function0) objRememberedValue4, modifierD, false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1800903851, true, new u50(23, pbBulkBookingRideDetailsTabType2, pbBulkBookingRideDetailsTabType), composer6, 54), composer6, 12582912, 120);
                        i5 = i6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ l9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f18291a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
