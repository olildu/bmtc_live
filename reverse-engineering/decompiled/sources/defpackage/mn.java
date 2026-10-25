package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.ChaloZigzagPathComposableKt;
import app.chalo.compose.ProceedButtonShineOverlayKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18411a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;

    public /* synthetic */ mn(int i, Modifier modifier, long j, float f, float f2, float f3, int i2) {
        this.b = i;
        this.c = modifier;
        this.d = j;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18411a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloZigzagPathComposableKt.a(this.c, this.d, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1), this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                ProceedButtonShineOverlayKt.b(this.b, this.c, this.d, this.e, this.f, this.g, 1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ mn(Modifier modifier, long j, float f, float f2, float f3, int i, int i2) {
        this.c = modifier;
        this.d = j;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.b = i;
        this.h = i2;
    }
}
