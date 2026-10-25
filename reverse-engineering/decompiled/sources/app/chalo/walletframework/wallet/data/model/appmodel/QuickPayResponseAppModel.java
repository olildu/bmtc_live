package app.chalo.walletframework.wallet.data.model.appmodel;

import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/QuickPayResponseAppModel;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickPayResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11006a;
    public final int b;
    public final Long c;
    public final long d;
    public final String e;
    public final Long f;
    public final QuickPayOrderStatus g;
    public final long h;

    public QuickPayResponseAppModel(String orderId, int i, Long l, long j, String str, Long l2, QuickPayOrderStatus status, long j2) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(status, "status");
        this.f11006a = orderId;
        this.b = i;
        this.c = l;
        this.d = j;
        this.e = str;
        this.f = l2;
        this.g = status;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayResponseAppModel)) {
            return false;
        }
        QuickPayResponseAppModel quickPayResponseAppModel = (QuickPayResponseAppModel) obj;
        return Intrinsics.d(this.f11006a, quickPayResponseAppModel.f11006a) && this.b == quickPayResponseAppModel.b && Intrinsics.d(this.c, quickPayResponseAppModel.c) && this.d == quickPayResponseAppModel.d && Intrinsics.d(this.e, quickPayResponseAppModel.e) && Intrinsics.d(this.f, quickPayResponseAppModel.f) && this.g == quickPayResponseAppModel.g && this.h == quickPayResponseAppModel.h;
    }

    public final int hashCode() {
        int iHashCode = ((this.f11006a.hashCode() * 31) + this.b) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.e;
        int iHashCode3 = (i + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode4 = (this.g.hashCode() + ((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31)) * 31;
        long j2 = this.h;
        return iHashCode4 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "QuickPayResponseAppModel(orderId=", this.f11006a, ", amount=", ", activationDuration=");
        sbM.append(this.c);
        sbM.append(", activationTime=");
        sbM.append(this.d);
        sbM.append(", transactionId=");
        sbM.append(this.e);
        sbM.append(", transactionTime=");
        sbM.append(this.f);
        sbM.append(", status=");
        sbM.append(this.g);
        sbM.append(", expiryTime=");
        return uf0.m(this.h, ")", sbM);
    }
}
