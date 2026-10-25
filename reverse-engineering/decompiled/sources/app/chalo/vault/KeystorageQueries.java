package app.chalo.vault;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.dd0;
import defpackage.ed0;
import defpackage.i40;
import defpackage.ib0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/vault/KeystorageQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetAllKeyBetweenTSQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeystorageQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/KeystorageQueries$GetAllKeyBetweenTSQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetAllKeyBetweenTSQuery<T> extends Query<T> {
        public final long b;
        public final String c;

        public GetAllKeyBetweenTSQuery(long j, String str, ed0 ed0Var) {
            super(ed0Var);
            this.b = j;
            this.c = str;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return KeystorageQueries.this.f697a.P(1546200321, "SELECT keystorage.validFrom, keystorage.validTo, keystorage.key, keystorage.agency FROM keystorage WHERE validFrom <= ? AND validTo >= ? AND agency = ?", function1, 3, new a(this, 2));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            KeystorageQueries.this.f697a.h1(new String[]{"keystorage"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            KeystorageQueries.this.f697a.P0(new String[]{"keystorage"}, listener);
        }

        public final String toString() {
            return "keystorage.sq:getAllKeyBetweenTS";
        }
    }

    public final Query W(long j, String str, Function4 function4) {
        return new GetAllKeyBetweenTSQuery(j, str, new ed0(function4, 0));
    }

    public final QueryResult X(Keystorage keystorage) {
        QueryResult queryResultA0 = this.f697a.A0(1338312135, "INSERT OR REPLACE INTO keystorage (validFrom, validTo, key, agency)\nVALUES (?, ?, ?, ?)", new dd0(keystorage, 0));
        T(1338312135, new ib0(18));
        return queryResultA0;
    }
}
