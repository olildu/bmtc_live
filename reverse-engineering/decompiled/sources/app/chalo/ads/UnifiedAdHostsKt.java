package app.chalo.ads;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.ads.UnifiedAdHostsKt;
import app.chalo.utils.chalologger.ChaloLog;
import defpackage.ol1;
import defpackage.pk0;
import defpackage.zt0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\n²\u0006)\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u001a\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00008\nX\u008a\u0084\u0002²\u0006)\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u001a\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "errorCode", "", "latestOnAdFailedToLoad", "Lapp/chalo/ads/UnifiedAdHostValidationError;", "latestOnHostValidationFailed", "loadedHeightDp", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UnifiedAdHostsKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:110:0x0209  */
    /* JADX WARN: Code duplicated, block: B:113:0x0223  */
    /* JADX WARN: Code duplicated, block: B:114:0x0225  */
    /* JADX WARN: Code duplicated, block: B:119:0x0235  */
    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:128:0x025f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0288  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:140:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0100  */
    /* JADX WARN: Code duplicated, block: B:79:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0140  */
    /* JADX WARN: Code duplicated, block: B:87:0x0142  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x017c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    public static final void a(final UnifiedAdSlotSpec spec, final Modifier modifier, boolean z, long j, float f, final Function2 function2, final Function1 function1, final Function1 onCrashLoggingRequired, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        UnifiedAdSlotSpec unifiedAdSlotSpec;
        Modifier modifier2;
        Function2 function3;
        Composer composer2;
        final long j2;
        final float f2;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z5;
        final long jColor;
        final float fM7278constructorimpl;
        boolean z6;
        boolean z7;
        Object objRememberedValue;
        UnifiedAdRenderConfig unifiedAdRenderConfig;
        boolean zChanged;
        Object objRememberedValue2;
        UnifiedAdSlotSpec unifiedAdSlotSpec2;
        UnifiedAdHostMode hostMode;
        UnifiedAdHostMode unifiedAdHostMode;
        UnifiedAdHostValidationError unifiedAdHostValidationError;
        State stateRememberUpdatedState;
        State stateRememberUpdatedState2;
        boolean zChanged2;
        Object objRememberedValue3;
        MutableIntState mutableIntState;
        boolean zChanged3;
        Object objRememberedValue4;
        Function0<ComposeUiNode> constructor;
        boolean z8;
        boolean z9;
        Object objRememberedValue5;
        boolean z10;
        boolean z11;
        Object objRememberedValue6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        int i6;
        int i7;
        int i8;
        Intrinsics.i(spec, "spec");
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        Composer composerStartRestartGroup = composer.startRestartGroup(-624975787);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(spec) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            i4 = i3 | 27648;
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((1572864 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            }
            i5 = i4 | 113246208;
            if ((805306368 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onCrashLoggingRequired)) {
                    i6 = 536870912;
                } else {
                    i6 = 268435456;
                }
                i5 |= i6;
            }
            if ((306783379 & i5) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i5 & 1)) {
                composer2 = composerStartRestartGroup;
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                jColor = ColorKt.Color(4292467161L);
                fM7278constructorimpl = Dp.m7278constructorimpl(1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-624975787, i5, -1, "app.chalo.ads.UnifiedAnchoredFooterAdHost (UnifiedAdHosts.kt:78)");
                }
                if (!AdsPolicyKt.a(composer2)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final int i10 = 0;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: rm1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i10) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        UnifiedAdHostsKt.a(spec, modifier, z5, jColor, fM7278constructorimpl, function2, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        UnifiedAdHostsKt.a(spec, modifier, z5, jColor, fM7278constructorimpl, function2, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        });
                        return;
                    }
                    return;
                }
                function3 = function2;
                unifiedAdSlotSpec = spec;
                modifier2 = modifier;
                z6 = z5;
                if ((i5 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objRememberedValue = composer2.rememberedValue();
                if (z7 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new UnifiedAdRenderConfig(unifiedAdSlotSpec, UnifiedAdHostMode.ANCHORED);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                unifiedAdRenderConfig = (UnifiedAdRenderConfig) objRememberedValue;
                zChanged = composer2.changed(unifiedAdRenderConfig);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    unifiedAdSlotSpec2 = unifiedAdRenderConfig.f851a;
                    hostMode = unifiedAdRenderConfig.b;
                    Intrinsics.i(unifiedAdSlotSpec2, "<this>");
                    Intrinsics.i(hostMode, "hostMode");
                    unifiedAdHostMode = unifiedAdSlotSpec2.b;
                    if (hostMode == unifiedAdHostMode) {
                        objRememberedValue2 = null;
                    } else {
                        objRememberedValue2 = new UnifiedAdHostValidationError.UnsupportedHostMode(unifiedAdSlotSpec2.f852a, hostMode, unifiedAdHostMode);
                    }
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                unifiedAdHostValidationError = (UnifiedAdHostValidationError) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer2, (i5 >> 18) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(null, composer2, (i5 >> 24) & 14);
                zChanged2 = composer2.changed(unifiedAdRenderConfig);
                objRememberedValue3 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                mutableIntState = (MutableIntState) objRememberedValue3;
                if (unifiedAdHostValidationError == null) {
                    composer2.startReplaceGroup(30676125);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (z6 || mutableIntState.getIntValue() <= 0) {
                        composer2.startReplaceGroup(-1979861243);
                    } else {
                        composer2.startReplaceGroup(-1976200360);
                        BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), fM7278constructorimpl), jColor, null, 2, null), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean zChanged4 = composer2.changed(mutableIntState);
                    if ((i5 & 458752) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zChanged4 | z8;
                    objRememberedValue5 = composer2.rememberedValue();
                    if (z9 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new zt0(13, function3, mutableIntState);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    Function2 function4 = (Function2) objRememberedValue5;
                    boolean zChanged5 = composer2.changed(mutableIntState);
                    if ((i5 & 3670016) == 1048576) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = zChanged5 | z10;
                    objRememberedValue6 = composer2.rememberedValue();
                    if (z11 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new ol1(3, function1, mutableIntState);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    AdsterUnifiedAd_androidKt.a(unifiedAdRenderConfig, null, modifierFillMaxWidth$default2, function4, (Function1) objRememberedValue6, null, onCrashLoggingRequired, composer2, ((i5 >> 6) & 458752) | 384 | ((i5 >> 9) & 3670016), 2);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(31631731);
                    zChanged3 = composer2.changed(mutableIntState) | composer2.changedInstance(unifiedAdHostValidationError) | composer2.changed(stateRememberUpdatedState) | composer2.changed(stateRememberUpdatedState2);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1(unifiedAdHostValidationError, mutableIntState, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    EffectsKt.LaunchedEffect(unifiedAdHostValidationError, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f2 = fM7278constructorimpl;
                j2 = jColor;
                z4 = z6;
            } else {
                unifiedAdSlotSpec = spec;
                modifier2 = modifier;
                function3 = function2;
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                j2 = j;
                f2 = f;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i12 = 1;
                final UnifiedAdSlotSpec unifiedAdSlotSpec3 = unifiedAdSlotSpec;
                final Modifier modifier3 = modifier2;
                final Function2 function5 = function3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: rm1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i12) {
                            case 0:
                                ((Integer) obj2).getClass();
                                UnifiedAdHostsKt.a(unifiedAdSlotSpec3, modifier3, z4, j2, f2, function5, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                UnifiedAdHostsKt.a(unifiedAdSlotSpec3, modifier3, z4, j2, f2, function5, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i3 | 27648;
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i4 |= i7;
        }
        i5 = i4 | 113246208;
        if ((805306368 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onCrashLoggingRequired)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i5 |= i6;
        }
        if ((306783379 & i5) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i5 & 1)) {
            composer2 = composerStartRestartGroup;
            if (i9 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            jColor = ColorKt.Color(4292467161L);
            fM7278constructorimpl = Dp.m7278constructorimpl(1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-624975787, i5, -1, "app.chalo.ads.UnifiedAnchoredFooterAdHost (UnifiedAdHosts.kt:78)");
            }
            if (!AdsPolicyKt.a(composer2)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    final int i13 = 0;
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: rm1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i13) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    UnifiedAdHostsKt.a(spec, modifier, z5, jColor, fM7278constructorimpl, function2, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    UnifiedAdHostsKt.a(spec, modifier, z5, jColor, fM7278constructorimpl, function2, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            function3 = function2;
            unifiedAdSlotSpec = spec;
            modifier2 = modifier;
            z6 = z5;
            if ((i5 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            objRememberedValue = composer2.rememberedValue();
            if (z7) {
                objRememberedValue = new UnifiedAdRenderConfig(unifiedAdSlotSpec, UnifiedAdHostMode.ANCHORED);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new UnifiedAdRenderConfig(unifiedAdSlotSpec, UnifiedAdHostMode.ANCHORED);
                composer2.updateRememberedValue(objRememberedValue);
            }
            unifiedAdRenderConfig = (UnifiedAdRenderConfig) objRememberedValue;
            zChanged = composer2.changed(unifiedAdRenderConfig);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                unifiedAdSlotSpec2 = unifiedAdRenderConfig.f851a;
                hostMode = unifiedAdRenderConfig.b;
                Intrinsics.i(unifiedAdSlotSpec2, "<this>");
                Intrinsics.i(hostMode, "hostMode");
                unifiedAdHostMode = unifiedAdSlotSpec2.b;
                if (hostMode == unifiedAdHostMode) {
                    objRememberedValue2 = null;
                } else {
                    objRememberedValue2 = new UnifiedAdHostValidationError.UnsupportedHostMode(unifiedAdSlotSpec2.f852a, hostMode, unifiedAdHostMode);
                }
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                unifiedAdSlotSpec2 = unifiedAdRenderConfig.f851a;
                hostMode = unifiedAdRenderConfig.b;
                Intrinsics.i(unifiedAdSlotSpec2, "<this>");
                Intrinsics.i(hostMode, "hostMode");
                unifiedAdHostMode = unifiedAdSlotSpec2.b;
                if (hostMode == unifiedAdHostMode) {
                    objRememberedValue2 = null;
                } else {
                    objRememberedValue2 = new UnifiedAdHostValidationError.UnsupportedHostMode(unifiedAdSlotSpec2.f852a, hostMode, unifiedAdHostMode);
                }
                composer2.updateRememberedValue(objRememberedValue2);
            }
            unifiedAdHostValidationError = (UnifiedAdHostValidationError) objRememberedValue2;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer2, (i5 >> 18) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(null, composer2, (i5 >> 24) & 14);
            zChanged2 = composer2.changed(unifiedAdRenderConfig);
            objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            mutableIntState = (MutableIntState) objRememberedValue3;
            if (unifiedAdHostValidationError == null) {
                composer2.startReplaceGroup(30676125);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i14 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i14), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (z6) {
                    composer2.startReplaceGroup(-1979861243);
                } else {
                    composer2.startReplaceGroup(-1979861243);
                }
                composer2.endReplaceGroup();
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zChanged6 = composer2.changed(mutableIntState);
                if ((i5 & 458752) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zChanged6 | z8;
                objRememberedValue5 = composer2.rememberedValue();
                if (z9) {
                    objRememberedValue5 = new zt0(13, function3, mutableIntState);
                    composer2.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new zt0(13, function3, mutableIntState);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                Function2 function6 = (Function2) objRememberedValue5;
                boolean zChanged7 = composer2.changed(mutableIntState);
                if ((i5 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zChanged7 | z10;
                objRememberedValue6 = composer2.rememberedValue();
                if (z11) {
                    objRememberedValue6 = new ol1(3, function1, mutableIntState);
                    composer2.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new ol1(3, function1, mutableIntState);
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                AdsterUnifiedAd_androidKt.a(unifiedAdRenderConfig, null, modifierFillMaxWidth$default4, function6, (Function1) objRememberedValue6, null, onCrashLoggingRequired, composer2, ((i5 >> 6) & 458752) | 384 | ((i5 >> 9) & 3670016), 2);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(31631731);
                zChanged3 = composer2.changed(mutableIntState) | composer2.changedInstance(unifiedAdHostValidationError) | composer2.changed(stateRememberUpdatedState) | composer2.changed(stateRememberUpdatedState2);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1(unifiedAdHostValidationError, mutableIntState, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new UnifiedAdHostsKt$UnifiedAnchoredFooterAdHost$3$1(unifiedAdHostValidationError, mutableIntState, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                EffectsKt.LaunchedEffect(unifiedAdHostValidationError, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 0);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = fM7278constructorimpl;
            j2 = jColor;
            z4 = z6;
        } else {
            unifiedAdSlotSpec = spec;
            modifier2 = modifier;
            function3 = function2;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            j2 = j;
            f2 = f;
            z4 = z2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i15 = 1;
            final UnifiedAdSlotSpec unifiedAdSlotSpec4 = unifiedAdSlotSpec;
            final Modifier modifier4 = modifier2;
            final Function2 function7 = function3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: rm1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i15) {
                        case 0:
                            ((Integer) obj2).getClass();
                            UnifiedAdHostsKt.a(unifiedAdSlotSpec4, modifier4, z4, j2, f2, function7, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            UnifiedAdHostsKt.a(unifiedAdSlotSpec4, modifier4, z4, j2, f2, function7, function1, onCrashLoggingRequired, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(final UnifiedAdSlotSpec spec, final Object obj, final Modifier modifier, final Function2 function2, final Function1 function1, final Function0 function0, final Function1 onCrashLoggingRequired, Composer composer, final int i) {
        int i2;
        Object obj2;
        Function2 function3;
        Function0 function4;
        UnifiedAdSlotSpec unifiedAdSlotSpec;
        Composer composer2;
        Intrinsics.i(spec, "spec");
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        Composer composerStartRestartGroup = composer.startRestartGroup(-504836796);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(spec) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj2 = obj;
            i2 |= composerStartRestartGroup.changedInstance(obj2) ? 32 : 16;
        } else {
            obj2 = obj;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        } else {
            function3 = function2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function4 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        } else {
            function4 = function0;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCrashLoggingRequired) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-504836796, i3, -1, "app.chalo.ads.UnifiedInlineAdHost (UnifiedAdHosts.kt:31)");
            }
            if (!AdsPolicyKt.a(composerStartRestartGroup)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i4 = 0;
                    final Object obj3 = obj2;
                    final Function2 function5 = function3;
                    final Function0 function6 = function4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: qm1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i4) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    UnifiedAdHostsKt.b(spec, obj3, modifier, function5, function1, function6, onCrashLoggingRequired, (Composer) obj4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    UnifiedAdHostsKt.b(spec, obj3, modifier, function5, function1, function6, onCrashLoggingRequired, (Composer) obj4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            unifiedAdSlotSpec = spec;
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new UnifiedAdRenderConfig(unifiedAdSlotSpec, UnifiedAdHostMode.INLINE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            UnifiedAdRenderConfig unifiedAdRenderConfig = (UnifiedAdRenderConfig) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(unifiedAdRenderConfig);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                UnifiedAdSlotSpec unifiedAdSlotSpec2 = unifiedAdRenderConfig.f851a;
                UnifiedAdHostMode hostMode = unifiedAdRenderConfig.b;
                Intrinsics.i(unifiedAdSlotSpec2, "<this>");
                Intrinsics.i(hostMode, "hostMode");
                UnifiedAdHostMode unifiedAdHostMode = unifiedAdSlotSpec2.b;
                objRememberedValue2 = hostMode == unifiedAdHostMode ? null : new UnifiedAdHostValidationError.UnsupportedHostMode(unifiedAdSlotSpec2.f852a, hostMode, unifiedAdHostMode);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            UnifiedAdHostValidationError unifiedAdHostValidationError = (UnifiedAdHostValidationError) objRememberedValue2;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i3 >> 12) & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(null, composerStartRestartGroup, (i3 >> 18) & 14);
            if (unifiedAdHostValidationError == null) {
                composerStartRestartGroup.startReplaceGroup(1383407300);
                AdsterUnifiedAd_androidKt.a(unifiedAdRenderConfig, obj, modifier, function2, function1, function0, onCrashLoggingRequired, composerStartRestartGroup, (524272 & i3) | ((i3 >> 3) & 3670016), 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1383756267);
                boolean zChangedInstance = composer2.changedInstance(unifiedAdHostValidationError) | composer2.changed(stateRememberUpdatedState) | composer2.changed(stateRememberUpdatedState2);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new UnifiedAdHostsKt$UnifiedInlineAdHost$2$1(unifiedAdHostValidationError, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.LaunchedEffect(unifiedAdHostValidationError, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            unifiedAdSlotSpec = spec;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i5 = 1;
            final UnifiedAdSlotSpec unifiedAdSlotSpec3 = unifiedAdSlotSpec;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: qm1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    switch (i5) {
                        case 0:
                            ((Integer) obj5).getClass();
                            UnifiedAdHostsKt.b(unifiedAdSlotSpec3, obj, modifier, function2, function1, function0, onCrashLoggingRequired, (Composer) obj4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            UnifiedAdHostsKt.b(unifiedAdSlotSpec3, obj, modifier, function2, function1, function0, onCrashLoggingRequired, (Composer) obj4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(UnifiedAdHostValidationError error, String str, Function1 function1, Function1 function2) {
        Intrinsics.i(error, "error");
        if (function2 != null) {
            function2.invoke(error);
        }
        if (function1 != null) {
            function1.invoke(-1001);
        }
        ChaloLog.c(str, str + " validationFailure slot=" + error.getF842a().name() + " reason=" + error.getD(), null);
    }
}
