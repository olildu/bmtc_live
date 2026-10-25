package app.chalo.uistate.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.b3;
import defpackage.h0;
import defpackage.pk0;
import defpackage.r1;
import defpackage.rx0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusTicketDetailsContainerKt {
    public static final void a(Modifier modifier, RegularBusTicketTripDetailsSpec spec, TextUIState.ChaloTextUIState from, TextUIState.ChaloTextUIState to, ImageUIState imageUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(spec, "spec");
        Intrinsics.i(from, "from");
        Intrinsics.i(to, "to");
        Intrinsics.i(imageUIState, "imageUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-752245216);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(spec) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(from) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(to) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUIState) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-752245216, i3, -1, "app.chalo.uistate.components.FromAndToStopUiComponent (RegularBusTicketDetailsContainer.kt:409)");
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
            CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, (i3 >> 12) & 14, 6);
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
            ChaloTextViewKt.a(null, from, null, null, composerStartRestartGroup, (i3 >> 3) & 112, 13);
            ChaloSpacersKt.b(spec.b, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, to, null, null, composerStartRestartGroup, (i3 >> 6) & 112, 13);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(modifier, spec, from, to, imageUIState, i));
        }
    }

    public static final void b(Modifier modifier, RegularBusTicketContainerUiState ticketDetailsContainer, Composer composer, int i) {
        int i2;
        boolean z;
        Intrinsics.i(ticketDetailsContainer, "ticketDetailsContainer");
        RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState = ticketDetailsContainer.e;
        RegularBusTicketTripDetailsUiState regularBusTicketTripDetailsUiState = ticketDetailsContainer.d;
        Object obj = ticketDetailsContainer.f9948a;
        DividerUIState dividerUIState = ticketDetailsContainer.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(900567848);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ticketDetailsContainer) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(900567848, i2, -1, "app.chalo.uistate.components.RegularBusScheduleAndStopInfoComponent (RegularBusTicketDetailsContainer.kt:181)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ChaloTicketDetailsContainerSpec chaloTicketDetailsContainerSpec = (ChaloTicketDetailsContainerSpec) obj;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloColorTokenKt.c(chaloTicketDetailsContainerSpec.b), ChaloThemeKt.d(chaloTicketDetailsContainerSpec.c)), chaloTicketDetailsContainerSpec.f9934a);
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
            if (regularBusTicketTripDetailsUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-678076611);
                composerStartRestartGroup.endReplaceGroup();
                z = false;
            } else {
                composerStartRestartGroup.startReplaceGroup(-678076610);
                f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), regularBusTicketTripDetailsUiState, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                z = true;
            }
            if (regularBusTicketAmountDetailsUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-677753436);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-677753435);
                if (!z || dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-483137959);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-475365732);
                    g(dividerUIState, chaloTicketDetailsContainerSpec, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                d(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), regularBusTicketAmountDetailsUiState, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                z = true;
            }
            RegularBusPickupScheduleUiState regularBusPickupScheduleUiState = ticketDetailsContainer.c;
            if (regularBusPickupScheduleUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-677135854);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-677135853);
                if (!z || dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1199611413);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1191220178);
                    g(dividerUIState, chaloTicketDetailsContainerSpec, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), regularBusPickupScheduleUiState, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                z = true;
            }
            RegularBusTicketReferenceNumberUiState regularBusTicketReferenceNumberUiState = ticketDetailsContainer.f;
            if (regularBusTicketReferenceNumberUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-676549365);
            } else {
                composerStartRestartGroup.startReplaceGroup(-676549364);
                if (!z || dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1828522751);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1819544252);
                    g(dividerUIState, chaloTicketDetailsContainerSpec, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                e(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), regularBusTicketReferenceNumberUiState, composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 16, modifier, ticketDetailsContainer));
        }
    }

    public static final void c(Modifier modifier, RegularBusPickupScheduleUiState regularBusPickupScheduleUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(371915026);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(regularBusPickupScheduleUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(371915026, i2, -1, "app.chalo.uistate.components.RegularBusScheduledOnSection (RegularBusTicketDetailsContainer.kt:369)");
            }
            boolean zChanged = composerStartRestartGroup.changed(regularBusPickupScheduleUiState.f9946a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = regularBusPickupScheduleUiState.f9946a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RegularBusPickupScheduleSpec regularBusPickupScheduleSpec = (RegularBusPickupScheduleSpec) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(modifier, regularBusPickupScheduleSpec.f9944a);
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
            ChaloTextViewKt.a(null, regularBusPickupScheduleUiState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.b(regularBusPickupScheduleSpec.b, composerStartRestartGroup, 0);
            RegularBusPickupScheduleTimeViewState.FixedTime fixedTime = regularBusPickupScheduleUiState.c;
            if (!xs.z(fixedTime)) {
                throw pk0.p(composerStartRestartGroup, 398812371);
            }
            composerStartRestartGroup.startReplaceGroup(-521607746);
            ChaloTextViewKt.a(null, fixedTime.f9945a, null, null, composerStartRestartGroup, 0, 13);
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 21, modifier, regularBusPickupScheduleUiState));
        }
    }

    public static final void d(Modifier modifier, RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1337435575);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(regularBusTicketAmountDetailsUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1337435575, i2, -1, "app.chalo.uistate.components.RegularBusTicketAmountDetailsSection (RegularBusTicketDetailsContainer.kt:269)");
            }
            boolean zChanged = composerStartRestartGroup.changed(regularBusTicketAmountDetailsUiState.f9947a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = regularBusTicketAmountDetailsUiState.f9947a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RegularBusAmountSpec regularBusAmountSpec = (RegularBusAmountSpec) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(modifier, regularBusAmountSpec.f9943a);
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
            ChaloTextViewKt.a(null, regularBusTicketAmountDetailsUiState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.b(regularBusAmountSpec.b, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, regularBusTicketAmountDetailsUiState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 20, modifier, regularBusTicketAmountDetailsUiState));
        }
    }

    public static final void e(Modifier modifier, RegularBusTicketReferenceNumberUiState regularBusTicketReferenceNumberUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(697792546);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(regularBusTicketReferenceNumberUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(697792546, i2, -1, "app.chalo.uistate.components.RegularBusTicketReferenceSection (RegularBusTicketDetailsContainer.kt:290)");
            }
            boolean zChanged = composerStartRestartGroup.changed(regularBusTicketReferenceNumberUiState.f9949a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = regularBusTicketReferenceNumberUiState.f9949a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RegularBusTicketReferenceSpec regularBusTicketReferenceSpec = (RegularBusTicketReferenceSpec) objRememberedValue;
            Modifier modifierC = ChaloThemeKt.c(modifier, regularBusTicketReferenceSpec.f9950a);
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
            ChaloTextViewKt.a(null, regularBusTicketReferenceNumberUiState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.b(regularBusTicketReferenceSpec.b, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, regularBusTicketReferenceNumberUiState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 18, modifier, regularBusTicketReferenceNumberUiState));
        }
    }

    public static final void f(Modifier modifier, RegularBusTicketTripDetailsUiState ticketTripUiState, Composer composer, int i) {
        Intrinsics.i(ticketTripUiState, "ticketTripUiState");
        Object obj = ticketTripUiState.f9952a;
        List list = ticketTripUiState.c;
        Composer composerStartRestartGroup = composer.startRestartGroup(843749295);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(ticketTripUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(843749295, i2, -1, "app.chalo.uistate.components.RegularBusTicketTripInfoSection (RegularBusTicketDetailsContainer.kt:311)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            RegularBusTicketTripDetailsSpec regularBusTicketTripDetailsSpec = (RegularBusTicketTripDetailsSpec) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1233175938);
                TicketRouteNameUiState ticketRouteNameUiState = ticketTripUiState.b;
                if (ticketRouteNameUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(-1233175939);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1233175938);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CommonImageKt.a(ticketRouteNameUiState.f9957a, null, false, composerStartRestartGroup, 0, 6);
                    ChaloSpacersKt.A(composerStartRestartGroup, 0);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    ChaloTextViewKt.a(null, ticketRouteNameUiState.b, null, null, composerStartRestartGroup, 0, 13);
                    composerStartRestartGroup = composerStartRestartGroup;
                    TextUIState.ChaloTextUIState chaloTextUIState = ticketTripUiState.g;
                    if (chaloTextUIState == null) {
                        composerStartRestartGroup.startReplaceGroup(1833341519);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1833341520);
                        ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    ChaloSpacersKt.b(regularBusTicketTripDetailsSpec.c, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1233917365);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                pk0.v(companion3, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1142188236);
                int i7 = 0;
                for (Object obj2 : list) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    CommonImageKt.a((ImageUIState) obj2, null, false, composerStartRestartGroup, 0, 6);
                    if (i7 < CollectionsKt.K(list)) {
                        composerStartRestartGroup.startReplaceGroup(2139967010);
                        ChaloSpacersKt.w(composerStartRestartGroup, 0);
                        CommonImageKt.a(new ImageUIState(IconType.IC_ARROW_RIGHT_DIRECTION, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), null, false, composerStartRestartGroup, 6, 6);
                        ChaloSpacersKt.w(composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(2128489725);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i7 = i8;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                ChaloSpacersKt.b(regularBusTicketTripDetailsSpec.c, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ticketTripUiState.d == null || ticketTripUiState.e == null) {
                composerStartRestartGroup.startReplaceGroup(-1245093175);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1232507857);
                a(modifier, regularBusTicketTripDetailsSpec, ticketTripUiState.d, ticketTripUiState.e, ticketTripUiState.f, composerStartRestartGroup, i2 & 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 17, modifier, ticketTripUiState));
        }
    }

    public static final void g(DividerUIState dividerUIState, ChaloTicketDetailsContainerSpec chaloTicketDetailsContainerSpec, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(215492428);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(dividerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTicketDetailsContainerSpec) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(215492428, i2, -1, "app.chalo.uistate.components.TicketDetailsDivider (RegularBusTicketDetailsContainer.kt:257)");
            }
            ChaloSpacersKt.b(chaloTicketDetailsContainerSpec.d, composerStartRestartGroup, 0);
            DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, (i2 << 3) & 112, 1);
            ChaloSpacersKt.b(chaloTicketDetailsContainerSpec.e, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(dividerUIState, chaloTicketDetailsContainerSpec, i, 19));
        }
    }
}
