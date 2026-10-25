package defpackage;

import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18314a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function3 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ lh1(int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function4, int i2, int i3, int i4) {
        this.f18314a = i4;
        this.b = i;
        this.c = modifier;
        this.d = j;
        this.e = j2;
        this.f = function3;
        this.g = function2;
        this.h = function4;
        this.i = i2;
        this.j = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18314a) {
            case 0:
                return TabRowKt.PrimaryTabRow_pAZo6Ak$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return TabRowKt.TabRow_pAZo6Ak$lambda$10(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return TabRowKt.SecondaryTabRow_pAZo6Ak$lambda$1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
