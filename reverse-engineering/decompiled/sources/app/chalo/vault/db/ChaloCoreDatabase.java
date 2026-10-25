package app.chalo.vault.db;

import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.chalo.vault.KeystorageQueries;
import app.chalo.vault.Quick_pay_tableQueries;
import app.chalo.vault.chalo_vault;
import defpackage.bj;
import defpackage.fi;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/db/ChaloCoreDatabase;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloCoreDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f10758a = LazyKt.b(new fi(this, 3));

    public static void a(chalo_vault chalo_vaultVar) throws Throwable {
        chalo_vaultVar.getC().V(new bj(10));
        chalo_vaultVar.getD().V(new bj(11));
        chalo_vaultVar.getH().V(new bj(12));
        chalo_vaultVar.getI().V(new bj(13));
        chalo_vaultVar.getB().V(new bj(14));
        chalo_vaultVar.getG().V(new bj(15));
        chalo_vaultVar.getF().V(new bj(16));
        chalo_vaultVar.getE().V(new bj(17));
    }

    public abstract AndroidSqliteDriver b();

    public abstract void c();

    public abstract void d();

    public final chalo_vault e() {
        return (chalo_vault) this.f10758a.getValue();
    }

    public final KeystorageQueries f() {
        return e().getD();
    }

    public final Quick_pay_tableQueries g() {
        return e().getG();
    }

    public abstract void h();
}
