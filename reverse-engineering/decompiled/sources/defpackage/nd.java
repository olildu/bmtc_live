package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeDisplayInfo;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.BusTicketCardUIKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.RouteInfo;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumReserveTicketDetailsScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.app.TitoVehicleAndEtaData;
import app.chalo.titoridedetail.data.ui.TITOStopInfoEtaState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nd implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18474a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nd(Modifier modifier, Function1 function1, String str, boolean z, String str2, TitoRideDataAppModel titoRideDataAppModel) {
        this.f18474a = 4;
        this.c = modifier;
        this.f = function1;
        this.d = str;
        this.b = z;
        this.e = str2;
        this.g = titoRideDataAppModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i;
        int i2;
        String strC;
        int i3 = this.f18474a;
        boolean z = this.b;
        Unit unit = Unit.f17538a;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f;
        Object obj8 = this.c;
        switch (i3) {
            case 0:
                RouteInfo routeInfo = (RouteInfo) obj8;
                String str = (String) obj6;
                String str2 = (String) obj5;
                Function0 function0 = (Function0) obj7;
                Function0 function1 = (Function0) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(570369723, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.BusTicketCardUI.<anonymous> (BusTicketCardUI.kt:53)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, 0.0f, ChaloTheme.b(composer2, 0).h, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM786paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composer2, 0).h, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer2, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                    composer2.startReplaceGroup(-237652201);
                    composer2.endReplaceGroup();
                    if (str.length() > 0) {
                        composer2.startReplaceGroup(-234808540);
                        ChaloSpacersKt.t(composer2, 0);
                        TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer2, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
                    } else {
                        composer2.startReplaceGroup(-237652201);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endNode();
                    ChaloSpacersKt.o(composer2, 0);
                    if (routeInfo != null) {
                        composer2.startReplaceGroup(-1643473301);
                        BusTicketCardUIKt.a(z, routeInfo, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1646722659);
                        composer2.endReplaceGroup();
                    }
                    ChaloSpacersKt.o(composer2, 0);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                    if (str2 != null) {
                        composer2.startReplaceGroup(1519728578);
                        Modifier modifierA = PlotlineComposeWidgetKt.a(companion, "PL_Use_Now_Cta");
                        Painter painterA = PainterResourceHelperKt.a(IconType.IC_ARROW_UP, composer2, 6);
                        boolean zChanged = composer2.changed(function0);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new hb(function0, 4);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        ChaloFilledButtonKt.c(str2, modifierA, null, painterA, 0L, 0L, 0.0f, (Function0) objRememberedValue, composer2, Painter.$stable << 9, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                    } else {
                        composer2.startReplaceGroup(1515769816);
                    }
                    composer2.endReplaceGroup();
                    SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
                    composer2.startReplaceGroup(1520172653);
                    Modifier modifierA2 = PlotlineComposeWidgetKt.a(companion, "PL_View_Receipt");
                    String strC2 = StringResourcesHelperKt.c(StringEnum.VIEW_RECEIPT, new Object[0], composer2, 6);
                    boolean zChanged2 = composer2.changed(function1);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new hb(function1, 5);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ChaloFilledButtonKt.h(0, composer2, modifierA2, strC2, (Function0) objRememberedValue2);
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                List<ProductPurchaseNudgeDisplayInfo> list = (List) obj8;
                ChaloBusComponent chaloBusComponent = (ChaloBusComponent) obj6;
                Function1 function2 = (Function1) obj5;
                Dp dp = (Dp) obj7;
                MutableIntState mutableIntState = (MutableIntState) obj4;
                BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                }
                if (composer3.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(175766263, iIntValue2, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoProductDetailUI.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:732)");
                    }
                    float f = ChaloTheme.b(composer3, 0).h;
                    float f2 = ChaloTheme.b(composer3, 0).h;
                    float fM7292unboximpl = ((Dp) RangesKt.b(Dp.m7276boximpl(Dp.m7278constructorimpl(BoxWithConstraints.mo694getMaxWidthD9Ej5fM() * 0.6f)), Dp.m7276boximpl(ChaloTheme.b(composer3, 0).b0))).m7292unboximpl();
                    Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), f, 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(f2), Alignment.INSTANCE.getTop(), composer3, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierM786paddingVpY3zN4$default2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion4, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-437485247);
                    for (ProductPurchaseNudgeDisplayInfo productPurchaseNudgeDisplayInfo : list) {
                        boolean zChanged3 = composer3.changed(function2) | composer3.changed(productPurchaseNudgeDisplayInfo);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new l3(24, function2, productPurchaseNudgeDisplayInfo);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function3 = (Function0) objRememberedValue3;
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierThen = companion5.then(dp != null ? SizeKt.m816heightInVpY3zN4$default(companion5, dp.m7292unboximpl(), 0.0f, 2, null) : companion5);
                        boolean zChanged4 = composer3.changed(mutableIntState);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new vd(mutableIntState, 1);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        ChaloBusScreenUIKt.q(chaloBusComponent, productPurchaseNudgeDisplayInfo, fM7292unboximpl, this.b, function3, OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen, (Function1) objRememberedValue4), composer3, 0);
                    }
                    if (b3.t(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                return ContextMenuScope.item$lambda$0((Function2) obj8, (ContextMenuScope) obj6, (Modifier) obj5, this.b, (Function3) obj4, (Function0) obj7, (ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                Modifier modifier = (Modifier) obj8;
                Function1 function4 = (Function1) obj6;
                PremiumBusBookingCardData premiumBusBookingCardData = (PremiumBusBookingCardData) obj5;
                NewPremiumReserveTicketDetailsScreenType newPremiumReserveTicketDetailsScreenType = (NewPremiumReserveTicketDetailsScreenType) obj7;
                PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = (PremiumBusPostBookingStopSchedule) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1211207878, iIntValue3, -1, "app.chalo.home.ui.common.PremiumBusScheduleAndStopInfoComponent.<anonymous> (PremiumBusUpcomingBottomSheetLayout.kt:139)");
                    }
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.a(composer4, 0).y0, null, 2, null), ChaloTheme.b(composer4, 0).h, ChaloTheme.b(composer4, 0).f);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion6.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composer4, 48);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i9 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, modifierM785paddingVpY3zN4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor6);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion7, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl6, Integer.valueOf(i9), composerM3915constructorimpl6));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierA3 = i41.a(rowScopeInstance3, companion8, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composer4, 48);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i10 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer4, modifierA3);
                    Function0<ComposeUiNode> constructor7 = companion7.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor7);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion7, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl7, Integer.valueOf(i10), composerM3915constructorimpl7));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = premiumBusBookingCardData.h;
                    if (Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b)) {
                        composer4.startReplaceGroup(-1067876840);
                        int i11 = PremiumBusUpcomingBottomSheetLayoutKt.WhenMappings.f3381a[newPremiumReserveTicketDetailsScreenType.ordinal()];
                        if (i11 == 1) {
                            i2 = 0;
                            composer4.startReplaceGroup(-2112654144);
                            strC = StringResourcesHelperKt.c(StringEnum.BUS_PASSED_PICKUP_STOP_INFO, new Object[0], composer4, 6);
                            composer4.endReplaceGroup();
                        } else {
                            if (i11 != 2) {
                                throw pk0.p(composer4, -2112657231);
                            }
                            composer4.startReplaceGroup(-2112647554);
                            i2 = 0;
                            strC = StringResourcesHelperKt.c(StringEnum.BUS_PASSED_DROP_STOP_INFO, new Object[0], composer4, 6);
                            composer4.endReplaceGroup();
                        }
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composer4, i2);
                        long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, i2);
                        int i12 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap8 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer4, companion8);
                        Function0<ComposeUiNode> constructor8 = companion7.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor8);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer4);
                        pk0.v(companion7, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl8, currentCompositionLocalMap8);
                        Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl8, Integer.valueOf(i12), composerM3915constructorimpl8));
                        String strC3 = StringResourcesHelperKt.c(StringEnum.BUS_PASSED_HEADING, new Object[0], composer4, 6);
                        long j = ChaloTheme.a(composer4, 0).e;
                        TextStyle headlineMedium = ChaloTheme.e(composer4, 0).getHeadlineMedium();
                        TextOverflow.Companion companion9 = TextOverflow.INSTANCE;
                        TextKt.m2623TextNvy7gAk(strC3, null, j, null, 0L, null, null, null, 0L, null, null, 0L, companion9.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, headlineMedium, composer4, 0, 24960, 110586);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion8, ChaloTheme.b(composer4, 0).d), composer4, 0);
                        TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composer4, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, companion9.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTheme.e(composer4, 0).getBodySmall(), composer4, 0, 24960, 110586);
                        composer = composer4;
                        composer.endNode();
                        composer.endReplaceGroup();
                        i = 0;
                    } else {
                        composer = composer4;
                        if ((premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) || Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b) || Intrinsics.d(premiumBusBookingTripTimeInfoState, PremiumBusBookingTripTimeInfoState.NotFetched.b)) {
                            i = 0;
                            composer.startReplaceGroup(-1066270854);
                            NewPremiumBusActivationBottomSheetContentKt.b(null, premiumBusBookingCardData.h, premiumBusPostBookingStopSchedule, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            if (!(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta)) {
                                throw pk0.p(composer, -2112660996);
                            }
                            composer.startReplaceGroup(-1065982151);
                            i = 0;
                            PremiumBusUpcomingBottomSheetLayoutKt.b((PremiumBusBookingTripTimeInfoState.LiveEta) premiumBusBookingTripTimeInfoState, newPremiumReserveTicketDetailsScreenType, null, composer, 0);
                            composer.endReplaceGroup();
                        }
                    }
                    composer.endNode();
                    String strC4 = StringResourcesHelperKt.c(z ? StringEnum.USE_TICKET_OR_TRACK : StringEnum.VIEW_DETAILS, new Object[i], composer, i);
                    boolean zChanged5 = composer.changed(function4) | composer.changedInstance(premiumBusBookingCardData);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new ow0(function4, premiumBusBookingCardData, 1);
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    Composer composer5 = composer;
                    ChaloFilledButtonKt.g(null, strC4, null, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue5, composer5, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 477);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            default:
                Modifier modifier2 = (Modifier) obj8;
                Function1 function5 = (Function1) obj7;
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                TitoRideDataAppModel titoRideDataAppModel = (TitoRideDataAppModel) obj4;
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer6.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1916063942, iIntValue4, -1, "app.chalo.home.ui.common.TitoRideDetailsCardInfoComponent.<anonymous> (TitoRideDetailsBottomSheetLayout.kt:115)");
                    }
                    Modifier modifierM785paddingVpY3zN5 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), ChaloTheme.a(composer6, 0).y0, null, 2, null), ChaloTheme.b(composer6, 0).h, ChaloTheme.b(composer6, 0).f);
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically3 = companion10.getCenterVertically();
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically3, composer6, 48);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i13 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer6, modifierM785paddingVpY3zN5);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor9 = companion11.getConstructor();
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
                    pk0.v(companion11, composerM3915constructorimpl9, measurePolicyRowMeasurePolicy5, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl9, Integer.valueOf(i13), composerM3915constructorimpl9));
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion12, null, false, 3, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion10.getStart(), composer6, 48);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i14 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer6, modifierWrapContentWidth$default);
                    Function0<ComposeUiNode> constructor10 = companion11.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor10);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl10 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion11, composerM3915constructorimpl10, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl10, currentCompositionLocalMap10);
                    Updater.m3923setimpl(composerM3915constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl10, Integer.valueOf(i14), composerM3915constructorimpl10));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    if (z) {
                        composer6.startReplaceGroup(-1797099438);
                        TitoVehicleAndEtaData titoVehicleAndEtaData = titoRideDataAppModel.c;
                        Intrinsics.g(titoVehicleAndEtaData, "null cannot be cast to non-null type app.chalo.titoridedetail.data.app.TitoVehicleAndEtaData.RideData");
                        TITOStopInfoEtaState tITOStopInfoEtaState = ((TitoVehicleAndEtaData.RideData) titoVehicleAndEtaData).b;
                        Intrinsics.g(tITOStopInfoEtaState, "null cannot be cast to non-null type app.chalo.titoridedetail.data.ui.TITOStopInfoEtaState.LiveEta");
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NEXT_STOP_WITHOUT_COLON, new Object[0], composer6, 6), null, ChaloTheme.a(composer6, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer6, 0).getBodySmall(), composer6, 0, 0, 131066);
                        ChaloSpacersKt.s(null, 0, composer6, 1);
                        String str5 = ((TITOStopInfoEtaState.LiveEta) tITOStopInfoEtaState).b;
                        if (str5 == null) {
                            composer6.startReplaceGroup(-1796570486);
                        } else {
                            composer6.startReplaceGroup(-1796570485);
                            ChaloEtaComponentKt.a(StringResourcesHelperKt.c(StringEnum.ROUTE_DETAILS_ETA_TEXT, new Object[]{str5}, composer6, 6), null, null, composer6, 0, 6);
                        }
                        composer6.endReplaceGroup();
                        composer6.endReplaceGroup();
                    } else {
                        composer6.startReplaceGroup(-1797805711);
                        TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TAPPED_IN_AT, new Object[0], composer6, 6), null, ChaloTheme.a(composer6, 0).w, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer6, 0).getBodySmall(), composer6, 0, 0, 131066);
                        ChaloSpacersKt.s(null, 0, composer6, 1);
                        TextKt.m2623TextNvy7gAk(str4, SizeKt.fillMaxWidth(companion12, 0.6f), ChaloTheme.a(composer6, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composer6, 0).getHeadlineMedium(), composer6, 48, 24960, 110584);
                        composer6 = composer6;
                        composer6.endReplaceGroup();
                    }
                    composer6.endNode();
                    SpacerKt.Spacer(i41.a(rowScopeInstance4, companion12, 1.0f, false, 2, null), composer6, 0);
                    Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(companion12, ChaloTheme.b(composer6, 0).k);
                    TextStyle titleLarge = ChaloTheme.e(composer6, 0).getTitleLarge();
                    String strC5 = StringResourcesHelperKt.c(StringEnum.TAP_OUT_WITHOUT_DASH, new Object[0], composer6, 6);
                    boolean zChanged6 = composer6.changed(function5) | composer6.changed(str3);
                    Object objRememberedValue6 = composer6.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new w60(9, str3, function5);
                        composer6.updateRememberedValue(objRememberedValue6);
                    }
                    ChaloFilledButtonKt.g(modifierM814height3ABfNKs, strC5, titleLarge, 0L, null, true, 0.0f, null, 0L, (Function0) objRememberedValue6, composer6, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ nd(Object obj, boolean z, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f18474a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    public /* synthetic */ nd(List list, ChaloBusComponent chaloBusComponent, boolean z, Function1 function1, Dp dp, MutableIntState mutableIntState) {
        this.f18474a = 1;
        this.c = list;
        this.d = chaloBusComponent;
        this.b = z;
        this.e = function1;
        this.f = dp;
        this.g = mutableIntState;
    }

    public /* synthetic */ nd(Function2 function2, ContextMenuScope contextMenuScope, Modifier modifier, boolean z, Function3 function3, Function0 function0) {
        this.f18474a = 2;
        this.c = function2;
        this.d = contextMenuScope;
        this.e = modifier;
        this.b = z;
        this.g = function3;
        this.f = function0;
    }
}
