package app.chalo.walletframework.wallet.domain.model;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/model/LoadMoneyPaymentCompleteData;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoadMoneyPaymentCompleteData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11085a;
    public final int b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public LoadMoneyPaymentCompleteData(int i, long j, String orderId, String str, String str2, String userId, String str3) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(userId, "userId");
        this.f11085a = orderId;
        this.b = i;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.f = userId;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoneyPaymentCompleteData)) {
            return false;
        }
        LoadMoneyPaymentCompleteData loadMoneyPaymentCompleteData = (LoadMoneyPaymentCompleteData) obj;
        return Intrinsics.d(this.f11085a, loadMoneyPaymentCompleteData.f11085a) && this.b == loadMoneyPaymentCompleteData.b && this.c == loadMoneyPaymentCompleteData.c && Intrinsics.d(this.d, loadMoneyPaymentCompleteData.d) && Intrinsics.d(this.e, loadMoneyPaymentCompleteData.e) && Intrinsics.d(this.f, loadMoneyPaymentCompleteData.f) && Intrinsics.d(this.g, loadMoneyPaymentCompleteData.g);
    }

    public final int hashCode() {
        int iHashCode = ((this.f11085a.hashCode() * 31) + this.b) * 31;
        long j = this.c;
        return this.g.hashCode() + nf1.e(nf1.e(nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "LoadMoneyPaymentCompleteData(orderId=", this.f11085a, ", amount=", ", transactionTime=");
        dd.k(this.c, ", transactionId=", this.d, sbM);
        cb0.t(sbM, ", paymentMode=", this.e, ", userId=", this.f);
        return z40.h(sbM, ", walletId=", this.g, ")");
    }
}
