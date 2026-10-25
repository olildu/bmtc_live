package app.chalo.core.database.columnadapters;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"app/chalo/core/database/columnadapters/CommonColumnAdapters$latLngColumnAdapter$2$1", "Lapp/cash/sqldelight/ColumnAdapter;", "Lapp/chalo/location/LatLng;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonColumnAdapters$latLngColumnAdapter$2$1 implements ColumnAdapter<LatLng, String> {
    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object a(String str) {
        Json json = ChaloJson.b;
        json.getClass();
        return (LatLng) json.b(str, LatLng.INSTANCE.serializer());
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object encode(Object obj) {
        LatLng value = (LatLng) obj;
        Intrinsics.i(value, "value");
        Json json = ChaloJson.b;
        json.getClass();
        return json.a(LatLng.INSTANCE.serializer(), value);
    }
}
