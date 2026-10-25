package app.chalo.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloToolBarKt {
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x0133  */
    /* JADX WARN: Code duplicated, block: B:87:0x0137  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void a(Function2 function2, IconType iconType, float f, long j, Function3 function3, Function0 function0, Composer composer, final int i, final int i2) {
        Function2 function4;
        int i3;
        float f2;
        Function3 function5;
        int i4;
        Function0 function1;
        int i5;
        boolean z;
        Composer composer2;
        final IconType iconType2;
        final Function2 function6;
        final float f3;
        final Function3 function7;
        final Function0 function8;
        final long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2 function9;
        IconType iconType3;
        long j3;
        int i6;
        float f4;
        Function0<ComposeUiNode> constructor;
        Composer composerStartRestartGroup = composer.startRestartGroup(-443013185);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            function4 = function2;
        } else if ((i & 6) == 0) {
            function4 = function2;
            i3 = (composerStartRestartGroup.changedInstance(function4) ? 4 : 2) | i;
        } else {
            function4 = function2;
            i3 = i;
        }
        int i8 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f2 = f;
                int i9 = composerStartRestartGroup.changed(f2) ? 256 : 128;
                i8 |= i9;
            } else {
                f2 = f;
            }
            i8 |= i9;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            i8 |= 1024;
        }
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                function5 = function3;
                i8 |= composerStartRestartGroup.changedInstance(function5) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i8 |= i5;
                }
                if ((74899 & i8) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            function9 = ComposableSingletons$ChaloToolBarKt.f1835a;
                        } else {
                            function9 = function4;
                        }
                        iconType3 = IconType.IC_ARROW_BACK;
                        if ((i2 & 4) != 0) {
                            f2 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                            i8 &= -897;
                        }
                        j3 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                        i6 = i8 & (-7169);
                        if (i10 != 0) {
                            function7 = ComposableSingletons$ChaloToolBarKt.b;
                        } else {
                            function7 = function5;
                        }
                        if (i4 != 0) {
                            f4 = f2;
                            function1 = null;
                        } else {
                            f4 = f2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i8 &= -897;
                        }
                        j3 = j;
                        i6 = i8 & (-7169);
                        function9 = function4;
                        f4 = f2;
                        function7 = function5;
                        iconType3 = iconType;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-443013185, i6, -1, "app.chalo.compose.components.ChaloToolBar (ChaloToolBar.kt:34)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    final Function2 function10 = function9;
                    final IconType iconType4 = iconType3;
                    final Function3 function11 = function7;
                    final Function0 function12 = function1;
                    final long j4 = j3;
                    function8 = function12;
                    SurfaceKt.m2480SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-246473712, true, new Function2() { // from class: mm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer3 = (Composer) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-246473712, iIntValue, -1, "app.chalo.compose.components.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:39)");
                                }
                                AppBarKt.m1640TopAppBarGHTll3U(function10, null, ComposableLambdaKt.rememberComposableLambda(-48818474, true, new h3(9, function12, iconType4), composer3, 54), function11, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j4, 0L, 0L, 0L, 0L, 0L, composer3, TopAppBarDefaults.$stable << 18, 62), null, composer3, 384, 178);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 9) & 458752) | 12582912, 95);
                    composer2 = composerStartRestartGroup;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.c(composer2, 6).b), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function6 = function10;
                    j2 = j4;
                    f3 = f4;
                    iconType2 = iconType4;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    iconType2 = iconType;
                    function6 = function4;
                    f3 = f2;
                    function7 = function5;
                    function8 = function1;
                    j2 = j;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: om
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ChaloToolBarKt.a(function6, iconType2, f3, j2, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function1 = function0;
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        function9 = ComposableSingletons$ChaloToolBarKt.f1835a;
                    } else {
                        function9 = function4;
                    }
                    iconType3 = IconType.IC_ARROW_BACK;
                    if ((i2 & 4) != 0) {
                        f2 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i8 &= -897;
                    }
                    j3 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                    i6 = i8 & (-7169);
                    if (i10 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.b;
                    } else {
                        function7 = function5;
                    }
                    if (i4 != 0) {
                        f4 = f2;
                        function1 = null;
                    } else {
                        f4 = f2;
                    }
                } else {
                    if (i7 != 0) {
                        function9 = ComposableSingletons$ChaloToolBarKt.f1835a;
                    } else {
                        function9 = function4;
                    }
                    iconType3 = IconType.IC_ARROW_BACK;
                    if ((i2 & 4) != 0) {
                        f2 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i8 &= -897;
                    }
                    j3 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                    i6 = i8 & (-7169);
                    if (i10 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.b;
                    } else {
                        function7 = function5;
                    }
                    if (i4 != 0) {
                        f4 = f2;
                        function1 = null;
                    } else {
                        f4 = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-443013185, i6, -1, "app.chalo.compose.components.ChaloToolBar (ChaloToolBar.kt:34)");
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i12), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                final Function2 function13 = function9;
                final IconType iconType5 = iconType3;
                final Function3 function14 = function7;
                final Function0 function15 = function1;
                final long j5 = j3;
                function8 = function15;
                SurfaceKt.m2480SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-246473712, true, new Function2() { // from class: mm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246473712, iIntValue, -1, "app.chalo.compose.components.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:39)");
                            }
                            AppBarKt.m1640TopAppBarGHTll3U(function13, null, ComposableLambdaKt.rememberComposableLambda(-48818474, true, new h3(9, function15, iconType5), composer3, 54), function14, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j5, 0L, 0L, 0L, 0L, 0L, composer3, TopAppBarDefaults.$stable << 18, 62), null, composer3, 384, 178);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 9) & 458752) | 12582912, 95);
                composer2 = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.c(composer2, 6).b), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function13;
                j2 = j5;
                f3 = f4;
                iconType2 = iconType5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                iconType2 = iconType;
                function6 = function4;
                f3 = f2;
                function7 = function5;
                function8 = function1;
                j2 = j;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: om
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloToolBarKt.a(function6, iconType2, f3, j2, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i8 |= 24576;
        function5 = function3;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i8 |= i5;
            }
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        function9 = ComposableSingletons$ChaloToolBarKt.f1835a;
                    } else {
                        function9 = function4;
                    }
                    iconType3 = IconType.IC_ARROW_BACK;
                    if ((i2 & 4) != 0) {
                        f2 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i8 &= -897;
                    }
                    j3 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                    i6 = i8 & (-7169);
                    if (i10 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.b;
                    } else {
                        function7 = function5;
                    }
                    if (i4 != 0) {
                        f4 = f2;
                        function1 = null;
                    } else {
                        f4 = f2;
                    }
                } else {
                    if (i7 != 0) {
                        function9 = ComposableSingletons$ChaloToolBarKt.f1835a;
                    } else {
                        function9 = function4;
                    }
                    iconType3 = IconType.IC_ARROW_BACK;
                    if ((i2 & 4) != 0) {
                        f2 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        i8 &= -897;
                    }
                    j3 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                    i6 = i8 & (-7169);
                    if (i10 != 0) {
                        function7 = ComposableSingletons$ChaloToolBarKt.b;
                    } else {
                        function7 = function5;
                    }
                    if (i4 != 0) {
                        f4 = f2;
                        function1 = null;
                    } else {
                        f4 = f2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-443013185, i6, -1, "app.chalo.compose.components.ChaloToolBar (ChaloToolBar.kt:34)");
                }
                Modifier.Companion companion5 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i13 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion5);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
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
                pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i13), composerM3915constructorimpl3));
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                final Function2 function16 = function9;
                final IconType iconType6 = iconType3;
                final Function3 function17 = function7;
                final Function0 function18 = function1;
                final long j6 = j3;
                function8 = function18;
                SurfaceKt.m2480SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-246473712, true, new Function2() { // from class: mm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer3 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246473712, iIntValue, -1, "app.chalo.compose.components.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:39)");
                            }
                            AppBarKt.m1640TopAppBarGHTll3U(function16, null, ComposableLambdaKt.rememberComposableLambda(-48818474, true, new h3(9, function18, iconType6), composer3, 54), function17, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j6, 0L, 0L, 0L, 0L, 0L, composer3, TopAppBarDefaults.$stable << 18, 62), null, composer3, 384, 178);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 9) & 458752) | 12582912, 95);
                composer2 = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion5, ChaloTheme.c(composer2, 6).b), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function6 = function16;
                j2 = j6;
                f3 = f4;
                iconType2 = iconType6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                iconType2 = iconType;
                function6 = function4;
                f3 = f2;
                function7 = function5;
                function8 = function1;
                j2 = j;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: om
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloToolBarKt.a(function6, iconType2, f3, j2, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function1 = function0;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    function9 = ComposableSingletons$ChaloToolBarKt.f1835a;
                } else {
                    function9 = function4;
                }
                iconType3 = IconType.IC_ARROW_BACK;
                if ((i2 & 4) != 0) {
                    f2 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    i8 &= -897;
                }
                j3 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                i6 = i8 & (-7169);
                if (i10 != 0) {
                    function7 = ComposableSingletons$ChaloToolBarKt.b;
                } else {
                    function7 = function5;
                }
                if (i4 != 0) {
                    f4 = f2;
                    function1 = null;
                } else {
                    f4 = f2;
                }
            } else {
                if (i7 != 0) {
                    function9 = ComposableSingletons$ChaloToolBarKt.f1835a;
                } else {
                    function9 = function4;
                }
                iconType3 = IconType.IC_ARROW_BACK;
                if ((i2 & 4) != 0) {
                    f2 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    i8 &= -897;
                }
                j3 = ChaloTheme.a(composerStartRestartGroup, 6).u;
                i6 = i8 & (-7169);
                if (i10 != 0) {
                    function7 = ComposableSingletons$ChaloToolBarKt.b;
                } else {
                    function7 = function5;
                }
                if (i4 != 0) {
                    f4 = f2;
                    function1 = null;
                } else {
                    f4 = f2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-443013185, i6, -1, "app.chalo.compose.components.ChaloToolBar (ChaloToolBar.kt:34)");
            }
            Modifier.Companion companion7 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i14 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion7);
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
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
            pk0.v(companion8, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl4, Integer.valueOf(i14), composerM3915constructorimpl4));
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            final Function2 function19 = function9;
            final IconType iconType7 = iconType3;
            final Function3 function110 = function7;
            final Function0 function111 = function1;
            final long j7 = j3;
            function8 = function111;
            SurfaceKt.m2480SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-246473712, true, new Function2() { // from class: mm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-246473712, iIntValue, -1, "app.chalo.compose.components.ChaloToolBar.<anonymous>.<anonymous> (ChaloToolBar.kt:39)");
                        }
                        AppBarKt.m1640TopAppBarGHTll3U(function19, null, ComposableLambdaKt.rememberComposableLambda(-48818474, true, new h3(9, function111, iconType7), composer3, 54), function110, 0.0f, null, TopAppBarDefaults.INSTANCE.m2838topAppBarColors5tl4gsc(j7, 0L, 0L, 0L, 0L, 0L, composer3, TopAppBarDefaults.$stable << 18, 62), null, composer3, 384, 178);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 9) & 458752) | 12582912, 95);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion7, ChaloTheme.c(composer2, 6).b), composer2, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function6 = function19;
            j2 = j7;
            f3 = f4;
            iconType2 = iconType7;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            iconType2 = iconType;
            function6 = function4;
            f3 = f2;
            function7 = function5;
            function8 = function1;
            j2 = j;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: om
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloToolBarKt.a(function6, iconType2, f3, j2, function7, function8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
