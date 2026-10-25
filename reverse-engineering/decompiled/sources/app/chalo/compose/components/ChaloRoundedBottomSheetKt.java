package app.chalo.compose.components;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.dk;
import defpackage.m3;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloRoundedBottomSheetKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db A[PHI: r5 r7 r9 r10
      0x00db: PHI (r5v19 int) = (r5v12 int), (r5v21 int), (r5v22 int) binds: [B:90:0x0106, B:76:0x00d8, B:77:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r7v10 kotlin.jvm.functions.Function0) = (r7v4 kotlin.jvm.functions.Function0), (r7v2 kotlin.jvm.functions.Function0), (r7v2 kotlin.jvm.functions.Function0) binds: [B:90:0x0106, B:76:0x00d8, B:77:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r9v7 boolean) = (r9v4 boolean), (r9v2 boolean), (r9v2 boolean) binds: [B:90:0x0106, B:76:0x00d8, B:77:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r10v14 boolean) = (r10v7 boolean), (r10v6 boolean), (r10v6 boolean) binds: [B:90:0x0106, B:76:0x00d8, B:77:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x018a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0194  */
    public static final void a(final SheetState modalBottomSheetState, Function0 function0, boolean z, boolean z2, boolean z3, final Function3 sheetContent, Composer composer, final int i, final int i2) {
        int i3;
        Function0 function1;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        Composer composer2;
        final Function0 function2;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        boolean z11;
        boolean z12;
        Object objRememberedValue;
        int i7;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(sheetContent, "sheetContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1711706554);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modalBottomSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z4 = z;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        z5 = z2;
                        int i9 = composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        z5 = z2;
                    }
                    i3 |= i9;
                } else {
                    z5 = z2;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z6 = z3;
                        int i10 = composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        z6 = z3;
                    }
                    i3 |= i10;
                } else {
                    z6 = z3;
                }
                if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(sheetContent)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z7, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new wb(8);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function1 = (Function0) objRememberedValue;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            z5 = z4;
                        }
                        if ((i2 & 16) != 0) {
                            i6 = i3 & (-57345);
                            z11 = z4;
                            z12 = z5;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1711706554, i6, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet (ChaloRoundedBottomSheet.kt:30)");
                        }
                        BackHandlerKt.b(!z12, composerStartRestartGroup, 0);
                        Shape shape = ChaloTheme.d(composerStartRestartGroup, 6).e;
                        ModalBottomSheetProperties modalBottomSheetProperties = new ModalBottomSheetProperties(z12, z11);
                        long j = ChaloTheme.a(composerStartRestartGroup, 6).t;
                        Function0 function3 = function1;
                        boolean z13 = z11;
                        ComposableLambda composableLambda = ComposableSingletons$ChaloRoundedBottomSheetKt.f1831a;
                        m3 m3Var = new m3(20);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1858801064, true, new dk(sheetContent, 1), composerStartRestartGroup, 54);
                        int i11 = i6 << 6;
                        composer2 = composerStartRestartGroup;
                        boolean z14 = z4;
                        boolean z15 = z12;
                        ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8(function3, null, modalBottomSheetState, 0.0f, z14, shape, j, 0L, 0.0f, 0L, composableLambda, m3Var, modalBottomSheetProperties, composableLambdaRememberComposableLambda, composer2, ((i6 >> 3) & 14) | (i11 & 896) | (i11 & 57344), 3078, TypedValues.Custom.TYPE_REFERENCE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z8 = z14;
                        function2 = function3;
                        z10 = z13;
                        z9 = z15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    }
                    i6 = i3;
                    z12 = z5;
                    z11 = z6;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1711706554, i6, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet (ChaloRoundedBottomSheet.kt:30)");
                    }
                    BackHandlerKt.b(!z12, composerStartRestartGroup, 0);
                    Shape shape2 = ChaloTheme.d(composerStartRestartGroup, 6).e;
                    ModalBottomSheetProperties modalBottomSheetProperties2 = new ModalBottomSheetProperties(z12, z11);
                    long j2 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                    Function0 function4 = function1;
                    boolean z16 = z11;
                    ComposableLambda composableLambda2 = ComposableSingletons$ChaloRoundedBottomSheetKt.f1831a;
                    m3 m3Var2 = new m3(20);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1858801064, true, new dk(sheetContent, 1), composerStartRestartGroup, 54);
                    int i12 = i6 << 6;
                    composer2 = composerStartRestartGroup;
                    boolean z17 = z4;
                    boolean z18 = z12;
                    ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8(function4, null, modalBottomSheetState, 0.0f, z17, shape2, j2, 0L, 0.0f, 0L, composableLambda2, m3Var2, modalBottomSheetProperties2, composableLambdaRememberComposableLambda2, composer2, ((i6 >> 3) & 14) | (i12 & 896) | (i12 & 57344), 3078, TypedValues.Custom.TYPE_REFERENCE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z8 = z17;
                    function2 = function4;
                    z10 = z16;
                    z9 = z18;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function2 = function1;
                    z8 = z4;
                    z9 = z5;
                    z10 = z6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: fl
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ChaloRoundedBottomSheetKt.a(modalBottomSheetState, function2, z8, z9, z10, sheetContent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i3 |= 384;
            z4 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                    }
                    i3 |= i9;
                } else {
                    z5 = z2;
                }
                i3 |= i9;
            } else {
                z5 = z2;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                    }
                    i3 |= i10;
                } else {
                    z6 = z3;
                }
                i3 |= i10;
            } else {
                z6 = z3;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(sheetContent)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z7, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function1 = (Function0) objRememberedValue;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        z5 = z4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 = i3 & (-57345);
                        z11 = z4;
                        z12 = z5;
                    } else {
                        i6 = i3;
                        z12 = z5;
                        z11 = z6;
                    }
                } else {
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function1 = (Function0) objRememberedValue;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        z5 = z4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 = i3 & (-57345);
                        z11 = z4;
                        z12 = z5;
                    } else {
                        i6 = i3;
                        z12 = z5;
                        z11 = z6;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1711706554, i6, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet (ChaloRoundedBottomSheet.kt:30)");
                }
                BackHandlerKt.b(!z12, composerStartRestartGroup, 0);
                Shape shape3 = ChaloTheme.d(composerStartRestartGroup, 6).e;
                ModalBottomSheetProperties modalBottomSheetProperties3 = new ModalBottomSheetProperties(z12, z11);
                long j3 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                Function0 function5 = function1;
                boolean z19 = z11;
                ComposableLambda composableLambda3 = ComposableSingletons$ChaloRoundedBottomSheetKt.f1831a;
                m3 m3Var3 = new m3(20);
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1858801064, true, new dk(sheetContent, 1), composerStartRestartGroup, 54);
                int i13 = i6 << 6;
                composer2 = composerStartRestartGroup;
                boolean z110 = z4;
                boolean z111 = z12;
                ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8(function5, null, modalBottomSheetState, 0.0f, z110, shape3, j3, 0L, 0.0f, 0L, composableLambda3, m3Var3, modalBottomSheetProperties3, composableLambdaRememberComposableLambda3, composer2, ((i6 >> 3) & 14) | (i13 & 896) | (i13 & 57344), 3078, TypedValues.Custom.TYPE_REFERENCE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z110;
                function2 = function5;
                z10 = z19;
                z9 = z111;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function2 = function1;
                z8 = z4;
                z9 = z5;
                z10 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: fl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloRoundedBottomSheetKt.a(modalBottomSheetState, function2, z8, z9, z10, sheetContent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 48;
        function1 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z4 = z;
                if (composerStartRestartGroup.changed(z4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    z5 = z2;
                    if (composerStartRestartGroup.changed(z5)) {
                    }
                    i3 |= i9;
                } else {
                    z5 = z2;
                }
                i3 |= i9;
            } else {
                z5 = z2;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                    }
                    i3 |= i10;
                } else {
                    z6 = z3;
                }
                i3 |= i10;
            } else {
                z6 = z3;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(sheetContent)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z7, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function1 = (Function0) objRememberedValue;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        z5 = z4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 = i3 & (-57345);
                        z11 = z4;
                        z12 = z5;
                    } else {
                        i6 = i3;
                        z12 = z5;
                        z11 = z6;
                    }
                } else {
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function1 = (Function0) objRememberedValue;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        z5 = z4;
                    }
                    if ((i2 & 16) != 0) {
                        i6 = i3 & (-57345);
                        z11 = z4;
                        z12 = z5;
                    } else {
                        i6 = i3;
                        z12 = z5;
                        z11 = z6;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1711706554, i6, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet (ChaloRoundedBottomSheet.kt:30)");
                }
                BackHandlerKt.b(!z12, composerStartRestartGroup, 0);
                Shape shape4 = ChaloTheme.d(composerStartRestartGroup, 6).e;
                ModalBottomSheetProperties modalBottomSheetProperties4 = new ModalBottomSheetProperties(z12, z11);
                long j4 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                Function0 function6 = function1;
                boolean z112 = z11;
                ComposableLambda composableLambda4 = ComposableSingletons$ChaloRoundedBottomSheetKt.f1831a;
                m3 m3Var4 = new m3(20);
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1858801064, true, new dk(sheetContent, 1), composerStartRestartGroup, 54);
                int i14 = i6 << 6;
                composer2 = composerStartRestartGroup;
                boolean z113 = z4;
                boolean z114 = z12;
                ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8(function6, null, modalBottomSheetState, 0.0f, z113, shape4, j4, 0L, 0.0f, 0L, composableLambda4, m3Var4, modalBottomSheetProperties4, composableLambdaRememberComposableLambda4, composer2, ((i6 >> 3) & 14) | (i14 & 896) | (i14 & 57344), 3078, TypedValues.Custom.TYPE_REFERENCE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z113;
                function2 = function6;
                z10 = z112;
                z9 = z114;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function2 = function1;
                z8 = z4;
                z9 = z5;
                z10 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: fl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloRoundedBottomSheetKt.a(modalBottomSheetState, function2, z8, z9, z10, sheetContent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 384;
        z4 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                z5 = z2;
                if (composerStartRestartGroup.changed(z5)) {
                }
                i3 |= i9;
            } else {
                z5 = z2;
            }
            i3 |= i9;
        } else {
            z5 = z2;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                z6 = z3;
                if (composerStartRestartGroup.changed(z6)) {
                }
                i3 |= i10;
            } else {
                z6 = z3;
            }
            i3 |= i10;
        } else {
            z6 = z3;
        }
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(sheetContent)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((74899 & i3) != 74898) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z7, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function1 = (Function0) objRememberedValue;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    z5 = z4;
                }
                if ((i2 & 16) != 0) {
                    i6 = i3 & (-57345);
                    z11 = z4;
                    z12 = z5;
                } else {
                    i6 = i3;
                    z12 = z5;
                    z11 = z6;
                }
            } else {
                if (i8 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function1 = (Function0) objRememberedValue;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    z5 = z4;
                }
                if ((i2 & 16) != 0) {
                    i6 = i3 & (-57345);
                    z11 = z4;
                    z12 = z5;
                } else {
                    i6 = i3;
                    z12 = z5;
                    z11 = z6;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1711706554, i6, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet (ChaloRoundedBottomSheet.kt:30)");
            }
            BackHandlerKt.b(!z12, composerStartRestartGroup, 0);
            Shape shape5 = ChaloTheme.d(composerStartRestartGroup, 6).e;
            ModalBottomSheetProperties modalBottomSheetProperties5 = new ModalBottomSheetProperties(z12, z11);
            long j5 = ChaloTheme.a(composerStartRestartGroup, 6).t;
            Function0 function7 = function1;
            boolean z115 = z11;
            ComposableLambda composableLambda5 = ComposableSingletons$ChaloRoundedBottomSheetKt.f1831a;
            m3 m3Var5 = new m3(20);
            ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(1858801064, true, new dk(sheetContent, 1), composerStartRestartGroup, 54);
            int i15 = i6 << 6;
            composer2 = composerStartRestartGroup;
            boolean z116 = z4;
            boolean z117 = z12;
            ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8(function7, null, modalBottomSheetState, 0.0f, z116, shape5, j5, 0L, 0.0f, 0L, composableLambda5, m3Var5, modalBottomSheetProperties5, composableLambdaRememberComposableLambda5, composer2, ((i6 >> 3) & 14) | (i15 & 896) | (i15 & 57344), 3078, TypedValues.Custom.TYPE_REFERENCE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z8 = z116;
            function2 = function7;
            z10 = z115;
            z9 = z117;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function2 = function1;
            z8 = z4;
            z9 = z5;
            z10 = z6;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: fl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloRoundedBottomSheetKt.a(modalBottomSheetState, function2, z8, z9, z10, sheetContent, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
