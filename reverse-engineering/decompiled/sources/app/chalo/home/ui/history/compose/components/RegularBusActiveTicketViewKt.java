package app.chalo.home.ui.history.compose.components;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.history.uistate.regularbusticket.ChaloTicketCtaSpec;
import app.chalo.home.ui.history.uistate.regularbusticket.ChaloTicketFooterContainerSpec;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketCtaUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketFooterContainerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketSpec;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketUiState;
import app.chalo.shape.TicketShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.c0;
import defpackage.gf;
import defpackage.i41;
import defpackage.pk0;
import defpackage.qv0;
import defpackage.rx0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusActiveTicketViewKt {
    public static final void a(Modifier modifier, RegularBusTicketUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3523a;
        Composer composerStartRestartGroup = composer.startRestartGroup(22071272);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(22071272, i2, -1, "app.chalo.home.ui.history.compose.components.RegularBusActiveTicket (RegularBusActiveTicketView.kt:64)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            RegularBusTicketSpec regularBusTicketSpec = (RegularBusTicketSpec) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            ChaloPadding chaloPadding = regularBusTicketSpec.f3522a;
            float f = regularBusTicketSpec.e;
            boolean zChanged2 = composerStartRestartGroup.changed(Dp.m7278constructorimpl(chaloPadding.d + f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = Dp.m7276boximpl(Dp.m7278constructorimpl(chaloPadding.d + f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(modifier, chaloPadding.b, chaloPadding.f1918a, chaloPadding.c, chaloPadding.d), 0.0f, 1, null), uiState.f == null ? ChaloThemeKt.d(UIShape.e) : new TicketShape(ChaloThemeHelper.a().g, Dp.m7278constructorimpl(((Dp) mutableState.getValue()).m7292unboximpl() + ((Dp) objRememberedValue3).m7292unboximpl()), ChaloThemeHelper.a().f), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1701685655, true, new c0(regularBusTicketSpec, uiState, density, mutableState, 16), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 13, modifier, uiState));
        }
    }

    public static final void b(Modifier modifier, RegularBusTicketFooterContainerUiState ticketFooterContainer, Composer composer, int i) {
        int i2;
        RoundedCornerShape roundedCornerShapeD;
        RoundedCornerShape roundedCornerShapeD2;
        Intrinsics.i(ticketFooterContainer, "ticketFooterContainer");
        Object obj = ticketFooterContainer.f3521a;
        RegularBusTicketCtaUiState regularBusTicketCtaUiState = ticketFooterContainer.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(376056068);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(ticketFooterContainer) : composerStartRestartGroup.changedInstance(ticketFooterContainer) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(376056068, i3, -1, "app.chalo.home.ui.history.compose.components.TicketFooterContainer (RegularBusActiveTicketView.kt:199)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, ((ChaloTicketFooterContainerSpec) obj).f3517a);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            RegularBusTicketCtaUiState regularBusTicketCtaUiState2 = ticketFooterContainer.c;
            if (regularBusTicketCtaUiState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1460439824);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1460439823);
                Modifier modifierA = PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Track_Bus");
                TextUIState.ChaloTextUIState chaloTextUIState = regularBusTicketCtaUiState2.b;
                ImageUIState imageUIState = regularBusTicketCtaUiState2.c;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(regularBusTicketCtaUiState2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new qv0(regularBusTicketCtaUiState2, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ChaloFilledButtonKt.i(modifierA, chaloTextUIState, imageUIState, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (regularBusTicketCtaUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1460007219);
            } else {
                Object obj2 = regularBusTicketCtaUiState.f3520a;
                composerStartRestartGroup.startReplaceGroup(-1460007218);
                boolean zChanged2 = composerStartRestartGroup.changed(obj2);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(obj2);
                } else {
                    obj2 = objRememberedValue3;
                }
                ChaloTicketCtaSpec chaloTicketCtaSpec = (ChaloTicketCtaSpec) obj2;
                UIShape uIShape = chaloTicketCtaSpec.b;
                if (uIShape == null || (roundedCornerShapeD = ChaloThemeKt.d(uIShape)) == null) {
                    roundedCornerShapeD = ChaloThemeKt.d(new UIShape.Rectangle(0.0f, 3));
                }
                Modifier modifierClip = ClipKt.clip(companion3, roundedCornerShapeD);
                float f = chaloTicketCtaSpec.d;
                ChaloColorToken chaloColorToken = chaloTicketCtaSpec.c;
                long jC = chaloColorToken != null ? ChaloColorTokenKt.c(chaloColorToken) : ChaloColorTokenKt.c(ChaloColorToken.Transparent.f9864a);
                UIShape uIShape2 = chaloTicketCtaSpec.b;
                if (uIShape2 == null || (roundedCornerShapeD2 = ChaloThemeKt.d(uIShape2)) == null) {
                    roundedCornerShapeD2 = ChaloThemeKt.d(new UIShape.Rectangle(0.0f, 3));
                }
                Modifier modifierC2 = ChaloThemeKt.c(BorderKt.m275borderxT4_qwU(modifierClip, f, jC, roundedCornerShapeD2), chaloTicketCtaSpec.f3516a);
                boolean z = (i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(ticketFooterContainer));
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new qv0(ticketFooterContainer, 16);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierC2, false, null, null, null, (Function0) objRememberedValue4, 15, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                ImageUIState imageUIState2 = regularBusTicketCtaUiState.c;
                if (imageUIState2 == null) {
                    composerStartRestartGroup.startReplaceGroup(1419413784);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1419413785);
                    CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, 0, 6);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                ChaloSpacersKt.B(composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, regularBusTicketCtaUiState.b, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 14, modifier, ticketFooterContainer));
        }
    }
}
