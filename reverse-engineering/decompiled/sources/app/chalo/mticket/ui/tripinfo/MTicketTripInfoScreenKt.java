package app.chalo.mticket.ui.tripinfo;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.data.ProductBookingBranding;
import app.chalo.data.ProductBookingBrandingKt;
import app.chalo.instantticket.ui.routeselection.compose.RouteSelectionInputKt;
import app.chalo.instantticket.ui.routeselection.uistate.RouteSelectionInputUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dq;
import defpackage.fc0;
import defpackage.pk0;
import defpackage.t8;
import defpackage.ug0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MTicketTripInfoScreenKt {
    public static final void a(MTicketTripInfoUIState mTicketTripInfoUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-543414219);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(mTicketTripInfoUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-543414219, i2, -1, "app.chalo.mticket.ui.tripinfo.MTicketTripInfoContent (MTicketTripInfoScreen.kt:73)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            RouteSelectionInputUIState routeSelectionInputUIState = mTicketTripInfoUIState.b;
            ProductBookingBranding productBookingBranding = mTicketTripInfoUIState.g;
            MTicketTripInfoUISpec mTicketTripInfoUISpec = mTicketTripInfoUIState.j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            RouteSelectionInputKt.a(routeSelectionInputUIState, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48);
            RouteSelectionInputKt.a(mTicketTripInfoUIState.c, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48);
            RouteSelectionInputKt.a(mTicketTripInfoUIState.d, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48);
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), mTicketTripInfoUISpec.b), mTicketTripInfoUIState.e);
            TextUIState textUIState = mTicketTripInfoUIState.f;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-151289954);
                composerStartRestartGroup.endReplaceGroup();
                obj = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-151289953);
                obj = null;
                TextKt.c(textUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), mTicketTripInfoUISpec.c), null, null, composerStartRestartGroup, 0, 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (Intrinsics.d(productBookingBranding, ProductBookingBranding.None.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-154250825);
            } else {
                composerStartRestartGroup.startReplaceGroup(-151010302);
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj), mTicketTripInfoUISpec.d);
                ProductBookingBranding.Companion companion3 = ProductBookingBranding.INSTANCE;
                ProductBookingBrandingKt.a(modifierC, productBookingBranding, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(mTicketTripInfoUIState, modifier, i, i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(MTicketTripInfoComponent mTicketTripInfoComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2137688021);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(mTicketTripInfoComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2137688021, i2, -1, "app.chalo.mticket.ui.tripinfo.MTicketTripInfoScreen (MTicketTripInfoScreen.kt:26)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(mTicketTripInfoComponent.t0(), composerStartRestartGroup);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(((MTicketTripInfoUIState) mutableStateA.getValue()).f5785a, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, composerStartRestartGroup, 48, 12);
            a((MTicketTripInfoUIState) mutableStateA.getValue(), ScrollKt.verticalScroll$default(ChaloThemeKt.c(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), ((MTicketTripInfoUIState) mutableStateA.getValue()).j.f5784a), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            LoadingDialogUIState loadingDialogUIState = ((MTicketTripInfoUIState) mutableStateA.getValue()).h;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-724142402);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -724142401, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            SnackbarUIState snackbarUIState = ((MTicketTripInfoUIState) mutableStateA.getValue()).i;
            if (snackbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-724049774);
            } else {
                composerStartRestartGroup.startReplaceGroup(-724049773);
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getBottom(), companion2.getStart(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                ChaloSnackbarKt.b(snackbarUIState, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(mTicketTripInfoComponent, i, 15));
        }
    }
}
