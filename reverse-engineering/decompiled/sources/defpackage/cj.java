package defpackage;

import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountIntent;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11334a;
    public final /* synthetic */ ChaloCardRechargeAmountComponent b;

    public /* synthetic */ cj(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, int i) {
        this.f11334a = i;
        this.b = chaloCardRechargeAmountComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11334a) {
            case 0:
                String str = this.b.B;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
            default:
                this.b.L0(ChaloCardRechargeAmountIntent.NavigateToHome.f6297a);
                return Unit.f17538a;
        }
    }
}
