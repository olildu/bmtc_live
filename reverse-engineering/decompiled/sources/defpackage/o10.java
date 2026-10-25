package defpackage;

import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsIntent;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsRestoredState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18560a;
    public final /* synthetic */ EnterCardDetailsComponent b;

    public /* synthetic */ o10(EnterCardDetailsComponent enterCardDetailsComponent, int i) {
        this.f18560a = i;
        this.b = enterCardDetailsComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18560a) {
            case 0:
                EnterCardDetailsViewState it = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it, "it");
                EnterCardDetailsRestoredState enterCardDetailsRestoredState = this.b.u;
                return EnterCardDetailsViewState.a(it, enterCardDetailsRestoredState != null ? enterCardDetailsRestoredState.f6332a : null, null, null, null, enterCardDetailsRestoredState != null ? enterCardDetailsRestoredState.f : false, false, false, false, false, null, false, 4062);
            default:
                EnterCardDetailsIntent it2 = (EnterCardDetailsIntent) obj;
                Intrinsics.i(it2, "it");
                this.b.H0(it2);
                return Unit.f17538a;
        }
    }
}
