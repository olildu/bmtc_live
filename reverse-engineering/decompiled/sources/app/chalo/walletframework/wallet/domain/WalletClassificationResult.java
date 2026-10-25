package app.chalo.walletframework.wallet.domain;

import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletClassificationResult;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class WalletClassificationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11076a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public WalletClassificationResult(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f11076a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletClassificationResult)) {
            return false;
        }
        WalletClassificationResult walletClassificationResult = (WalletClassificationResult) obj;
        return this.f11076a.equals(walletClassificationResult.f11076a) && this.b.equals(walletClassificationResult.b) && this.c.equals(walletClassificationResult.c) && this.d.equals(walletClassificationResult.d) && this.e.equals(walletClassificationResult.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xs.e(this.d, xs.e(this.c, xs.e(this.b, this.f11076a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WalletClassificationResult(walletCachedMatchingBackend=" + this.f11076a + ", walletCachedWithIdRotatedInBackend=" + this.b + ", walletDoesNotExist=" + this.c + ", walletNotCachedButExistsOnBackend=" + this.d + ", walletNotCachedAndNoBackendInfoPresent=" + this.e + ")";
    }
}
