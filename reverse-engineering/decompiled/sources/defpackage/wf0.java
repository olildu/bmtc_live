package defpackage;

import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.login.ui.options.LoginOptionsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19923a;
    public final /* synthetic */ LoginOptionsComponent b;

    public /* synthetic */ wf0(LoginOptionsComponent loginOptionsComponent, int i) {
        this.f19923a = i;
        this.b = loginOptionsComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19923a) {
            case 0:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                this.b.Q0(new LoginOptionsIntent.OnPhoneNumberEntered(it));
                break;
            default:
                LoginOptionsIntent it2 = (LoginOptionsIntent) obj;
                Intrinsics.i(it2, "it");
                this.b.Q0(it2);
                break;
        }
        return Unit.f17538a;
    }
}
