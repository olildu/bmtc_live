package app.chalo.core.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.navigation.parent.ParentComponent;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.arkivanov.decompose.extensions.compose.stack.ChildrenKt;
import com.arkivanov.decompose.router.stack.ChildStack;
import com.arkivanov.essenty.backhandler.BackHandler;
import defpackage.dk;
import defpackage.fp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006 \u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/navigation/child/ChildComponent;", "CHILD", "Lcom/arkivanov/decompose/router/stack/ChildStack;", "childStack", "core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DecomposeParentScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(DefaultParentComponent defaultParentComponent, Function3 setupChildren, Composer composer, int i) {
        int i2;
        Composer composer2;
        DefaultParentComponent defaultParentComponent2 = defaultParentComponent;
        Intrinsics.i(setupChildren, "setupChildren");
        Composer composerStartRestartGroup = composer.startRestartGroup(1947530680);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(defaultParentComponent2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(setupChildren) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947530680, i2, -1, "app.chalo.core.compose.DecomposeParentScreen (DecomposeParentScreen.kt:23)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(defaultParentComponent2.g(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Object obj = ((ChildStack) mutableStateA.getValue()).f12382a.b;
            boolean zChanged = composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new DecomposeParentScreenKt$DecomposeParentScreen$1$1(softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(obj, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            ChildStack childStack = (ChildStack) mutableStateA.getValue();
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            BackHandler d = defaultParentComponent2.f6004a.getD();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(defaultParentComponent2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                DecomposeParentScreenKt$DecomposeParentScreen$2$1 decomposeParentScreenKt$DecomposeParentScreen$2$1 = new DecomposeParentScreenKt$DecomposeParentScreen$2$1(0, defaultParentComponent2, ParentComponent.class, "onBackClicked", "onBackClicked()Z", 8);
                composerStartRestartGroup.updateRememberedValue(decomposeParentScreenKt$DecomposeParentScreen$2$1);
                objRememberedValue2 = decomposeParentScreenKt$DecomposeParentScreen$2$1;
            }
            composer2 = composerStartRestartGroup;
            ChildrenKt.a(childStack, modifierM264backgroundbw27NRU$default, DecomposeStackAnimation_androidKt.a(d, (Function0) objRememberedValue2), ComposableLambdaKt.rememberComposableLambda(-1768476779, true, new dk(setupChildren, 2), composerStartRestartGroup, 54), composer2, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            defaultParentComponent2 = defaultParentComponent2;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(defaultParentComponent2, setupChildren, i, 29));
        }
    }
}
