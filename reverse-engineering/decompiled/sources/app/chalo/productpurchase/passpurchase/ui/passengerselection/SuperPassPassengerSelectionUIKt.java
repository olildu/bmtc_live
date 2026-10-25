package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.text.TextUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.arkivanov.decompose.value.MutableValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.fb1;
import defpackage.l91;
import defpackage.pk0;
import defpackage.sa1;
import defpackage.sx0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassPassengerSelectionUIKt {
    public static final void a(PassPassengerSelectionCardUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1605208588);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1605208588, i2, -1, "app.chalo.productpurchase.passpurchase.ui.passengerselection.PassPassengerSelectionCard (SuperPassPassengerSelectionUI.kt:79)");
            }
            modifier2 = modifier;
            ChaloRoundedCardKt.a(state.c, modifier2, ComposableLambdaKt.rememberComposableLambda(-963100061, true, new sx0(state, 23), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(state, modifier2, i, 25));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(SuperPassPassengerSelectionViewModel superPassPassengerSelectionViewModel, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-366779598);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(superPassPassengerSelectionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366779598, i2, -1, "app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelection (SuperPassPassengerSelectionUI.kt:22)");
            }
            d((SuperPassPassengerSelectionUIState) SubscribeAsStateKt.a((MutableValue) superPassPassengerSelectionViewModel.g.getValue(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(superPassPassengerSelectionViewModel, i, 18));
        }
    }

    public static final void c(SuperPassPassengerSelectionUIState superPassPassengerSelectionUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-308368135);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(superPassPassengerSelectionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 18;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-308368135, i3, -1, "app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionContent (SuperPassPassengerSelectionUI.kt:49)");
            }
            SuperPassPassengerSelectionUISpec superPassPassengerSelectionUISpec = superPassPassengerSelectionUIState.d;
            Modifier modifierC = ChaloThemeKt.c(modifier, superPassPassengerSelectionUISpec.f8451a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState textUIState = superPassPassengerSelectionUIState.b;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean z = true;
            TextKt.c(textUIState, ChaloThemeKt.c(companion2, superPassPassengerSelectionUISpec.b), null, null, composerStartRestartGroup, 0, 12);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            PaddingValues paddingValuesM779PaddingValuesYgX7TsA$default = PaddingKt.m779PaddingValuesYgX7TsA$default(0.0f, superPassPassengerSelectionUISpec.c, 1, null);
            if ((i3 & 14) != 4) {
                z = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l91(superPassPassengerSelectionUIState, i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM779PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_PERCENT_X);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(superPassPassengerSelectionUIState, modifier, i, 26));
        }
    }

    public static final void d(SuperPassPassengerSelectionUIState superPassPassengerSelectionUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-780471125);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(superPassPassengerSelectionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-780471125, i2, -1, "app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionMainContent (SuperPassPassengerSelectionUI.kt:31)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(superPassPassengerSelectionUIState.f8452a, null, null, composerStartRestartGroup, 0, 14);
            c(superPassPassengerSelectionUIState, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, (i2 & 14) | 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(superPassPassengerSelectionUIState, i, 19));
        }
    }
}
