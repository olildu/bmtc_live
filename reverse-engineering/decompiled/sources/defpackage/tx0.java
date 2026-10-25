package defpackage;

import app.chalo.receipt.UserDetailsForProducts;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tx0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19696a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ UserDetailsForProducts c;

    public /* synthetic */ tx0(Function1 function1, UserDetailsForProducts userDetailsForProducts, int i) {
        this.f19696a = i;
        this.b = function1;
        this.c = userDetailsForProducts;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19696a) {
            case 0:
                this.b.invoke(this.c.c());
                break;
            case 1:
                this.b.invoke(this.c.c());
                break;
            default:
                this.b.invoke(this.c.c());
                break;
        }
        return Unit.f17538a;
    }
}
