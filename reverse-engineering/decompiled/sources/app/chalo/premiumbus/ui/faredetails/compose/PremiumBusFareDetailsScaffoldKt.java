package app.chalo.premiumbus.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScaffoldKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsErrorScreenUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsScreenUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.snackbar.SnackbarUIState;
import defpackage.b3;
import defpackage.dq;
import defpackage.eq0;
import defpackage.ni;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsScaffoldKt {
    public static final void a(PremiumBusFareDetailsErrorScreenUiState premiumBusFareDetailsErrorScreenUiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1517413028);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(premiumBusFareDetailsErrorScreenUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1517413028, i2, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsErrorScreen (PremiumBusFareDetailsScaffold.kt:102)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            ChaloTextViewKt.a(null, premiumBusFareDetailsErrorScreenUiState.f7583a, null, null, composerStartRestartGroup, 0, 13);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            if (b3.s(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), premiumBusFareDetailsErrorScreenUiState.b)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(premiumBusFareDetailsErrorScreenUiState, modifier, i, 18));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x0201 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x019d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e3  */
    public static final void b(final PremiumBusFareDetailsUiState state, final Modifier modifier, Arrangement.Vertical vertical, Function2 function2, final Function3 body, Composer composer, final int i, final int i2) {
        int i3;
        Arrangement.Vertical vertical2;
        int i4;
        Function2 function3;
        int i5;
        int i6;
        boolean z;
        Modifier modifier2;
        Composer composer2;
        final Arrangement.Vertical vertical3;
        final Function2 function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function5;
        final Arrangement.Vertical top;
        final Function2 function6;
        PremiumBusFareDetailsScreenUISpecs premiumBusFareDetailsScreenUISpecs;
        PremiumBusFareDetailsContent premiumBusFareDetailsContent;
        boolean z2;
        PremiumBusFareDetailsContent.Error error;
        PremiumBusFareDetailsErrorScreenUiState premiumBusFareDetailsErrorScreenUiState;
        Function2 function7;
        Function0<ComposeUiNode> constructor;
        SnackbarUIState snackbarUIState;
        int i7;
        Intrinsics.i(state, "state");
        Intrinsics.i(body, "body");
        Composer composerStartRestartGroup = composer.startRestartGroup(-601429705);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                vertical2 = vertical;
                i3 |= composerStartRestartGroup.changed(vertical2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changedInstance(body)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i6 = i3;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i6 & 1)) {
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if (i4 != 0) {
                        function6 = ComposableSingletons$PremiumBusFareDetailsScaffoldKt.f7560a;
                    } else {
                        function6 = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-601429705, i6, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScaffold (PremiumBusFareDetailsScaffold.kt:43)");
                    }
                    premiumBusFareDetailsScreenUISpecs = state.f;
                    premiumBusFareDetailsContent = state.c;
                    z2 = premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.Error;
                    if (z2) {
                        error = (PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent;
                    } else {
                        error = null;
                    }
                    if (error != null) {
                        premiumBusFareDetailsErrorScreenUiState = error.b;
                    } else {
                        premiumBusFareDetailsErrorScreenUiState = null;
                    }
                    if (premiumBusFareDetailsErrorScreenUiState != null) {
                        composerStartRestartGroup.startReplaceGroup(1411658048);
                        a(premiumBusFareDetailsErrorScreenUiState, modifier, composerStartRestartGroup, i6 & 112);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            return;
                        }
                        final int i9 = 0;
                        function5 = new Function2() { // from class: xt0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i9) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                    } else {
                        modifier2 = modifier;
                        Arrangement.Vertical vertical4 = top;
                        function7 = function6;
                        composerStartRestartGroup.startReplaceGroup(1409342379);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusFareDetailsScreenUISpecs.f7606a), null, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        constructor = companion.getConstructor();
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
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i10), composerM3915constructorimpl));
                        Modifier modifierA = dq.a(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1623823357, true, new ni(vertical4, premiumBusFareDetailsContent, body, state, premiumBusFareDetailsScreenUISpecs, 2), composerStartRestartGroup, 54);
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(modifierA, null, false, composableLambdaRememberComposableLambda, composer2, 3072, 6);
                        if (z2) {
                            composer2.startReplaceGroup(-487198783);
                            snackbarUIState = ((PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent).f7573a;
                            if (snackbarUIState == null) {
                                composer2.startReplaceGroup(-487198784);
                            } else {
                                composer2.startReplaceGroup(-487198783);
                                PremiumBusFareDetailsFooterKt.b(0, composer2, null, snackbarUIState);
                            }
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-487131947);
                            function7.invoke(composer2, Integer.valueOf((i6 >> 9) & 14));
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical3 = vertical4;
                        function4 = function7;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
                modifier2 = modifier;
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                vertical3 = vertical2;
                function4 = function3;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i11 = 1;
                    final Modifier modifier3 = modifier2;
                    function5 = new Function2() { // from class: xt0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i11) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    PremiumBusFareDetailsScaffoldKt.b(state, modifier3, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    PremiumBusFareDetailsScaffoldKt.b(state, modifier3, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
            }
            i3 |= 3072;
            function3 = function2;
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(body)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i6 & 1)) {
                if (i8 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if (i4 != 0) {
                    function6 = ComposableSingletons$PremiumBusFareDetailsScaffoldKt.f7560a;
                } else {
                    function6 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-601429705, i6, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScaffold (PremiumBusFareDetailsScaffold.kt:43)");
                }
                premiumBusFareDetailsScreenUISpecs = state.f;
                premiumBusFareDetailsContent = state.c;
                z2 = premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.Error;
                if (z2) {
                    error = (PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent;
                } else {
                    error = null;
                }
                if (error != null) {
                    premiumBusFareDetailsErrorScreenUiState = error.b;
                } else {
                    premiumBusFareDetailsErrorScreenUiState = null;
                }
                if (premiumBusFareDetailsErrorScreenUiState != null) {
                    composerStartRestartGroup.startReplaceGroup(1411658048);
                    a(premiumBusFareDetailsErrorScreenUiState, modifier, composerStartRestartGroup, i6 & 112);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    final int i12 = 0;
                    function5 = new Function2() { // from class: xt0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i12) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                } else {
                    modifier2 = modifier;
                    Arrangement.Vertical vertical5 = top;
                    function7 = function6;
                    composerStartRestartGroup.startReplaceGroup(1409342379);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusFareDetailsScreenUISpecs.f7606a), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i13 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default2);
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
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i13), composerM3915constructorimpl2));
                    Modifier modifierA2 = dq.a(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1623823357, true, new ni(vertical5, premiumBusFareDetailsContent, body, state, premiumBusFareDetailsScreenUISpecs, 2), composerStartRestartGroup, 54);
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifierA2, null, false, composableLambdaRememberComposableLambda2, composer2, 3072, 6);
                    if (z2) {
                        composer2.startReplaceGroup(-487198783);
                        snackbarUIState = ((PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent).f7573a;
                        if (snackbarUIState == null) {
                            composer2.startReplaceGroup(-487198784);
                        } else {
                            composer2.startReplaceGroup(-487198783);
                            PremiumBusFareDetailsFooterKt.b(0, composer2, null, snackbarUIState);
                        }
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-487131947);
                        function7.invoke(composer2, Integer.valueOf((i6 >> 9) & 14));
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical3 = vertical5;
                    function4 = function7;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            vertical3 = vertical2;
            function4 = function3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i14 = 1;
                final Modifier modifier4 = modifier2;
                function5 = new Function2() { // from class: xt0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i14) {
                            case 0:
                                ((Integer) obj2).getClass();
                                PremiumBusFareDetailsScaffoldKt.b(state, modifier4, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                PremiumBusFareDetailsScaffoldKt.b(state, modifier4, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
        }
        i3 |= 384;
        vertical2 = vertical;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(body)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i6 & 1)) {
                if (i8 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if (i4 != 0) {
                    function6 = ComposableSingletons$PremiumBusFareDetailsScaffoldKt.f7560a;
                } else {
                    function6 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-601429705, i6, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScaffold (PremiumBusFareDetailsScaffold.kt:43)");
                }
                premiumBusFareDetailsScreenUISpecs = state.f;
                premiumBusFareDetailsContent = state.c;
                z2 = premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.Error;
                if (z2) {
                    error = (PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent;
                } else {
                    error = null;
                }
                if (error != null) {
                    premiumBusFareDetailsErrorScreenUiState = error.b;
                } else {
                    premiumBusFareDetailsErrorScreenUiState = null;
                }
                if (premiumBusFareDetailsErrorScreenUiState != null) {
                    composerStartRestartGroup.startReplaceGroup(1411658048);
                    a(premiumBusFareDetailsErrorScreenUiState, modifier, composerStartRestartGroup, i6 & 112);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    final int i15 = 0;
                    function5 = new Function2() { // from class: xt0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i15) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                } else {
                    modifier2 = modifier;
                    Arrangement.Vertical vertical6 = top;
                    function7 = function6;
                    composerStartRestartGroup.startReplaceGroup(1409342379);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM264backgroundbw27NRU$default3 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusFareDetailsScreenUISpecs.f7606a), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i16 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default3);
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
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i16), composerM3915constructorimpl3));
                    Modifier modifierA3 = dq.a(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1623823357, true, new ni(vertical6, premiumBusFareDetailsContent, body, state, premiumBusFareDetailsScreenUISpecs, 2), composerStartRestartGroup, 54);
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(modifierA3, null, false, composableLambdaRememberComposableLambda3, composer2, 3072, 6);
                    if (z2) {
                        composer2.startReplaceGroup(-487198783);
                        snackbarUIState = ((PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent).f7573a;
                        if (snackbarUIState == null) {
                            composer2.startReplaceGroup(-487198784);
                        } else {
                            composer2.startReplaceGroup(-487198783);
                            PremiumBusFareDetailsFooterKt.b(0, composer2, null, snackbarUIState);
                        }
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-487131947);
                        function7.invoke(composer2, Integer.valueOf((i6 >> 9) & 14));
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical3 = vertical6;
                    function4 = function7;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            vertical3 = vertical2;
            function4 = function3;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i17 = 1;
                final Modifier modifier5 = modifier2;
                function5 = new Function2() { // from class: xt0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i17) {
                            case 0:
                                ((Integer) obj2).getClass();
                                PremiumBusFareDetailsScaffoldKt.b(state, modifier5, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                PremiumBusFareDetailsScaffoldKt.b(state, modifier5, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
        }
        i3 |= 3072;
        function3 = function2;
        if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(body)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        i6 = i3;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i6 & 1)) {
            if (i8 != 0) {
                top = Arrangement.INSTANCE.getTop();
            } else {
                top = vertical2;
            }
            if (i4 != 0) {
                function6 = ComposableSingletons$PremiumBusFareDetailsScaffoldKt.f7560a;
            } else {
                function6 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601429705, i6, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsScaffold (PremiumBusFareDetailsScaffold.kt:43)");
            }
            premiumBusFareDetailsScreenUISpecs = state.f;
            premiumBusFareDetailsContent = state.c;
            z2 = premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.Error;
            if (z2) {
                error = (PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent;
            } else {
                error = null;
            }
            if (error != null) {
                premiumBusFareDetailsErrorScreenUiState = error.b;
            } else {
                premiumBusFareDetailsErrorScreenUiState = null;
            }
            if (premiumBusFareDetailsErrorScreenUiState != null) {
                composerStartRestartGroup.startReplaceGroup(1411658048);
                a(premiumBusFareDetailsErrorScreenUiState, modifier, composerStartRestartGroup, i6 & 112);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    return;
                }
                final int i18 = 0;
                function5 = new Function2() { // from class: xt0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i18) {
                            case 0:
                                ((Integer) obj2).getClass();
                                PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                PremiumBusFareDetailsScaffoldKt.b(state, modifier, top, function6, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                modifier2 = modifier;
                Arrangement.Vertical vertical7 = top;
                function7 = function6;
                composerStartRestartGroup.startReplaceGroup(1409342379);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM264backgroundbw27NRU$default4 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusFareDetailsScreenUISpecs.f7606a), null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i19 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default4);
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
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i19), composerM3915constructorimpl4));
                Modifier modifierA4 = dq.a(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-1623823357, true, new ni(vertical7, premiumBusFareDetailsContent, body, state, premiumBusFareDetailsScreenUISpecs, 2), composerStartRestartGroup, 54);
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(modifierA4, null, false, composableLambdaRememberComposableLambda4, composer2, 3072, 6);
                if (z2) {
                    composer2.startReplaceGroup(-487198783);
                    snackbarUIState = ((PremiumBusFareDetailsContent.Error) premiumBusFareDetailsContent).f7573a;
                    if (snackbarUIState == null) {
                        composer2.startReplaceGroup(-487198784);
                    } else {
                        composer2.startReplaceGroup(-487198783);
                        PremiumBusFareDetailsFooterKt.b(0, composer2, null, snackbarUIState);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-487131947);
                    function7.invoke(composer2, Integer.valueOf((i6 >> 9) & 14));
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical3 = vertical7;
                function4 = function7;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function5);
        }
        modifier2 = modifier;
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        vertical3 = vertical2;
        function4 = function3;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i110 = 1;
            final Modifier modifier6 = modifier2;
            function5 = new Function2() { // from class: xt0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i110) {
                        case 0:
                            ((Integer) obj2).getClass();
                            PremiumBusFareDetailsScaffoldKt.b(state, modifier6, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            PremiumBusFareDetailsScaffoldKt.b(state, modifier6, vertical3, function4, body, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function5);
        }
    }
}
