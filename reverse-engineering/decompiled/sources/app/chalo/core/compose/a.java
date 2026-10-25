package app.chalo.core.compose;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.insets.NavigationBarInsetsKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.providers.toast.KotlinToastManager;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.arkivanov.decompose.extensions.compose.stack.ChildrenKt;
import com.arkivanov.decompose.router.stack.ChildStack;
import com.arkivanov.essenty.backhandler.BackHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2044a;
    public final /* synthetic */ RootComponent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(RootComponent rootComponent, Object obj, int i) {
        this.f2044a = i;
        this.b = rootComponent;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier modifierConsumeWindowInsets;
        switch (this.f2044a) {
            case 0:
                KotlinToastManager kotlinToastManager = (KotlinToastManager) this.c;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249036433, iIntValue, -1, "app.chalo.core.compose.DecomposeApp.<anonymous>.<anonymous> (DecomposeApp.kt:46)");
                    }
                    RootComponent rootComponent = this.b;
                    MutableState mutableStateA = SubscribeAsStateKt.a(rootComponent.getF(), composer);
                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    Object obj3 = ((ChildStack) mutableStateA.getValue()).f12382a.b;
                    boolean zChanged = composer.changed(softwareKeyboardController);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DecomposeAppKt$DecomposeApp$1$1$1$1(softwareKeyboardController, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    EffectsKt.LaunchedEffect(obj3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
                    DecomposeAppKt.b(kotlinToastManager.getB(), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), composer, 0);
                    DecomposeBackProcessorKt.a(rootComponent, ComposableLambdaKt.rememberComposableLambda(-616499609, true, new a(rootComponent, mutableStateA, 1), composer, 54), composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                MutableState mutableState = (MutableState) this.c;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-616499609, iIntValue2, -1, "app.chalo.core.compose.DecomposeApp.<anonymous>.<anonymous>.<anonymous> (DecomposeApp.kt:61)");
                    }
                    Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean zChanged2 = composer2.changed(context.getResources().getConfiguration());
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                        objRememberedValue2 = Integer.valueOf(identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : (int) (24 * context.getResources().getDisplayMetrics().density));
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    int iIntValue3 = ((Number) objRememberedValue2).intValue();
                    ChildStack childStack = (ChildStack) mutableState.getValue();
                    composer2.startReplaceGroup(249384925);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    if (Build.VERSION.SDK_INT >= 35) {
                        composer2.startReplaceGroup(2019505766);
                        composer2.endReplaceGroup();
                        modifierConsumeWindowInsets = WindowInsetsPadding_androidKt.safeDrawingPadding(modifierFillMaxSize$default);
                    } else {
                        composer2.startReplaceGroup(2019635966);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        WindowInsets.Companion companion = WindowInsets.INSTANCE;
                        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(companion, composer2, 6);
                        WindowInsets navigationBars = WindowInsets_androidKt.getNavigationBars(companion, composer2, 6);
                        WindowInsets ime = WindowInsets_androidKt.getIme(companion, composer2, 6);
                        modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.consumeWindowInsets(PaddingKt.m788paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, density.mo401toDpu2uoSUM(Math.min(iIntValue3, statusBars.getTop(density))), 0.0f, density.mo400toDpu2uoSUM(Math.max(density.mo404toPx0680j_4(NavigationBarInsetsKt.a(true, composer2, 6)), ime.getBottom(density))), 5, null), statusBars), navigationBars), ime);
                        composer2.endReplaceGroup();
                    }
                    Modifier modifier = modifierConsumeWindowInsets;
                    composer2.endReplaceGroup();
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloTheme.a(composer2, 0).t, null, 2, null);
                    RootComponent rootComponent2 = this.b;
                    BackHandler d = rootComponent2.getD();
                    boolean zChangedInstance = composer2.changedInstance(rootComponent2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        DecomposeAppKt$DecomposeApp$1$1$2$2$1 decomposeAppKt$DecomposeApp$1$1$2$2$1 = new DecomposeAppKt$DecomposeApp$1$1$2$2$1(0, rootComponent2, RootComponent.class, "onBackClicked", "onBackClicked()V", 0);
                        composer2.updateRememberedValue(decomposeAppKt$DecomposeApp$1$1$2$2$1);
                        objRememberedValue3 = decomposeAppKt$DecomposeApp$1$1$2$2$1;
                    }
                    ChildrenKt.a(childStack, modifierM264backgroundbw27NRU$default, DecomposeStackAnimation_androidKt.a(d, (Function0) ((KFunction) objRememberedValue3)), ComposableSingletons$DecomposeAppKt.f2032a, composer2, 3072);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
