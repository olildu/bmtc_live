package app.chalo.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.RowWithTwoTextKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.uistate.text.TextUIState;
import defpackage.i41;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RowWithTwoTextKt {
    /* JADX WARN: Code duplicated, block: B:100:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    /* JADX WARN: Code duplicated, block: B:91:0x0173  */
    /* JADX WARN: Code duplicated, block: B:93:0x018e  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2  */
    public static final void a(final TextUIState.ChaloTextUIState text1, final TextUIState.ChaloTextUIState chaloTextUIState, Modifier modifier, Modifier modifier2, Modifier modifier3, boolean z, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier4;
        int i4;
        int i5;
        boolean z2;
        int i6;
        float f2;
        boolean z3;
        final Modifier modifier5;
        final boolean z4;
        final Modifier modifier6;
        final Modifier modifier7;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier8;
        boolean z5;
        int i7;
        Modifier modifier9;
        Function0<ComposeUiNode> constructor;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion;
        Modifier modifier10;
        Intrinsics.i(text1, "text1");
        Composer composerStartRestartGroup = composer.startRestartGroup(1089293383);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(chaloTextUIState) ? 32 : 16;
        }
        int i8 = i3 | 384;
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                modifier4 = modifier2;
                i8 |= composerStartRestartGroup.changed(modifier4) ? 2048 : 1024;
            }
            i4 = i8 | 24576;
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        f2 = f;
                        int i10 = composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
                        i4 |= i10;
                    } else {
                        f2 = f;
                    }
                    i4 |= i10;
                } else {
                    f2 = f;
                }
                if ((599187 & i4) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier8 = Modifier.INSTANCE;
                        if (i9 != 0) {
                            modifier4 = modifier8;
                        }
                        z5 = i5 == 0 ? z2 : true;
                        if ((i2 & 64) != 0) {
                            i4 &= -3670017;
                            f2 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                        }
                        i7 = i4;
                        modifier9 = modifier8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        modifier8 = modifier;
                        z5 = z2;
                        i7 = i4;
                        modifier9 = modifier3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1089293383, i7, -1, "app.chalo.compose.components.RowWithTwoText (RowWithTwoText.kt:20)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier8);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifier11 = modifier4;
                    ChaloTextViewKt.a(modifier11, text1, null, null, composerStartRestartGroup, ((i7 >> 9) & 14) | ((i7 << 3) & 112), 12);
                    if (chaloTextUIState == null) {
                        composerStartRestartGroup.startReplaceGroup(-782664721);
                        composerStartRestartGroup.endReplaceGroup();
                        modifier10 = modifier9;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-782664720);
                        companion = Modifier.INSTANCE;
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f2), composerStartRestartGroup, 0);
                        if (z5) {
                            composerStartRestartGroup.startReplaceGroup(316312819);
                            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1214829141);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier10 = modifier9;
                        ChaloTextViewKt.a(modifier10, chaloTextUIState, null, null, composerStartRestartGroup, ((i7 >> 12) & 14) | (i7 & 112), 12);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier10;
                    modifier6 = modifier8;
                    modifier7 = modifier11;
                    z4 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier3;
                    z4 = z2;
                    modifier6 = modifier;
                    modifier7 = modifier4;
                }
                f3 = f2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j41
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            RowWithTwoTextKt.a(text1, chaloTextUIState, modifier6, modifier7, modifier5, z4, f3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i4 = 221184 | i8;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i4 |= i10;
                } else {
                    f2 = f;
                }
                i4 |= i10;
            } else {
                f2 = f;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    modifier8 = Modifier.INSTANCE;
                    if (i9 != 0) {
                        modifier4 = modifier8;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                    }
                    i7 = i4;
                    modifier9 = modifier8;
                } else {
                    modifier8 = Modifier.INSTANCE;
                    if (i9 != 0) {
                        modifier4 = modifier8;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                    }
                    i7 = i4;
                    modifier9 = modifier8;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1089293383, i7, -1, "app.chalo.compose.components.RowWithTwoText (RowWithTwoText.kt:20)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier8);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i12), composerM3915constructorimpl2));
                rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifier12 = modifier4;
                ChaloTextViewKt.a(modifier12, text1, null, null, composerStartRestartGroup, ((i7 >> 9) & 14) | ((i7 << 3) & 112), 12);
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-782664721);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier10 = modifier9;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-782664720);
                    companion = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f2), composerStartRestartGroup, 0);
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(316312819);
                        SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1214829141);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier10 = modifier9;
                    ChaloTextViewKt.a(modifier10, chaloTextUIState, null, null, composerStartRestartGroup, ((i7 >> 12) & 14) | (i7 & 112), 12);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier10;
                modifier6 = modifier8;
                modifier7 = modifier12;
                z4 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier3;
                z4 = z2;
                modifier6 = modifier;
                modifier7 = modifier4;
            }
            f3 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j41
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        RowWithTwoTextKt.a(text1, chaloTextUIState, modifier6, modifier7, modifier5, z4, f3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i8 = i3 | 3456;
        modifier4 = modifier2;
        i4 = i8 | 24576;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                    }
                    i4 |= i10;
                } else {
                    f2 = f;
                }
                i4 |= i10;
            } else {
                f2 = f;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    modifier8 = Modifier.INSTANCE;
                    if (i9 != 0) {
                        modifier4 = modifier8;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                    }
                    i7 = i4;
                    modifier9 = modifier8;
                } else {
                    modifier8 = Modifier.INSTANCE;
                    if (i9 != 0) {
                        modifier4 = modifier8;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                        f2 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                    }
                    i7 = i4;
                    modifier9 = modifier8;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1089293383, i7, -1, "app.chalo.compose.components.RowWithTwoText (RowWithTwoText.kt:20)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i13 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier8);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i13), composerM3915constructorimpl3));
                rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifier13 = modifier4;
                ChaloTextViewKt.a(modifier13, text1, null, null, composerStartRestartGroup, ((i7 >> 9) & 14) | ((i7 << 3) & 112), 12);
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-782664721);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier10 = modifier9;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-782664720);
                    companion = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f2), composerStartRestartGroup, 0);
                    if (z5) {
                        composerStartRestartGroup.startReplaceGroup(316312819);
                        SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1214829141);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier10 = modifier9;
                    ChaloTextViewKt.a(modifier10, chaloTextUIState, null, null, composerStartRestartGroup, ((i7 >> 12) & 14) | (i7 & 112), 12);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier10;
                modifier6 = modifier8;
                modifier7 = modifier13;
                z4 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier3;
                z4 = z2;
                modifier6 = modifier;
                modifier7 = modifier4;
            }
            f3 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j41
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        RowWithTwoTextKt.a(text1, chaloTextUIState, modifier6, modifier7, modifier5, z4, f3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 = 221184 | i8;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                }
                i4 |= i10;
            } else {
                f2 = f;
            }
            i4 |= i10;
        } else {
            f2 = f;
        }
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                modifier8 = Modifier.INSTANCE;
                if (i9 != 0) {
                    modifier4 = modifier8;
                }
                if (i5 == 0) {
                }
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                    f2 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                }
                i7 = i4;
                modifier9 = modifier8;
            } else {
                modifier8 = Modifier.INSTANCE;
                if (i9 != 0) {
                    modifier4 = modifier8;
                }
                if (i5 == 0) {
                }
                if ((i2 & 64) != 0) {
                    i4 &= -3670017;
                    f2 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                }
                i7 = i4;
                modifier9 = modifier8;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1089293383, i7, -1, "app.chalo.compose.components.RowWithTwoText (RowWithTwoText.kt:20)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i14 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier8);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i14), composerM3915constructorimpl4));
            rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifier14 = modifier4;
            ChaloTextViewKt.a(modifier14, text1, null, null, composerStartRestartGroup, ((i7 >> 9) & 14) | ((i7 << 3) & 112), 12);
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-782664721);
                composerStartRestartGroup.endReplaceGroup();
                modifier10 = modifier9;
            } else {
                composerStartRestartGroup.startReplaceGroup(-782664720);
                companion = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, f2), composerStartRestartGroup, 0);
                if (z5) {
                    composerStartRestartGroup.startReplaceGroup(316312819);
                    SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1214829141);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier10 = modifier9;
                ChaloTextViewKt.a(modifier10, chaloTextUIState, null, null, composerStartRestartGroup, ((i7 >> 12) & 14) | (i7 & 112), 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier10;
            modifier6 = modifier8;
            modifier7 = modifier14;
            z4 = z5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier5 = modifier3;
            z4 = z2;
            modifier6 = modifier;
            modifier7 = modifier4;
        }
        f3 = f2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    RowWithTwoTextKt.a(text1, chaloTextUIState, modifier6, modifier7, modifier5, z4, f3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
