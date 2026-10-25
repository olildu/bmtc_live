package app.chalo.vault;

import app.cash.sqldelight.Transacter;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/vault/chalo_vault;", "Lapp/cash/sqldelight/Transacter;", "Companion", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface chalo_vault extends Transacter {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/chalo_vault$Companion;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    Chalo_pay_tableQueries J();

    Wallet_transaction_tableQueries L();

    Load_money_tableQueries R();

    Quick_pay_receipt_tableQueries m();

    KeystorageQueries n();

    ConfigQueries q();

    Wallet_tableQueries r();

    Quick_pay_tableQueries u();
}
