package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SnackbarDefaults;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.dialogs.TncDialogKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainScreenKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.ThresholdConfig;
import app.chalo.location.LatLng;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.components.map.PolylinePointUIState;
import app.chalo.uistate.components.map.TrafficLayerConfig;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountViewState;
import app.chalo.wallet.ui.loadbalance.compose.WalletLoadBalanceEnterAmountComposableKt;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceViewState;
import app.chalo.wallet.ui.mainbalance.compose.WalletBalanceComposableKt;
import com.google.maps.android.compose.PolylineKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15791a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h5(int i, Object obj, Object obj2, Object obj3) {
        this.f15791a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15791a;
        Unit unit = Unit.f17538a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5((Modifier) obj5, (MutableState) obj3, (Function2) obj4, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                TrafficLayerConfig trafficLayerConfig = (TrafficLayerConfig) obj5;
                List<PolylinePointUIState> list = (List) obj3;
                List list2 = (List) obj4;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1975234955, iIntValue, -1, "app.chalo.compose.components.chalomap.ChaloMap.<anonymous> (ChaloMap.android.kt:268)");
                    }
                    if (trafficLayerConfig.b) {
                        composer.startReplaceGroup(-1122316988);
                        for (PolylinePointUIState polylinePointUIState : list) {
                            List list3 = polylinePointUIState.f9963a;
                            ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((LatLng) it.next()).b());
                            }
                            PolylineKt.a(arrayList, ChaloColorTokenKt.c(polylinePointUIState.b), null, null, false, polylinePointUIState.c, null, composer, 0, 0);
                        }
                    } else {
                        composer.startReplaceGroup(-1132895273);
                    }
                    composer.endReplaceGroup();
                    ChaloMap_androidKt.e(list2, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 2:
                Modifier modifier = (Modifier) obj5;
                Function3 function3 = (Function3) obj3;
                Function3 function4 = (Function3) obj4;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                float f = ChaloSnackbarKt.f1826a;
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-998766662, iIntValue2, -1, "app.chalo.compose.components.ChaloSnackbarContainer.<anonymous> (ChaloSnackbar.kt:145)");
                    }
                    Modifier modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(modifier, 0.0f, ChaloSnackbarKt.f1826a, 1, null);
                    Shape rectangleShape = RectangleShapeKt.getRectangleShape();
                    SnackbarDefaults snackbarDefaults = SnackbarDefaults.INSTANCE;
                    int i2 = SnackbarDefaults.$stable;
                    SurfaceKt.m2480SurfaceT9BRK9s(modifierM835widthInVpY3zN4$default, rectangleShape, snackbarDefaults.getColor(composer2, i2), snackbarDefaults.getContentColor(composer2, i2), 0.0f, ChaloTheme.c(composer2, 6).c, null, ComposableLambdaKt.rememberComposableLambda(47776213, true, new h3(7, function3, function4), composer2, 54), composer2, 12582960, 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 3:
                return ContextMenuUiKt.ContextMenuPopup$lambda$1((Modifier) obj5, (ContextMenuColors) obj3, (Function1) obj4, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                Modifier modifier2 = (Modifier) obj5;
                Function0 function0 = (Function0) obj3;
                List list4 = (List) obj4;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229534311, iIntValue3, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsTncDialogue.<anonymous> (FareDetailsMainScreen.kt:483)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifier2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TERMS_AND_CONDITIONS, new Object[0], composer3, 6), columnScopeInstance.align(companion3, companion.getCenterHorizontally()), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer3, 0)), composer3, 0, 0, 131068);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer3, 0).i), composer3, 0);
                    Modifier modifierAlign = columnScopeInstance.align(companion3, companion.getCenterHorizontally());
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierAlign);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    composer3.startReplaceGroup(-1503423096);
                    int i5 = 0;
                    for (Object obj6 : list4) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        FareDetailsMainScreenKt.g(i6, 0, composer3, null, (String) obj6);
                        if (i5 < CollectionsKt.K(list4)) {
                            composer3.startReplaceGroup(2029342703);
                            gf.r(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).d, composer3, 0);
                        } else {
                            composer3.startReplaceGroup(2009728507);
                            composer3.endReplaceGroup();
                        }
                        i5 = i6;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer3, 0).i), composer3, 0);
                    Modifier modifierAlign2 = columnScopeInstance.align(companion4, Alignment.INSTANCE.getEnd());
                    boolean zChanged = composer3.changed(function0);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new fk(function0, 27);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer3, 6), ClickableKt.m299clickableoSLSa3U$default(modifierAlign2, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.a(composer3, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer3, 0)), composer3, 0, 0, 131064);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 5:
                return LazyStaggeredGridDslKt.rememberColumnSlots$lambda$0$0((PaddingValues) obj5, (StaggeredGridCells) obj3, (Arrangement.Horizontal) obj4, (Density) obj, (Constraints) obj2);
            case 6:
                return LazyStaggeredGridDslKt.rememberRowSlots$lambda$0$0((PaddingValues) obj5, (StaggeredGridCells) obj3, (Arrangement.Vertical) obj4, (Density) obj, (Constraints) obj2);
            case 7:
                NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState = (NewPremiumBusReserveTicketActivationState) obj5;
                BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) obj3;
                Function1 function1 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-788220948, iIntValue4, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationScreenMainScreen.<anonymous> (NewPremiumBusReserveTicketActivationScreen.kt:325)");
                    }
                    NewPremiumBusReserveTicketActivationScreenKt.a(newPremiumBusReserveTicketActivationState, bottomSheetScaffoldState, function1, composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 8:
                Function1 function2 = (Function1) obj5;
                PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog passDateChangeConfirmationDialog = (PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog) obj3;
                Function0 function5 = (Function0) obj4;
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-522019119, iIntValue5, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PassDateChangeConfirmationDialog.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1286)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Color.INSTANCE.m4642getWhite0d7_KjU(), ChaloTheme.d(composer5, 0).g), ChaloTheme.b(composer5, 0).h);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top2, companion6.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor3);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion7, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer5, 48);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor4);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion7, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i8), composerM3915constructorimpl4));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.REVISED_PASS_VALIDITY_WILL_BE, new Object[0], composer5, 6), null, ChaloTheme.a(composer5, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer5, 0).getBodyMedium(), composer5, 0, 0, 131066);
                    SpacerKt.Spacer(i41.a(rowScopeInstance, companion5, 1.0f, false, 2, null), composer5, 0);
                    Painter painterA = PainterResourceHelperKt.a(IconType.IC_CLOSE, composer5, 6);
                    long j = ChaloTheme.a(composer5, 0).v0;
                    boolean zChanged2 = composer5.changed(function5);
                    Object objRememberedValue2 = composer5.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new p80(function5, 27);
                        composer5.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion5, false, null, null, null, (Function0) objRememberedValue2, 15, null);
                    int i9 = Painter.$stable | 48;
                    IconKt.m2070Iconww6aTOc(painterA, "", modifierM299clickableoSLSa3U$default, j, composer5, i9, 0);
                    composer5.endNode();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer5, 48);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i10 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
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
                    pk0.v(companion7, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl5, Integer.valueOf(i10), composerM3915constructorimpl5));
                    TextKt.m2623TextNvy7gAk(passDateChangeConfirmationDialog.f6912a, null, ChaloTheme.a(composer5, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer5, 0).getBodyLarge()), composer5, 0, 0, 131066);
                    ChaloSpacersKt.w(composer5, 0);
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_ARROW_RIGHT, composer5, 6), "", SizeKt.m828size3ABfNKs(companion5, ChaloTheme.b(composer5, 0).g), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, i9, 120);
                    ChaloSpacersKt.w(composer5, 0);
                    TextKt.m2623TextNvy7gAk(passDateChangeConfirmationDialog.b, null, ChaloTheme.a(composer5, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer5, 0).getBodyLarge()), composer5, 0, 0, 131066);
                    composer5.endNode();
                    ChaloSpacersKt.p(composer5, 0);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    String strC = StringResourcesHelperKt.c(StringEnum.CAB_CONFIRM, new Object[0], composer5, 6);
                    Shape shape = ChaloTheme.d(composer5, 0).g;
                    boolean zChanged3 = composer5.changed(function2) | composer5.changed(passDateChangeConfirmationDialog);
                    Object objRememberedValue3 = composer5.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new zf0(28, function2, passDateChangeConfirmationDialog);
                        composer5.updateRememberedValue(objRememberedValue3);
                    }
                    ChaloFilledButtonKt.g(modifierFillMaxWidth$default3, strC, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue3, composer5, 6, 492);
                    ChaloSpacersKt.n(composer5, 0);
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    String strC2 = StringResourcesHelperKt.c(StringEnum.CANCEL, new Object[0], composer5, 6);
                    Shape shape2 = ChaloTheme.d(composer5, 0).g;
                    boolean zChanged4 = composer5.changed(function5);
                    Object objRememberedValue4 = composer5.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new p80(function5, 28);
                        composer5.updateRememberedValue(objRememberedValue4);
                    }
                    ChaloFilledButtonKt.f(strC2, false, modifierFillMaxWidth$default4, null, shape2, 0.0f, 0L, (Function0) objRememberedValue4, composer5, 384, 106);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 9:
                Map map = (Map) obj5;
                Float f2 = (Float) obj;
                Float f3 = (Float) obj2;
                return Float.valueOf(((ThresholdConfig) ((Function2) obj4).invoke(MapsKt.e(map, f2), MapsKt.e(map, f3))).a((Density) obj3, f2.floatValue(), f3.floatValue()));
            case 10:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$3((Ref.LongRef) obj5, (TextFieldSelectionState) obj3, (Ref.LongRef) obj4, (PointerInputChange) obj, (Offset) obj2);
            case 11:
                List list5 = (List) obj5;
                Function0 function6 = (Function0) obj3;
                Function0 function7 = (Function0) obj4;
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1578120365, iIntValue6, -1, "app.chalo.compose.components.dialogs.TncDialog.<anonymous> (TncDialog.kt:43)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), ChaloTheme.a(composer6, 6).t, null, 2, null), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer6, 48);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i11 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer6, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor6);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion9, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl6, Integer.valueOf(i11), composerM3915constructorimpl6));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion8, ChaloTheme.b(composer6, 6).i), composer6, 0);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TERMS_AND_CONDITIONS, new Object[0], composer6, 6), PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), ChaloTheme.b(composer6, 6).h, 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composer6, 6).getDisplaySmall(), composer6, 0, 0, 130044);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion8, ChaloTheme.b(composer6, 6).h), composer6, 0);
                    composer6.startReplaceGroup(-215897384);
                    int i12 = 0;
                    for (Object obj7 : list5) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        TncDialogKt.b(i13, 0, composer6, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer6, 6).h, 0.0f, 2, null), (String) obj7);
                        i12 = i13;
                    }
                    composer6.endReplaceGroup();
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, ChaloTheme.b(composer6, 6).i), composer6, 0);
                    DividerKt.m1950HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), ChaloTheme.b(composer6, 6).b, ChaloTheme.a(composer6, 6).m, composer6, 6, 0);
                    TncDialogKt.a(384, composer6, SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), function6, function7);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 12:
                WalletBalanceComponent walletBalanceComponent = (WalletBalanceComponent) obj5;
                PagerState pagerState = (PagerState) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(587134438, iIntValue7, -1, "app.chalo.wallet.ui.mainbalance.WalletBalanceMainScreen.<anonymous>.<anonymous> (WalletBalanceMainScreen.kt:75)");
                    }
                    WalletBalanceViewState walletBalanceViewState = (WalletBalanceViewState) mutableState.getValue();
                    boolean zChangedInstance = composer7.changedInstance(walletBalanceComponent);
                    Object objRememberedValue5 = composer7.rememberedValue();
                    if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new un1(walletBalanceComponent, 3);
                        composer7.updateRememberedValue(objRememberedValue5);
                    }
                    WalletBalanceComposableKt.e(walletBalanceViewState, (Function1) objRememberedValue5, pagerState, composer7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            default:
                PagerState pagerState2 = (PagerState) obj5;
                WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = (WalletLoadBalanceEnterAmountComponent) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-602960913, iIntValue8, -1, "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountMainScreen.<anonymous>.<anonymous>.<anonymous> (WalletLoadBalanceEnterAmountMainScreen.kt:92)");
                    }
                    WalletLoadBalanceEnterAmountViewState walletLoadBalanceEnterAmountViewState = (WalletLoadBalanceEnterAmountViewState) mutableState2.getValue();
                    boolean zChangedInstance2 = composer8.changedInstance(walletLoadBalanceEnterAmountComponent);
                    Object objRememberedValue6 = composer8.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new un1(walletLoadBalanceEnterAmountComponent, 4);
                        composer8.updateRememberedValue(objRememberedValue6);
                    }
                    WalletLoadBalanceEnterAmountComposableKt.a(walletLoadBalanceEnterAmountViewState, pagerState2, (Function1) objRememberedValue6, composer8, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ h5(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f15791a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}
