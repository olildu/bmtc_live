package app.chalo.vault.vault;

import app.cash.sqldelight.db.SqlDriver;
import app.chalo.vault.chalo_vault;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"vault_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Chalo_vaultImplKt {
    public static final chalo_vault a(ClassReference classReference, SqlDriver driver) {
        Intrinsics.i(driver, "driver");
        return new chalo_vaultImpl(driver);
    }
}
