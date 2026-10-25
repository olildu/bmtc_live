package app.chalo.ncmc.data.apiresponsemodel;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardRechargeConfigListApiResponseModelKt {
    public static final boolean a(CardRechargeConfigApiResponseModel cardRechargeConfigApiResponseModel, int i) {
        if (cardRechargeConfigApiResponseModel.f6067a != null && cardRechargeConfigApiResponseModel.l != null && cardRechargeConfigApiResponseModel.m != null && cardRechargeConfigApiResponseModel.g != null) {
            Boolean bool = cardRechargeConfigApiResponseModel.i;
            if ((bool != null ? bool.booleanValue() : true) && cardRechargeConfigApiResponseModel.f != null) {
                Integer num = cardRechargeConfigApiResponseModel.j;
                if ((num != null ? num.intValue() : 0) <= i) {
                    Integer num2 = cardRechargeConfigApiResponseModel.k;
                    if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) >= i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
