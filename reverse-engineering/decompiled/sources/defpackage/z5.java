package defpackage;

import androidx.compose.material3.AppBarColumnKt;
import androidx.compose.material3.AppBarRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20166a;
    public final /* synthetic */ Function3 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ z5(Function3 function3, Modifier modifier, int i, Function1 function1, int i2, int i3, int i4) {
        this.f20166a = i4;
        this.b = function3;
        this.c = modifier;
        this.d = i;
        this.e = function1;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20166a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarColumnKt.AppBarColumn$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarRowKt.AppBarRow$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, iIntValue2);
        }
    }
}
