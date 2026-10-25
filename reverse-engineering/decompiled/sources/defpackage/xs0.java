package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xs0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20048a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ xs0(boolean[] zArr, Function0 function0, int i) {
        this.f20048a = i;
        this.b = zArr;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20048a) {
            case 0:
                boolean[] zArr = this.b;
                zArr[0] = true;
                for (boolean z : zArr) {
                    if (!z) {
                    }
                    break;
                }
                this.c.invoke();
                break;
            default:
                boolean[] zArr2 = this.b;
                zArr2[1] = true;
                for (boolean z2 : zArr2) {
                    if (!z2) {
                    }
                    break;
                }
                this.c.invoke();
                break;
        }
        return Unit.f17538a;
    }
}
