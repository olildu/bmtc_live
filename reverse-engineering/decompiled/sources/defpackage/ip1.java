package defpackage;

import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.walletframework.wallet.data.exceptions.WalletAutoReclaimException;
import app.chalo.walletframework.wallet.data.exceptions.WalletLoadBalanceRechargeOrderCreationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ip1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17081a;
    public final /* synthetic */ NetworkResponse b;

    public /* synthetic */ ip1(NetworkResponse networkResponse, int i) {
        this.f17081a = i;
        this.b = networkResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
        switch (this.f17081a) {
            case 0:
                return new WalletAutoReclaimException(genericChaloErrorResponse, Integer.valueOf(this.b.f), genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 1:
                return new WalletAutoReclaimException(genericChaloErrorResponse, Integer.valueOf(this.b.f), genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 2:
                return new WalletLoadBalanceRechargeOrderCreationException(genericChaloErrorResponse, Integer.valueOf(this.b.f), genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            default:
                return new WalletLoadBalanceRechargeOrderCreationException(genericChaloErrorResponse, Integer.valueOf(this.b.f), genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
        }
    }
}
