package app.chalo.multimodalticket.ui.composables;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.multimodalticket.ui.FullJourneyTicketCardUISpecs;
import app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.image.ImageUIState;
import defpackage.b3;
import defpackage.c6;
import defpackage.ox;
import defpackage.pk0;
import defpackage.w00;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FullJourneyTicketCardComposableKt {
    public static final void a(FullJourneyTicketCardUIState state, Composer composer, int i) {
        int i2;
        Modifier modifierA;
        Intrinsics.i(state, "state");
        FullJourneyTicketCardUISpecs fullJourneyTicketCardUISpecs = state.f5926a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934234610);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934234610, i2, -1, "app.chalo.multimodalticket.ui.composables.FullJourneyTicketCardComposable (FullJourneyTicketCardComposable.kt:26)");
            }
            Modifier modifier = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            BorderUISpec borderUISpec = fullJourneyTicketCardUISpecs.c;
            if (borderUISpec != null && (modifierA = BorderUISpecKt.a(modifier, borderUISpec)) != null) {
                modifier = modifierA;
            }
            ChaloRoundedCardKt.b(ComposeUtilsKt.b(modifierFillMaxWidth$default.then(modifier), state.h, composerStartRestartGroup, 0, 6), ChaloThemeKt.d(fullJourneyTicketCardUISpecs.d), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1286929299, true, new c6(state, 26), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(state, i, 18));
        }
    }

    public static final void b(Modifier modifier, FullJourneyTicketCardUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(state, "state");
        ArrayList arrayList = state.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1094266657);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1094266657, i2, -1, "app.chalo.multimodalticket.ui.composables.ModeIconsRowComposable (FullJourneyTicketCardComposable.kt:76)");
            }
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(modifier, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
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
            composerStartRestartGroup.startReplaceGroup(1795698825);
            int size = arrayList.size();
            int i5 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                int i6 = i3 + 1;
                int i7 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                CommonImageKt.a((ImageUIState) obj, null, false, composerStartRestartGroup, 0, 6);
                if (CollectionsKt.K(arrayList) != i5) {
                    composerStartRestartGroup.startReplaceGroup(313550142);
                    CommonImageKt.a(state.e, ChaloThemeKt.c(Modifier.INSTANCE, state.f5926a.e), false, composerStartRestartGroup, 0, 4);
                } else {
                    composerStartRestartGroup.startReplaceGroup(310346602);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i6;
                i5 = i7;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, state, i, 20));
        }
    }
}
