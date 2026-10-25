package app.chalo.productsummary.ui.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.RowWithTwoTextKt;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import defpackage.b0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BookingDetailsComponentKt {
    public static final void a(Modifier modifier, BookingDetailsUIState bookingDetails, Composer composer, int i) {
        int i2;
        Intrinsics.i(bookingDetails, "bookingDetails");
        Composer composerStartRestartGroup = composer.startRestartGroup(684596090);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bookingDetails) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(684596090, i2, -1, "app.chalo.productsummary.ui.compose.components.BookingDetailsComponent (BookingDetailsComponent.kt:15)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, bookingDetails.f8748a, null, null, composerStartRestartGroup, 0, 13);
            TitleSubtitleUiState titleSubtitleUiState = bookingDetails.b;
            if (titleSubtitleUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1266349911);
            } else {
                composerStartRestartGroup.startReplaceGroup(1266349912);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                RowWithTwoTextKt.a(titleSubtitleUiState.b, titleSubtitleUiState.c, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleUiState titleSubtitleUiState2 = bookingDetails.c;
            if (titleSubtitleUiState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1266550295);
            } else {
                composerStartRestartGroup.startReplaceGroup(1266550296);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                RowWithTwoTextKt.a(titleSubtitleUiState2.b, titleSubtitleUiState2.c, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleUiState titleSubtitleUiState3 = bookingDetails.d;
            if (titleSubtitleUiState3 == null) {
                composerStartRestartGroup.startReplaceGroup(1266754647);
            } else {
                composerStartRestartGroup.startReplaceGroup(1266754648);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                RowWithTwoTextKt.a(titleSubtitleUiState3.b, titleSubtitleUiState3.c, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleUiState titleSubtitleUiState4 = bookingDetails.e;
            if (titleSubtitleUiState4 == null) {
                composerStartRestartGroup.startReplaceGroup(1266957015);
            } else {
                composerStartRestartGroup.startReplaceGroup(1266957016);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                RowWithTwoTextKt.a(titleSubtitleUiState4.b, titleSubtitleUiState4.c, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleUiState titleSubtitleUiState5 = bookingDetails.f;
            if (titleSubtitleUiState5 == null) {
                composerStartRestartGroup.startReplaceGroup(1267157399);
            } else {
                composerStartRestartGroup.startReplaceGroup(1267157400);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                RowWithTwoTextKt.a(titleSubtitleUiState5.b, titleSubtitleUiState5.c, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
            }
            composerStartRestartGroup.endReplaceGroup();
            TitleSubtitleUiState titleSubtitleUiState6 = bookingDetails.g;
            if (titleSubtitleUiState6 == null) {
                composerStartRestartGroup.startReplaceGroup(1267363735);
            } else {
                composerStartRestartGroup.startReplaceGroup(1267363736);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                RowWithTwoTextKt.a(titleSubtitleUiState6.b, titleSubtitleUiState6.c, null, null, null, false, 0.0f, composerStartRestartGroup, 0, 124);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 10, modifier, bookingDetails));
        }
    }
}
