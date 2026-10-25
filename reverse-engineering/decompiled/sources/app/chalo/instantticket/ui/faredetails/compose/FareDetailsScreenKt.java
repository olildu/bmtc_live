package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.d30;
import defpackage.f30;
import defpackage.pk;
import defpackage.pk0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FareDetailsScreenKt {
    public static final void a(FareDetailsViewState viewState, Function1 intentHandler, Composer composer, int i) {
        int i2;
        String strC;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(intentHandler, "intentHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(112467314);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(intentHandler) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(112467314, i3, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsScreen (FareDetailsScreen.kt:25)");
            }
            FareDetailsScreenType fareDetailsScreenType = viewState.n;
            if ((fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket) || Intrinsics.d(fareDetailsScreenType, FareDetailsScreenType.InstantTicket.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(706914625);
                strC = StringResourcesHelperKt.c(StringEnum.FARE_DETAILS_HEADING, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (fareDetailsScreenType != null) {
                    throw pk0.p(composerStartRestartGroup, 706910869);
                }
                composerStartRestartGroup.startReplaceGroup(439579980);
                composerStartRestartGroup.endReplaceGroup();
                strC = "";
            }
            if (viewState.C) {
                composerStartRestartGroup.startReplaceGroup(439639936);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(Modifier.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloTheme.b(composerStartRestartGroup, 0).h), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                List list = viewState.p;
                boolean z = (i3 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new d30(intentHandler, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                FareDetailsMainScreenKt.d(modifierVerticalScroll$default, list, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(438263536);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.a(ComposableLambdaKt.rememberComposableLambda(173181267, true, new pk(strC, i4), composerStartRestartGroup, 54), null, ChaloTheme.c(composerStartRestartGroup, 0).e, 0L, null, null, composerStartRestartGroup, 6, 58);
            if (viewState.E) {
                composerStartRestartGroup.startReplaceGroup(1609995596);
                PlotlineComposeWidgetKt.a(6, 2, composerStartRestartGroup, null, "instantTicketFareDetailsScreenBanner");
            } else {
                composerStartRestartGroup.startReplaceGroup(1607818342);
            }
            composerStartRestartGroup.endReplaceGroup();
            FareDetailsMainScreenKt.b(viewState, intentHandler, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f30(viewState, intentHandler, i, 1));
        }
    }
}
