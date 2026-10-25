package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import defpackage.qp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/cash/sqldelight/ExecutableQuery;", "", "RowType", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExecutableQuery<RowType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f699a;

    public ExecutableQuery(Function1 mapper) {
        Intrinsics.i(mapper, "mapper");
        this.f699a = mapper;
    }

    public abstract QueryResult a(Function1 function1);

    public final List b() {
        return (List) a(new qp((Query) this, 24)).getB();
    }

    public final Object c() {
        Object objD = d();
        if (objD != null) {
            return objD;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }

    public final Object d() {
        return a(new qp(this, 25)).getB();
    }
}
