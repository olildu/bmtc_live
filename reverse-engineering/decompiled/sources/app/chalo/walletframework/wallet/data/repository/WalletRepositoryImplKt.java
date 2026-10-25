package app.chalo.walletframework.wallet.data.repository;

import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletRepositoryImplKt {
    public static final List a(List list, WalletTransactionType walletTransactionType) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WalletTransactionAppModel) obj).b == walletTransactionType) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((WalletTransactionAppModel) obj2).e);
        }
        return CollectionsKt.z(arrayList2);
    }
}
