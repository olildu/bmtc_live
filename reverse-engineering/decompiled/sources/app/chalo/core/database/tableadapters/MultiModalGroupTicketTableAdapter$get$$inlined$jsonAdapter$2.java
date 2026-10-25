package app.chalo.core.database.tableadapters;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"app/chalo/core/database/tableadapters/MultiModalGroupTicketTableAdapter$jsonAdapter$1", "Lapp/cash/sqldelight/ColumnAdapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2 implements ColumnAdapter<MultiModalGroupTicketStopDetails, String> {
    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object a(String str) {
        Json json = ChaloJson.b;
        json.getClass();
        return json.b(str, MultiModalGroupTicketStopDetails.INSTANCE.serializer());
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object encode(Object value) {
        Intrinsics.i(value, "value");
        Json json = ChaloJson.b;
        json.getClass();
        return json.a(MultiModalGroupTicketStopDetails.INSTANCE.serializer(), value);
    }
}
