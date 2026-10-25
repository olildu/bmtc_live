package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19215a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ rj(int i, int i2, long j, long j2, int i3) {
        this.f19215a = i3;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19215a) {
            case 0:
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                int i = this.c;
                long j = this.d;
                long j2 = this.e;
                int i2 = this.b;
                LazyListScope.CC.o(LazyRow, i2, null, null, ComposableLambdaKt.composableLambdaInstance(749982920, true, new tj(i, j, j2, i2)), 6, null);
                break;
            default:
                LazyListScope LazyRow2 = (LazyListScope) obj;
                Intrinsics.i(LazyRow2, "$this$LazyRow");
                int i3 = this.c;
                long j3 = this.d;
                int i4 = this.b;
                LazyListScope.CC.o(LazyRow2, i4, null, null, ComposableLambdaKt.composableLambdaInstance(72324510, true, new tj(i3, j3, i4, this.e)), 6, null);
                break;
        }
        return Unit.f17538a;
    }
}
