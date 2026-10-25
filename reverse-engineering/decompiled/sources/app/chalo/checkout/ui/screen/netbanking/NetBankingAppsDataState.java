package app.chalo.checkout.ui.screen.netbanking;

import defpackage.hq0;
import defpackage.nf1;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsDataState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetBankingAppsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1499a;
    public final boolean b;
    public final String c;
    public final List d;

    public NetBankingAppsDataState(List list, boolean z, String str, String str2) {
        this.f1499a = str;
        this.b = z;
        this.c = str2;
        this.d = list;
    }

    public static NetBankingAppsDataState a(NetBankingAppsDataState netBankingAppsDataState, String str, String searchText, List list, int i) {
        if ((i & 1) != 0) {
            str = netBankingAppsDataState.f1499a;
        }
        boolean z = (i & 2) != 0 ? netBankingAppsDataState.b : false;
        if ((i & 4) != 0) {
            searchText = netBankingAppsDataState.c;
        }
        if ((i & 8) != 0) {
            list = netBankingAppsDataState.d;
        }
        netBankingAppsDataState.getClass();
        Intrinsics.i(searchText, "searchText");
        return new NetBankingAppsDataState(list, z, str, searchText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetBankingAppsDataState)) {
            return false;
        }
        NetBankingAppsDataState netBankingAppsDataState = (NetBankingAppsDataState) obj;
        return Intrinsics.d(this.f1499a, netBankingAppsDataState.f1499a) && this.b == netBankingAppsDataState.b && Intrinsics.d(this.c, netBankingAppsDataState.c) && Intrinsics.d(this.d, netBankingAppsDataState.d);
    }

    public final int hashCode() {
        String str = this.f1499a;
        int iE = nf1.e((((str == null ? 0 : str.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c);
        List list = this.d;
        return iE + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return uf0.p(this.c, ", netBankingItemList=", ")", hq0.m("NetBankingAppsDataState(toolbarTitle=", this.f1499a, ", showDialogLoader=", ", searchText=", this.b), this.d);
    }
}
