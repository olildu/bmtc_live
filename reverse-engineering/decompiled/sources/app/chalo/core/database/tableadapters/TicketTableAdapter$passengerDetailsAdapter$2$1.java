package app.chalo.core.database.tableadapters;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.models.mticketing.MTicketPassengerInfo;
import app.chalo.network.config.ChaloJson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0005"}, d2 = {"app/chalo/core/database/tableadapters/TicketTableAdapter$passengerDetailsAdapter$2$1", "Lapp/cash/sqldelight/ColumnAdapter;", "", "", "Lapp/chalo/models/mticketing/MTicketPassengerInfo;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketTableAdapter$passengerDetailsAdapter$2$1 implements ColumnAdapter<Map<String, ? extends MTicketPassengerInfo>, String> {
    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object a(String str) {
        Json json = ChaloJson.b;
        json.getClass();
        return (Map) json.b(str, new LinkedHashMapSerializer(StringSerializer.f18170a, MTicketPassengerInfo.INSTANCE.serializer()));
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object encode(Object obj) {
        Map value = (Map) obj;
        Intrinsics.i(value, "value");
        Json json = ChaloJson.b;
        json.getClass();
        return json.a(new LinkedHashMapSerializer(StringSerializer.f18170a, MTicketPassengerInfo.INSTANCE.serializer()), value);
    }
}
