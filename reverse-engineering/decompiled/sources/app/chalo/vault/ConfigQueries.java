package app.chalo.vault;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import defpackage.i40;
import defpackage.ls;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/vault/ConfigQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "GetConfigQuery", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigQueries extends TransacterImpl {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/ConfigQueries$GetConfigQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class GetConfigQuery<T> extends Query<T> {
        public final String b;
        public final /* synthetic */ ConfigQueries c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetConfigQuery(ConfigQueries configQueries, String key, ls lsVar) {
            super(lsVar);
            Intrinsics.i(key, "key");
            this.c = configQueries;
            this.b = key;
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult a(Function1 function1) {
            return this.c.f697a.P(-896372700, "SELECT config.key, config.value FROM config WHERE key = ? LIMIT 1", function1, 1, new a(this, 1));
        }

        @Override // app.cash.sqldelight.Query
        public final void e(i40 i40Var) {
            this.c.f697a.h1(new String[]{"config"}, i40Var);
        }

        @Override // app.cash.sqldelight.Query
        public final void f(Query.Listener listener) {
            Intrinsics.i(listener, "listener");
            this.c.f697a.P0(new String[]{"config"}, listener);
        }

        public final String toString() {
            return "config.sq:getConfig";
        }
    }

    public final Query W(String key, Function2 function2) {
        Intrinsics.i(key, "key");
        return new GetConfigQuery(this, key, new ls(0, function2));
    }
}
