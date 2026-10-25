package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.instantticket.ui.instantticketscreen.WalletSubTextProperties;
import app.chalo.premiumbus.ui.slotselection.NoRideAvailableForSelectedTimeUIState;
import app.chalo.premiumbus.ui.slotselection.ODPairTagsUIState;
import app.chalo.premiumbus.ui.slotselection.OutlinedButtonUIState;
import app.chalo.premiumbus.ui.slotselection.PBOdPairWithSlotsCardUISpecs;
import app.chalo.premiumbus.ui.slotselection.PBOdPairWithSlotsCardUIState;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeCardUIState;
import app.chalo.premiumbus.ui.slotselection.PbSlotCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n20 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18447a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n20(PBOdPairWithSlotsCardUISpecs pBOdPairWithSlotsCardUISpecs, PBOdPairWithSlotsCardUIState pBOdPairWithSlotsCardUIState, boolean z) {
        this.f18447a = 4;
        this.c = pBOdPairWithSlotsCardUISpecs;
        this.d = pBOdPairWithSlotsCardUIState;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        int i;
        int i2 = this.f18447a;
        Unit unit = Unit.f17538a;
        boolean z = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$3(this.b, (MutableIntState) obj5, (MutableIntState) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 1:
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(365474107, iIntValue, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.VerifyAndMoreOptionsButtonSection.<anonymous>.<anonymous> (NewPremiumBusReserveTicketActivationScreen.kt:573)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer, 0).g, ChaloTheme.b(composer, 0).h);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM785paddingVpY3zN4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ChaloFilledButtonKt.f(StringResourcesHelperKt.c(StringEnum.MANAGE_RIDES, new Object[0], composer, 6), false, i41.a(rowScopeInstance, SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composer, 0).n), 1.0f, false, 2, null), ChaloTypographyKt.a(ChaloTypographyKt.h(ChaloTheme.e(composer, 0))), ChaloTheme.d(composer, 0).g, 0.0f, 0L, function0, composer, 0, 98);
                    if (z) {
                        composer.startReplaceGroup(1575927789);
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composer, 0).h), composer, 0);
                        ChaloFilledButtonKt.g(i41.a(rowScopeInstance, companion2, 1.5f, false, 2, null), StringResourcesHelperKt.c(StringEnum.VERIFY_MY_TICKET, new Object[0], composer, 6), ChaloTypographyKt.a(ChaloTypographyKt.h(ChaloTheme.e(composer, 0))), 0L, ChaloTheme.d(composer, 0).g, false, ChaloTheme.b(composer, 0).n, null, 0L, function1, composer, 0, TypedValues.CycleType.TYPE_WAVE_OFFSET);
                    } else {
                        composer.startReplaceGroup(1549198411);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 2:
                String str = (String) obj5;
                WalletSubTextProperties walletSubTextProperties = (WalletSubTextProperties) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-913389517, iIntValue2, -1, "app.chalo.instantticket.ui.instantticketscreen.compose.ChaloWalletPaymentOptionCard.<anonymous> (PaymentBottomSheetComposable.kt:211)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion4, ChaloTheme.b(composer2, 0).h);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Horizontal start = arrangement.getStart();
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, companion5.getTop(), composer2, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                    pk0.v(companion6, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    float f = z ? 0.4f : 1.0f;
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.WALLET_INTRODUCTION, composer2, 6), "", rowScopeInstance2.align(AlphaKt.alpha(SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion4, ChaloTheme.b(composer2, 0).k), ChaloTheme.b(composer2, 0).k), f), companion5.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 120);
                    Modifier modifierA = i41.a(rowScopeInstance2, PaddingKt.m788paddingqDBjuR0$default(companion4, ChaloTheme.b(composer2, 0).g, 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierA);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                    pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CHALO_WALLET, new Object[0], composer2, 6), columnScopeInstance.align(AlphaKt.alpha(companion4, f), companion5.getStart()), ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131064);
                    if (walletSubTextProperties.b.length() > 0) {
                        composer2.startReplaceGroup(1746594505);
                        if (walletSubTextProperties.f3961a) {
                            composer2.startReplaceGroup(1747096829);
                            companion = companion4;
                            TextKt.m2623TextNvy7gAk(walletSubTextProperties.b, columnScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(companion4, 0.0f, ChaloTheme.b(composer2, 0).e, 0.0f, 0.0f, 13, null), companion5.getStart()), ChaloTheme.a(composer2, 0).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131064);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1746652351);
                            TextKt.m2623TextNvy7gAk(walletSubTextProperties.b, columnScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(companion4, 0.0f, ChaloTheme.b(composer2, 0).e, 0.0f, 0.0f, 13, null), companion5.getStart()), ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131064);
                            composer2.endReplaceGroup();
                            companion = companion4;
                        }
                    } else {
                        companion = companion4;
                        composer2.startReplaceGroup(1737149673);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (str.length() > 0) {
                        composer2.startReplaceGroup(1734489029);
                        TextKt.m2623TextNvy7gAk(str, SizeKt.wrapContentSize$default(rowScopeInstance2.align(companion, companion5.getTop()), null, false, 3, null), ChaloTheme.a(composer2, 0).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer2, 0)), composer2, 0, 24960, 110584);
                    } else {
                        composer2.startReplaceGroup(1724029939);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 3:
                PassPurchaseNudgeCardUIState passPurchaseNudgeCardUIState = (PassPurchaseNudgeCardUIState) obj5;
                NoRideAvailableForSelectedTimeUIState noRideAvailableForSelectedTimeUIState = (NoRideAvailableForSelectedTimeUIState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1078539538, iIntValue3, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotPageContent.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionScreen.kt:479)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion8, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    if (!z || passPurchaseNudgeCardUIState == null) {
                        composer3.startReplaceGroup(-891573398);
                    } else {
                        composer3.startReplaceGroup(-870537201);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, ChaloTheme.b(composer3, 0).h), composer3, 0);
                        PremiumBusSlotSelectionUiStateKt.i(PaddingKt.m786paddingVpY3zN4$default(companion7, ChaloTheme.b(composer3, 0).h, 0.0f, 2, null), passPurchaseNudgeCardUIState, composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    if (noRideAvailableForSelectedTimeUIState == null || z) {
                        composer3.startReplaceGroup(-891573398);
                    } else {
                        composer3.startReplaceGroup(-870133891);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, ChaloTheme.b(composer3, 0).h), composer3, 0);
                        Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion7, ChaloTheme.b(composer3, 0).h, 0.0f, 2, null);
                        UIShape.Rectangle rectangle = UIShape.f1926a;
                        PremiumBusSlotSelectionUiStateKt.d(modifierM786paddingVpY3zN4$default, noRideAvailableForSelectedTimeUIState, composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            default:
                PBOdPairWithSlotsCardUISpecs pBOdPairWithSlotsCardUISpecs = (PBOdPairWithSlotsCardUISpecs) obj5;
                PBOdPairWithSlotsCardUIState pBOdPairWithSlotsCardUIState = (PBOdPairWithSlotsCardUIState) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1351744212, iIntValue4, -1, "app.chalo.premiumbus.ui.slotselection.ODPairWithSlotsCard.<anonymous> (PremiumBusSlotSelectionUiState.kt:853)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), pBOdPairWithSlotsCardUISpecs.f7821a);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement2.getTop();
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top, companion10.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, modifierC);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion11.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion11, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    ODPairTagsUIState oDPairTagsUIState = pBOdPairWithSlotsCardUIState.b;
                    StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = pBOdPairWithSlotsCardUIState.j;
                    if (oDPairTagsUIState != null) {
                        composer4.startReplaceGroup(-1415199702);
                        ChaloTextViewKt.a(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(companion9, ChaloColorTokenKt.c(oDPairTagsUIState.b), ChaloThemeKt.d(oDPairTagsUIState.c)), oDPairTagsUIState.d), oDPairTagsUIState.f7815a, null, null, composer4, 0, 12);
                        i = 0;
                        gf.r(companion9, pBOdPairWithSlotsCardUISpecs.k, composer4, 0);
                    } else {
                        i = 0;
                        composer4.startReplaceGroup(-1450497728);
                        composer4.endReplaceGroup();
                    }
                    Modifier modifierHeight = IntrinsicKt.height(companion9, IntrinsicSize.Min);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion10.getCenterVertically(), composer4, 48);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, i);
                    int i8 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, modifierHeight);
                    Function0<ComposeUiNode> constructor6 = companion11.getConstructor();
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
                    pk0.v(companion11, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl6, Integer.valueOf(i8), composerM3915constructorimpl6));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    PremiumBusSlotSelectionUiStateKt.b(SizeKt.fillMaxHeight(companion9, 0.9f), composer4, 6);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion9, pBOdPairWithSlotsCardUISpecs.j), composer4, 0);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion10.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer4, companion9);
                    Function0<ComposeUiNode> constructor7 = companion11.getConstructor();
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
                    pk0.v(companion11, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl7, Integer.valueOf(i9), composerM3915constructorimpl7));
                    PremiumBusSlotSelectionUiStateKt.s(pBOdPairWithSlotsCardUIState.c, pBOdPairWithSlotsCardUIState.e, composer4, 0);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion9, pBOdPairWithSlotsCardUISpecs.i), composer4, 0);
                    PremiumBusSlotSelectionUiStateKt.s(pBOdPairWithSlotsCardUIState.d, pBOdPairWithSlotsCardUIState.f, composer4, 0);
                    composer4.endNode();
                    composer4.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion9, pBOdPairWithSlotsCardUISpecs.f), composer4, 0);
                    PremiumBusSlotSelectionUiStateKt.h(pBOdPairWithSlotsCardUIState.h, z, composer4, 0);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion9, pBOdPairWithSlotsCardUISpecs.g), composer4, 0);
                    if (errorWithMsgAndRetry != null) {
                        composer4.startReplaceGroup(-1413519161);
                        StandardErrorScreenKt.c(errorWithMsgAndRetry, null, composer4, 0, 2);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-1413406166);
                        composer4.startReplaceGroup(-738329823);
                        for (PbSlotCardUIState pbSlotCardUIState : pBOdPairWithSlotsCardUIState.g) {
                            Modifier.Companion companion12 = Modifier.INSTANCE;
                            PremiumBusSlotSelectionUiStateKt.q(companion12, pbSlotCardUIState, z, composer4, 6);
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion12, pBOdPairWithSlotsCardUISpecs.e), composer4, 0);
                        }
                        composer4.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, pBOdPairWithSlotsCardUISpecs.h), composer4, 0);
                        OutlinedButtonUIState outlinedButtonUIState = pBOdPairWithSlotsCardUIState.i;
                        if (outlinedButtonUIState == null) {
                            composer4.startReplaceGroup(-1412945321);
                        } else {
                            composer4.startReplaceGroup(-1412945320);
                            PremiumBusSlotSelectionUiStateKt.h(outlinedButtonUIState, z, composer4, 0);
                        }
                        composer4.endReplaceGroup();
                        composer4.endReplaceGroup();
                    }
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ n20(Function0 function0, Function0 function1, boolean z) {
        this.f18447a = 1;
        this.c = function0;
        this.b = z;
        this.d = function1;
    }

    public /* synthetic */ n20(boolean z, Object obj, Object obj2, int i) {
        this.f18447a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
