package app.chalo.premiumbus.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOfferHeaderStripUiState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import defpackage.eq0;
import defpackage.gf;
import defpackage.hk;
import defpackage.pk0;
import defpackage.tt0;
import defpackage.u50;
import defpackage.xm0;
import defpackage.xo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsCommonViewsKt {
    public static final void a(Function2 strip, Modifier modifier, Shape shape, float f, Function3 card, Composer composer, int i) {
        int i2;
        Intrinsics.i(strip, "strip");
        Intrinsics.i(card, "card");
        Composer composerStartRestartGroup = composer.startRestartGroup(24246323);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(strip) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(card) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(24246323, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusCardBehindStrip (PremiumBusFareDetailsCommonViews.kt:122)");
            }
            int i4 = i3 >> 3;
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), shape, f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1071907374, true, new xo0(f, 2, strip, shape, card), composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 112) | 24576 | (i4 & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tt0(strip, modifier, shape, f, card, i));
        }
    }

    public static final void b(Modifier modifier, Function3 content, Composer composer, int i) {
        Object obj;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-421114746);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-421114746, i2, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsBand (PremiumBusFareDetailsCommonViews.kt:39)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            int i3 = (i2 << 6) & 7168;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            content.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i3 >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            boolean zX = gf.x(companion, ChaloTheme.b(composerStartRestartGroup, 0).c, composerStartRestartGroup, 0);
            obj = companion;
            if (zX) {
                ComposerKt.traceEventEnd();
                obj = companion;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            obj = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(obj, content, i, 14));
        }
    }

    public static final void c(PremiumBusOfferHeaderStripUiState strip, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(strip, "strip");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1729817607);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(strip) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1729817607, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusOfferHeaderStrip (PremiumBusFareDetailsCommonViews.kt:143)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Brush.Companion companion = Brush.INSTANCE;
            List list = strip.c;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m4566verticalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), strip.d);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            CommonImageKt.a(strip.f7622a, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, strip.e), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, strip.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(strip, modifier2, i, 17));
        }
    }

    public static final void d(PassUpsellOfferCardUiState offerCard, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(offerCard, "offerCard");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1398992420);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(offerCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1398992420, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassUpsellOfferCard (PremiumBusFareDetailsCommonViews.kt:54)");
            }
            PassUpsellOfferCardUISpecs passUpsellOfferCardUISpecs = offerCard.h;
            a(ComposableLambdaKt.rememberComposableLambda(1737756054, true, new xm0(offerCard, 4), composerStartRestartGroup, 54), companion, ChaloThemeKt.d(passUpsellOfferCardUISpecs.b), passUpsellOfferCardUISpecs.c, ComposableLambdaKt.rememberComposableLambda(1828877698, true, new u50(26, passUpsellOfferCardUISpecs, offerCard), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | 24582);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(offerCard, modifier, i, 16));
        }
    }

    public static final void e(ButtonUIState payButtonUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(payButtonUIState, "payButtonUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1237447341);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(payButtonUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 3504;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1237447341, i3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusSimpleFareDetailsFooter (PremiumBusFareDetailsCommonViews.kt:163)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CardDefaults.$stable << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(-170490719, true, new hk(payButtonUIState, 2), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 22);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(payButtonUIState, modifier, i, 15));
        }
    }
}
