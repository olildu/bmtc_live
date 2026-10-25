package app.chalo.compose.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import defpackage.fj;
import defpackage.mk;
import defpackage.n4;
import defpackage.pk;
import defpackage.qk;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloLoadingDialogKt {
    public static final void a(LoadingDialogUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-550262415);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-550262415, i2, -1, "app.chalo.compose.components.ChaloLoadingDialog (ChaloLoadingDialog.kt:32)");
            }
            c(state.d, ComposableLambdaKt.rememberComposableLambda(-305989925, true, new n4(state, 9), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(state, i, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086 A[PHI: r1 r2 r5
      0x0086: PHI (r1v9 java.lang.String) = (r1v5 java.lang.String), (r1v3 java.lang.String), (r1v3 java.lang.String) binds: [B:55:0x009a, B:47:0x0082, B:48:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r2v12 int) = (r2v8 int), (r2v5 int), (r2v13 int) binds: [B:55:0x009a, B:47:0x0082, B:48:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r5v8 boolean) = (r5v4 boolean), (r5v2 boolean), (r5v2 boolean) binds: [B:55:0x009a, B:47:0x0082, B:48:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, boolean z, Function0 function0, Composer composer, int i, int i2) {
        String strC;
        int i3;
        boolean z2;
        int i4;
        Function0 function1;
        int i5;
        boolean z3;
        boolean z4;
        Function0 function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        boolean z5;
        Function0 function3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2107984271);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                strC = str;
                int i6 = composerStartRestartGroup.changed(strC) ? 4 : 2;
                i3 = i6 | i;
            } else {
                strC = str;
            }
            i3 = i6 | i;
        } else {
            strC = str;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 1) != 0) {
                            strC = StringResourcesHelperKt.c(StringEnum.LOADING_THREE_DOTS, new Object[0], composerStartRestartGroup, 6);
                            i3 &= -15;
                        }
                        if (i7 != 0) {
                            z2 = false;
                        }
                        if (i4 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new wb(8);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            z5 = z2;
                            function3 = (Function0) objRememberedValue;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2107984271, i3, -1, "app.chalo.compose.components.ChaloLoadingDialog (ChaloLoadingDialog.kt:80)");
                        }
                        BackHandlerKt.b(!z5, composerStartRestartGroup, 0);
                        AndroidDialog_androidKt.Dialog(function3, new DialogProperties(z5, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-410831238, true, new pk(strC, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2 = function3;
                        z4 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 1) != 0) {
                            i3 &= -15;
                        }
                    }
                    z5 = z2;
                    function3 = function1;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2107984271, i3, -1, "app.chalo.compose.components.ChaloLoadingDialog (ChaloLoadingDialog.kt:80)");
                    }
                    BackHandlerKt.b(!z5, composerStartRestartGroup, 0);
                    AndroidDialog_androidKt.Dialog(function3, new DialogProperties(z5, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-410831238, true, new pk(strC, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function3;
                    z4 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    function2 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new qk(strC, z4, function2, i, i2, 0));
                }
            }
            i3 |= 384;
            function1 = function0;
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 1) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.LOADING_THREE_DOTS, new Object[0], composerStartRestartGroup, 6);
                        i3 &= -15;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z5 = z2;
                        function3 = (Function0) objRememberedValue;
                    } else {
                        z5 = z2;
                        function3 = function1;
                    }
                } else {
                    if ((i2 & 1) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.LOADING_THREE_DOTS, new Object[0], composerStartRestartGroup, 6);
                        i3 &= -15;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z5 = z2;
                        function3 = (Function0) objRememberedValue;
                    } else {
                        z5 = z2;
                        function3 = function1;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2107984271, i3, -1, "app.chalo.compose.components.ChaloLoadingDialog (ChaloLoadingDialog.kt:80)");
                }
                BackHandlerKt.b(!z5, composerStartRestartGroup, 0);
                AndroidDialog_androidKt.Dialog(function3, new DialogProperties(z5, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-410831238, true, new pk(strC, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function3;
                z4 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                function2 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new qk(strC, z4, function2, i, i2, 0));
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 1) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.LOADING_THREE_DOTS, new Object[0], composerStartRestartGroup, 6);
                        i3 &= -15;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z5 = z2;
                        function3 = (Function0) objRememberedValue;
                    } else {
                        z5 = z2;
                        function3 = function1;
                    }
                } else {
                    if ((i2 & 1) != 0) {
                        strC = StringResourcesHelperKt.c(StringEnum.LOADING_THREE_DOTS, new Object[0], composerStartRestartGroup, 6);
                        i3 &= -15;
                    }
                    if (i7 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        z5 = z2;
                        function3 = (Function0) objRememberedValue;
                    } else {
                        z5 = z2;
                        function3 = function1;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2107984271, i3, -1, "app.chalo.compose.components.ChaloLoadingDialog (ChaloLoadingDialog.kt:80)");
                }
                BackHandlerKt.b(!z5, composerStartRestartGroup, 0);
                AndroidDialog_androidKt.Dialog(function3, new DialogProperties(z5, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-410831238, true, new pk(strC, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function3;
                z4 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                function2 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new qk(strC, z4, function2, i, i2, 0));
            }
        }
        i3 |= 384;
        function1 = function0;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 1) != 0) {
                    strC = StringResourcesHelperKt.c(StringEnum.LOADING_THREE_DOTS, new Object[0], composerStartRestartGroup, 6);
                    i3 &= -15;
                }
                if (i7 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    z5 = z2;
                    function3 = (Function0) objRememberedValue;
                } else {
                    z5 = z2;
                    function3 = function1;
                }
            } else {
                if ((i2 & 1) != 0) {
                    strC = StringResourcesHelperKt.c(StringEnum.LOADING_THREE_DOTS, new Object[0], composerStartRestartGroup, 6);
                    i3 &= -15;
                }
                if (i7 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    z5 = z2;
                    function3 = (Function0) objRememberedValue;
                } else {
                    z5 = z2;
                    function3 = function1;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2107984271, i3, -1, "app.chalo.compose.components.ChaloLoadingDialog (ChaloLoadingDialog.kt:80)");
            }
            BackHandlerKt.b(!z5, composerStartRestartGroup, 0);
            AndroidDialog_androidKt.Dialog(function3, new DialogProperties(z5, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-410831238, true, new pk(strC, 0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function3;
            z4 = z5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
            function2 = function1;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qk(strC, z4, function2, i, i2, 0));
        }
    }

    public static final void c(DialogUIEventHandler spec, Function2 content, Composer composer, int i) {
        int i2;
        Function2 function2;
        Intrinsics.i(spec, "spec");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1190697954);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(spec) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1190697954, i2, -1, "app.chalo.compose.components.Dialog (ChaloLoadingDialog.kt:57)");
            }
            BackHandlerKt.b(!spec.f9988a, composerStartRestartGroup, 0);
            DialogDismissRequest dialogDismissRequest = spec.c;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(dialogDismissRequest);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ChaloLoadingDialogKt$Dialog$1$1 chaloLoadingDialogKt$Dialog$1$1 = new ChaloLoadingDialogKt$Dialog$1$1(0, dialogDismissRequest, DialogDismissRequest.class, "onDismissRequest", "onDismissRequest()V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloLoadingDialogKt$Dialog$1$1);
                objRememberedValue = chaloLoadingDialogKt$Dialog$1$1;
            }
            function2 = content;
            AndroidDialog_androidKt.Dialog((Function0) ((KFunction) objRememberedValue), new DialogProperties(spec.f9988a, spec.b, false, 4, (DefaultConstructorMarker) null), function2, composerStartRestartGroup, (i2 << 3) & 896, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = content;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(spec, function2, i, 6));
        }
    }
}
