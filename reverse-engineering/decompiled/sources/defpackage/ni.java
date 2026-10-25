package defpackage;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.NavigationBarItemColors;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.divider.TicketPunchDividerKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.StopNearbyTripsCardKt;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsShimmerViewKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsTripSummaryCardKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsScreenUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTripSummaryUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.productactivation.ui.ActivationPassComposablesKt;
import app.chalo.productactivation.ui.ActivationTicketComposablesKt;
import app.chalo.productactivation.ui.uistate.ActivationPassFooterUIState;
import app.chalo.productactivation.ui.uistate.UpsellRideSectionUISpecs;
import app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionLoadingItemUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSkeletonLoadingUISpec;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ni implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18514a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ni(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f18514a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Composer composer;
        int i2 = this.f18514a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        int i3 = 6;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i2) {
            case 0:
                Modifier modifier = (Modifier) obj8;
                String str = (String) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1407008294, iIntValue, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardPassItem.<anonymous> (ChaloCardComposeItems.kt:116)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer2, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer2, 0)), composer2, 1572864, 0, 131002);
                    if (str2 == null) {
                        composer2.startReplaceGroup(1835746470);
                    } else {
                        composer2.startReplaceGroup(1835746471);
                        ChaloSpacersKt.t(composer2, 0);
                        TextKt.m2623TextNvy7gAk(vo1.n(StringResourcesHelperKt.c(StringEnum.MTICKET_BOOKING_VALID_TILL, new Object[0], composer2, 6), " ", str2), null, ChaloTheme.a(composer2, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
                    }
                    composer2.endReplaceGroup();
                    ChaloSpacersKt.o(composer2, 0);
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer2, 0).r0, ChaloTheme.d(composer2, 0).b), ChaloTheme.b(composer2, 0).h);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ChaloCardComposeItemsKt.d(0, composer2, null, StringResourcesHelperKt.c(StringEnum.PLAN_TYPE, new Object[0], composer2, 6), str3);
                    if (str4 == null) {
                        composer2.startReplaceGroup(-1764043985);
                    } else {
                        composer2.startReplaceGroup(-1764043984);
                        ChaloCardComposeItemsKt.d(0, composer2, null, StringResourcesHelperKt.c(StringEnum.TRIPS_LEFT, new Object[0], composer2, 6), str4);
                    }
                    composer2.endReplaceGroup();
                    if (r1.k(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                List list = (List) obj8;
                NavigationTabAppModel navigationTabAppModel = (NavigationTabAppModel) obj7;
                Function1 function1 = (Function1) obj6;
                MutableIntState mutableIntState = (MutableIntState) obj5;
                MutableState mutableState = (MutableState) obj4;
                RowScope NavigationBar = (RowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(NavigationBar, "$this$NavigationBar");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer3.changed(NavigationBar) ? 4 : 2;
                }
                if (composer3.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1832697185, iIntValue2, -1, "app.chalo.home.ui.base.AppBottomNavigation.<anonymous>.<anonymous>.<anonymous> (HomeScreenMainDecompose.kt:519)");
                    }
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    Iterator it = list.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        NavigationTabAppModel navigationTabAppModel2 = (NavigationTabAppModel) next;
                        boolean z = navigationTabAppModel.f3761a.d == navigationTabAppModel2.f3761a.d;
                        if (i6 == 0) {
                            composer3.startReplaceGroup(-2002351030);
                            ChaloSpacersKt.y(composer3, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-2028175549);
                            composer3.endReplaceGroup();
                        }
                        RowScope rowScope = NavigationBar;
                        Modifier modifierA = i41.a(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                        int i8 = iIntValue2;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        List list2 = list;
                        Iterator it2 = it;
                        int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierA);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Iterator it3 = list2.iterator();
                        int i10 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i10 = -1;
                            } else if (((NavigationTabAppModel) it3.next()).f3761a.d != navigationTabAppModel.f3761a.d) {
                                i10++;
                            }
                        }
                        mutableIntState.setIntValue(i10);
                        Composer composer4 = composer3;
                        State<Dp> stateM163animateDpAsStateAjpBEmI = AnimateAsStateKt.m163animateDpAsStateAjpBEmI(Dp.m7278constructorimpl(((Dp) mutableState.getValue()).m7292unboximpl() * mutableIntState.getIntValue()), AnimationSpecKt.tween$default(200, 0, null, i3, null), "", null, composer4, 432, 8);
                        if (z) {
                            composer4.startReplaceGroup(878223285);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(OffsetKt.m744offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m7278constructorimpl(stateM163animateDpAsStateAjpBEmI.getValue().m7292unboximpl() - Dp.m7278constructorimpl(((Dp) mutableState.getValue()).m7292unboximpl() * mutableIntState.getIntValue())), 0.0f, 2, null), 0.0f, 1, null);
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            Modifier modifierZIndex = ZIndexModifierKt.zIndex(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(boxScopeInstance.align(modifierFillMaxWidth$default, companion4.getTopStart()), RoundedCornerShapeKt.m1075RoundedCornerShapea9UjIt4(ChaloTheme.b(composer4, 0).f1916a, ChaloTheme.b(composer4, 0).f1916a, ChaloTheme.b(composer4, 0).c, ChaloTheme.b(composer4, 0).c)), ChaloTheme.a(composer4, 0).e, null, 2, null), 2.0f);
                            boolean zChanged = composer4.changed(density);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new f0(density, mutableState, 12);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierZIndex, (Function1) objRememberedValue);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i11 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierOnGloballyPositioned);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor4);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion5, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i11), composerM3915constructorimpl4));
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ChaloSpacersKt.s(null, 0, composer4, 1);
                            composer4.endNode();
                        } else {
                            composer4.startReplaceGroup(851675753);
                        }
                        composer4.endReplaceGroup();
                        Modifier modifierAlign = boxScopeInstance.align(PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Bottom_Navigation_Item_" + navigationTabAppModel2.f3761a.c), Alignment.INSTANCE.getCenter());
                        NavigationBarItemColors navigationBarItemColorsM2183colors69fazGs = NavigationBarItemDefaults.INSTANCE.m2183colors69fazGs(ChaloTheme.a(composer4, 0).e, ChaloTheme.a(composer4, 0).e, ChaloTheme.a(composer4, 0).Z, ChaloTheme.a(composer4, 0).v0, ChaloTheme.a(composer4, 0).v0, 0L, 0L, composer4, NavigationBarItemDefaults.$stable << 21, 96);
                        boolean zChanged2 = composer4.changed(function1) | composer4.changedInstance(navigationTabAppModel2);
                        Object objRememberedValue2 = composer4.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new cy(13, function1, navigationTabAppModel2);
                            composer4.updateRememberedValue(objRememberedValue2);
                        }
                        NavigationBarKt.NavigationBarItem(rowScope, z, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(2090447796, true, new yt(z, navigationTabAppModel2, 1), composer4, 54), modifierAlign, false, ComposableLambdaKt.rememberComposableLambda(207067767, true, new n4(navigationTabAppModel2, 22), composer4, 54), false, navigationBarItemColorsM2183colors69fazGs, null, composer4, (i8 & 14) | 1575936, 336);
                        composer4.endNode();
                        if (i6 == CollectionsKt.K(list2)) {
                            composer4.startReplaceGroup(-1998048726);
                            ChaloSpacersKt.y(composer4, 0);
                        } else {
                            composer4.startReplaceGroup(-2028175549);
                        }
                        composer4.endReplaceGroup();
                        it = it2;
                        composer3 = composer4;
                        i6 = i7;
                        mutableIntState = mutableIntState;
                        list = list2;
                        NavigationBar = rowScope;
                        navigationTabAppModel = navigationTabAppModel;
                        i3 = 6;
                        iIntValue2 = i8;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                Arrangement.Vertical vertical = (Arrangement.Vertical) obj8;
                PremiumBusFareDetailsContent premiumBusFareDetailsContent = (PremiumBusFareDetailsContent) obj7;
                Function3 function3 = (Function3) obj6;
                PremiumBusFareDetailsUiState premiumBusFareDetailsUiState = (PremiumBusFareDetailsUiState) obj5;
                PremiumBusFareDetailsScreenUISpecs premiumBusFareDetailsScreenUISpecs = (PremiumBusFareDetailsScreenUISpecs) obj4;
                BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= composer5.changed(BoxWithConstraints) ? 4 : 2;
                }
                if (composer5.shouldExecute((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1623823357, iIntValue3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScaffold.<anonymous>.<anonymous> (PremiumBusFareDetailsScaffold.kt:62)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), BoxWithConstraints.mo693getMaxHeightD9Ej5fM(), 0.0f, 2, null);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(vertical, companion7.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i12 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierM816heightInVpY3zN4$default);
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
                    pk0.v(companion8, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl5, Integer.valueOf(i12), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i13 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor6);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion8, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl6, Integer.valueOf(i13), composerM3915constructorimpl6));
                    PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState = premiumBusFareDetailsUiState.b;
                    if (premiumBusFareDetailsTripSummaryUiState == null) {
                        composer5.startReplaceGroup(-997999798);
                        composer5.endReplaceGroup();
                        i = 0;
                    } else {
                        composer5.startReplaceGroup(-997999797);
                        i = 0;
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, premiumBusFareDetailsScreenUISpecs.c), composer5, 0);
                        PremiumBusFareDetailsTripSummaryCardKt.a(premiumBusFareDetailsTripSummaryUiState, ChaloThemeKt.c(companion6, premiumBusFareDetailsScreenUISpecs.b), composer5, 0, 0);
                        composer5.endReplaceGroup();
                    }
                    boolean z2 = premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.InitialLoading;
                    if (z2) {
                        composer5.startReplaceGroup(-997596890);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, premiumBusFareDetailsScreenUISpecs.d), composer5, i);
                        FareDetailsShimmerViewKt.a(ChaloThemeKt.c(companion6, premiumBusFareDetailsScreenUISpecs.b), composer5, i);
                    } else {
                        composer5.startReplaceGroup(-1001293485);
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    if (z2) {
                        composer5.startReplaceGroup(1950579817);
                    } else {
                        composer5.startReplaceGroup(1954572679);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composer5, 0);
                        long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                        int i14 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default3);
                        Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                        if (composer5.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor7);
                        } else {
                            composer5.useNode();
                        }
                        Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer5);
                        pk0.v(companion8, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl7, currentCompositionLocalMap7);
                        Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl7, Integer.valueOf(i14), composerM3915constructorimpl7));
                        function3.invoke(columnScopeInstance2, composer5, 6);
                        composer5.endNode();
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
            case 3:
                Modifier modifier2 = (Modifier) obj8;
                ProductSelectionSkeletonLoadingUISpec productSelectionSkeletonLoadingUISpec = (ProductSelectionSkeletonLoadingUISpec) obj7;
                ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState = (ProductSelectionLoadingItemUIState) obj6;
                ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState2 = (ProductSelectionLoadingItemUIState) obj5;
                ProductSelectionLoadingItemUIState productSelectionLoadingItemUIState3 = (ProductSelectionLoadingItemUIState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer6.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2011966892, iIntValue4, -1, "app.chalo.productpurchase.productselection.ui.ProductSelectionShimmerCard.<anonymous> (ProductSelectionScreen.kt:478)");
                    }
                    Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), productSelectionSkeletonLoadingUISpec.f);
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement3.getTop();
                    Alignment.Companion companion9 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(top2, companion9.getStart(), composer6, 0);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i15 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer6, modifierC);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion10.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor8);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion10, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl8, Integer.valueOf(i15), composerM3915constructorimpl8));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    ProductSelectionScreenKt.k(productSelectionLoadingItemUIState, columnScopeInstance3.align(companion11, companion9.getEnd()), composer6, 0, 0);
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion9.getStart(), composer6, 0);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i16 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer6, companion11);
                    Function0<ComposeUiNode> constructor9 = companion10.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor9);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion10, composerM3915constructorimpl9, measurePolicyColumnMeasurePolicy6, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl9, Integer.valueOf(i16), composerM3915constructorimpl9));
                    ProductSelectionScreenKt.k(productSelectionLoadingItemUIState2, null, composer6, 0, 2);
                    ChaloSpacersKt.a(productSelectionSkeletonLoadingUISpec.b, composer6, 0);
                    ProductSelectionScreenKt.k(productSelectionLoadingItemUIState3, null, composer6, 0, 2);
                    composer6.endNode();
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 4:
                return SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$62$lambda$61((Shape) obj8, (Shape) obj7, (Density) obj6, (SearchBarState) obj5, (MutableState) obj4, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
            case 5:
                NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = (NearbyStopAndTripsUiModel) obj8;
                Function1 function2 = (Function1) obj7;
                Function1 function4 = (Function1) obj6;
                Function2 function5 = (Function2) obj5;
                Function3 function6 = (Function3) obj4;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer7.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(550190650, iIntValue5, -1, "app.chalo.home.nearbytrips.ui.StopNearbyTripsCard.<anonymous> (StopNearbyTripsCard.kt:55)");
                    }
                    StopNearbyTripsCardKt.h(nearbyStopAndTripsUiModel, function2, function4, function5, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer7, 0).t, null, 2, null), function6, composer7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            default:
                UpsellRideSectionUISpecs upsellRideSectionUISpecs = (UpsellRideSectionUISpecs) obj8;
                ActivationPassFooterUIState activationPassFooterUIState = (ActivationPassFooterUIState) obj7;
                UpsellRideSectionUIState upsellRideSectionUIState = (UpsellRideSectionUIState) obj6;
                Density density2 = (Density) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer8.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1861675644, iIntValue6, -1, "app.chalo.productactivation.ui.UpsellRideSection.<anonymous> (UpsellRideSectionComposables.kt:49)");
                    }
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
                    ChaloPadding chaloPadding = upsellRideSectionUISpecs.b;
                    float f = upsellRideSectionUISpecs.f;
                    Modifier modifierC2 = ChaloThemeKt.c(modifierFillMaxWidth$default4, chaloPadding);
                    Arrangement arrangement4 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), Alignment.INSTANCE.getStart(), composer8, 0);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i17 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer8, modifierC2);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor10 = companion13.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor10);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl10 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion13, composerM3915constructorimpl10, measurePolicyColumnMeasurePolicy7, composerM3915constructorimpl10, currentCompositionLocalMap10);
                    Updater.m3923setimpl(composerM3915constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion13, composerM3915constructorimpl10, Integer.valueOf(i17), composerM3915constructorimpl10));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    if (upsellRideSectionUIState instanceof UpsellRideSectionUIState.Booked) {
                        composer8.startReplaceGroup(-1501601870);
                        UpsellRideSectionUIState.Booked booked = (UpsellRideSectionUIState.Booked) upsellRideSectionUIState;
                        ChaloTextViewKt.a(null, booked.f8083a, null, null, composer8, 0, 13);
                        composer = composer8;
                        ChaloSpacersKt.b(f, composer, 0);
                        ActivationTicketComposablesKt.c(booked.b, null, composer, 0);
                        ChaloSpacersKt.b(f, composer, 0);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement4.getStart(), UiAlignmentKt.b(UiAlignment.Vertical.Center.f9888a), composer, 0);
                        long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                        int i18 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, companion12);
                        Function0<ComposeUiNode> constructor11 = companion13.getConstructor();
                        if (composer.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor11);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM3915constructorimpl11 = Updater.m3915constructorimpl(composer);
                        pk0.v(companion13, composerM3915constructorimpl11, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl11, currentCompositionLocalMap11);
                        Updater.m3923setimpl(composerM3915constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion13, composerM3915constructorimpl11, Integer.valueOf(i18), composerM3915constructorimpl11));
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        ChaloTextViewKt.a(null, booked.c, null, null, composer, 0, 13);
                        ChaloSpacersKt.v(upsellRideSectionUISpecs.g, composer, 0);
                        ChaloTextViewKt.a(null, booked.d, null, null, composer, 0, 13);
                        composer.endNode();
                        composer.endReplaceGroup();
                    } else {
                        composer = composer8;
                        if (!(upsellRideSectionUIState instanceof UpsellRideSectionUIState.BookedUnconfirmed)) {
                            throw pk0.p(composer, -2126650580);
                        }
                        composer.startReplaceGroup(-1500880562);
                        UpsellRideSectionUIState.BookedUnconfirmed bookedUnconfirmed = (UpsellRideSectionUIState.BookedUnconfirmed) upsellRideSectionUIState;
                        ChaloTextViewKt.a(null, bookedUnconfirmed.f8084a, null, null, composer, 0, 13);
                        ChaloSpacersKt.b(f, composer, 0);
                        ChaloTextViewKt.a(null, bookedUnconfirmed.b, null, null, composer, 0, 13);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (activationPassFooterUIState == null) {
                        composer.startReplaceGroup(-265238225);
                    } else {
                        composer.startReplaceGroup(-265238224);
                        TicketPunchDividerKt.a(null, null, 0.0f, 0.0f, composer, 0, 15);
                        boolean zChanged3 = composer.changed(density2);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new p11(mutableState2, density2);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        ActivationPassComposablesKt.d(activationPassFooterUIState, (Function1) objRememberedValue3, composer, 0, 0);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
        }
    }
}
