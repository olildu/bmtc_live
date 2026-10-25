package app.chalo.core.database.tableadapters;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.network.config.ChaloJson;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntityKxSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"app/chalo/core/database/tableadapters/RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1", "Lapp/cash/sqldelight/ColumnAdapter;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1 implements ColumnAdapter<RecentLocationPairEndpointEntity, String> {
    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object a(String str) {
        return (RecentLocationPairEndpointEntity) ChaloJson.b.b(str, RecentLocationPairEndpointEntityKxSerializer.c);
    }

    @Override // app.cash.sqldelight.ColumnAdapter
    public final Object encode(Object obj) {
        RecentLocationPairEndpointEntity value = (RecentLocationPairEndpointEntity) obj;
        Intrinsics.i(value, "value");
        return ChaloJson.b.a(RecentLocationPairEndpointEntityKxSerializer.c, value);
    }
}
