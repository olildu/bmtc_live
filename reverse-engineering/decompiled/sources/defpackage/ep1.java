package defpackage;

import app.chalo.vault.dao.WalletDaoImpl;
import app.chalo.vault.mapper.ChaloPayEntityMapperKt;
import app.chalo.vault.mapper.QuickPayEntityMapperKt;
import app.chalo.vault.mapper.WalletTransactionEntityMapperKt;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import app.chalo.walletframework.wallet.data.repository.entity.ChaloPayEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ep1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15577a;
    public final /* synthetic */ List b;
    public final /* synthetic */ WalletDaoImpl c;

    public /* synthetic */ ep1(List list, WalletDaoImpl walletDaoImpl, int i) {
        this.f15577a = i;
        this.b = list;
        this.c = walletDaoImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15577a) {
            case 0:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    this.c.x().Y(ChaloPayEntityMapperKt.a((ChaloPayEntity) it.next()));
                }
                break;
            case 1:
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    this.c.f10756a.g().f0(QuickPayEntityMapperKt.a((QuickPayEntity) it2.next()));
                }
                break;
            default:
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    this.c.A().b0(WalletTransactionEntityMapperKt.a((WalletTransactionEntity) it3.next()));
                }
                break;
        }
        return Unit.f17538a;
    }
}
