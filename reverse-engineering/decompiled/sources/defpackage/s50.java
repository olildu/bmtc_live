package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.compose.theme.ShapedContentUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19271a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s50(float f, ShapedContentUIState shapedContentUIState, ShapedContentUIState shapedContentUIState2, float f2, long j, int i) {
        this.b = f;
        this.f = shapedContentUIState;
        this.g = shapedContentUIState2;
        this.d = f2;
        this.c = j;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19271a) {
            case 0:
                ((Integer) obj2).getClass();
                FromAndToStopDetailViewKt.f(this.b, (ShapedContentUIState) this.f, (ShapedContentUIState) this.g, this.d, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TooltipPopupComposableKt.c((Modifier) this.f, this.b, this.c, this.d, (Function2) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ s50(Modifier modifier, float f, long j, float f2, Function2 function2, int i) {
        this.f = modifier;
        this.b = f;
        this.c = j;
        this.d = f2;
        this.g = function2;
        this.e = i;
    }
}
