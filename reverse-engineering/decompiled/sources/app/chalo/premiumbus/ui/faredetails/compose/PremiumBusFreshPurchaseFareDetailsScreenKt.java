package app.chalo.premiumbus.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.divider.DashedDividerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusCouponCardUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusCouponCardUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusDiscountTagUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTermsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitRowUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOfferCardUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOffersSectionUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOffersSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerCounterUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerDetailsSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerDetailsUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerRowUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSectionNoteUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSectionNoteUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusTncSectionUISpecs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.au0;
import defpackage.b3;
import defpackage.bu0;
import defpackage.eq0;
import defpackage.gf;
import defpackage.hi;
import defpackage.i41;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.qj;
import defpackage.r1;
import defpackage.u50;
import defpackage.wm0;
import defpackage.zt0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFreshPurchaseFareDetailsScreenKt {
    public static final void a(PremiumBusCouponCardUiState premiumBusCouponCardUiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1613279831);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusCouponCardUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613279831, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusCouponCard (PremiumBusFreshPurchaseFareDetailsScreen.kt:117)");
            }
            PremiumBusCouponCardUISpecs premiumBusCouponCardUISpecs = premiumBusCouponCardUiState.e;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Brush.Companion.m4560linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(premiumBusCouponCardUISpecs.f7563a)), Color.m4595boximpl(ChaloColorTokenKt.c(premiumBusCouponCardUISpecs.b))), 0L, 0L, 0, 14, (Object) null), ChaloThemeKt.d(premiumBusCouponCardUISpecs.c), 0.0f, 4, null), premiumBusCouponCardUISpecs.d);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(premiumBusCouponCardUiState.f7564a, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(modifier2, premiumBusCouponCardUISpecs.e), composerStartRestartGroup, 0);
            Modifier modifierA = i41.a(rowScopeInstance, modifier2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, premiumBusCouponCardUiState.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            TextUIState.ChaloTextUIState chaloTextUIState = premiumBusCouponCardUiState.c;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1524589455);
            } else {
                composerStartRestartGroup.startReplaceGroup(1524589456);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            CommonImageKt.a(premiumBusCouponCardUiState.d, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(premiumBusCouponCardUiState, modifier2, i, 23));
        }
    }

    public static final void b(PremiumBusDiscountTagUiState premiumBusDiscountTagUiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1982214471);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusDiscountTagUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1982214471, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusDiscountTag (PremiumBusFreshPurchaseFareDetailsScreen.kt:251)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(premiumBusDiscountTagUiState.b), ChaloThemeKt.d(premiumBusDiscountTagUiState.c)), premiumBusDiscountTagUiState.d);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
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
            ChaloTextViewKt.a(null, premiumBusDiscountTagUiState.f7565a, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(premiumBusDiscountTagUiState, modifier, i, 24));
        }
    }

    public static final void c(PremiumBusFareSplitRowUiState premiumBusFareSplitRowUiState, float f, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1725076507);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(premiumBusFareSplitRowUiState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1725076507, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareSplitRow (PremiumBusFreshPurchaseFareDetailsScreen.kt:323)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ChaloTextViewKt.a(i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), premiumBusFareSplitRowUiState.f7615a, null, null, composerStartRestartGroup, 0, 12);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, premiumBusFareSplitRowUiState.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(premiumBusFareSplitRowUiState, f, modifier2, i, 5));
        }
    }

    public static final void d(PremiumBusFareSplitSectionUiState section, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(section, "section");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2599241);
        int i2 = ((i & 6) == 0 ? (composerStartRestartGroup.changed(section) ? 4 : 2) | i : i) | 48;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2599241, i2, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareSplitSection (PremiumBusFreshPurchaseFareDetailsScreen.kt:285)");
            }
            PremiumBusFareSplitUISpecs premiumBusFareSplitUISpecs = section.e;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = premiumBusFareSplitUISpecs.f7617a;
            float f = premiumBusFareSplitUISpecs.f;
            float f2 = premiumBusFareSplitUISpecs.e;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), premiumBusFareSplitUISpecs.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, section.f7616a, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusFareSplitUISpecs.c), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1525878856);
            int i4 = 0;
            for (Object obj : section.b) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                PremiumBusFareSplitRowUiState premiumBusFareSplitRowUiState = (PremiumBusFareSplitRowUiState) obj;
                if (i4 > 0) {
                    composerStartRestartGroup.startReplaceGroup(1177290170);
                    gf.r(Modifier.INSTANCE, premiumBusFareSplitUISpecs.d, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1166086708);
                    composerStartRestartGroup.endReplaceGroup();
                }
                c(premiumBusFareSplitRowUiState, f, null, composerStartRestartGroup, 0);
                i4 = i5;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f2), composerStartRestartGroup, 0);
            DashedDividerKt.a(section.d, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f2), composerStartRestartGroup, 0);
            c(section.c, f, null, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(section, modifier2, i, 26));
        }
    }

    public static final void e(PremiumBusFareDetailsContent.FreshPurchase content, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(343822006);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(content) : composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(343822006, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsContent (PremiumBusFreshPurchaseFareDetailsScreen.kt:71)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PremiumBusOffersSectionUiState premiumBusOffersSectionUiState = content.f7574a;
            if (premiumBusOffersSectionUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-896813554);
            } else {
                composerStartRestartGroup.startReplaceGroup(-896813553);
                g(premiumBusOffersSectionUiState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusSectionNoteUiState premiumBusSectionNoteUiState = content.b;
            if (premiumBusSectionNoteUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-896721639);
            } else {
                composerStartRestartGroup.startReplaceGroup(-896721638);
                k(premiumBusSectionNoteUiState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState = content.c;
            if (premiumBusPassengerDetailsSectionUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-896645782);
            } else {
                composerStartRestartGroup.startReplaceGroup(-896645781);
                i(premiumBusPassengerDetailsSectionUiState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState = content.d;
            if (premiumBusFareSplitSectionUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-896562671);
            } else {
                composerStartRestartGroup.startReplaceGroup(-896562670);
                d(premiumBusFareSplitSectionUiState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState = content.e;
            if (premiumBusFareDetailsTermsUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-896477545);
            } else {
                composerStartRestartGroup.startReplaceGroup(-896477544);
                l(premiumBusFareDetailsTermsUiState, null, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(content, modifier, i, 27));
        }
    }

    public static final void f(PremiumBusFareDetailsUiState state, PremiumBusFareDetailsContent content, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-606737742);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(content) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606737742, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreen (PremiumBusFreshPurchaseFareDetailsScreen.kt:46)");
            }
            PremiumBusFareDetailsScaffoldKt.b(state, companion, null, ComposableLambdaKt.rememberComposableLambda(1013989445, true, new zt0(0, content, state), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1590758956, true, new u50(29, content, state), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 27648 | ((i3 >> 3) & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new au0(state, content, modifier2, i, 0));
        }
    }

    public static final void g(PremiumBusOffersSectionUiState premiumBusOffersSectionUiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-669944399);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusOffersSectionUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-669944399, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusOffersSection (PremiumBusFreshPurchaseFareDetailsScreen.kt:89)");
            }
            PremiumBusOffersSectionUISpecs premiumBusOffersSectionUISpecs = premiumBusOffersSectionUiState.c;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusOffersSectionUISpecs.f7623a), null, 2, null), premiumBusOffersSectionUISpecs.b);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ChaloTextViewKt.a(null, premiumBusOffersSectionUiState.f7624a, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusOffersSectionUISpecs.c), composerStartRestartGroup, 0);
            PremiumBusOfferCardUiState premiumBusOfferCardUiState = premiumBusOffersSectionUiState.b;
            if (premiumBusOfferCardUiState instanceof PremiumBusOfferCardUiState.Coupon) {
                composerStartRestartGroup.startReplaceGroup(-892121757);
                a(((PremiumBusOfferCardUiState.Coupon) premiumBusOfferCardUiState).f7620a, null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(premiumBusOfferCardUiState instanceof PremiumBusOfferCardUiState.PassUpsell)) {
                    throw pk0.p(composerStartRestartGroup, -892124575);
                }
                composerStartRestartGroup.startReplaceGroup(-892118575);
                PremiumBusFareDetailsCommonViewsKt.d(((PremiumBusOfferCardUiState.PassUpsell) premiumBusOfferCardUiState).f7621a, null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusOffersSectionUISpecs.d), composerStartRestartGroup, 0);
            m(premiumBusOffersSectionUISpecs.e, 0, ChaloColorTokenKt.c(premiumBusOffersSectionUISpecs.f), composerStartRestartGroup, null);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(premiumBusOffersSectionUiState, modifier2, i, 22));
        }
    }

    public static final void h(PremiumBusPassengerCounterUiState premiumBusPassengerCounterUiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2080691945);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusPassengerCounterUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2080691945, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassengerCounter (PremiumBusFreshPurchaseFareDetailsScreen.kt:266)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(premiumBusPassengerCounterUiState.f7625a, null, false, composerStartRestartGroup, 384, 2);
            ChaloTextViewKt.a(PaddingKt.m786paddingVpY3zN4$default(modifier, premiumBusPassengerCounterUiState.d, 0.0f, 2, null), premiumBusPassengerCounterUiState.b, null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup = composerStartRestartGroup;
            CommonImageKt.a(premiumBusPassengerCounterUiState.c, null, false, composerStartRestartGroup, 384, 2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(premiumBusPassengerCounterUiState, modifier, i, 25));
        }
    }

    public static final void i(PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        float f;
        Object obj;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1219997967);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusPassengerDetailsSectionUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        int i5 = 0;
        int i6 = 1;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1219997967, i4, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassengerDetailsSection (PremiumBusFreshPurchaseFareDetailsScreen.kt:174)");
            }
            PremiumBusPassengerDetailsUISpecs premiumBusPassengerDetailsUISpecs = premiumBusPassengerDetailsSectionUiState.b;
            float f2 = 0.0f;
            Object obj2 = null;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, premiumBusPassengerDetailsUISpecs.b, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            char c = ' ';
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1585593709);
            ArrayList arrayList = premiumBusPassengerDetailsSectionUiState.f7626a;
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj3 = arrayList.get(i8);
                i8++;
                PremiumBusPassengerRowUiState premiumBusPassengerRowUiState = (PremiumBusPassengerRowUiState) obj3;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, f2, i6, obj2);
                char c2 = c;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i5);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i5);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c2));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                j(premiumBusPassengerRowUiState, premiumBusPassengerDetailsUISpecs, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), premiumBusPassengerDetailsUISpecs.f7627a), composerStartRestartGroup, 0);
                DividerUIState dividerUIState = premiumBusPassengerRowUiState.g;
                if (dividerUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(1429441163);
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(companion2, 0.0f, premiumBusPassengerDetailsUISpecs.c, 0.0f, 0.0f, 13, null), 0.0f, 1, null), dividerUIState.f10017a), ChaloColorTokenKt.c(dividerUIState.b), null, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    f = 0.0f;
                    obj = null;
                    i3 = 1;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1429795958);
                    f = 0.0f;
                    obj = null;
                    i3 = 1;
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(companion2, 0.0f, premiumBusPassengerDetailsUISpecs.c, 0.0f, 0.0f, 13, null), 0.0f, 1, null), premiumBusPassengerDetailsUISpecs.f), ChaloColorTokenKt.c(premiumBusPassengerDetailsUISpecs.g), null, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                c = c2;
                f2 = f;
                obj2 = obj;
                i6 = i3;
                i5 = 0;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(premiumBusPassengerDetailsSectionUiState, modifier2, i, 0));
        }
    }

    public static final void j(PremiumBusPassengerRowUiState premiumBusPassengerRowUiState, PremiumBusPassengerDetailsUISpecs premiumBusPassengerDetailsUISpecs, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(742556368);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusPassengerRowUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(premiumBusPassengerDetailsUISpecs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(742556368, i2, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassengerRow (PremiumBusFreshPurchaseFareDetailsScreen.kt:215)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            RadioButtonUIState radioButtonUIState = premiumBusPassengerRowUiState.e;
            if (radioButtonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1743529112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1743529111);
                ChaloRadioButtonKt.a(null, radioButtonUIState, composerStartRestartGroup, 0, 1);
                nf1.t(Modifier.INSTANCE, premiumBusPassengerDetailsUISpecs.d, composerStartRestartGroup, 0);
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierA = i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, premiumBusPassengerRowUiState.f7628a, null, null, composerStartRestartGroup, 0, 13);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
            ChaloTextViewKt.a(null, premiumBusPassengerRowUiState.b, null, null, composerStartRestartGroup, 0, 13);
            TextUIState.ChaloTextUIState chaloTextUIState = premiumBusPassengerRowUiState.c;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(2023992523);
            } else {
                composerStartRestartGroup.startReplaceGroup(2023992524);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, premiumBusPassengerDetailsUISpecs.e), composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusDiscountTagUiState premiumBusDiscountTagUiState = premiumBusPassengerRowUiState.d;
            if (premiumBusDiscountTagUiState == null) {
                composerStartRestartGroup.startReplaceGroup(2024199045);
            } else {
                composerStartRestartGroup.startReplaceGroup(2024199046);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, premiumBusPassengerDetailsUISpecs.e), composerStartRestartGroup, 0);
                b(premiumBusDiscountTagUiState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            PremiumBusPassengerCounterUiState premiumBusPassengerCounterUiState = premiumBusPassengerRowUiState.f;
            if (premiumBusPassengerCounterUiState == null) {
                composerStartRestartGroup.startReplaceGroup(640685817);
            } else {
                composerStartRestartGroup.startReplaceGroup(640685818);
                h(premiumBusPassengerCounterUiState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(premiumBusPassengerRowUiState, premiumBusPassengerDetailsUISpecs, modifier, i, 16));
        }
    }

    public static final void k(PremiumBusSectionNoteUiState premiumBusSectionNoteUiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1416136067);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusSectionNoteUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1416136067, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusSectionNote (PremiumBusFreshPurchaseFareDetailsScreen.kt:151)");
            }
            PremiumBusSectionNoteUISpecs premiumBusSectionNoteUISpecs = premiumBusSectionNoteUiState.c;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusSectionNoteUISpecs.b), composerStartRestartGroup, 0);
            m(premiumBusSectionNoteUISpecs.c, 0, ChaloColorTokenKt.c(premiumBusSectionNoteUISpecs.d), composerStartRestartGroup, null);
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), premiumBusSectionNoteUISpecs.f7631a);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusSectionNoteUISpecs.e), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), premiumBusSectionNoteUiState.f7632a, null, null, composerStartRestartGroup, 6, 12);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusSectionNoteUISpecs.f), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), premiumBusSectionNoteUiState.b, null, null, composerStartRestartGroup, 6, 12);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(premiumBusSectionNoteUiState, modifier2, i, 29));
        }
    }

    public static final void l(PremiumBusFareDetailsTermsUiState section, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(section, "section");
        Composer composerStartRestartGroup = composer.startRestartGroup(-999396722);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(section) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-999396722, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusTncSection (PremiumBusFreshPurchaseFareDetailsScreen.kt:338)");
            }
            PremiumBusTncSectionUISpecs premiumBusTncSectionUISpecs = section.d;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            m(premiumBusTncSectionUISpecs.b, 0, ChaloColorTokenKt.c(premiumBusTncSectionUISpecs.c), composerStartRestartGroup, null);
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), premiumBusTncSectionUISpecs.f7636a);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusTncSectionUISpecs.d), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, section.f7612a, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, premiumBusTncSectionUISpecs.e), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(331775409);
            Iterator it = section.b.iterator();
            while (it.hasNext()) {
                ChaloTextViewKt.a(null, (TextUIState.ChaloTextUIState) it.next(), null, null, composerStartRestartGroup, 0, 13);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, premiumBusTncSectionUISpecs.f), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, premiumBusTncSectionUISpecs.g), composerStartRestartGroup, 0);
            TextKt.c(section.c, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, premiumBusTncSectionUISpecs.h), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(section, modifier2, i, 28));
        }
    }

    public static final void m(float f, int i, long j, Composer composer, Modifier modifier) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(108534775);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(108534775, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.SectionBreak (PremiumBusFreshPurchaseFareDetailsScreen.kt:369)");
            }
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f), j, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qj(f, j, modifier2, i));
        }
    }
}
