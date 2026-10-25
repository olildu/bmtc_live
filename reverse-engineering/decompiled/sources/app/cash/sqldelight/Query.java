package app.cash.sqldelight;

import defpackage.i40;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/cash/sqldelight/Query;", "", "RowType", "Lapp/cash/sqldelight/ExecutableQuery;", "Listener", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Query<RowType> extends ExecutableQuery<RowType> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/Query$Listener;", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void a();
    }

    public abstract void e(i40 i40Var);

    public abstract void f(Listener listener);
}
