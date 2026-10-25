package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jh1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17407a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ ScrollState d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Function3 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ jh1(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, float f2, Function2 function4, int i2, int i3, int i4) {
        this.f17407a = i4;
        this.b = i;
        this.c = modifier;
        this.d = scrollState;
        this.e = j;
        this.f = j2;
        this.g = f;
        this.h = function3;
        this.i = function2;
        this.j = f2;
        this.k = function4;
        this.l = i2;
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f17407a) {
            case 0:
                return TabRowKt.PrimaryScrollableTabRow_cx2KkNY$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, ((Integer) obj2).intValue());
            default:
                return TabRowKt.SecondaryScrollableTabRow_cx2KkNY$lambda$3(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, ((Integer) obj2).intValue());
        }
    }
}
