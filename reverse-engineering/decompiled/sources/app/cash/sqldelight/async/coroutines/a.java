package app.cash.sqldelight.async.coroutines;

import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f701a;
    public final /* synthetic */ ExecutableQuery b;

    public /* synthetic */ a(ExecutableQuery executableQuery, int i) {
        this.f701a = i;
        this.b = executableQuery;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SqlCursor cursor = (SqlCursor) obj;
        switch (this.f701a) {
            case 0:
                Intrinsics.i(cursor, "cursor");
                QueryResult.Value next = cursor.next();
                ArrayList arrayList = new ArrayList();
                ExecutableQuery executableQuery = this.b;
                if (!((Boolean) next.b).booleanValue()) {
                    return new QueryResult.Value(arrayList);
                }
                arrayList.add(executableQuery.f699a.invoke(cursor));
                while (((Boolean) cursor.next().b).booleanValue()) {
                    arrayList.add(executableQuery.f699a.invoke(cursor));
                }
                return new QueryResult.Value(arrayList);
            default:
                Intrinsics.i(cursor, "cursor");
                QueryResult.Value next2 = cursor.next();
                ExecutableQuery executableQuery2 = this.b;
                if (!((Boolean) next2.b).booleanValue()) {
                    return new QueryResult.Value(null);
                }
                Object objInvoke = executableQuery2.f699a.invoke(cursor);
                if (!((Boolean) cursor.next().b).booleanValue()) {
                    return new QueryResult.Value(objInvoke);
                }
                throw new IllegalStateException(("ResultSet returned more than 1 row for " + executableQuery2).toString());
        }
    }
}
