package defpackage;

import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hh1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15827a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;

    public /* synthetic */ hh1(Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function4, int i, int i2) {
        this.f15827a = i2;
        this.b = modifier;
        this.c = j;
        this.d = j2;
        this.e = function3;
        this.f = function2;
        this.g = function4;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15827a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TabRowKt.TabRowImpl_DTcfvLk$lambda$4(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Composer) obj, iIntValue2);
        }
    }
}
