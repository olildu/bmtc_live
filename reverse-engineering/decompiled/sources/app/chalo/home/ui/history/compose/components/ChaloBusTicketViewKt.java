package app.chalo.home.ui.history.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import app.chalo.compose.components.ChaloAlertTextKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusPickupScheduleTimeViewState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusScheduleSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusScheduleUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketContainerUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketCtaUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketTripDetailsUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloTicketCtaSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloTicketDetailsContainerSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloTicketFooterContainerSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.ProductFooterContainerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerSpec;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketCtaUiState;
import app.chalo.shape.TicketShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.b0;
import defpackage.c0;
import defpackage.gf;
import defpackage.i4;
import defpackage.i41;
import defpackage.pk0;
import defpackage.r1;
import defpackage.u6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusTicketViewKt {
    public static final void a(Modifier modifier, ChaloBusTicketUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f3507a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1168865088);
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
                ComposerKt.traceEventStart(-1168865088, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloBusActiveTicketWithUiState (ChaloBusTicketView.kt:71)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ChaloBusTicketSpec chaloBusTicketSpec = (ChaloBusTicketSpec) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            ChaloPadding chaloPadding = chaloBusTicketSpec.f3504a;
            float f = chaloBusTicketSpec.e;
            boolean zChanged2 = composerStartRestartGroup.changed(Dp.m7278constructorimpl(chaloPadding.d + f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = Dp.m7276boximpl(Dp.m7278constructorimpl(chaloPadding.d + f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(PaddingKt.m787paddingqDBjuR0(modifier, chaloPadding.b, chaloPadding.f1918a, chaloPadding.c, chaloPadding.d), 0.0f, 1, null), uiState.f == null ? ChaloThemeKt.d(UIShape.e) : new TicketShape(ChaloThemeHelper.a().g, Dp.m7278constructorimpl(((Dp) mutableState.getValue()).m7292unboximpl() + ((Dp) objRememberedValue3).m7292unboximpl()), ChaloThemeHelper.a().f), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(22455839, true, new c0(chaloBusTicketSpec, uiState, density, mutableState, 4), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 19, modifier, uiState));
        }
    }

    public static final void b(Modifier modifier, ChaloBusTicketContainerUiState chaloBusTicketContainerUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1806654405);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chaloBusTicketContainerUiState) : composerStartRestartGroup.changedInstance(chaloBusTicketContainerUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1806654405, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloBusScheduleAndStopInfoComponent (ChaloBusTicketView.kt:276)");
            }
            boolean zChanged = composerStartRestartGroup.changed(chaloBusTicketContainerUiState.f3502a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = chaloBusTicketContainerUiState.f3502a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloTicketDetailsContainerSpec chaloTicketDetailsContainerSpec = (ChaloTicketDetailsContainerSpec) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(chaloTicketDetailsContainerSpec.b), ChaloThemeKt.d(chaloTicketDetailsContainerSpec.c)), chaloTicketDetailsContainerSpec.f3509a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), chaloBusTicketContainerUiState.b, composerStartRestartGroup, 6);
            ChaloSpacersKt.a(chaloTicketDetailsContainerSpec.d, composerStartRestartGroup, 0);
            ChaloDividerComposableKt.b(null, ChaloColorTokenKt.c(ChaloColorToken.AlmostBlackColor.f9756a), composerStartRestartGroup, 0, 1);
            ChaloSpacersKt.a(chaloTicketDetailsContainerSpec.e, composerStartRestartGroup, 0);
            d(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), chaloBusTicketContainerUiState.c, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 20, modifier, chaloBusTicketContainerUiState));
        }
    }

    public static final void c(Modifier modifier, ChaloBusScheduleUiState chaloBusScheduleUiState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(536126589);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chaloBusScheduleUiState) : composerStartRestartGroup.changedInstance(chaloBusScheduleUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(536126589, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloBusScheduledOnSection (ChaloBusTicketView.kt:315)");
            }
            boolean zChanged = composerStartRestartGroup.changed(chaloBusScheduleUiState.f3501a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = chaloBusScheduleUiState.f3501a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloBusScheduleSpec chaloBusScheduleSpec = (ChaloBusScheduleSpec) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(modifier, chaloBusScheduleSpec.f3500a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, chaloBusScheduleUiState.c, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.a(chaloBusScheduleSpec.b, composerStartRestartGroup, 0);
            ChaloBusPickupScheduleTimeViewState chaloBusPickupScheduleTimeViewState = chaloBusScheduleUiState.d;
            if (chaloBusPickupScheduleTimeViewState instanceof ChaloBusPickupScheduleTimeViewState.FixedTime) {
                composerStartRestartGroup.startReplaceGroup(157438099);
                modifier2 = null;
                ChaloTextViewKt.a(null, ((ChaloBusPickupScheduleTimeViewState.FixedTime) chaloBusPickupScheduleTimeViewState).f3498a, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(chaloBusPickupScheduleTimeViewState instanceof ChaloBusPickupScheduleTimeViewState.LiveTime)) {
                    throw pk0.p(composerStartRestartGroup, -1380398195);
                }
                composerStartRestartGroup.startReplaceGroup(157582311);
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ChaloBusPickupScheduleTimeViewState.LiveTime liveTime = (ChaloBusPickupScheduleTimeViewState.LiveTime) chaloBusPickupScheduleTimeViewState;
                GifUIKt.a(null, liveTime.f3499a, composerStartRestartGroup, 0, 1);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                modifier2 = null;
                ChaloTextViewKt.a(null, liveTime.b, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            AlertTextWithIconUiState alertTextWithIconUiState = chaloBusScheduleUiState.f;
            if (alertTextWithIconUiState == null) {
                composerStartRestartGroup.startReplaceGroup(157973313);
            } else {
                composerStartRestartGroup.startReplaceGroup(157973314);
                ChaloSpacersKt.a(chaloBusScheduleSpec.d, composerStartRestartGroup, 0);
                ChaloAlertTextKt.a(modifier2, alertTextWithIconUiState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState.ChaloTextUIState chaloTextUIState = chaloBusScheduleUiState.e;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(158146913);
            } else {
                composerStartRestartGroup.startReplaceGroup(158146914);
                ChaloSpacersKt.a(chaloBusScheduleSpec.c, composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 22, modifier, chaloBusScheduleUiState));
        }
    }

    public static final void d(Modifier modifier, ChaloBusTicketTripDetailsUiState ticketTripUiState, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(ticketTripUiState, "ticketTripUiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-669478628);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(ticketTripUiState) : composerStartRestartGroup.changedInstance(ticketTripUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-669478628, i2, -1, "app.chalo.home.ui.history.compose.components.ChaloBusTicketTripInfoSection (ChaloBusTicketView.kt:362)");
            }
            modifier2 = modifier;
            e(modifier2, ticketTripUiState.b, ticketTripUiState.c, ticketTripUiState.d, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 23, modifier2, ticketTripUiState));
        }
    }

    public static final void e(Modifier modifier, TextUIState.ChaloTextUIState from, TextUIState.ChaloTextUIState to, ImageUIState imageUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(from, "from");
        Intrinsics.i(to, "to");
        Intrinsics.i(imageUIState, "imageUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(619265809);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(from) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(to) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUIState) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(619265809, i3, -1, "app.chalo.home.ui.history.compose.components.FromAndToStopUiComponent (ChaloBusTicketView.kt:377)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, (i3 >> 9) & 14, 6);
            ChaloSpacersKt.x(composerStartRestartGroup, 0);
            Alignment.Horizontal start = companion.getStart();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), start, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            ChaloTextViewKt.a(null, from, null, null, composerStartRestartGroup, i3 & 112, 13);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, to, null, null, composerStartRestartGroup, (i3 >> 3) & 112, 13);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(modifier, from, to, imageUIState, i, 8));
        }
    }

    public static final void f(Modifier modifier, ProductBannerUiState bannerUiState, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Composer composer3;
        Intrinsics.i(bannerUiState, "bannerUiState");
        Object obj = bannerUiState.f3519a;
        RegularBusTicketCtaUiState regularBusTicketCtaUiState = bannerUiState.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(916881521);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(bannerUiState) : composerStartRestartGroup.changedInstance(bannerUiState) ? 32 : 16;
        }
        int i3 = i2;
        boolean z = false;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(916881521, i3, -1, "app.chalo.home.ui.history.compose.components.ProductBanner (ChaloBusTicketView.kt:400)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ProductBannerSpec productBannerSpec = (ProductBannerSpec) obj;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(productBannerSpec.c), ChaloThemeKt.d(productBannerSpec.b)), productBannerSpec.f3518a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
            Modifier modifierA = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            modifier2 = companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ImageUIState imageUIState = bannerUiState.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(141021147);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(141021148);
                composer3 = composerStartRestartGroup;
                CommonImageKt.a(imageUIState, null, false, composer3, 0, 6);
                ChaloSpacersKt.a(productBannerSpec.d, composer3, 0);
                composer3.endReplaceGroup();
            }
            Composer composer4 = composer3;
            ChaloTextViewKt.a(null, bannerUiState.b, null, null, composer4, 0, 13);
            composer2 = composer4;
            composer2.endNode();
            if (regularBusTicketCtaUiState == null) {
                composer2.startReplaceGroup(31611878);
            } else {
                composer2.startReplaceGroup(31611879);
                Modifier modifierC2 = ChaloThemeKt.c(modifier2, regularBusTicketCtaUiState.f3520a.f3516a);
                TextUIState.ChaloTextUIState chaloTextUIState = regularBusTicketCtaUiState.b;
                ImageUIState imageUIState2 = regularBusTicketCtaUiState.c;
                if ((i3 & 112) == 32 || ((i3 & 64) != 0 && composer2.changedInstance(bannerUiState))) {
                    z = true;
                }
                Object objRememberedValue2 = composer2.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new i4(bannerUiState, 27);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                ChaloFilledButtonKt.i(modifierC2, chaloTextUIState, imageUIState2, (Function0) objRememberedValue2, composer2, 0, 0);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 18, modifier2, bannerUiState));
        }
    }

    public static final void g(Modifier modifier, ProductFooterContainerUiState ticketFooterContainer, Composer composer, int i) {
        int i2;
        RoundedCornerShape roundedCornerShapeD;
        RoundedCornerShape roundedCornerShapeD2;
        Intrinsics.i(ticketFooterContainer, "ticketFooterContainer");
        ChaloBusTicketCtaUiState chaloBusTicketCtaUiState = ticketFooterContainer.c;
        Object obj = ticketFooterContainer.f3511a;
        ChaloBusTicketCtaUiState chaloBusTicketCtaUiState2 = ticketFooterContainer.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-131368416);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(ticketFooterContainer) : composerStartRestartGroup.changedInstance(ticketFooterContainer) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131368416, i2, -1, "app.chalo.home.ui.history.compose.components.TicketFooterContainer (ChaloBusTicketView.kt:207)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, ((ChaloTicketFooterContainerSpec) obj).f3510a);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (chaloBusTicketCtaUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-474594319);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-474594318);
                Modifier modifierA = PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Track_Bus");
                TextUIState.ChaloTextUIState chaloTextUIState = chaloBusTicketCtaUiState.b;
                ImageUIState imageUIState = chaloBusTicketCtaUiState.c;
                boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(ticketFooterContainer));
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new i4(ticketFooterContainer, 26);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ChaloFilledButtonKt.i(modifierA, chaloTextUIState, imageUIState, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(i41.a(rowScopeInstance, SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).b), 1.0f, false, 2, null), composerStartRestartGroup, 0);
            boolean zChanged2 = composerStartRestartGroup.changed(chaloBusTicketCtaUiState2.f3503a);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = chaloBusTicketCtaUiState2.f3503a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ChaloTicketCtaSpec chaloTicketCtaSpec = (ChaloTicketCtaSpec) objRememberedValue3;
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
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(ChaloThemeKt.c(BorderKt.m275borderxT4_qwU(modifierClip, f, jC, roundedCornerShapeD2), chaloTicketCtaSpec.f3508a), RippleEffectKt.b(composerStartRestartGroup), null, false, null, null, chaloBusTicketCtaUiState2.d, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ImageUIState imageUIState2 = chaloBusTicketCtaUiState2.c;
            if (imageUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-436264297);
            } else {
                composerStartRestartGroup.startReplaceGroup(-436264296);
                CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.B(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, chaloBusTicketCtaUiState2.b, null, null, composerStartRestartGroup, 0, 13);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 21, modifier, ticketFooterContainer));
        }
    }
}
