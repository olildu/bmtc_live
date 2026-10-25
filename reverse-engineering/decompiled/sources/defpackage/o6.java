package defpackage;

import androidx.compose.material3.AppBarKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18572a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ o6(float f, float f2, float f3, int i) {
        this.f18572a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18572a) {
            case 0:
                return AppBarKt.BottomAppBarState(this.b, this.c, this.d);
            default:
                return AppBarKt.rememberTopAppBarState$lambda$26$lambda$25(this.b, this.c, this.d);
        }
    }
}
