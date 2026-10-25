package defpackage;

import io.github.alexzhirkevich.compottie.internal.animation.AnimatedShape;
import io.github.alexzhirkevich.compottie.internal.animation.expressions.ExpressionsRuntimeKt;
import io.github.alexzhirkevich.keight.ScriptRuntime;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19090a;
    public final /* synthetic */ AnimatedShape b;
    public final /* synthetic */ ScriptRuntime c;
    public final /* synthetic */ ScriptRuntime d;

    public /* synthetic */ q5(AnimatedShape animatedShape, ScriptRuntime scriptRuntime, ScriptRuntime scriptRuntime2, int i) {
        this.f19090a = i;
        this.b = animatedShape;
        this.c = scriptRuntime;
        this.d = scriptRuntime2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19090a) {
            case 0:
                return ExpressionsRuntimeKt.b(this.b.d(ExpressionsRuntimeKt.a(this.c)).d, this.d);
            case 1:
                return ExpressionsRuntimeKt.b(this.b.d(ExpressionsRuntimeKt.a(this.c)).b, this.d);
            default:
                return ExpressionsRuntimeKt.b(this.b.d(ExpressionsRuntimeKt.a(this.c)).c, this.d);
        }
    }
}
