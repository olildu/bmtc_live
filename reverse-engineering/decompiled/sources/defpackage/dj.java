package defpackage;

import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15467a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ CardRechargeDataFetchErrorReason c;

    public /* synthetic */ dj(Function1 function1, CardRechargeDataFetchErrorReason cardRechargeDataFetchErrorReason, int i) {
        this.f15467a = i;
        this.b = function1;
        this.c = cardRechargeDataFetchErrorReason;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15467a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(new ChaloCardRechargeAmountIntent.CardDataFetchErrorActionClickedIntent(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
