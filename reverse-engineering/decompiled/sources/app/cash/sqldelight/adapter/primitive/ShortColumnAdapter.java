package app.cash.sqldelight.adapter.primitive;

import app.cash.sqldelight.ColumnAdapter;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lapp/cash/sqldelight/adapter/primitive/ShortColumnAdapter;", "Lapp/cash/sqldelight/ColumnAdapter;", "", "", "sqldelight-primitive-adapters"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShortColumnAdapter implements ColumnAdapter<Short, Long> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object a(String str) {
        return Short.valueOf((short) ((Number) str).longValue());
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object encode(Object obj) {
        return Long.valueOf(((Number) obj).shortValue());
    }
}
