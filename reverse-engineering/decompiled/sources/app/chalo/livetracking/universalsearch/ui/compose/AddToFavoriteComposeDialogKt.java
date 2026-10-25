package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import app.chalo.livetracking.universalsearch.ui.compose.AddToFavoriteComposeDialogKt;
import defpackage.t1;
import defpackage.u1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showDialog", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "showErrorString", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AddToFavoriteComposeDialogKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final Function0 function0, final Function1 function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1294419270);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1294419270, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.AddToFavoriteComposeDialog (AddToFavoriteComposeDialog.kt:39)");
            }
            if (z) {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState2 = (MutableState) objRememberedValue2;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState3 = (MutableState) objRememberedValue3;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1827514371);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new t1(mutableState, 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog((Function0) objRememberedValue4, null, ComposableLambdaKt.rememberComposableLambda(38393955, true, new u1(mutableState2, mutableState3, function0, function1, mutableState), composerStartRestartGroup, 54), composer2, 390, 2);
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-1829515576);
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: s1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        Composer composer3 = (Composer) obj;
                        ((Integer) obj2).getClass();
                        switch (i4) {
                            case 0:
                                AddToFavoriteComposeDialogKt.a(z, function0, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                AddToFavoriteComposeDialogKt.a(z, function0, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i4 = 1;
            function2 = new Function2() { // from class: s1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            AddToFavoriteComposeDialogKt.a(z, function0, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            AddToFavoriteComposeDialogKt.a(z, function0, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }
}
