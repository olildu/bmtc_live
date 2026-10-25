package defpackage;

import androidx.compose.material3.CheckboxKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19136a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qn(int i, boolean z, Function1 function1) {
        this.f19136a = i;
        this.b = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19136a) {
            case 0:
                return CheckboxKt.Checkbox$lambda$5$lambda$4(this.b, this.c);
            default:
                return CheckboxKt.Checkbox$lambda$2$lambda$1(this.b, this.c);
        }
    }
}
