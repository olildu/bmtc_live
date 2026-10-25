package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.android.MainActivity;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.core.compose.DecomposeAppKt;
import app.chalo.core.compose.a;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.providers.toast.KotlinToastManager;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19073a;
    public final /* synthetic */ RootComponent b;

    public /* synthetic */ pw(RootComponent rootComponent, int i) {
        this.f19073a = i;
        this.b = rootComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        int i = this.f19073a;
        Unit unit = Unit.f17538a;
        RootComponent rootComponent = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(867329100, iIntValue, -1, "app.chalo.core.compose.DecomposeApp.<anonymous> (DecomposeApp.kt:43)");
                    }
                    composer.startReplaceGroup(-1168520582);
                    Scope scopeB = KoinApplicationKt.b(composer);
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed((Object) null) | composer.changed(scopeB);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = scopeB.d(Reflection.a(KotlinToastManager.class), null, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    composer.endReplaceGroup();
                    ChaloThemeKt.a(null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-249036433, true, new a(rootComponent, (KotlinToastManager) objRememberedValue, i2), composer, 54), composer, 1572864);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AtomicInteger atomicInteger = MainActivity.o1;
                if (!composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-927268315, iIntValue2, -1, "app.chalo.android.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:326)");
                    }
                    DecomposeAppKt.a(rootComponent, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
