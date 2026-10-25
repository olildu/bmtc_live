package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.LinearProgressIndicatorKt;
import app.chalo.uistate.components.LinearProgressIndicatorUIState;
import app.chalo.webview.WebViewScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class df0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15456a;
    public final /* synthetic */ LinearProgressIndicatorUIState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;

    public /* synthetic */ df0(LinearProgressIndicatorUIState linearProgressIndicatorUIState, Modifier modifier, int i, int i2) {
        this.f15456a = i2;
        this.b = linearProgressIndicatorUIState;
        this.c = modifier;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15456a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                LinearProgressIndicatorKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                WebViewScreenKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
