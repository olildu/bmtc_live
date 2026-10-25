package app.chalo.core.database.columnadapters;

import app.cash.sqldelight.ColumnAdapter;
import defpackage.ep;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/columnadapters/CommonColumnAdapters;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonColumnAdapters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f2048a = LazyKt.b(new ep(15));
    public static final Lazy b = LazyKt.b(new ep(16));
    public static final Lazy c = LazyKt.b(new ep(17));
    public static final Lazy d = LazyKt.b(new ep(18));
    public static final Lazy e = LazyKt.b(new ep(19));

    public static ColumnAdapter a() {
        return (ColumnAdapter) c.getValue();
    }

    public static ColumnAdapter b() {
        return (ColumnAdapter) f2048a.getValue();
    }
}
