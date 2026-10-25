package app.chalo.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import app.chalo.compose.BackHandlerKt;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.backhandler.BackCallbackKt;
import com.arkivanov.essenty.backhandler.BackCallbackKt$BackCallback$1;
import defpackage.m8;
import defpackage.n8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002¨\u0006\u0003²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "currentOnBack", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BackHandlerKt {
    public static final void a(final boolean z, final Function0 onBack, final int i, final int i2, Composer composer, final int i3) {
        int i4;
        Intrinsics.i(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(1959728005);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                z = true;
            }
            if (i6 != 0) {
                i = 0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959728005, i4, -1, "app.chalo.compose.BackHandler (BackHandler.kt:24)");
            }
            final ComponentContext componentContext = (ComponentContext) composerStartRestartGroup.consume(LocalComponentContextKt.f1813a);
            if (componentContext == null) {
                throw new IllegalStateException("No LocalComponentContext provided. Make sure to provide it in your root composable.");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onBack, composerStartRestartGroup, (i4 >> 6) & 14);
            int i7 = i4;
            Boolean boolValueOf = Boolean.valueOf(z);
            Integer numValueOf = Integer.valueOf(i);
            boolean zChanged = ((i7 & 14) == 4) | ((i7 & 112) == 32) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(componentContext);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                        Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                        final BackCallbackKt$BackCallback$1 backCallbackKt$BackCallback$1A = BackCallbackKt.a(z, new y5(stateRememberUpdatedState, 2), i, 28);
                        final ComponentContext componentContext2 = componentContext;
                        componentContext2.getD().a(backCallbackKt$BackCallback$1A);
                        return new DisposableEffectResult() { // from class: app.chalo.compose.BackHandlerKt$BackHandler$lambda$1$0$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                componentContext2.getD().d(backCallbackKt$BackCallback$1A);
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(componentContext, boolValueOf, numValueOf, (Function1) objRememberedValue, composerStartRestartGroup, (i7 << 3) & 1008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final int i8 = i;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z2 = z;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: p8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                    BackHandlerKt.a(z2, onBack, i8, iUpdateChangedFlags, (Composer) obj, i3);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(boolean z, Composer composer, int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        m8 m8Var;
        Composer composerStartRestartGroup = composer.startRestartGroup(2020119422);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020119422, i2, -1, "app.chalo.compose.NonDismissableModalBackBlocker (BackHandler.kt:48)");
            }
            ComponentContext componentContext = (ComponentContext) composerStartRestartGroup.consume(LocalComponentContextKt.f1813a);
            if (componentContext == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    m8Var = new m8(z, i, 0);
                }
            } else {
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(componentContext) | ((i2 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new n8(z, componentContext, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.DisposableEffect(componentContext, boolValueOf, (Function1) objRememberedValue, composerStartRestartGroup, (i2 << 3) & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(m8Var);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            m8Var = new m8(z, i, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(m8Var);
        }
    }
}
