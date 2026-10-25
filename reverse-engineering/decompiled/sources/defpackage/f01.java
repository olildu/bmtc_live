package defpackage;

import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15601a;
    public final /* synthetic */ ChaloUseCaseResult.Failure b;
    public final /* synthetic */ String c;

    public /* synthetic */ f01(ChaloUseCaseResult.Failure failure, String str, int i) {
        this.f15601a = i;
        this.b = failure;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        QuickpayTripAmountDataState quickpayTripAmountDataState = (QuickpayTripAmountDataState) obj;
        switch (this.f15601a) {
            case 0:
                break;
        }
        return QuickpayTripAmountDataState.a(quickpayTripAmountDataState, (TripAmountState) this.b.f10418a, this.c, null, 0L, true, false, null, 0L, false, null, 1004);
    }
}
