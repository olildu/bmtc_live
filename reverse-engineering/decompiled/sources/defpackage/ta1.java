package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.sos.SosScreenTypeUIState;
import app.chalo.sos.SosScreenUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ta1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19642a;
    public final /* synthetic */ SosScreenTypeUIState.DisplayScreenUIState b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;

    public /* synthetic */ ta1(SosScreenTypeUIState.DisplayScreenUIState displayScreenUIState, Modifier modifier, int i, int i2) {
        this.f19642a = i2;
        this.b = displayScreenUIState;
        this.c = modifier;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19642a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                SosScreenUIKt.e(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                SosScreenUIKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
