package app.chalo.login.data.models.app;

import defpackage.nf1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/data/models/app/DpdpaUserConsentsInfoAppModel;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DpdpaUserConsentsInfoAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5191a;
    public final Integer b;
    public final String c;
    public final ArrayList d;

    public DpdpaUserConsentsInfoAppModel(String userId, Integer num, String str, ArrayList arrayList) {
        Intrinsics.i(userId, "userId");
        this.f5191a = userId;
        this.b = num;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpdpaUserConsentsInfoAppModel)) {
            return false;
        }
        DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel = (DpdpaUserConsentsInfoAppModel) obj;
        return Intrinsics.d(this.f5191a, dpdpaUserConsentsInfoAppModel.f5191a) && Intrinsics.d(this.b, dpdpaUserConsentsInfoAppModel.b) && this.c.equals(dpdpaUserConsentsInfoAppModel.c) && this.d.equals(dpdpaUserConsentsInfoAppModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f5191a.hashCode() * 31;
        Integer num = this.b;
        return this.d.hashCode() + nf1.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "DpdpaUserConsentsInfoAppModel(userId=" + this.f5191a + ", policyVersion=" + this.b + ", tncUrl=" + this.c + ", consents=" + this.d + ")";
    }
}
