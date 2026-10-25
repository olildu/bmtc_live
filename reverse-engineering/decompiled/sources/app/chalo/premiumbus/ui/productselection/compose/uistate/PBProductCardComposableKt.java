package app.chalo.premiumbus.ui.productselection.compose.uistate;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerKt;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import app.chalo.premiumbus.compose.ProductOfferBadgeKt;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposableKt;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import coil3.size.Size;
import defpackage.c0;
import defpackage.g2;
import defpackage.h0;
import defpackage.hk;
import defpackage.i41;
import defpackage.kn0;
import defpackage.pk0;
import defpackage.u6;
import defpackage.zk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/compose/PricingEngineRuleExpiryBannerUIState;", "bannerState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBProductCardComposableKt {
    public static final void a(Modifier modifier, ProductLabelUiState productLabel, Composer composer, int i) {
        Intrinsics.i(productLabel, "productLabel");
        ProductLabelSpecs productLabelSpecs = productLabel.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(644048062);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(productLabel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(644048062, i2, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.ChaloLabelText (PBProductCardComposable.kt:297)");
            }
            ChaloTextViewKt.a(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(productLabelSpecs.b), ChaloThemeKt.d(productLabelSpecs.c)), productLabelSpecs.f7711a), productLabel.f7712a, null, null, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, productLabel, i, 12));
        }
    }

    public static final void b(PBProductCardUiState pBProductCardUiState, PremiumBusProductSelectionSpecs specs, Size size, Function2 imageSizeUpdate, Composer composer, int i) {
        int i2;
        Object obj;
        Intrinsics.i(specs, "specs");
        Intrinsics.i(imageSizeUpdate, "imageSizeUpdate");
        Composer composerStartRestartGroup = composer.startRestartGroup(-207710036);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pBProductCardUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(specs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = size;
            i2 |= composerStartRestartGroup.changedInstance(obj) ? 256 : 128;
        } else {
            obj = size;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(imageSizeUpdate) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207710036, i2, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposable (PBProductCardComposable.kt:99)");
            }
            PbProductCardUISpecs pbProductCardUISpecs = pBProductCardUiState.f7703a;
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloThemeKt.d(pbProductCardUISpecs.b), pbProductCardUISpecs.c, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1245042741, true, new c0(pBProductCardUiState, obj, specs, imageSizeUpdate, 11), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 21, pBProductCardUiState, specs, size, imageSizeUpdate));
        }
    }

    public static final void c(final PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, final Long l, final PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState, final Modifier modifier, Composer composer, final int i) {
        int i2;
        PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState2;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1092233531);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusProductSelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            pricingEngineRuleExpiryBannerUIState2 = pricingEngineRuleExpiryBannerUIState;
            i2 |= composerStartRestartGroup.changed(pricingEngineRuleExpiryBannerUIState2) ? 256 : 128;
        } else {
            pricingEngineRuleExpiryBannerUIState2 = pricingEngineRuleExpiryBannerUIState;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1092233531, i3, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardExpiryBanner (PBProductCardComposable.kt:231)");
            }
            if (l == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                final PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState3 = pricingEngineRuleExpiryBannerUIState2;
                function2 = new Function2() { // from class: so0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).intValue();
                                PBProductCardComposableKt.c(premiumBusProductSelectionComponent, l, pricingEngineRuleExpiryBannerUIState3, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                PBProductCardComposableKt.c(premiumBusProductSelectionComponent, l, pricingEngineRuleExpiryBannerUIState3, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                modifier2 = modifier;
                boolean zChanged = composerStartRestartGroup.changed(premiumBusProductSelectionComponent) | ((i3 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    long jLongValue = l.longValue();
                    PricingEngineRuleExpiryTickerDelegate pricingEngineRuleExpiryTickerDelegate = premiumBusProductSelectionComponent.D;
                    ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().f);
                    UIShape backgroundShape = ChaloThemeHelper.d.f1923a;
                    pricingEngineRuleExpiryTickerDelegate.getClass();
                    Intrinsics.i(backgroundShape, "backgroundShape");
                    PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1 pricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1 = new PricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(pricingEngineRuleExpiryTickerDelegate.d), pricingEngineRuleExpiryTickerDelegate, jLongValue, chaloPadding, backgroundShape);
                    composerStartRestartGroup.updateRememberedValue(pricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1);
                    objRememberedValue = pricingEngineRuleExpiryTickerDelegate$bannerFlow$$inlined$map$1;
                }
                composer2 = composerStartRestartGroup;
                PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState4 = (PricingEngineRuleExpiryBannerUIState) SnapshotStateKt.collectAsState((Flow) objRememberedValue, pricingEngineRuleExpiryBannerUIState, null, composer2, (i3 >> 3) & 112, 2).getValue();
                if (pricingEngineRuleExpiryBannerUIState4 == null) {
                    composer2.startReplaceGroup(57317992);
                } else {
                    composer2.startReplaceGroup(57317993);
                    PricingEngineRuleExpiryBannerKt.a(pricingEngineRuleExpiryBannerUIState4, modifier2, composer2, (i3 >> 6) & 112);
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        modifier2 = modifier;
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            final Modifier modifier3 = modifier2;
            function2 = new Function2() { // from class: so0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).intValue();
                            PBProductCardComposableKt.c(premiumBusProductSelectionComponent, l, pricingEngineRuleExpiryBannerUIState, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            PBProductCardComposableKt.c(premiumBusProductSelectionComponent, l, pricingEngineRuleExpiryBannerUIState, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void d(final PBProductCardUiState pBProductCardUiState, PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, final PremiumBusProductSelectionSpecs specs, Size size, final Function2 imageSizeUpdate, Composer composer, int i) {
        int i2;
        PremiumBusProductSelectionComponent premiumBusProductSelectionComponent2;
        Size size2;
        PbProductCardUISpecs pbProductCardUISpecs = pBProductCardUiState.f7703a;
        Intrinsics.i(specs, "specs");
        Intrinsics.i(imageSizeUpdate, "imageSizeUpdate");
        Composer composerStartRestartGroup = composer.startRestartGroup(-573659590);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pBProductCardUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            premiumBusProductSelectionComponent2 = premiumBusProductSelectionComponent;
            i2 |= composerStartRestartGroup.changedInstance(premiumBusProductSelectionComponent2) ? 32 : 16;
        } else {
            premiumBusProductSelectionComponent2 = premiumBusProductSelectionComponent;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(specs) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            size2 = size;
            i2 |= composerStartRestartGroup.changedInstance(size2) ? 2048 : 1024;
        } else {
            size2 = size;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(imageSizeUpdate) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-573659590, i2, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardMainComposable (PBProductCardComposable.kt:61)");
            }
            final PremiumBusProductSelectionComponent premiumBusProductSelectionComponent3 = premiumBusProductSelectionComponent2;
            final Size size3 = size2;
            ChaloRoundedCardKt.b(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, pbProductCardUISpecs.h, 0.0f, 2, null), ChaloThemeKt.d(pbProductCardUISpecs.b), pbProductCardUISpecs.c, 0.0f, ComposableLambdaKt.rememberComposableLambda(1482975833, true, new Function3() { // from class: app.chalo.premiumbus.ui.productselection.compose.uistate.a
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1482975833, iIntValue, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardMainComposable.<anonymous> (PBProductCardComposable.kt:68)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null);
                        MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer2);
                        IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composer2);
                        PBProductCardUiState pBProductCardUiState2 = pBProductCardUiState;
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = pBProductCardUiState2.k;
                        boolean zChangedInstance = composer2.changedInstance(uiEventHandler$Companion$fromLambda$1);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PBProductCardComposableKt$PBProductCardMainComposable$1$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM264backgroundbw27NRU$default, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) ((KFunction) objRememberedValue), 28, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM295clickableO2vRcR0$default);
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
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        PBProductCardComposableKt.c(premiumBusProductSelectionComponent3, pBProductCardUiState2.i, pBProductCardUiState2.j, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer2, 3072);
                        PBProductCardComposableKt.b(pBProductCardUiState2, specs, size3, imageSizeUpdate, composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(pBProductCardUiState, premiumBusProductSelectionComponent, specs, size, imageSizeUpdate, i, 21));
        }
    }

    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v29 */
    public static final void e(ButtonUIState buttonUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.StyledTextUIState styledTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, BorderUISpec highlightedBtnBorderUiSpec, OfferTagUIState offerTagUIState, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        ?? r4;
        Object obj;
        boolean z;
        int i4;
        Intrinsics.i(highlightedBtnBorderUiSpec, "highlightedBtnBorderUiSpec");
        UIShape uIShape = highlightedBtnBorderUiSpec.c;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1017817531);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(buttonUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTextUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(styledTextUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTextUIState2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(highlightedBtnBorderUiSpec) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(offerTagUIState) : composerStartRestartGroup.changedInstance(offerTagUIState) ? 131072 : 65536;
        }
        int i5 = i2;
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1017817531, i5, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PbProductItemCardPlanHighlightComposable (PBProductCardComposable.kt:250)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (styledTextUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1437478777);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (offerTagUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1021614038);
                    composerStartRestartGroup.endReplaceGroup();
                    obj = null;
                    z = false;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1021614037);
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    obj = null;
                    ProductOfferBadgeKt.a(offerTagUIState, null, composerStartRestartGroup, (i5 >> 15) & 14, 2);
                    z = false;
                    ChaloSpacersKt.t(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1021458046);
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = 48;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1021458045);
                    i4 = 48;
                    ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                    composerStartRestartGroup.endReplaceGroup();
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, i4);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion = companion2;
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (!(composerStartRestartGroup.getApplier() != null)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                if (chaloTextUIState2 != null) {
                    composerStartRestartGroup.startReplaceGroup(393661055);
                    TextKt.c(chaloTextUIState2, null, null, null, composerStartRestartGroup, (i5 >> 9) & 14, 14);
                    ChaloSpacersKt.C(composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(381394820);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = 3;
                r4 = 1;
                TextKt.b(null, styledTextUIState, composerStartRestartGroup, (i5 >> 3) & 112, 1);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
            } else {
                companion = companion2;
                i3 = 3;
                r4 = 1;
                composerStartRestartGroup.startReplaceGroup(1425598585);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1438144935);
            } else {
                composerStartRestartGroup.startReplaceGroup(1438144936);
                SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifierClip = ClipKt.clip(SizeKt.m814height3ABfNKs(companion, buttonUIState.g), ChaloThemeKt.d(uIShape));
                long jC = ChaloColorTokenKt.c(highlightedBtnBorderUiSpec.b);
                RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(uIShape);
                ButtonElevation buttonElevationM1677elevatedButtonElevationR_JCAzs = ButtonDefaults.INSTANCE.m1677elevatedButtonElevationR_JCAzs(ChaloThemeHelper.b().f1917a, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, ButtonDefaults.$stable << 15, 30);
                boolean zChanged = composerStartRestartGroup.changed(buttonUIState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new kn0(buttonUIState, i3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloFilledButtonKt.b(modifierClip, jC, 0L, roundedCornerShapeD, null, buttonElevationM1677elevatedButtonElevationR_JCAzs, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(688431004, r4, new hk(buttonUIState, r4), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 20);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new g2(buttonUIState, chaloTextUIState, styledTextUIState, chaloTextUIState2, highlightedBtnBorderUiSpec, offerTagUIState, i, 8));
        }
    }
}
